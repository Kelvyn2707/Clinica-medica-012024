package entidades;

import java.util.Date;

// Table MySQL

//CREATE TABLE Paciente (
//    id INT PRIMARY KEY AUTO_INCREMENT,
//    nome VARCHAR(100) NOT NULL,
//    cpf VARCHAR(14) NOT NULL,
//    rg VARCHAR(14) NOT NULL,
//    cidade VARCHAR(100) NOT NULL,
//    bairro VARCHAR(100) NOT NULL,
//    numero_residencia CHAR(10) NOT NULL,
//    cep CHAR(9) NOT NULL,
//    idade INT NOT NULL,
//    sexo CHAR(1) CHECK (sexo IN ('F', 'M')) NOT NULL,
//    email VARCHAR(100) NOT NULL,
//    telefone VARCHAR(20) NOT NULL,
//    data_nascimento DATE NOT NULL,
//    status VARCHAR(10) NOT NULL
//);


public class Paciente {
    private int id;
    private String nome;
    private String cpf;
    private String rg;
    private String cidade;
    private String bairro;
    private String numeroResidencia;
    private String cep;
    private int idade;
    private String sexo;
    private String email;
    private String telefone;
    private Date dataNascimento;
    private String status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getNumeroResidencia() {
        return numeroResidencia;
    }

    public void setNumeroResidencia(String numeroResidencia) {
        this.numeroResidencia = numeroResidencia;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

