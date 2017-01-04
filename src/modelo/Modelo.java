/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import vista.Vista;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Modelo {
 
    Connection cc;
    Connection cn = Conexion();
    Vista v = new Vista();
    
    public Connection Conexion(){
       try {
            Class.forName("com.mysql.jdbc.Driver");
            cc = DriverManager.getConnection("jdbc:mysql://localhost:3306/SistemaMVC" , "root", "");
            System.out.println("Se ha iniciado la conexión con el servidor de forma exitosa");
            
        } catch (Exception ex) {
            System.out.println (ex);
        }
            return cc; 
    }
    
    public void IniciarModelo() throws SQLException{
        BloquearUsuario();
        MostrarUsuarios("");
    }
    
    public void EliminarUsuarios() throws SQLException{
         NuevoUsuario();
        v.registrarboton.setEnabled(false);
        int fila = v.Tabla.getSelectedRow();
        if (fila>=0){
            String id = v.Tabla.getValueAt (fila,0).toString();
            
            PreparedStatement ppt = cn.prepareStatement("DELETE FROM usuarios WHERE id='"+id+"'");
            ppt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Usuario Eliminado");
            MostrarUsuarios("");
        }
        else{
            JOptionPane.showMessageDialog(null, "No se ha seleccionado la fila");
        }
        
    }
    
    public void ActualizarUsuarios() throws SQLException{
       
        String id = v.buscartxt.getText();
        String nombre = v.nombretxt.getText();
        String apellido = v.apellidotxt.getText();
        String telefono = v.telefonotxt.getText();
        String domicilio = v.domiciliotxt.getText();
        String edad = v.edadtxt.getText();
      
        
        if(v.nombretxt.getText().equals("") || v.apellidotxt.getText().equals("")
                || v.telefonotxt.getText().equals("")
                || v.domiciliotxt.getText().equals("") || v.edadtxt.getText().isEmpty() == true){
             v.idtxt.setEnabled(false);
            JOptionPane.showMessageDialog(null, "No pueden haber campos vacíos");
        }else{
             v.idtxt.setEnabled(false);
            PreparedStatement ppt = cn.prepareStatement("UPDATE usuarios SET "
                + "nombre= '"+nombre+"',"
                + "apellido = '"+apellido+"',"
                + "telefono= '"+telefono+"',"
                + "domicilio= '"+domicilio+"',"
                + "edad= '"+edad+"'"
                + "WHERE id= '"+id+"'");
            ppt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Usuario modificado");
            MostrarUsuarios("");
            BloquearUsuario();
       }
    }
    
    public void ConsultarUsuarios(){
        NuevoUsuario();
        v.registrarboton.setEnabled(false);
        int fila = v.Tabla.getSelectedRow();
        if (fila>=0){
            v.buscartxt.setText(v.Tabla.getValueAt(fila, 0).toString());
            v.nombretxt.setText(v.Tabla.getValueAt(fila, 1).toString());
            v.apellidotxt.setText(v.Tabla.getValueAt(fila, 2).toString());
            v.telefonotxt.setText(v.Tabla.getValueAt(fila, 3).toString());
            v.domiciliotxt.setText(v.Tabla.getValueAt(fila, 4).toString());
            v.edadtxt.setText(v.Tabla.getValueAt(fila, 5).toString());
            
        }
        else{
            JOptionPane.showMessageDialog(null, "No se ha seleccionado la fila");
        }
    }
    
    public void Limpiar(){
        v.buscartxt.setText("");
        v.idtxt.setText("");
        v.nombretxt.setText("");
        v.apellidotxt.setText("");
        v.domiciliotxt.setText("");
        v.edadtxt.setText("");
        v.telefonotxt.setText("");
        
    }
    
    public void MostrarUsuarios(String atributo) throws SQLException {
        DefaultTableModel modo = new DefaultTableModel();
        modo.addColumn("ID");
        modo.addColumn("Nombre");
        modo.addColumn("Apellido");
        modo.addColumn("Telefono");
        modo.addColumn("Domicilio");
        modo.addColumn("Edad");
        v.Tabla.setModel(modo);
        
        String sql;
        
        if(atributo.equals("")){
            sql = "SELECT * from usuarios";
        }else {
           sql = "SELECT * from usuarios WHERE id= '"+atributo+"'"; 
        }
        
        String datos[] = new String[6];
        
        Statement st = cn.createStatement();
        ResultSet rs = st.executeQuery(sql);
        while(rs.next()){
            datos[0]= rs.getString(1);
            datos[1]= rs.getString(2);
            datos[2]= rs.getString(3);
            datos[3]= rs.getString(4);
            datos[4]= rs.getString(5);
            datos[5]= rs.getString(6);
            modo.addRow(datos); 
        }
        v.Tabla.setModel(modo);
    }    
        
    
    public void InsertarUsuarios() throws SQLException{
        
        if(v.nombretxt.getText().equals("") || v.apellidotxt.getText().equals("")
                || v.idtxt.getText().equals("") || v.telefonotxt.getText().equals("")
                || v.domiciliotxt.getText().equals("") || v.edadtxt.getText().isEmpty() == true){
            JOptionPane.showMessageDialog(null, "No pueden haber campos vacíos");
        }else{
            PreparedStatement ppt = cn.prepareStatement("INSERT INTO usuarios (id,nombre,apellido, telefono,domicilio,edad) VALUES (?,?,?,?,?,?)");
            ppt.setString(1, v.idtxt.getText());
            ppt.setString(2, v.nombretxt.getText());
            ppt.setString(3, v.apellidotxt.getText());
            ppt.setString(4, v.telefonotxt.getText());
            ppt.setString(5, v.domiciliotxt.getText());
            ppt.setString(6, v.edadtxt.getText());
            ppt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Inserción Exitosa" );
       }
        
    }
    
    public void NuevoUsuario(){
        Limpiar();
        v.idtxt.setEnabled(true);
        v.nombretxt.setEnabled(true);
        v.apellidotxt.setEnabled(true);
        v.domiciliotxt.setEnabled(true);
        v.edadtxt.setEnabled(true);
        v.telefonotxt.setEnabled(true);
        
    }
    
    public void BloquearUsuario(){
        v.idtxt.setEnabled(false);
        v.nombretxt.setEnabled(false);
        v.apellidotxt.setEnabled(false);
        v.domiciliotxt.setEnabled(false);
        v.edadtxt.setEnabled(false);
        v.telefonotxt.setEnabled(false);
        Limpiar();
        
    }

    
}
