/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.edu.imepac.clinica.medica;

import javax.swing.JOptionPane;

/**
 *
 * @author 232-001135
 */
public class Loading extends javax.swing.JFrame {

    /**
     * Creates new form Splash
     */
    public Loading() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelLoading = new javax.swing.JPanel();
        progresso = new javax.swing.JProgressBar();
        txtNomeClinica = new javax.swing.JLabel();
        porcentagem = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));
        setUndecorated(true);

        painelLoading.setBackground(new java.awt.Color(0, 153, 153));

        progresso.setBackground(new java.awt.Color(255, 255, 255));
        progresso.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        progresso.setForeground(new java.awt.Color(0, 124, 104));

        txtNomeClinica.setBackground(new java.awt.Color(255, 255, 255));
        txtNomeClinica.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        txtNomeClinica.setForeground(new java.awt.Color(255, 255, 255));
        txtNomeClinica.setText("Joy Clínica");

        porcentagem.setBackground(new java.awt.Color(0, 0, 0));
        porcentagem.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        porcentagem.setForeground(new java.awt.Color(255, 255, 255));
        porcentagem.setText("100%");

        javax.swing.GroupLayout painelLoadingLayout = new javax.swing.GroupLayout(painelLoading);
        painelLoading.setLayout(painelLoadingLayout);
        painelLoadingLayout.setHorizontalGroup(
            painelLoadingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelLoadingLayout.createSequentialGroup()
                .addGroup(painelLoadingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelLoadingLayout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(progresso, javax.swing.GroupLayout.PREFERRED_SIZE, 528, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelLoadingLayout.createSequentialGroup()
                        .addGap(341, 341, 341)
                        .addComponent(porcentagem, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelLoadingLayout.createSequentialGroup()
                        .addGap(249, 249, 249)
                        .addComponent(txtNomeClinica)))
                .addContainerGap(91, Short.MAX_VALUE))
        );
        painelLoadingLayout.setVerticalGroup(
            painelLoadingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelLoadingLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(txtNomeClinica, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(progresso, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(porcentagem, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelLoading, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelLoading, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        
        Loading loading = new Loading();
        loading.setVisible(true);
        try { 
            for (int i = 0; i <= 100; i += 3){
               Thread.sleep(70);
               loading.progresso.setValue(i);
               loading.porcentagem.setText(Integer.toString(i) + "%");
            }
            loading.dispose();
            
            TelaLogin login = new TelaLogin();
            login.setVisible(true); 
        } catch (InterruptedException e){
            JOptionPane.showConfirmDialog(null, "Erro!");
        }
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
            java.util.logging.Logger.getLogger(Loading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Loading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Loading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Loading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel painelLoading;
    private javax.swing.JLabel porcentagem;
    private javax.swing.JProgressBar progresso;
    private javax.swing.JLabel txtNomeClinica;
    // End of variables declaration//GEN-END:variables
}
