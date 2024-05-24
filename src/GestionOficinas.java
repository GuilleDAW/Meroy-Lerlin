
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JFormattedTextField;
import javax.swing.text.MaskFormatter;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.File;
import java.io.IOException;
import java.sql.Statement;

public class GestionOficinas extends javax.swing.JFrame {

    public GestionOficinas() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelCabecera = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButtonNuevaOficina = new javax.swing.JButton();
        jTextFieldRegion = new javax.swing.JTextField();
        jTextFieldCiudad = new javax.swing.JTextField();
        jTextFieldPais = new javax.swing.JTextField();
        jButtonBorrarOficina = new javax.swing.JButton();
        jButtonBuscarOficina = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        MaskFormatter maskP=null;
        try{
            maskP=new MaskFormatter("#####");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, "El campo debe tener 5 números.", "Error", JOptionPane.INFORMATION_MESSAGE);
        }
        jFormattedTextFieldCodPostal = new JFormattedTextField(maskP);
        jTextFieldDirec1 = new javax.swing.JTextField();
        jTextFieldDirec2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButtonInforme = new javax.swing.JButton();
        MaskFormatter maskTLF=null;
        try{
            maskTLF=new MaskFormatter("#########");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, "El campo debe tener 5 números.", "Error", JOptionPane.INFORMATION_MESSAGE);
        }
        jFormattedTextFieldTelefono = new JFormattedTextField(maskTLF);
        jToggleButtonModificarOficina = new javax.swing.JToggleButton();
        jTextFieldCodOfi = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Meroy Lerlin-Gestión Oficinas");

        jPanelCabecera.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("Gestión de oficinas");

        jButtonNuevaOficina.setText("Nueva oficina");
        jButtonNuevaOficina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNuevaOficinaActionPerformed(evt);
            }
        });

        jButtonBorrarOficina.setText("Borrar oficina");
        jButtonBorrarOficina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBorrarOficinaActionPerformed(evt);
            }
        });

        jButtonBuscarOficina.setText("Buscar oficina");
        jButtonBuscarOficina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarOficinaActionPerformed(evt);
            }
        });

        jLabel2.setText("Código");

        jLabel3.setText("Ciudad");

        jLabel4.setText("País");

        jLabel5.setText("Región");

        jLabel6.setText("Código postal");

        jLabel7.setText("Teléfono");

        jLabel8.setText("Dirección 1");

        jLabel9.setText("Dirección 2");

        jButtonInforme.setText("Generar informe empleados");
        jButtonInforme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInformeActionPerformed(evt);
            }
        });

        jToggleButtonModificarOficina.setText("Modificar oficina");
        jToggleButtonModificarOficina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonModificarOficinaActionPerformed(evt);
            }
        });

        jTextFieldCodOfi.setText(" ");

        javax.swing.GroupLayout jPanelCabeceraLayout = new javax.swing.GroupLayout(jPanelCabecera);
        jPanelCabecera.setLayout(jPanelCabeceraLayout);
        jPanelCabeceraLayout.setHorizontalGroup(
            jPanelCabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCabeceraLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jButtonNuevaOficina)
                .addGap(38, 38, 38)
                .addComponent(jButtonBorrarOficina)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jToggleButtonModificarOficina)
                .addGap(18, 18, 18)
                .addComponent(jButtonBuscarOficina)
                .addGap(24, 24, 24))
            .addGroup(jPanelCabeceraLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanelCabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(40, 40, 40)
                .addGroup(jPanelCabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldCiudad, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                    .addComponent(jTextFieldPais)
                    .addComponent(jTextFieldRegion)
                    .addComponent(jTextFieldCodOfi))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelCabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel7))
                .addGap(8, 8, 8)
                .addGroup(jPanelCabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jFormattedTextFieldCodPostal)
                    .addComponent(jFormattedTextFieldTelefono)
                    .addComponent(jTextFieldDirec1, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                    .addComponent(jTextFieldDirec2))
                .addGap(45, 45, 45))
            .addGroup(jPanelCabeceraLayout.createSequentialGroup()
                .addGroup(jPanelCabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelCabeceraLayout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(jLabel1))
                    .addGroup(jPanelCabeceraLayout.createSequentialGroup()
                        .addGap(204, 204, 204)
                        .addComponent(jButtonInforme)))
                .addGap(56, 171, Short.MAX_VALUE))
        );
        jPanelCabeceraLayout.setVerticalGroup(
            jPanelCabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCabeceraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(jPanelCabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jFormattedTextFieldCodPostal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jTextFieldCodOfi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanelCabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7)
                    .addComponent(jFormattedTextFieldTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanelCabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldDirec1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(35, 35, 35)
                .addGroup(jPanelCabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldRegion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jTextFieldDirec2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(jPanelCabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonBorrarOficina)
                    .addComponent(jButtonNuevaOficina)
                    .addComponent(jButtonBuscarOficina)
                    .addComponent(jToggleButtonModificarOficina))
                .addGap(47, 47, 47)
                .addComponent(jButtonInforme)
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelCabecera, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelCabecera, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonNuevaOficinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNuevaOficinaActionPerformed

        Oficina o1 = new Oficina(jTextFieldCodOfi.getText(), jTextFieldCiudad.getText(), jTextFieldPais.getText(), jTextFieldRegion.getText(), jFormattedTextFieldCodPostal.getText(), jFormattedTextFieldTelefono.getText(), jTextFieldDirec1.getText(), jTextFieldDirec2.getText());

        try {
            Connection con = ConexiónBD.getConnection();

            String sql = "INSERT INTO oficina VALUES(?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement st = con.prepareStatement(sql);

            st.setString(1, (o1.getCodigoOficina()).toUpperCase());
            st.setString(2, o1.getCiudad());
            st.setString(3, o1.getPais());
            st.setString(4, o1.getRegion());
            st.setString(5, o1.getCP());
            st.setString(6, o1.getTelefono());
            st.setString(7, o1.getLineaDir1());
            st.setString(8, o1.getLineaDir2());

            st.executeUpdate();

            //Esto es para que los campos se queden en blanco
            jTextFieldCodOfi.setText("");
            jTextFieldCiudad.setText("");
            jTextFieldPais.setText("");
            jTextFieldRegion.setText("");
            jFormattedTextFieldCodPostal.setText("");
            jFormattedTextFieldTelefono.setText("");
            jTextFieldDirec1.setText("");
            jTextFieldDirec2.setText("");

            JOptionPane.showMessageDialog(this, "Oficina creada con éxito", "Creación de oficina.", JOptionPane.INFORMATION_MESSAGE);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error al crear la oficina.", "Error", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButtonNuevaOficinaActionPerformed

    private void jButtonBorrarOficinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBorrarOficinaActionPerformed

        String codOfi = JOptionPane.showInputDialog(this, "Introduce el código de la oficina", "Eliminar oficina", JOptionPane.QUESTION_MESSAGE);

        try {

            Connection con = ConexiónBD.getConnection();
            String sql = "SELECT * FROM empleado WHERE codigo_oficina LIKE UPPER(?)";
            PreparedStatement sentencia;
            sentencia = con.prepareStatement(sql);
            sentencia.setString(1, codOfi);
            ResultSet rs = sentencia.executeQuery();

            if (!rs.next()) {

                String sql2 = "DELETE FROM oficina WHERE codigo_oficina LIKE ?";
                PreparedStatement ps = con.prepareStatement(sql2);
                ps.setString(1, codOfi);
                ps.executeUpdate();

                JOptionPane.showMessageDialog(this, "Oficina eliminada con éxito", "Eliminar oficina", JOptionPane.INFORMATION_MESSAGE);

            } else {
                JOptionPane.showMessageDialog(this, " No puedes eliminar la oficina " + codOfi + " . Tiene empleados asociados.", "Error", JOptionPane.WARNING_MESSAGE);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, " Error de conexión a la base de datos.", "Buscar usuario.", JOptionPane.WARNING_MESSAGE);
        }

    }

    private void jButtonBuscarUsuActionPerformed(java.awt.event.ActionEvent evt) {

    }//GEN-LAST:event_jButtonBorrarOficinaActionPerformed

    private void jToggleButtonModificarOficinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonModificarOficinaActionPerformed
        boolean activado = jToggleButtonModificarOficina.isSelected();
        String codOf = "";
        String codOfi = "";

        if (activado == true) {
            codOf = JOptionPane.showInputDialog("Introduce el código de la oficina");
            codOfi = codOf.toUpperCase();
            try {
                Connection con = ConexiónBD.getConnection();
                String sql = "SELECT * FROM oficina WHERE codigo_oficina= UPPER(?)";
                PreparedStatement ps = con.prepareStatement(sql);
                ps.setString(1, codOfi);
                ResultSet rs = ps.executeQuery();

                String[] columnas = new String[8];
                while (rs.next()) {
                    columnas[0] = rs.getString(1);
                    columnas[1] = rs.getString(2);
                    columnas[2] = rs.getString(3);
                    columnas[3] = rs.getString(4);
                    columnas[4] = rs.getString(5);
                    columnas[5] = rs.getString(6);
                    columnas[6] = rs.getString(7);
                    columnas[7] = rs.getString(8);
                }

                jTextFieldCodOfi.setText(columnas[0]);
                jTextFieldCiudad.setText(columnas[1]);
                jTextFieldPais.setText(columnas[2]);
                jTextFieldRegion.setText(columnas[3]);
                jFormattedTextFieldCodPostal.setText(columnas[4]);
                jFormattedTextFieldTelefono.setText(columnas[5]);
                jTextFieldDirec1.setText(columnas[6]);
                jTextFieldDirec2.setText(columnas[7]);

                jTextFieldCodOfi.setEnabled(false);

                JOptionPane.showMessageDialog(this, "Datos de la oficina cargados eficientemente", "Modificación de oficina", JOptionPane.INFORMATION_MESSAGE);
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Error al cargar los datos de la oficina", "Error", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            try {
                Connection con = ConexiónBD.getConnection();
                String sql = "UPDATE oficina SET ciudad = ? ,pais = ? ,region = ? ,codigo_postal = ? ,telefono = ? ,linea_direccion1 = ? ,linea_direccion2 = ? WHERE codigo_oficina = ? ";
                PreparedStatement ps = con.prepareStatement(sql);

                ps.setString(1, jTextFieldCiudad.getText());
                ps.setString(2, jTextFieldPais.getText());
                ps.setString(3, jTextFieldRegion.getText());
                ps.setString(4, jFormattedTextFieldCodPostal.getText());
                ps.setString(5, jFormattedTextFieldTelefono.getText());
                ps.setString(6, jTextFieldDirec1.getText());
                ps.setString(7, jTextFieldDirec2.getText());
                ps.setString(8, jTextFieldCodOfi.getText());

                ps.executeUpdate();

                jTextFieldCodOfi.setText("");
                jTextFieldCiudad.setText("");
                jTextFieldPais.setText("");
                jTextFieldRegion.setText("");
                jFormattedTextFieldCodPostal.setText("");
                jFormattedTextFieldTelefono.setText("");
                jTextFieldDirec1.setText("");
                jTextFieldDirec2.setText("");

                jTextFieldCodOfi.setEnabled(true);

                JOptionPane.showMessageDialog(this, "Oficina modificada con éxito", "Modificación de la oficina", JOptionPane.INFORMATION_MESSAGE);

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Error al modificar la oficina", "Error", JOptionPane.WARNING_MESSAGE);

            }

        }
    }//GEN-LAST:event_jToggleButtonModificarOficinaActionPerformed

    private void jButtonBuscarOficinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarOficinaActionPerformed
        String codOf = JOptionPane.showInputDialog("Introduce el código de la oficina");

        try {
            Connection con = ConexiónBD.getConnection();
            String sql = "SELECT * FROM oficina WHERE codigo_oficina=UPPER(?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, codOf);
            ResultSet rs = ps.executeQuery();

            String[] columnas = new String[8];
            while (rs.next()) {
                columnas[0] = rs.getString(1);
                columnas[1] = rs.getString(2);
                columnas[2] = rs.getString(3);
                columnas[3] = rs.getString(4);
                columnas[4] = rs.getString(5);
                columnas[5] = rs.getString(6);
                columnas[6] = rs.getString(7);
                columnas[7] = rs.getString(8);
            }

            String cod = columnas[0], ciudad = columnas[1], pais = columnas[2], region = columnas[3], codpostal = columnas[4], tlf = columnas[5], dir1 = columnas[6], dir2 = columnas[7];

            JOptionPane.showMessageDialog(this, "Datos de la oficina:\n Código: " + cod + "\n Ciudad: " + ciudad + "\n Pais: " + pais + "\n Region: " + region + "\n Código Postal: " + codpostal + "\n Telefono: " + tlf + "\n Dirección 1: " + dir1 + "\n Dirección 2: " + dir2, "Búsqueda de la oficina.", JOptionPane.INFORMATION_MESSAGE);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "No se pueden cargar los datos de las oficinas.", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_jButtonBuscarOficinaActionPerformed

    private void jButtonInformeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInformeActionPerformed
        try {
            Connection con = ConexiónBD.getConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT codigo_oficina, COUNT(*) FROM empleado GROUP BY codigo_oficina");

            StringBuilder message = new StringBuilder("Empleados por oficinas:\n");
            while (rs.next()) {
                String codigoOficina = rs.getString("codigo_oficina");
                int cantidadEmpleados = rs.getInt(2); // Obtenemos la cantidad de empleados directamente desde el ResultSet

                // Construimos la cadena con la información de la oficina y la cantidad de empleados
                message.append("Oficina: ").append(codigoOficina).append(", Cantidad de empleados: ").append(cantidadEmpleados).append("\n");
            }

            JOptionPane.showMessageDialog(this, message.toString(), "Información de empleados por oficina", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException exc) {
            JOptionPane.showMessageDialog(this, "No se pueden cargar los datos de las oficinas.", "Error", JOptionPane.ERROR_MESSAGE);
        }

        int opc = JOptionPane.showConfirmDialog(this, "¿Quieres generar un documento?", "Informe de empleados", JOptionPane.YES_NO_CANCEL_OPTION);

        if (opc == 0) {
            try {
                Connection con = ConexiónBD.getConnection();
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("SELECT codigo_oficina, COUNT(*) FROM empleado GROUP BY codigo_oficina");

                File archivo = new File("src\\informe.txt");
                FileWriter fw = new FileWriter(archivo, true);
                BufferedWriter bw = new BufferedWriter(fw);

                String linea;
                bw.write("Número de empleados por oficina: \n");
                while (rs.next()) {
                    linea = "";
                    for (int i = 0; i < 2; i++) {
                        linea += (rs.getString(i + 1)) + " ";
                    }
                    bw.write(linea + "\n");
                }

                JOptionPane.showMessageDialog(this, "Informe generado con éxito", "Generación de informe de empleados.", JOptionPane.INFORMATION_MESSAGE);

                bw.close();
                fw.close();

            } catch (IOException e) {
                JOptionPane.showMessageDialog(this, "Error al crear el txt", "Error", JOptionPane.ERROR_MESSAGE);
            } catch (SQLException E) {
                JOptionPane.showMessageDialog(this, "Error al cargar los datos", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else if (opc == 1) {
            try {
                Connection con = ConexiónBD.getConnection();
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("SELECT codigo_oficina, COUNT(*) FROM empleado GROUP BY codigo_oficina");

                StringBuilder message = new StringBuilder("Empleados por oficinas:\n");
                while (rs.next()) {
                    String codigoOficina = rs.getString("codigo_oficina");
                    int cantidadEmpleados = rs.getInt(2); // Obtenemos la cantidad de empleados directamente desde el ResultSet

                    // Construimos la cadena con la información de la oficina y la cantidad de empleados
                    message.append("Oficina: ").append(codigoOficina).append(", Cantidad de empleados: ").append(cantidadEmpleados).append("\n");
                }

                JOptionPane.showMessageDialog(this, message.toString(), "Información de empleados por oficina", JOptionPane.INFORMATION_MESSAGE);
            } catch (SQLException exc) {
                JOptionPane.showMessageDialog(this, "No se pueden cargar los datos de las oficinas.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButtonInformeActionPerformed

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(GestionOficinas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionOficinas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionOficinas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionOficinas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionOficinas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBorrarOficina;
    private javax.swing.JButton jButtonBuscarOficina;
    private javax.swing.JButton jButtonInforme;
    private javax.swing.JButton jButtonNuevaOficina;
    private javax.swing.JFormattedTextField jFormattedTextFieldCodPostal;
    private javax.swing.JFormattedTextField jFormattedTextFieldTelefono;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanelCabecera;
    private javax.swing.JTextField jTextFieldCiudad;
    private javax.swing.JTextField jTextFieldCodOfi;
    private javax.swing.JTextField jTextFieldDirec1;
    private javax.swing.JTextField jTextFieldDirec2;
    private javax.swing.JTextField jTextFieldPais;
    private javax.swing.JTextField jTextFieldRegion;
    private javax.swing.JToggleButton jToggleButtonModificarOficina;
    // End of variables declaration//GEN-END:variables
}
