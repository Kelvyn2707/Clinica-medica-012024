package entidades;

// Table MySQL

//CREATE TABLE Medico (
//    id INT PRIMARY KEY AUTO_INCREMENT,
//    nome VARCHAR(100) NOT NULL,
//    crm VARCHAR(15) UNIQUE NOT NULL,
//    especialidade VARCHAR(100) NOT NULL
//);

public class Medico {
    private int id;
    private String nomeMedico;
    private String crm;
    private String especialidade;
    private String senhaMedico;
    
    public Medico(String nomeUsuario, String senhaUsuario){
        this.senhaMedico = senhaMedico ;
        this.nomeMedico = nomeMedico;
    }

    
    public int getIdMedico() { 
        return id; }
    
    public void setIdMedico(int id) { 
        this.id = id; }

    public String getNomeMedico() { 
        return nomeMedico; }
    
    public void setNomeMedico(String nome) { 
        this.nomeMedico = nome; }

    public String getCrmMedico() { 
        return crm; }
    
    public void setCrmMedico(String crm) { 
        this.crm = crm; }

    public String getEspecialidadeMedico() { 
        return especialidade; }
    
    public void setEspecialidadeMedico(String especialidade) { 
        this.especialidade = especialidade; }

    public String getSenhaMedico() {
        return senhaMedico;
    }

    public void setSenhaMedico(String senha) {
        this.senhaMedico = senha;
    }
}