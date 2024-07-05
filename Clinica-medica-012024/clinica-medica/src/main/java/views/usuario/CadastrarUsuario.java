package views.usuario;

import DAOS.UsuarioDAO;
import entidades.Usuario;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import views.geral.TelaPrincipal;

/**
 *
 * @author Usuario
 */
public class CadastrarUsuario extends javax.swing.JFrame {

    public CadastrarUsuario() {
        initComponents();
        setLocationRelativeTo(null); // Centralizando a janela na tela
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelCadastroUsuario = new javax.swing.JPanel();
        txtCadastrarUsuario = new javax.swing.JLabel();
        cadastrarUsuario = new javax.swing.JButton();
        nomeUsuario = new javax.swing.JTextField();
        emailUsuario = new javax.swing.JTextField();
        senhaUsuario = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelCadastroUsuario.setBackground(new java.awt.Color(0, 153, 153));
        jPanelCadastroUsuario.setForeground(new java.awt.Color(255, 255, 255));

        txtCadastrarUsuario.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        txtCadastrarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        txtCadastrarUsuario.setText("Cadastrar Usuario");

        cadastrarUsuario.setBackground(new java.awt.Color(255, 255, 255));
        cadastrarUsuario.setForeground(new java.awt.Color(0, 153, 160));
        cadastrarUsuario.setText("Cadastrar");
        cadastrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarUsuarioActionPerformed(evt);
            }
        });

        nomeUsuario.setBackground(new java.awt.Color(255, 255, 255));
        nomeUsuario.setForeground(new java.awt.Color(0, 0, 0));
        nomeUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeUsuarioActionPerformed(evt);
            }
        });

        emailUsuario.setBackground(new java.awt.Color(255, 255, 255));
        emailUsuario.setForeground(new java.awt.Color(0, 0, 0));

        senhaUsuario.setBackground(new java.awt.Color(255, 255, 255));
        senhaUsuario.setForeground(new java.awt.Color(0, 0, 0));
        senhaUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                senhaUsuarioActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nome:");

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Email:");

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Senha:");

        javax.swing.GroupLayout jPanelCadastroUsuarioLayout = new javax.swing.GroupLayout(jPanelCadastroUsuario);
        jPanelCadastroUsuario.setLayout(jPanelCadastroUsuarioLayout);
        jPanelCadastroUsuarioLayout.setHorizontalGroup(
            jPanelCadastroUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCadastroUsuarioLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanelCadastroUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelCadastroUsuarioLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(emailUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelCadastroUsuarioLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(senhaUsuario))
                    .addGroup(jPanelCadastroUsuarioLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelCadastroUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCadastrarUsuario)
                            .addComponent(nomeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(73, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCadastroUsuarioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cadastrarUsuario)
                .addGap(164, 164, 164))
        );
        jPanelCadastroUsuarioLayout.setVerticalGroup(
            jPanelCadastroUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCadastroUsuarioLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(txtCadastrarUsuario)
                .addGap(37, 37, 37)
                .addGroup(jPanelCadastroUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nomeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelCadastroUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(emailUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelCadastroUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(senhaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(cadastrarUsuario)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelCadastroUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelCadastroUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cadastrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarUsuarioActionPerformed
      
      String nome = nomeUsuario.getText().trim();
      String email = emailUsuario.getText().trim();
      String senha = new String(senhaUsuario.getPassword()).trim();

      if (nome.isEmpty() || email.isEmpty() || senha.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Todos os campos são obrigatórios!");
        return;
      }
        
      Usuario usuario = new Usuario();
      usuario.setNome(nomeUsuario.getText());
      usuario.setEmail(emailUsuario.getText());
      usuario.setSenha(new String(senhaUsuario.getPassword()));

      UsuarioDAO usuarioDAO = new UsuarioDAO();
      usuarioDAO.cadastrarUsuario(usuario);

      JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso!");
      dispose();
      
      TelaPrincipal tp = new TelaPrincipal();
      this.dispose();
      tp.setVisible(true);
      
    }//GEN-LAST:event_cadastrarUsuarioActionPerformed

    private void nomeUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeUsuarioActionPerformed

    private void senhaUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_senhaUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_senhaUsuarioActionPerformed

    public static void main(String[] args) {
        CadastrarUsuario frame = new CadastrarUsuario();
        frame.setVisible(true);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cadastrarUsuario;
    private javax.swing.JTextField emailUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanelCadastroUsuario;
    private javax.swing.JTextField nomeUsuario;
    private javax.swing.JPasswordField senhaUsuario;
    private javax.swing.JLabel txtCadastrarUsuario;
    // End of variables declaration//GEN-END:variables
}