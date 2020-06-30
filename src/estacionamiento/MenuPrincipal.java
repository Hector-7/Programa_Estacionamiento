
package estacionamiento;


public class MenuPrincipal extends javax.swing.JFrame {

    //En esta seccion se muestra el menu principal centrado para su uso.
    public MenuPrincipal() {
        initComponents();
        setLocationRelativeTo(null);
        getContentPane().setLayout(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jmnu_admin = new javax.swing.JMenu();
        jmnu_acomod = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jmnui_alta = new javax.swing.JMenuItem();
        jmnui_consulta = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jmnui_empleado = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jmnui_cliente = new javax.swing.JMenuItem();
        jmnui_servidor = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jmnu_admin.setText("Administrador");
        jmnu_admin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmnu_adminMouseClicked(evt);
            }
        });
        jMenuBar1.add(jmnu_admin);

        jmnu_acomod.setText("Acomodador");
        jmnu_acomod.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmnu_acomodMouseClicked(evt);
            }
        });
        jMenuBar1.add(jmnu_acomod);

        jMenu3.setText("Boleto");

        jmnui_alta.setText("Alta");
        jmnui_alta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmnui_altaActionPerformed(evt);
            }
        });
        jMenu3.add(jmnui_alta);

        jmnui_consulta.setText("Consulta");
        jmnui_consulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmnui_consultaActionPerformed(evt);
            }
        });
        jMenu3.add(jmnui_consulta);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Nomina");

        jmnui_empleado.setText("Empleado");
        jmnui_empleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmnui_empleadoActionPerformed(evt);
            }
        });
        jMenu4.add(jmnui_empleado);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("Auto");
        jMenuBar1.add(jMenu5);

        jMenu6.setText("Chat");

        jmnui_cliente.setText("Cliente");
        jmnui_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmnui_clienteActionPerformed(evt);
            }
        });
        jMenu6.add(jmnui_cliente);

        jmnui_servidor.setText("Servidor");
        jmnui_servidor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmnui_servidorActionPerformed(evt);
            }
        });
        jMenu6.add(jmnui_servidor);

        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 513, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 278, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//En esta seccion se mostrara el menu de administrador con sus respectivas funciones usando la funcion de hilos para mostrar un mensaje.
    private void jmnu_adminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmnu_adminMouseClicked
        /*RegistroNuevoAcomodador nAcom = new RegistroNuevoAcomodador();
        nAcom.setVisible(true);*/
        Thread hilo= new Proceso("Usted selecciono el proceso para registrar un nuevo acomodador");
        hilo.start();
        RegistroNuevoAcomodador nAcom = new RegistroNuevoAcomodador();
        nAcom.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jmnu_adminMouseClicked
//En esta seccion se mostrara el menu de acomodadores, empezando por una pantalla de acceso de cuenta, con sus respectivas funciones usando la funcion de hilos para mostrar un mensaje.
    private void jmnu_acomodMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmnu_acomodMouseClicked
        /*Contrasena contr = new Contrasena();
        contr.setVisible(true);*/
        Thread hilo= new Proceso ("Usted selecciono el proceso para registrar un nuevo vehiculo");
        hilo.start();
        Contrasena contr = new Contrasena();
        contr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jmnu_acomodMouseClicked
//En esta seccion se mostrara e l menu de alta, empezando por una pantalla de acceso de cuenta, con sus respectivas funciones usando la funcion de hilos para mostrar un mensaje.
    private void jmnui_altaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmnui_altaActionPerformed
        
        Thread hilo= new Proceso ("Usted selecciono el proceso para dar de alta un vehiculo");
        hilo.start();
        Contrasena contr = new Contrasena();
        contr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jmnui_altaActionPerformed
//En esta seccion se mostrara el menu de consulta, con sus respectivas funciones usando la funcion de hilos para mostrar un mensaje.
    private void jmnui_consultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmnui_consultaActionPerformed
        
        Thread hilo= new Proceso ("Usted selecciono el proceso para generar un reporte de todos los vehiculos registrados");
        hilo.start();
        ConsultaDatos consulta = new ConsultaDatos();
        consulta.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jmnui_consultaActionPerformed

    private void jmnui_empleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmnui_empleadoActionPerformed
        // TODO add your handling code here:
        Thread hilo= new Proceso ("Usted selecciono el proceso para revisar la nomina de los acomodadores");
        hilo.start();
        nominaEmpleados nomina = new nominaEmpleados();
        nomina.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jmnui_empleadoActionPerformed

    private void jmnui_servidorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmnui_servidorActionPerformed
        Thread hilo= new Proceso ("Usted selecciono el chat");
        hilo.start();
        Frm1 chatS = new Frm1();
        chatS.setVisible(true);
        //this.dispose();
    }//GEN-LAST:event_jmnui_servidorActionPerformed

    private void jmnui_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmnui_clienteActionPerformed
        Thread hilo= new Proceso ("Usted selecciono el chat");
        hilo.start();
        Frm2 chatC = new Frm2();
        chatC.setVisible(true);
        //this.dispose();
    }//GEN-LAST:event_jmnui_clienteActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jmnu_acomod;
    private javax.swing.JMenu jmnu_admin;
    private javax.swing.JMenuItem jmnui_alta;
    private javax.swing.JMenuItem jmnui_cliente;
    private javax.swing.JMenuItem jmnui_consulta;
    private javax.swing.JMenuItem jmnui_empleado;
    private javax.swing.JMenuItem jmnui_servidor;
    // End of variables declaration//GEN-END:variables
}
