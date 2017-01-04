/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import vista.Vista;
import modelo.Modelo;

public class Controlador implements ActionListener {

    private Modelo m;
    private Vista v;

    public Controlador(Modelo m, Vista v) {
        this.m = m;
        this.v = v;
        this.v.nuevoboton.addActionListener(this);
        this.v.registrarboton.addActionListener(this);
        this.v.refrescar_tabla.addActionListener(this);
        this.v.buscar.addActionListener(this);
        this.v.modificarboton.addActionListener(this);
        this.v.actualizarboton.addActionListener(this);
        this.v.eliminarboton.addActionListener(this);        
        
    }
    
    public void iniciar() throws SQLException{
        v.setTitle("Sistema con MVC");
        v.pack();
        v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        v.setLocationRelativeTo(null);
        v.setVisible(true);
        m.IniciarModelo();
    }
    
    @Override
    public void actionPerformed (ActionEvent e){
        if (v.nuevoboton == e.getSource()){
            m.NuevoUsuario();
            
        }else if (v.registrarboton == e.getSource()){
            try {
                m.InsertarUsuarios();
            } catch (SQLException ex) {
                Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else if (v.buscar == e.getSource()){
            try {
                m.MostrarUsuarios(v.buscartxt.getText());
            } catch (SQLException ex) {
                Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else if (v.refrescar_tabla == e.getSource()){
            try {
                m.MostrarUsuarios("");
            } catch (SQLException ex) {
                Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if (v.modificarboton == e.getSource()){
            m.ConsultarUsuarios();
            
        }else if (v.actualizarboton == e.getSource()){
            try {
                m.ActualizarUsuarios();
            } catch (SQLException ex) {
                Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else if (v.eliminarboton == e.getSource()){
            try {
                m.EliminarUsuarios();
            } catch (SQLException ex) {
                Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
