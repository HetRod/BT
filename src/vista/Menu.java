/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;


import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.ImageIcon;

/**
 *
 * @author usuario1
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        setLocationRelativeTo(null);
        Calendar cal = Calendar.getInstance();
        
        String hora = cal.get(cal.HOUR_OF_DAY)+":"+cal.get(cal.MINUTE);
        this.jLabel1.setText(date());
        this.jLabel2.setText(hora);
        
    }
    public static String date() {
        Date fecha = new Date();
      

        SimpleDateFormat formatofecha = new SimpleDateFormat("dd/MM/yyyy");
                
        return formatofecha.format(fecha);  
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem40 = new javax.swing.JMenuItem();
        jMenuItem41 = new javax.swing.JMenuItem();
        jMenuItem42 = new javax.swing.JMenuItem();
        jMenuItem29 = new javax.swing.JMenuItem();
        jMenuItem30 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem19 = new javax.swing.JMenuItem();
        jMenuItem20 = new javax.swing.JMenuItem();
        jMenuItem25 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem24 = new javax.swing.JMenuItem();
        jMenuItem22 = new javax.swing.JMenuItem();
        jMenuItem23 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItem21 = new javax.swing.JMenuItem();
        jMenuItem27 = new javax.swing.JMenuItem();
        jMenuItem26 = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenuItem28 = new javax.swing.JMenuItem();
        jMenu9 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem43 = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem17 = new javax.swing.JMenuItem();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        jMenuItem44 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem45 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuItem46 = new javax.swing.JMenuItem();
        jMenuItem18 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem31 = new javax.swing.JMenuItem();
        jMenuItem32 = new javax.swing.JMenuItem();
        jMenuItem33 = new javax.swing.JMenuItem();
        jMenuItem34 = new javax.swing.JMenuItem();
        jMenuItem35 = new javax.swing.JMenuItem();
        jMenuItem36 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem37 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenuItem47 = new javax.swing.JMenuItem();
        jMenuItem48 = new javax.swing.JMenuItem();
        jMenuItem49 = new javax.swing.JMenuItem();
        jMenuItem50 = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem38 = new javax.swing.JMenuItem();
        jMenuItem39 = new javax.swing.JMenuItem();
        jMenuItem51 = new javax.swing.JMenuItem();
        jMenuItem52 = new javax.swing.JMenuItem();
        jMenuItem53 = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel5.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/J-00090180-5.png")));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setLabelFor(this);
        jLabel5.setAlignmentX(0.5F);
        jLabel5.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);

        jLabel1.setText("00/00/00");

        jLabel2.setText("00:00");

        jMenuBar2.setAlignmentY(0.1F);
        jMenuBar2.setMargin(new java.awt.Insets(15, 0, 0, 0));

        jMenu3.setText("Archivo");
        jMenu3.setAlignmentY(0.1F);
        jMenu3.setFont(new java.awt.Font("Utsaah", 0, 24)); // NOI18N
        jMenu3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMenu3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jMenu3.setMargin(new java.awt.Insets(15, 0, 0, 15));

        jMenuItem2.setText("Seleccionar Usuario");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem2);

        jMenuItem3.setText("Salir");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem3);

        jMenuBar2.add(jMenu3);

        jMenu4.setText("Módulos");
        jMenu4.setAlignmentY(0.1F);
        jMenu4.setFont(new java.awt.Font("Utsaah", 0, 24)); // NOI18N
        jMenu4.setMargin(new java.awt.Insets(15, 0, 0, 10));

        jMenuItem40.setText("Instalación");
        jMenu4.add(jMenuItem40);

        jMenuItem41.setText("Seguridad");
        jMenu4.add(jMenuItem41);

        jMenuItem42.setText("Configuración");
        jMenu4.add(jMenuItem42);

        jMenuItem29.setText("Operativo");
        jMenu4.add(jMenuItem29);

        jMenuItem30.setText("Perfiles");
        jMenu4.add(jMenuItem30);

        jMenuBar2.add(jMenu4);

        jMenu5.setText("Procesos");
        jMenu5.setAlignmentY(0.1F);
        jMenu5.setFont(new java.awt.Font("Utsaah", 0, 24)); // NOI18N
        jMenu5.setMargin(new java.awt.Insets(15, 0, 0, 10));

        jMenuItem19.setText("Aportes Masivos");
        jMenu5.add(jMenuItem19);

        jMenuItem20.setText("Retiros Masivos");
        jMenu5.add(jMenuItem20);

        jMenuItem25.setText("Desincorporación");
        jMenuItem25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem25ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem25);
        jMenu5.add(jSeparator1);

        jMenuItem24.setText("Recibir Inversiones");
        jMenu5.add(jMenuItem24);

        jMenuItem22.setText("Cálculo de Rendimiento");
        jMenu5.add(jMenuItem22);

        jMenuItem23.setText("Pago de Rendimiento");
        jMenu5.add(jMenuItem23);
        jMenu5.add(jSeparator2);

        jMenuItem21.setText("Cálculo de Comisiones");
        jMenu5.add(jMenuItem21);

        jMenuItem27.setText("Cierre Mensual");
        jMenu5.add(jMenuItem27);

        jMenuItem26.setText("Cierre Diario");
        jMenu5.add(jMenuItem26);
        jMenu5.add(jSeparator3);

        jMenuItem28.setText("Programar Procesos");
        jMenu5.add(jMenuItem28);

        jMenuBar2.add(jMenu5);

        jMenu9.setText("Tablas");
        jMenu9.setAlignmentY(0.1F);
        jMenu9.setFont(new java.awt.Font("Utsaah", 0, 24)); // NOI18N
        jMenu9.setMargin(new java.awt.Insets(15, 0, 0, 10));

        jMenuItem4.setText("Transacciones");
        jMenu9.add(jMenuItem4);

        jMenuItem5.setText("Fideicomiso");
        jMenu9.add(jMenuItem5);

        jMenuItem6.setText("Embargo");
        jMenu9.add(jMenuItem6);

        jMenuItem11.setText("Movimientos Embargo");
        jMenu9.add(jMenuItem11);
        jMenu9.add(jSeparator4);

        jMenuItem9.setText("Fideicomitente");
        jMenu9.add(jMenuItem9);

        jMenuItem8.setText("Saldo Fideicomitente");
        jMenu9.add(jMenuItem8);

        jMenuItem10.setText("Transacciones Fideicomiso");
        jMenu9.add(jMenuItem10);

        jMenuItem43.setText("Inversiones");
        jMenu9.add(jMenuItem43);
        jMenu9.add(jSeparator5);

        jMenuItem12.setText("Plan de Cuentas");
        jMenu9.add(jMenuItem12);

        jMenuItem7.setText("Movimientos Contable Fideicomiso");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItem7);

        jMenuItem17.setText("Asientos Contables");
        jMenu9.add(jMenuItem17);
        jMenu9.add(jSeparator6);

        jMenuItem44.setText("Monedas");
        jMenu9.add(jMenuItem44);

        jMenuItem13.setText("Días Feriados");
        jMenu9.add(jMenuItem13);

        jMenuItem45.setText("Usuarios");
        jMenu9.add(jMenuItem45);

        jMenuItem14.setText("Perfilamiento");
        jMenu9.add(jMenuItem14);

        jMenuItem15.setText("Logs Auditoría");
        jMenu9.add(jMenuItem15);

        jMenuItem46.setText("Tabla Genérica");
        jMenu9.add(jMenuItem46);

        jMenuItem18.setText("Opciones del Sistema");
        jMenu9.add(jMenuItem18);

        jMenuBar2.add(jMenu9);

        jMenu6.setText("Reportes");
        jMenu6.setAlignmentY(0.1F);
        jMenu6.setFont(new java.awt.Font("Utsaah", 0, 24)); // NOI18N
        jMenu6.setMargin(new java.awt.Insets(15, 0, 0, 10));

        jMenuItem31.setText("Estado Cuenta x Beneficiario");
        jMenu6.add(jMenuItem31);

        jMenuItem32.setText("Balance General");
        jMenu6.add(jMenuItem32);

        jMenuItem33.setText("Balance General x Contrato");
        jMenu6.add(jMenuItem33);

        jMenuItem34.setText("Movimientos x Beneficiario");
        jMenu6.add(jMenuItem34);

        jMenuItem35.setText("Saldo x Beneficiario");
        jMenu6.add(jMenuItem35);

        jMenuItem36.setText("Inversiones");
        jMenu6.add(jMenuItem36);

        jMenuBar2.add(jMenu6);

        jMenu7.setText("Utilitarios");
        jMenu7.setAlignmentY(0.1F);
        jMenu7.setFont(new java.awt.Font("Utsaah", 0, 24)); // NOI18N
        jMenu7.setMargin(new java.awt.Insets(15, 0, 0, 10));

        jMenuItem37.setText("Calculadora");
        jMenu7.add(jMenuItem37);

        jMenuItem16.setText("Calendario");
        jMenu7.add(jMenuItem16);

        jMenuItem47.setText("Agenda de Contactos");
        jMenu7.add(jMenuItem47);

        jMenuItem48.setText("Alarma");
        jMenu7.add(jMenuItem48);

        jMenuItem49.setText("Agenda Diaria");
        jMenu7.add(jMenuItem49);

        jMenuItem50.setText("Importar Datos");
        jMenu7.add(jMenuItem50);

        jMenuBar2.add(jMenu7);

        jMenu8.setText("Ayuda");
        jMenu8.setAlignmentY(0.1F);
        jMenu8.setFont(new java.awt.Font("Utsaah", 0, 24)); // NOI18N
        jMenu8.setMargin(new java.awt.Insets(15, 0, 0, 15));

        jMenuItem38.setText("Acerca del Sistema");
        jMenu8.add(jMenuItem38);

        jMenuItem39.setText("Contenido e Índice de la Ayuda");
        jMenu8.add(jMenuItem39);

        jMenuItem51.setText("Asistencia Técnica");
        jMenu8.add(jMenuItem51);

        jMenuItem52.setText("Manual de Usuario");
        jMenu8.add(jMenuItem52);

        jMenuItem53.setText("Preguntas Frecuentes");
        jMenu8.add(jMenuItem53);

        jMenuBar2.add(jMenu8);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(486, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(333, 333, 333))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(59, 59, 59)
                        .addComponent(jLabel2)
                        .addGap(48, 48, 48))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(220, 220, 220)
                .addComponent(jLabel5)
                .addContainerGap(246, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    
    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        Salir s = new Salir();
        s.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem25ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem25ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem19;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem20;
    private javax.swing.JMenuItem jMenuItem21;
    private javax.swing.JMenuItem jMenuItem22;
    private javax.swing.JMenuItem jMenuItem23;
    private javax.swing.JMenuItem jMenuItem24;
    private javax.swing.JMenuItem jMenuItem25;
    private javax.swing.JMenuItem jMenuItem26;
    private javax.swing.JMenuItem jMenuItem27;
    private javax.swing.JMenuItem jMenuItem28;
    private javax.swing.JMenuItem jMenuItem29;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem30;
    private javax.swing.JMenuItem jMenuItem31;
    private javax.swing.JMenuItem jMenuItem32;
    private javax.swing.JMenuItem jMenuItem33;
    private javax.swing.JMenuItem jMenuItem34;
    private javax.swing.JMenuItem jMenuItem35;
    private javax.swing.JMenuItem jMenuItem36;
    private javax.swing.JMenuItem jMenuItem37;
    private javax.swing.JMenuItem jMenuItem38;
    private javax.swing.JMenuItem jMenuItem39;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem40;
    private javax.swing.JMenuItem jMenuItem41;
    private javax.swing.JMenuItem jMenuItem42;
    private javax.swing.JMenuItem jMenuItem43;
    private javax.swing.JMenuItem jMenuItem44;
    private javax.swing.JMenuItem jMenuItem45;
    private javax.swing.JMenuItem jMenuItem46;
    private javax.swing.JMenuItem jMenuItem47;
    private javax.swing.JMenuItem jMenuItem48;
    private javax.swing.JMenuItem jMenuItem49;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem50;
    private javax.swing.JMenuItem jMenuItem51;
    private javax.swing.JMenuItem jMenuItem52;
    private javax.swing.JMenuItem jMenuItem53;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    // End of variables declaration//GEN-END:variables

   
}
