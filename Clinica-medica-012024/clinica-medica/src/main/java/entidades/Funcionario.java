package entidades;

// CREATE TABLE Funcionario (
//    id INT PRIMARY KEY AUTO_INCREMENT,
//    nome VARCHAR(100) NOT NULL,
//    rg VARCHAR(14) NOT NULL,
//    orgao_emissor VARCHAR(20) NOT NULL,
//    cpf VARCHAR(14) NOT NULL,
//    endereco VARCHAR(100) NOT NULL,
//    numero CHAR(10) NOT NULL,
//    complemento VARCHAR(100),
//    bairro VARCHAR(100) NOT NULL,
//    cidade VARCHAR(100) NOT NULL,
//    estado VARCHAR(2) NOT NULL,
//    telefone VARCHAR(20),
//    celular VARCHAR(20),
//    numero_pis VARCHAR(20) NOT NULL,
//    data_nascimento DATE NOT NULL
// );


import java.sql.Date;

public class Funcionario {
    
    private int id;
    private String nome;
    private String rg;
    private String orgaoEmissor;
    private String cpf;
    private String endereco;
    private String numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String estado;
    private String telefone;
    private String celular;
    private String numeroPis;
    private Date dataNascimento;

    public int getId() { 
        return id; }
    
    public void setId(int id) { 
        this.id = id; }

    public String getNome() { 
        return nome; }
    
    public void setNome(String nome) { 
        this.nome = nome; }

    public String getRg() { 
        return rg; }
    
    public void setRg(String rg) { 
        this.rg = rg; }

    public String getOrgaoEmissor() { 
        return orgaoEmissor; }
    
    public void setOrgaoEmissor(String orgaoEmissor) { 
        this.orgaoEmissor = orgaoEmissor; }

    public String getCpf() { 
        return cpf; }
    
    public void setCpf(String cpf) { 
        this.cpf = cpf; }

    public String getEndereco() { 
        return endereco; }
    
    public void setEndereco(String endereco) { 
        this.endereco = endereco; }

    public String getNumero() { 
        return numero; }
    
    public void setNumero(String numero) { 
        this.numero = numero; }

    public String getComplemento() { 
        return complemento; }
    
    public void setComplemento(String complemento) { 
        this.complemento = complemento; }

    public String getBairro() { 
        return bairro; }
    
    public void setBairro(String bairro) { 
        this.bairro = bairro; }

    public String getCidade() { 
        return cidade; }
    
    public void setCidade(String cidade) { 
        this.cidade = cidade; }

    public String getEstado() { 
        return estado; }
    
    public void setEstado(String estado) {
        this.estado = estado; }

    public String getTelefone() { 
        return telefone; }
    
    public void setTelefone(String telefone) { 
        this.telefone = telefone; }

    public String getCelular() { 
        return celular; }
    
    public void setCelular(String celular) { 
        this.celular = celular; }

    public String getNumeroPis() { 
        return numeroPis; }
    
    public void setNumeroPis(String numeroPis) { 
        this.numeroPis = numeroPis; }

    public Date getDataNascimento() { 
        return dataNascimento; }
    
    public void setDataNascimento(Date dataNascimento) { 
        this.dataNascimento = dataNascimento; }
}