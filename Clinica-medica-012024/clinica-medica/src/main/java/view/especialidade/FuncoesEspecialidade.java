package view.especialidade;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import views.geral.TelaPrincipal;

/**
 *
 * @author Usuario
 */
public class FuncoesEspecialidade extends javax.swing.JFrame {

    public FuncoesEspecialidade() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        editarEspecialidade = new javax.swing.JButton();
        deletarEspecialidade = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        consultarEspecialidade = new javax.swing.JLabel();
        newValueField = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 160));

        editarEspecialidade.setBackground(new java.awt.Color(255, 255, 255));
        editarEspecialidade.setForeground(new java.awt.Color(0, 153, 160));
        editarEspecialidade.setText("Editar");
        editarEspecialidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarEspecialidadeActionPerformed(evt);
            }
        });

        deletarEspecialidade.setBackground(new java.awt.Color(255, 255, 255));
        deletarEspecialidade.setForeground(new java.awt.Color(0, 153, 160));
        deletarEspecialidade.setText("Deletar");
        deletarEspecialidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletarEspecialidadeActionPerformed(evt);
            }
        });

        table.setBackground(new java.awt.Color(255, 255, 255));
        table.setForeground(new java.awt.Color(0, 153, 160));
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "Felipe Silva", "Cardiologista"},
                {"2", "João Marcos", "Neurocirurgião"},
                {"3", "Maria Andrade", "Pediatra"}
            },
            new String [] {
                "ID", "Nome", "Especialidade"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table);

        consultarEspecialidade.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        consultarEspecialidade.setForeground(new java.awt.Color(255, 255, 255));
        consultarEspecialidade.setText("Consultar Especialidades");

        newValueField.setBackground(new java.awt.Color(0, 153, 160));
        newValueField.setForeground(new java.awt.Color(0, 0, 0));
        newValueField.setBorder(null);

        jButton1.setBackground(new java.awt.Color(204, 0, 0));
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("X");
        jButton1.setBorderPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(consultarEspecialidade)
                .addGap(105, 105, 105)
                .addComponent(jButton1))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(editarEspecialidade)
                    .addComponent(deletarEspecialidade))
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(newValueField))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(91, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(consultarEspecialidade))
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(editarEspecialidade, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(199, 199, 199)
                        .addComponent(deletarEspecialidade, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(newValueField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void deletarEspecialidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletarEspecialidadeActionPerformed
        int selectedRow = table.getSelectedRow();

        if (selectedRow >= 0) {
            // Remove the selected row from the table
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            model.removeRow(selectedRow);
        } else {
            JOptionPane.showMessageDialog(null, "Selecione alguma linha para deletar.");
        }
    }//GEN-LAST:event_deletarEspecialidadeActionPerformed

    private void editarEspecialidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarEspecialidadeActionPerformed
        int selectedRow = table.getSelectedRow();
        int selectedColumn = table.getSelectedColumn();

        if (selectedRow >= 0 && selectedColumn >= 0) {
            String newValue = newValueField.getText();
            table.setValueAt(newValue, selectedRow, selectedColumn);
        } else {
            JOptionPane.showMessageDialog(null, "Selecione alguma linha para editar.");
        }      
    }//GEN-LAST:event_editarEspecialidadeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
        TelaPrincipal tp = new TelaPrincipal();
        tp.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(FuncoesEspecialidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FuncoesEspecialidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FuncoesEspecialidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FuncoesEspecialidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FuncoesEspecialidade().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel consultarEspecialidade;
    private javax.swing.JButton deletarEspecialidade;
    private javax.swing.JButton editarEspecialidade;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField newValueField;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
