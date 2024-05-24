
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

public class Tabla extends javax.swing.JFrame {

    DefaultTableModel modelo = null;

    public Tabla() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButtonActualizar = new javax.swing.JButton();
        jButtonPorOficina = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Lista Empleados");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Código Empleado", "Nombre", "Apellido 1", "Apellido 2", "Extensión", "Email", "Código Oficina", "Código Jefe", "Puesto"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButtonActualizar.setText("Mostrar Todos");
        jButtonActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonActualizarActionPerformed(evt);
            }
        });

        jButtonPorOficina.setText("Mostrar por Oficina");
        jButtonPorOficina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPorOficinaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("Lista de empleados");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(184, 184, 184)
                .addComponent(jButtonActualizar)
                .addGap(174, 174, 174)
                .addComponent(jButtonPorOficina)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 827, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 175, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonActualizar)
                    .addComponent(jButtonPorOficina))
                .addGap(49, 49, 49))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonActualizarActionPerformed
        try {
            Connection con = ConexiónBD.getConnection();
            String sql = "SELECT * FROM empleado";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            modelo = new DefaultTableModel();
            modelo.addColumn("Código Empleado");
            modelo.addColumn("Nombre");
            modelo.addColumn("Apellido 1");
            modelo.addColumn("Apellido 2");
            modelo.addColumn("Extensión");
            modelo.addColumn("Email");
            modelo.addColumn("Código Oficina");
            modelo.addColumn("Código Jefe");
            modelo.addColumn("Puesto");

            Object[] columnas = new Object[9];
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
                modelo.addRow(columnas);
            }

            jTable1.setModel(modelo);
            JOptionPane.showMessageDialog(this, "Los datos fueron cargados correctamente", "Carga de datos", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error al cargar la tabla", "Error", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButtonActualizarActionPerformed

    private void jButtonPorOficinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPorOficinaActionPerformed
        String oficina = JOptionPane.showInputDialog("Introduce el código de la oficina");
        boolean comp;
        String regex = "^[A-Z]{3}-[A-Z]{2,3}$";
        comp = oficina != null && !oficina.isEmpty() && oficina.matches(regex);
        if (comp) {

            try {
                Connection con = ConexiónBD.getConnection();
                String sql = "SELECT * FROM empleado WHERE codigo_oficina LIKE UPPER(?)";
                PreparedStatement ps = con.prepareStatement(sql);
                ps.setString(1, oficina);
                ResultSet rs = ps.executeQuery();

                modelo = new DefaultTableModel();
                modelo.addColumn("Código Empleado");
                modelo.addColumn("Nombre");
                modelo.addColumn("Apellido 1");
                modelo.addColumn("Apellido 2");
                modelo.addColumn("Extensión");
                modelo.addColumn("Email");
                modelo.addColumn("Código Oficina");
                modelo.addColumn("Código Jefe");
                modelo.addColumn("Puesto");

                Object[] columnas = new Object[9];
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
                    modelo.addRow(columnas);
                }

                jTable1.setModel(modelo);
                JOptionPane.showMessageDialog(this, "Los datos fueron cargados correctamente", "Carga de datos", JOptionPane.INFORMATION_MESSAGE);
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Error al cargar la tabla", "Error", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "El código de oficina no existe", "Error", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButtonPorOficinaActionPerformed

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
            java.util.logging.Logger.getLogger(Tabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tabla().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonActualizar;
    private javax.swing.JButton jButtonPorOficina;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
