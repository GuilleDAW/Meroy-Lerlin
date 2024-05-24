
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JFormattedTextField;
import javax.swing.text.MaskFormatter;

public class GestionEmpleado extends javax.swing.JFrame {

    public GestionEmpleado() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jButton1CrearEmp = new javax.swing.JButton();
        jButton2BorrarEmp = new javax.swing.JButton();
        jButton4BuscarEmp = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldMail = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldCodJefe = new javax.swing.JTextField();
        MaskFormatter maskEX=null;
        try{
            maskEX=new MaskFormatter("####");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, "Introduzca los datos correctos", "Error", JOptionPane.INFORMATION_MESSAGE);
        }
        jFormattedTextFieldExtension = new JFormattedTextField(maskEX);
        ;
        jTextFieldPuesto = new javax.swing.JTextField();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldAp1 = new javax.swing.JTextField();
        jTextFieldAp2 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jToggleButtonModificar = new javax.swing.JToggleButton();
        jLabel14 = new javax.swing.JLabel();
        jLabelEMP = new javax.swing.JLabel();
        jTextFieldCodOfi = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jButtonListadoEmpleados = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextFieldCod_JEF = new javax.swing.JTextField();
        jTextFieldCod_OF = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jToggleButtonModificarOF = new javax.swing.JToggleButton();
        jToggleButtonModificarJEF = new javax.swing.JToggleButton();
        jLabel13 = new javax.swing.JLabel();
        jLabelEmp = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gestión Empleados");

        jButton1CrearEmp.setText("Crear empleado");
        jButton1CrearEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1CrearEmpActionPerformed(evt);
            }
        });

        jButton2BorrarEmp.setText("Borrar empleado");
        jButton2BorrarEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2BorrarEmpActionPerformed(evt);
            }
        });

        jButton4BuscarEmp.setText("Buscar empleado");
        jButton4BuscarEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4BuscarEmpActionPerformed(evt);
            }
        });

        jLabel1.setText("Nombre");

        jLabel2.setText("Apellido 1");

        jLabel3.setText("Apellido 2");

        jLabel4.setText("Extensión");

        jLabel5.setText("E mail");

        jLabel6.setText("Código oficina");

        jLabel7.setText("Código jefe");

        jLabel8.setText("Puesto");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 102, 102));
        jLabel9.setText("Gestión de empleados");

        jToggleButtonModificar.setText("Modificar empleado");
        jToggleButtonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonModificarActionPerformed(evt);
            }
        });

        jLabel14.setText("Código empleado");

        jLabelEMP.setText(" ");

        jTextFieldCodOfi.setText(" ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldAp2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldAp1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(90, 90, 90))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTextFieldMail, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jFormattedTextFieldExtension, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel7))
                                .addGap(25, 25, 25)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTextFieldCodJefe, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                                    .addComponent(jTextFieldPuesto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                                    .addComponent(jTextFieldCodOfi, javax.swing.GroupLayout.Alignment.LEADING)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(31, 31, 31)
                                .addComponent(jLabelEMP, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(225, 225, 225))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1CrearEmp)
                        .addGap(47, 47, 47)
                        .addComponent(jButton2BorrarEmp)
                        .addGap(46, 46, 46)
                        .addComponent(jToggleButtonModificar)
                        .addGap(55, 55, 55)
                        .addComponent(jButton4BuscarEmp)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(233, 233, 233)
                .addComponent(jLabel9)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(jTextFieldAp1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(14, 14, 14)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(jTextFieldAp2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(86, 86, 86)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(jTextFieldPuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jTextFieldCodOfi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jTextFieldCodJefe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jFormattedTextFieldExtension, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(jLabelEMP))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jTextFieldMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1CrearEmp)
                    .addComponent(jButton2BorrarEmp)
                    .addComponent(jButton4BuscarEmp)
                    .addComponent(jToggleButtonModificar))
                .addGap(81, 81, 81))
        );

        jTabbedPane1.addTab("Creación y edición de empleado", jPanel1);

        jButtonListadoEmpleados.setText("Listado de empleados");
        jButtonListadoEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListadoEmpleadosActionPerformed(evt);
            }
        });

        jLabel10.setText("Código Oficina");

        jLabel11.setText("Código Jefe");

        jTextFieldCod_OF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCod_OFActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 102, 102));
        jLabel12.setText("Gestión de empleados");

        jToggleButtonModificarOF.setText("Cambiar oficina del empleado");
        jToggleButtonModificarOF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonModificarOFActionPerformed(evt);
            }
        });

        jToggleButtonModificarJEF.setText("Cambiar jefe del empleado");
        jToggleButtonModificarJEF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonModificarJEFActionPerformed(evt);
            }
        });

        jLabel13.setText("Codigo del empleado");

        jLabelEmp.setText(" ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToggleButtonModificarOF)
                    .addComponent(jToggleButtonModificarJEF)
                    .addComponent(jButtonListadoEmpleados))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10))
                        .addGap(51, 51, 51)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldCod_OF, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                            .addComponent(jTextFieldCod_JEF)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                        .addComponent(jLabelEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(247, 247, 247)
                .addComponent(jLabel12)
                .addGap(0, 288, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel12)
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTextFieldCod_OF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButtonModificarOF))
                .addGap(45, 45, 45)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jTextFieldCod_JEF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButtonModificarJEF))
                .addGap(45, 45, 45)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabelEmp))
                .addGap(2, 2, 2)
                .addComponent(jButtonListadoEmpleados)
                .addContainerGap(176, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Información y gestión", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 756, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1CrearEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1CrearEmpActionPerformed

        Empleado e1 = new Empleado(0, jTextFieldNombre.getText(), jTextFieldAp1.getText(), jTextFieldAp2.getText(), jFormattedTextFieldExtension.getText(), jTextFieldMail.getText(), jTextFieldCodOfi.getText().toUpperCase(), Integer.parseInt(jTextFieldCodJefe.getText()), jTextFieldPuesto.getText());
        boolean valid = true;        

        if (jTextFieldNombre.getText().isEmpty()) {
            jTextFieldNombre.setBorder(BorderFactory.createLineBorder(Color.RED));
            valid = false;
        } else {
            jTextFieldNombre.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        }

        if (jTextFieldAp1.getText().isEmpty()) {
            jTextFieldAp1.setBorder(BorderFactory.createLineBorder(Color.RED));
            valid = false;
        } else {
            jTextFieldAp1.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        }

        if (jFormattedTextFieldExtension.getText().isEmpty()) {
            jFormattedTextFieldExtension.setBorder(BorderFactory.createLineBorder(Color.RED));
            valid = false;
        } else {
            jFormattedTextFieldExtension.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        }

        if (jTextFieldMail.getText().isEmpty()) {
            jTextFieldMail.setBorder(BorderFactory.createLineBorder(Color.RED));
            valid = false;
        } else {
            jTextFieldMail.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        }

        if (jTextFieldCodOfi.getText().isEmpty()) {
            jTextFieldCodOfi.setBorder(BorderFactory.createLineBorder(Color.RED));
            valid = false;
        } else {
            jTextFieldCodOfi.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        }

        try {
            Connection con = ConexiónBD.getConnection();
            String sql = "INSERT INTO empleado VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement st = con.prepareStatement(sql);

            st.setInt(1, e1.getCodigoEmp());
            st.setString(2, e1.getNombre());
            st.setString(3, e1.getApellido1());
            st.setString(4, e1.getApellido2());
            st.setString(5, e1.getExtensión());
            st.setString(6, e1.getEmail());
            st.setString(7, e1.getCodigoOficina().toUpperCase());
            st.setInt(8, e1.getCodigoJefe());
            st.setString(9, e1.getPuesto());

            st.executeUpdate();

            jTextFieldNombre.setText("");
            jTextFieldAp1.setText("");
            jTextFieldAp2.setText("");
            jFormattedTextFieldExtension.setText("");
            jTextFieldMail.setText("");
            jTextFieldCodOfi.setText("");
            jTextFieldCodJefe.setText("");
            jTextFieldPuesto.setText("");

            JOptionPane.showMessageDialog(this, "Empleado creado con éxito", "Creación del usuario", JOptionPane.INFORMATION_MESSAGE);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Los campos señalados son obligatorios.", "Error", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButton1CrearEmpActionPerformed

    private void jButton2BorrarEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2BorrarEmpActionPerformed
        try {
            boolean eliminarEmpleado = true;
            while (eliminarEmpleado) {
                String codEmp = JOptionPane.showInputDialog("Introduce el código del empleado");

                if (codEmp == null || codEmp.isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Debe introducir un código de empleado válido", "Error", JOptionPane.WARNING_MESSAGE);

                    break;
                }

                try {
                    Connection con = ConexiónBD.getConnection();

                    String sqlCheck = "SELECT * FROM empleado WHERE codigo_empleado=?";
                    PreparedStatement psCheck = con.prepareStatement(sqlCheck);
                    psCheck.setString(1, codEmp);
                    ResultSet rsCheck = psCheck.executeQuery();

                    if (!rsCheck.next()) {
                        JOptionPane.showMessageDialog(this, "No se encontró ningún empleado con el código especificado", "Error", JOptionPane.WARNING_MESSAGE);
                        continue;
                    }

                    String sqlDelete = "DELETE FROM empleado WHERE codigo_empleado=?";
                    PreparedStatement psDelete = con.prepareStatement(sqlDelete);
                    psDelete.setString(1, codEmp);
                    psDelete.executeUpdate();

                    int opc = JOptionPane.showConfirmDialog(this, "¿Está seguro de que desea eliminar el empleado con código " + codEmp + "?", "Eliminación de empleado", JOptionPane.YES_NO_CANCEL_OPTION);
                    if (opc == JOptionPane.YES_OPTION) {
                        JOptionPane.showMessageDialog(this, "Empleado eliminado con éxito", "Eliminación de empleado", JOptionPane.INFORMATION_MESSAGE);
                    } else if (opc == JOptionPane.NO_OPTION) {
                        JOptionPane.showMessageDialog(this, "Operación cancelada", "Eliminación de empleado", JOptionPane.INFORMATION_MESSAGE);

                    } else if (opc == JOptionPane.CANCEL_OPTION) {
                        JOptionPane.showMessageDialog(this, "Empleado no eliminado", "Eliminación de empleado", JOptionPane.INFORMATION_MESSAGE);

                        break;
                    }
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(this, "Error al eliminar el empleado", "Error", JOptionPane.WARNING_MESSAGE);
                }
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error al eliminar el empleado", "Error", JOptionPane.WARNING_MESSAGE);
        }


    }//GEN-LAST:event_jButton2BorrarEmpActionPerformed

    private void jButton4BuscarEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4BuscarEmpActionPerformed
        try {
            boolean comprobar = true;
            while (comprobar) {
                String codEmp = JOptionPane.showInputDialog("Introduce el código del empleado");

                if (codEmp == null || codEmp.isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Debe introducir un código de empleado válido", "Error", JOptionPane.WARNING_MESSAGE);
                    break;
                }

                try {
                    Connection con = ConexiónBD.getConnection();
                    String sqlCheck = "SELECT * FROM empleado WHERE codigo_empleado=?";
                    PreparedStatement psCheck = con.prepareStatement(sqlCheck);
                    psCheck.setString(1, codEmp);
                    ResultSet rsCheck = psCheck.executeQuery();
                    boolean empleadoExiste = rsCheck.next(); 

                    if (!empleadoExiste) {
                        JOptionPane.showMessageDialog(this, "No se encontró ningún empleado con el código especificado", "Error", JOptionPane.WARNING_MESSAGE);
                        continue; 
                    }

                    String sql = "SELECT * FROM empleado WHERE codigo_empleado=?";
                    PreparedStatement ps = con.prepareStatement(sql);
                    ps.setString(1, codEmp);
                    ResultSet rs = ps.executeQuery();

                    String[] columnas = new String[9];
                    while (rs.next()) {
                        columnas[0] = rs.getString(1);
                        columnas[1] = rs.getString(2);
                        columnas[2] = rs.getString(3);
                        columnas[3] = rs.getString(4);
                        columnas[4] = rs.getString(5);
                        columnas[5] = rs.getString(6);
                        columnas[6] = rs.getString(7);
                        columnas[7] = rs.getString(8);
                        columnas[8] = rs.getString(9);
                    }

                    String cod = columnas[0], nombre = columnas[1], ap1 = columnas[2], ap2 = columnas[3], ext = columnas[4], mail = columnas[5], OF = columnas[6], JEF = columnas[7], puesto = columnas[8];

                    JOptionPane.showMessageDialog(this, "Datos del empleado:\n Código: " + cod + "\n Nombre: " + nombre + "\n Apellido 1: " + ap1 + "\n Apellido 2: " + ap2 + "\n Extensión: " + ext + "\n Email: " + mail + "\n Código oficina: " + OF + "\n Código jefe: " + JEF + "\n Puesto: " + puesto, "Búsqueda de empleado.", JOptionPane.INFORMATION_MESSAGE);
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(this, "Error al buscar el empleado", "Error", JOptionPane.WARNING_MESSAGE);
                }
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error al buscar el empleado", "Error", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_jButton4BuscarEmpActionPerformed

    private void jToggleButtonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonModificarActionPerformed

        boolean activado = jToggleButtonModificar.isSelected();
        if (activado == true) {
            String codEmp = JOptionPane.showInputDialog("Introduce el código del empleado");
            if (codEmp != null && !codEmp.isEmpty()) {
                try {
                    Connection con = ConexiónBD.getConnection();
                    String sql = "SELECT * FROM empleado WHERE codigo_empleado=?";
                    PreparedStatement ps = con.prepareStatement(sql);
                    ps.setString(1, codEmp);
                    ResultSet rs = ps.executeQuery();

                    String[] columnas = new String[9];
                    while (rs.next()) {
                        columnas[0] = rs.getString(1);
                        columnas[1] = rs.getString(2);
                        columnas[2] = rs.getString(3);
                        columnas[3] = rs.getString(4);
                        columnas[4] = rs.getString(5);
                        columnas[5] = rs.getString(6);
                        columnas[6] = rs.getString(7);
                        columnas[7] = rs.getString(8);
                        columnas[8] = rs.getString(9);
                    }
                    jLabelEMP.setText(columnas[0]);
                    jTextFieldNombre.setText(columnas[1]);
                    jTextFieldAp1.setText(columnas[2]);
                    jTextFieldAp2.setText(columnas[3]);
                    jFormattedTextFieldExtension.setText(columnas[4]);
                    jTextFieldMail.setText(columnas[5]);
                    jTextFieldCodOfi.setText(columnas[6]);
                    jTextFieldCodJefe.setText(columnas[7]);
                    jTextFieldPuesto.setText(columnas[8]);

                    jTextFieldCodJefe.setEnabled(false);
                    jTextFieldCodOfi.setEnabled(false);

                    JOptionPane.showMessageDialog(this, "Datos del empleado cargado eficientemente", "Modificación del usuario", JOptionPane.INFORMATION_MESSAGE);
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(this, "Error al cargar los datos del empleado", "Error", JOptionPane.WARNING_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Debe introducir un código de empleado válido", "Error", JOptionPane.WARNING_MESSAGE);
                jToggleButtonModificar.setSelected(false);
            }
        } else {
            try {
                Connection con = ConexiónBD.getConnection();
                String sql = "UPDATE empleado SET nombre=? ,apellido1=? ,apellido2=? ,extension=? ,email=? ,puesto=? WHERE codigo_empleado=? ";
                PreparedStatement ps = con.prepareStatement(sql);

                ps.setString(1, jTextFieldNombre.getText());
                ps.setString(2, jTextFieldAp1.getText());
                ps.setString(3, jTextFieldAp2.getText());
                ps.setString(4, jFormattedTextFieldExtension.getText());
                ps.setString(5, jTextFieldMail.getText());
                ps.setString(6, jTextFieldPuesto.getText());
                ps.setString(7, jLabelEMP.getText());

                ps.executeUpdate();

                jTextFieldNombre.setText("");
                jTextFieldAp1.setText("");
                jTextFieldAp2.setText("");
                jFormattedTextFieldExtension.setText("");
                jTextFieldMail.setText("");
                jTextFieldCodOfi.setText("");
                jTextFieldCodJefe.setText("");
                jTextFieldPuesto.setText("");
                jLabelEMP.setText("");

                jTextFieldCodJefe.setEnabled(true);
                jTextFieldCodOfi.setEnabled(true);

                JOptionPane.showMessageDialog(this, "Empleado modificado con éxito", "Modificación del usuario", JOptionPane.INFORMATION_MESSAGE);
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Error al modificar el empleado", "Error", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_jToggleButtonModificarActionPerformed

    private void jButtonListadoEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListadoEmpleadosActionPerformed
        Tabla tabla = new Tabla();
        tabla.setVisible(true);
        tabla.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButtonListadoEmpleadosActionPerformed

    private void jToggleButtonModificarOFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonModificarOFActionPerformed
        boolean activado = jToggleButtonModificarOF.isSelected();
        String codEmp = "";
        if (activado == true) {
            codEmp = JOptionPane.showInputDialog("Introduce el código del empleado");
            if (codEmp != null && !codEmp.isEmpty()) {
                try {
                    Connection con = ConexiónBD.getConnection();
                    String sql = "SELECT codigo_oficina,codigo_empleado FROM empleado WHERE codigo_empleado = UPPER(?)";
                    PreparedStatement ps = con.prepareStatement(sql);
                    ps.setString(1, codEmp);
                    ResultSet rs = ps.executeQuery();

                    if (rs.next()) {
                        jTextFieldCod_OF.setText(rs.getString(1));
                        jLabelEmp.setText(rs.getString(2));
                        JOptionPane.showMessageDialog(this, "Datos del empleado cargados eficientemente", "Modificación del empleado", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(this, "No se encontró ningún empleado con el código proporcionado", "Error", JOptionPane.WARNING_MESSAGE);
                        jToggleButtonModificarOF.setSelected(false);
                    }
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(this, "Error al cargar los datos del empleado: " + e.getMessage(), "Error", JOptionPane.WARNING_MESSAGE);
                    jToggleButtonModificarOF.setSelected(false);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Debe introducir un código de empleado válido", "Error", JOptionPane.WARNING_MESSAGE);
                jToggleButtonModificarOF.setSelected(false);
            }
        } else {
            try {
                Connection con = ConexiónBD.getConnection();
                String sql = "UPDATE empleado SET codigo_oficina=? WHERE codigo_empleado=? ";
                PreparedStatement ps = con.prepareStatement(sql);

                ps.setString(1, jTextFieldCod_OF.getText());
                ps.setString(2, jLabelEmp.getText());

                ps.executeUpdate();

                jTextFieldCod_OF.setText("");

                JOptionPane.showMessageDialog(this, "Oficina del empleado modificada con éxito", "Modificación del usuario", JOptionPane.INFORMATION_MESSAGE);
            } catch (SQLException e) {
                jTextFieldCod_OF.setText("");
                JOptionPane.showMessageDialog(this, "Error al modificar la oficina del empleado", "Error", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_jToggleButtonModificarOFActionPerformed

    private void jToggleButtonModificarJEFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonModificarJEFActionPerformed
        boolean activado = jToggleButtonModificarJEF.isSelected();
        String codEmp = "";
        if (activado == true) {
            codEmp = JOptionPane.showInputDialog("Introduce el código del empleado");
            if (codEmp != null && !codEmp.isEmpty()) {
                try {
                    Connection con = ConexiónBD.getConnection();
                    String sql = "SELECT codigo_jefe,codigo_empleado FROM empleado WHERE codigo_empleado = ?";
                    PreparedStatement ps = con.prepareStatement(sql);
                    ps.setString(1, codEmp);
                    ResultSet rs = ps.executeQuery();

                    if (rs.next()) {
                        jTextFieldCod_JEF.setText(rs.getString(1));
                        jLabelEmp.setText(rs.getString(2));
                        JOptionPane.showMessageDialog(this, "Datos del empleado modificados con éxito", "Modificación del jefe del empleado.", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(this, "No se encontró ningún empleado con el código proporcionado", "Error", JOptionPane.WARNING_MESSAGE);
                        jToggleButtonModificarJEF.setSelected(false);
                    }
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(this, "Error al cargar los datos del empleado: " + e.getMessage(), "Error", JOptionPane.WARNING_MESSAGE);
                    jToggleButtonModificarJEF.setSelected(false);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Debe introducir un código de empleado válido", "Error", JOptionPane.WARNING_MESSAGE);
                jToggleButtonModificarJEF.setSelected(false);
            }
        } else {
            try {
                Connection con = ConexiónBD.getConnection();
                String sql = "UPDATE empleado SET codigo_jefe=? WHERE codigo_empleado=? ";
                PreparedStatement ps = con.prepareStatement(sql);
                
                boolean valid;
                if (jTextFieldCod_JEF.getText().isEmpty()) {
                    jTextFieldCod_JEF.setBorder(BorderFactory.createLineBorder(Color.RED));
                    valid = false;
                } else {
                    jTextFieldCod_JEF.setBorder(BorderFactory.createLineBorder(Color.GRAY));
                }

                ps.setString(1, jTextFieldCod_JEF.getText());
                ps.setString(2, jLabelEmp.getText());

                ps.executeUpdate();

                jTextFieldCod_JEF.setText("");

                JOptionPane.showMessageDialog(this, "Oficina del empleado modificada con éxito", "Modificación del usuario", JOptionPane.INFORMATION_MESSAGE);
            } catch (SQLException e) {
                jTextFieldCod_OF.setText("");
                JOptionPane.showMessageDialog(this, "Error al modificar la oficina del empleado", "Error", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_jToggleButtonModificarJEFActionPerformed

    private void jTextFieldCod_OFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCod_OFActionPerformed

        jTextFieldCod_OF.setEditable(false);
    }//GEN-LAST:event_jTextFieldCod_OFActionPerformed

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
            java.util.logging.Logger.getLogger(GestionEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionEmpleado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1CrearEmp;
    private javax.swing.JButton jButton2BorrarEmp;
    private javax.swing.JButton jButton4BuscarEmp;
    private javax.swing.JButton jButtonListadoEmpleados;
    private javax.swing.JFormattedTextField jFormattedTextFieldExtension;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelEMP;
    private javax.swing.JLabel jLabelEmp;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextFieldAp1;
    private javax.swing.JTextField jTextFieldAp2;
    private javax.swing.JTextField jTextFieldCodJefe;
    private javax.swing.JTextField jTextFieldCodOfi;
    private javax.swing.JTextField jTextFieldCod_JEF;
    private javax.swing.JTextField jTextFieldCod_OF;
    private javax.swing.JTextField jTextFieldMail;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldPuesto;
    private javax.swing.JToggleButton jToggleButtonModificar;
    private javax.swing.JToggleButton jToggleButtonModificarJEF;
    private javax.swing.JToggleButton jToggleButtonModificarOF;
    // End of variables declaration//GEN-END:variables
}
