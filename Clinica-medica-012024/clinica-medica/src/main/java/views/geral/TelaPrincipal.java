package views.geral;

import views.consulta.AgendaConsulta;
import view.convenio.Convenios;
import view.especialidade.FuncoesEspecialidade;
import view.prontuario.Prontuario;
import views.consulta.TabelaConsultas;
import views.usuario.CadastrarUsuario;
import views.usuario.ConsultarUsuario;
import views.usuario.ListagemUsuario;
import view.medico.TelaMedico;

public class TelaPrincipal extends javax.swing.JFrame {

    public TelaPrincipal() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        botaoListagemUsuario = new javax.swing.JMenu();
        botaoCadastrarUsuario = new javax.swing.JMenuItem();
        botaoConsUsuario = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        botaoTelaAgendaConsulta = new javax.swing.JMenu();
        botaoAgendaConsulta = new javax.swing.JMenuItem();
        botaoListaConsulta = new javax.swing.JMenuItem();
        convenio = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu9 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 766, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 511, Short.MAX_VALUE)
        );

        jMenu1.setText("Inicio");

        jMenuItem2.setText("Login");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        botaoListagemUsuario.setText("Usuario");

        botaoCadastrarUsuario.setText("Cadastrar");
        botaoCadastrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastrarUsuarioActionPerformed(evt);
            }
        });
        botaoListagemUsuario.add(botaoCadastrarUsuario);

        botaoConsUsuario.setText("Consultar");
        botaoConsUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoConsUsuarioActionPerformed(evt);
            }
        });
        botaoListagemUsuario.add(botaoConsUsuario);

        jMenuItem3.setText("Listagem");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        botaoListagemUsuario.add(jMenuItem3);

        jMenuBar1.add(botaoListagemUsuario);

        botaoTelaAgendaConsulta.setText("Consultas");
        botaoTelaAgendaConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoTelaAgendaConsultaActionPerformed(evt);
            }
        });

        botaoAgendaConsulta.setText("Agendar");
        botaoAgendaConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAgendaConsultaActionPerformed(evt);
            }
        });
        botaoTelaAgendaConsulta.add(botaoAgendaConsulta);

        botaoListaConsulta.setText("Listar");
        botaoListaConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoListaConsultaActionPerformed(evt);
            }
        });
        botaoTelaAgendaConsulta.add(botaoListaConsulta);

        jMenuBar1.add(botaoTelaAgendaConsulta);

        convenio.setText("Convenio");
        convenio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                convenioActionPerformed(evt);
            }
        });

        jMenuItem9.setText("Cadastrar");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        convenio.add(jMenuItem9);

        jMenuBar1.add(convenio);

        jMenu5.setText("Especialidade");

        jMenuItem5.setText("Consultar");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem5);

        jMenuBar1.add(jMenu5);

        jMenu7.setText("Funcionários");
        jMenuBar1.add(jMenu7);

        jMenu8.setText("Médicos");

        jMenuItem1.setText("Prontuario");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem1);

        jMenuItem4.setText("Cadastrar");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem4);

        jMenuBar1.add(jMenu8);

        jMenu9.setText("Pacientes");

        jMenuItem8.setText("Cadastrar");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItem8);

        jMenuBar1.add(jMenu9);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoCadastrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastrarUsuarioActionPerformed
        this.dispose();
        CadastrarUsuario telaCadastro = new CadastrarUsuario();
        telaCadastro.setVisible(true);
    }//GEN-LAST:event_botaoCadastrarUsuarioActionPerformed

    private void botaoConsUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoConsUsuarioActionPerformed
        ConsultarUsuario telaConsulta = new ConsultarUsuario();
        telaConsulta.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botaoConsUsuarioActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        ListagemUsuario telaListagem = new ListagemUsuario();
        telaListagem.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        Convenios telaC = new Convenios();
        telaC.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void botaoAgendaConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAgendaConsultaActionPerformed
        AgendaConsulta telaAC = new AgendaConsulta();
        telaAC.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botaoAgendaConsultaActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        TelaLogin telaL = new TelaLogin();
        telaL.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void botaoTelaAgendaConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoTelaAgendaConsultaActionPerformed
        TabelaConsultas telaConsulta = new TabelaConsultas();
        telaConsulta.setVisible(true);
    }//GEN-LAST:event_botaoTelaAgendaConsultaActionPerformed

    private void botaoListaConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoListaConsultaActionPerformed
        TabelaConsultas telaConsulta = new TabelaConsultas();
        telaConsulta.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botaoListaConsultaActionPerformed

    private void convenioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_convenioActionPerformed
        Convenios telaConv = new Convenios();
        telaConv.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_convenioActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        FuncoesEspecialidade funcEsp = new FuncoesEspecialidade();
        funcEsp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        Prontuario prontuario = new Prontuario();
        prontuario.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        TelaMedico telaMedico = new TelaMedico();
        telaMedico.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        AgendaConsulta telaAC = new AgendaConsulta();
        telaAC.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem8ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem botaoAgendaConsulta;
    private javax.swing.JMenuItem botaoCadastrarUsuario;
    private javax.swing.JMenuItem botaoConsUsuario;
    private javax.swing.JMenuItem botaoListaConsulta;
    private javax.swing.JMenu botaoListagemUsuario;
    private javax.swing.JMenu botaoTelaAgendaConsulta;
    private javax.swing.JMenu convenio;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    private CadastrarUsuario CadastrarUsuario() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
