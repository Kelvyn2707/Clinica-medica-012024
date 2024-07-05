package views.consulta;

import javax.swing.JOptionPane;
import views.geral.TelaPrincipal;

public class AgendaConsulta extends javax.swing.JFrame {

    public AgendaConsulta() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtNome = new javax.swing.JTextField();
        txtNomePaciente = new javax.swing.JLabel();
        txtDataNascimento = new javax.swing.JLabel();
        botaoCadastrar = new javax.swing.JButton();
        txtCPF = new javax.swing.JLabel();
        txtRG = new javax.swing.JLabel();
        txtEmissor = new javax.swing.JLabel();
        txtSexo = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        txtEndereco = new javax.swing.JLabel();
        txtBairro = new javax.swing.JLabel();
        txtLogradouro = new javax.swing.JLabel();
        txtComplemento = new javax.swing.JLabel();
        txtNumero = new javax.swing.JLabel();
        txtCEP = new javax.swing.JLabel();
        txtCidade = new javax.swing.JLabel();
        txtContato = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JLabel();
        txtCpF = new javax.swing.JTextField();
        txtCelular = new javax.swing.JLabel();
        txtInformacoesAdicionais = new javax.swing.JLabel();
        txtConvenio = new javax.swing.JLabel();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        txtCodConvenio = new javax.swing.JLabel();
        txtSenhaAcesso = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        txtCadastroPaciente = new javax.swing.JLabel();
        jScrollBar1 = new javax.swing.JScrollBar();
        txtDataNasc = new javax.swing.JTextField();
        txtRg = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        txtNome.setBackground(new java.awt.Color(255, 255, 255));
        txtNome.setForeground(new java.awt.Color(0, 0, 0));

        txtNomePaciente.setForeground(new java.awt.Color(255, 255, 255));
        txtNomePaciente.setText("Nome:");

        txtDataNascimento.setForeground(new java.awt.Color(242, 242, 242));
        txtDataNascimento.setText("Data de Nascimento:");

        botaoCadastrar.setBackground(new java.awt.Color(255, 255, 255));
        botaoCadastrar.setForeground(new java.awt.Color(0, 153, 153));
        botaoCadastrar.setText("Cadastrar");
        botaoCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastrarActionPerformed(evt);
            }
        });

        txtCPF.setForeground(new java.awt.Color(242, 242, 242));
        txtCPF.setText("CPF:");

        txtRG.setForeground(new java.awt.Color(242, 242, 242));
        txtRG.setText("RG:");

        txtEmissor.setForeground(new java.awt.Color(242, 242, 242));
        txtEmissor.setText("Emissor:");

        txtSexo.setForeground(new java.awt.Color(242, 242, 242));
        txtSexo.setText("Sexo:");

        jCheckBox1.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setText("M");

        jCheckBox2.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox2.setText("F");

        txtEndereco.setBackground(new java.awt.Color(0, 153, 153));
        txtEndereco.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtEndereco.setForeground(new java.awt.Color(242, 242, 242));
        txtEndereco.setText("ENDEREÇO");

        txtBairro.setForeground(new java.awt.Color(242, 242, 242));
        txtBairro.setText("BAIRRO");

        txtLogradouro.setForeground(new java.awt.Color(242, 242, 242));
        txtLogradouro.setText("LOGRADOURO");

        txtComplemento.setForeground(new java.awt.Color(242, 242, 242));
        txtComplemento.setText("COMPLEMENTO");

        txtNumero.setForeground(new java.awt.Color(242, 242, 242));
        txtNumero.setText("NÚMERO");

        txtCEP.setForeground(new java.awt.Color(242, 242, 242));
        txtCEP.setText("CEP");

        txtCidade.setForeground(new java.awt.Color(242, 242, 242));
        txtCidade.setText("CIDADE");

        txtContato.setForeground(new java.awt.Color(242, 242, 242));
        txtContato.setText("CONTATO");

        txtTelefone.setForeground(new java.awt.Color(242, 242, 242));
        txtTelefone.setText("TELEFONE");

        txtCpF.setBackground(new java.awt.Color(255, 255, 255));
        txtCpF.setForeground(new java.awt.Color(0, 0, 0));

        txtCelular.setForeground(new java.awt.Color(242, 242, 242));
        txtCelular.setText("CELULAR");

        txtInformacoesAdicionais.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtInformacoesAdicionais.setForeground(new java.awt.Color(242, 242, 242));
        txtInformacoesAdicionais.setText("INFORMAÇÕES COMPLEMENTARES");

        txtConvenio.setForeground(new java.awt.Color(242, 242, 242));
        txtConvenio.setText("POSSUI CONVÊNIO");

        jCheckBox3.setForeground(new java.awt.Color(242, 242, 242));
        jCheckBox3.setText("SIM");

        jCheckBox4.setForeground(new java.awt.Color(242, 242, 242));
        jCheckBox4.setText("NÃO");

        txtCodConvenio.setForeground(new java.awt.Color(242, 242, 242));
        txtCodConvenio.setText("Código convênio");

        txtSenhaAcesso.setForeground(new java.awt.Color(242, 242, 242));
        txtSenhaAcesso.setText("Senha de acesso:");

        jButton2.setBackground(new java.awt.Color(255, 0, 0));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("X");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        txtCadastroPaciente.setBackground(new java.awt.Color(0, 153, 153));
        txtCadastroPaciente.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtCadastroPaciente.setForeground(new java.awt.Color(255, 255, 255));
        txtCadastroPaciente.setText("CADASTRO PACIENTES");

        txtDataNasc.setBackground(new java.awt.Color(255, 255, 255));
        txtDataNasc.setForeground(new java.awt.Color(0, 0, 0));
        txtDataNasc.setText("00/00/0000");

        txtRg.setBackground(new java.awt.Color(255, 255, 255));
        txtRg.setForeground(new java.awt.Color(0, 0, 0));

        jTextField4.setBackground(new java.awt.Color(255, 255, 255));
        jTextField4.setForeground(new java.awt.Color(0, 0, 0));

        jTextField5.setBackground(new java.awt.Color(255, 255, 255));
        jTextField5.setForeground(new java.awt.Color(0, 0, 0));

        jTextField6.setBackground(new java.awt.Color(255, 255, 255));
        jTextField6.setForeground(new java.awt.Color(0, 0, 0));

        jTextField7.setBackground(new java.awt.Color(255, 255, 255));
        jTextField7.setForeground(new java.awt.Color(0, 0, 0));

        jTextField8.setBackground(new java.awt.Color(255, 255, 255));
        jTextField8.setForeground(new java.awt.Color(0, 0, 0));

        jTextField9.setBackground(new java.awt.Color(255, 255, 255));
        jTextField9.setForeground(new java.awt.Color(0, 0, 0));

        jTextField10.setBackground(new java.awt.Color(255, 255, 255));
        jTextField10.setForeground(new java.awt.Color(0, 0, 0));

        jTextField12.setBackground(new java.awt.Color(255, 255, 255));
        jTextField12.setForeground(new java.awt.Color(0, 0, 0));

        jTextField13.setBackground(new java.awt.Color(255, 255, 255));
        jTextField13.setForeground(new java.awt.Color(0, 0, 0));

        jTextField14.setBackground(new java.awt.Color(255, 255, 255));
        jTextField14.setForeground(new java.awt.Color(0, 0, 0));

        jPasswordField1.setBackground(new java.awt.Color(255, 255, 255));
        jPasswordField1.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtConvenio)
                        .addGap(398, 398, 398))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(txtInformacoesAdicionais)
                                .addGap(2, 2, 2))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(329, 329, 329)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jCheckBox3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jCheckBox4))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtSenhaAcesso)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jPasswordField1, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                                        .addGap(2, 2, 2))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtCodConvenio)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField14)))))
                        .addGap(255, 255, 255)
                        .addComponent(botaoCadastrar)
                        .addGap(18, 18, 18))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(403, 403, 403)
                                .addComponent(txtContato))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(394, 394, 394)
                                .addComponent(txtEndereco)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(369, 369, 369)
                .addComponent(txtCadastroPaciente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtNomePaciente)
                                    .addComponent(txtCPF, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCEP, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addComponent(txtCpF, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtRG)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtRg, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(100, 100, 100)
                                        .addComponent(txtCidade)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtLogradouro)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(txtDataNascimento)
                                        .addGap(130, 130, 130)
                                        .addComponent(txtSexo)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jCheckBox1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jCheckBox2))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addGap(6, 6, 6)
                                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addGap(34, 34, 34)
                                            .addComponent(txtEmissor)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtNumero)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtBairro)
                                            .addComponent(txtTelefone))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(txtCelular))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(28, 28, 28)
                                                .addComponent(txtComplemento)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(txtCadastroPaciente)
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomePaciente)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDataNascimento)
                    .addComponent(txtDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSexo)
                    .addComponent(jCheckBox1)
                    .addComponent(jCheckBox2))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCPF)
                    .addComponent(txtCpF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRG)
                    .addComponent(txtEmissor)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(txtEndereco)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCEP)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLogradouro)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNumero)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBairro)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtComplemento)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(txtContato)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTelefone)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCelular)
                            .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(txtInformacoesAdicionais)
                .addGap(18, 18, 18)
                .addComponent(txtConvenio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox4)
                    .addComponent(jCheckBox3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodConvenio)
                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSenhaAcesso)
                    .addComponent(botaoCadastrar)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
        TelaPrincipal telaP = new TelaPrincipal();
        telaP.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void botaoCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastrarActionPerformed
        
        String nome = txtNome.getText().trim();
        String dataNasc = txtDataNasc.getText().trim();
        String rg = txtRg.getText().trim();
        String cpf = txtCpF.getText().trim();

        if (nome.isEmpty() || dataNasc.isEmpty() || rg.isEmpty() || cpf.isEmpty() ) {
           JOptionPane.showMessageDialog(null, "Todos os campos são obrigatórios!");
           return;
        }
        
        JOptionPane.showMessageDialog(this, "Cadastro de  paciente realizado");
        this.dispose();
        TelaPrincipal telaP = new TelaPrincipal();
        telaP.setVisible(true);
    }//GEN-LAST:event_botaoCadastrarActionPerformed

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
            java.util.logging.Logger.getLogger(AgendaConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgendaConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgendaConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgendaConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgendaConsulta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCadastrar;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JLabel txtBairro;
    private javax.swing.JLabel txtCEP;
    private javax.swing.JLabel txtCPF;
    private javax.swing.JLabel txtCadastroPaciente;
    private javax.swing.JLabel txtCelular;
    private javax.swing.JLabel txtCidade;
    private javax.swing.JLabel txtCodConvenio;
    private javax.swing.JLabel txtComplemento;
    private javax.swing.JLabel txtContato;
    private javax.swing.JLabel txtConvenio;
    private javax.swing.JTextField txtCpF;
    private javax.swing.JTextField txtDataNasc;
    private javax.swing.JLabel txtDataNascimento;
    private javax.swing.JLabel txtEmissor;
    private javax.swing.JLabel txtEndereco;
    private javax.swing.JLabel txtInformacoesAdicionais;
    private javax.swing.JLabel txtLogradouro;
    private javax.swing.JTextField txtNome;
    private javax.swing.JLabel txtNomePaciente;
    private javax.swing.JLabel txtNumero;
    private javax.swing.JLabel txtRG;
    private javax.swing.JTextField txtRg;
    private javax.swing.JLabel txtSenhaAcesso;
    private javax.swing.JLabel txtSexo;
    private javax.swing.JLabel txtTelefone;
    // End of variables declaration//GEN-END:variables
}
