
package estacionamiento;
//Se genera la importacion de los metodos y librerias necesarias para el desarrollo del programa
import Metodos_sql.ConexionBD;
import static Metodos_sql.ConexionBD.PASSWORD;
import static Metodos_sql.ConexionBD.URL;
import static Metodos_sql.ConexionBD.USERNAME;
import com.mysql.jdbc.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.DriverManager;


//Se genera la funcionalidad que englobara todo el menu de acomodadores
public class RegistroNuevoAcomodador extends javax.swing.JFrame {
    //Se crean las variables necesarias para crear las sentencias preparadas y el logeo a la base de datos.
    PreparedStatement ps;
    ResultSet rs;
    public static final String URL = "jdbc:mysql://localhost:3306/Estacionamiento";
    public static final String USERNAME = "root";
    public static final String PASSWORD = "";
    //Se crea el metodo de conxion a la base de datos para utilizarlo en los diferentes puntos del programa.
    public static Connection getConection(){
        Connection con = null;
        
        try{
            
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection)DriverManager.getConnection(URL,USERNAME,PASSWORD);
            JOptionPane.showMessageDialog(null, "Conexion exitosa");
            
        }catch(Exception e){
            System.out.println(e);
        }
        return con;
    }
    //Se genera la visualizacion del menu de registro de nuevo acomodador con su titulo
    public RegistroNuevoAcomodador() {
        initComponents();
        setLocationRelativeTo(null);
        getContentPane().setLayout(null);
        this.setTitle("Registro de nuevos acomodadores");
        
        /*ConexionBD con=new ConexionBD();
        System.out.println("Conexion establecida");*/
    }
   //Se crea el metodo para limpiar las cajas de texto una vez usadas ciertas funciones.
    private void limpiarCajas(){
        txt_idEmpleado.setText(null);
        txt_nombreCompleto.setText(null);
        txt_puesto.setText(null);
        cbx_nivel.setSelectedIndex(0);
        txt_sueldo.setText(null);
        txt_direccion.setText(null);
        txt_contraseña.setText(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_nombreCompleto = new javax.swing.JTextField();
        txt_direccion = new javax.swing.JTextField();
        txt_sueldo = new javax.swing.JTextField();
        txt_puesto = new javax.swing.JTextField();
        txt_idEmpleado = new javax.swing.JTextField();
        btn_guardar = new javax.swing.JButton();
        btn_borrar = new javax.swing.JButton();
        btn_modificar = new javax.swing.JButton();
        btn_buscar = new javax.swing.JButton();
        btn_regresar = new javax.swing.JButton();
        cbx_nivel = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        txt_contraseña = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nombre Completo");

        jLabel2.setText("Direccion");

        jLabel3.setText("Sueldo");

        jLabel4.setText("Nivel");

        jLabel5.setText("Puesto");

        jLabel6.setText("ID Acomodador");

        btn_guardar.setText("Guardar");
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });

        btn_borrar.setText("Borrar");
        btn_borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_borrarActionPerformed(evt);
            }
        });

        btn_modificar.setText("Modificar");
        btn_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificarActionPerformed(evt);
            }
        });

        btn_buscar.setText("Buscar empleado");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        btn_regresar.setText("Regresar menu principal");
        btn_regresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_regresarMouseClicked(evt);
            }
        });

        cbx_nivel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona", "1", "2", "3", "4" }));

        jLabel7.setText("Contraseña");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_nombreCompleto)
                            .addComponent(txt_direccion)
                            .addComponent(txt_sueldo)
                            .addComponent(txt_puesto)
                            .addComponent(txt_idEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
                            .addComponent(cbx_nivel, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_contraseña)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_regresar)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_buscar)
                                .addGap(48, 48, 48)
                                .addComponent(btn_guardar)
                                .addGap(31, 31, 31)
                                .addComponent(btn_borrar)
                                .addGap(27, 27, 27)
                                .addComponent(btn_modificar)))))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_nombreCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_sueldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbx_nivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(txt_puesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_idEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txt_contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_guardar)
                    .addComponent(btn_borrar)
                    .addComponent(btn_modificar)
                    .addComponent(btn_buscar))
                .addGap(39, 39, 39)
                .addComponent(btn_regresar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//Se genera el boton guardar que conectara a la base de datos y registrara todos los datos del nuevo acomodador ingresador por el administrador, usando la fucion Try-Catch
    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
        Connection con=null;
        
        try{
            con = getConection();
            ps = con.prepareStatement("INSERT INTO acomodadores(Nombre, Puesto, Nivel, Sueldo, Direccion, Contraseña) VALUES(?,?,?,?,?,?)");
            ps.setString(1, txt_nombreCompleto.getText());
            ps.setString(2, txt_puesto.getText());
            ps.setInt(3, cbx_nivel.getSelectedIndex());
            ps.setFloat(4, Float.parseFloat(txt_sueldo.getText()));
            ps.setString(5, txt_direccion.getText());
            ps.setString(6, txt_contraseña.getText());
            
            int res = ps.executeUpdate();
            
            if(res>0){
                JOptionPane.showMessageDialog(null, "Nuevo acomodador guardado");
                limpiarCajas();
            } else{
                JOptionPane.showMessageDialog(null, "Error al guardar los datos");
                limpiarCajas();
            }
            
            con.close();
        }catch(Exception e){
            System.err.println(e);
        }
        
    }//GEN-LAST:event_btn_guardarActionPerformed
//Se crea la funcion para el boton regresar, el cual nos regresara al menu principal para elegir alguna otra funcion adicional.
    private void btn_regresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_regresarMouseClicked
        MenuPrincipal mPri = new MenuPrincipal();
        mPri.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_regresarMouseClicked
//Se genera el boton buscar, el cual buscara en la base de datos el acomodador solicitado, ya sea para modificarlo o eliminarlo del registro.
    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        Connection con=null;
        
        try{
            con = getConection();
            ps = con.prepareStatement("Select * FROM acomodadores WHERE idAcomodador = ?");
            ps.setInt(1, Integer.parseInt(txt_idEmpleado.getText()));
            
            rs = ps.executeQuery();
            
            if(rs.next()){
                txt_nombreCompleto.setText(rs.getString("Nombre"));
                txt_puesto.setText(rs.getString("Puesto"));
                cbx_nivel.setSelectedItem(rs.getString("Nivel"));
                txt_sueldo.setText(String.valueOf(rs.getFloat("Sueldo")));
                txt_direccion.setText(rs.getString("Direccion"));
                txt_contraseña.setText(rs.getString("Contraseña"));
            }else{
            JOptionPane.showMessageDialog(null,"No existe una persona con ese ID");
            }
        }catch(Exception e){
            System.err.println(e);
        }
    }//GEN-LAST:event_btn_buscarActionPerformed
//Se crea la funcion modificar, la cual modificara o actualizara los datos de algun acomodador ya guardado en la base de datos.
    private void btn_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarActionPerformed
        Connection con=null;
        
        try{
            con = getConection();
            ps = con.prepareStatement("UPDATE acomodadores SET Nombre=?, Puesto=?, Nivel=?, Sueldo=?, Direccion=?, Contraseña=? WHERE idAcomodador=?");
            ps.setString(1, txt_nombreCompleto.getText());
            ps.setString(2, txt_puesto.getText());
            ps.setInt(3, cbx_nivel.getSelectedIndex());
            ps.setFloat(4, Float.parseFloat(txt_sueldo.getText()));
            ps.setString(5, txt_direccion.getText());
            ps.setString(6, txt_contraseña.getText());
            
            ps.setString(7, txt_idEmpleado.getText());
            
            int res = ps.executeUpdate();
            
            if(res>0){
                JOptionPane.showMessageDialog(null, "Se actualizaron los datos del acomodador");
                limpiarCajas();
            } else{
                JOptionPane.showMessageDialog(null, "Error al actualizar los datos");
                limpiarCajas();
            }
            
            con.close();
        }catch(Exception e){
            System.err.println(e);
        }
    }//GEN-LAST:event_btn_modificarActionPerformed
//Se crea la funcion de borrado, el cual borrara de la base de datos el acomodador que sea seleccionado.
    private void btn_borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_borrarActionPerformed
        Connection con=null;
        
        try{
            con = getConection();
            ps = con.prepareStatement("DELETE FROM acomodadores WHERE idAcomodador=?");
            ps.setString(1, txt_idEmpleado.getText());
            //ps.setInt(1, Integer.parseInt(txt_idEmpleado.getText()));
            
            int res = ps.executeUpdate();
            
            if(res>0){
                JOptionPane.showMessageDialog(null, "Se Borraron los datos del acomodador de la base de datos");
                limpiarCajas();
            } else{
                JOptionPane.showMessageDialog(null, "Error al borrar los datos del acomodador");
                limpiarCajas();
            }
            
            con.close();
        }catch(Exception e){
            System.err.println(e);
        }
    }//GEN-LAST:event_btn_borrarActionPerformed

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
            java.util.logging.Logger.getLogger(RegistroNuevoAcomodador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroNuevoAcomodador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroNuevoAcomodador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroNuevoAcomodador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroNuevoAcomodador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_borrar;
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_guardar;
    private javax.swing.JButton btn_modificar;
    private javax.swing.JButton btn_regresar;
    private javax.swing.JComboBox<String> cbx_nivel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txt_contraseña;
    private javax.swing.JTextField txt_direccion;
    private javax.swing.JTextField txt_idEmpleado;
    private javax.swing.JTextField txt_nombreCompleto;
    private javax.swing.JTextField txt_puesto;
    private javax.swing.JTextField txt_sueldo;
    // End of variables declaration//GEN-END:variables
}
