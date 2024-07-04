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
    private String nome;
    private String crm;
    private String especialidade;

    
    public int getId() { 
        return id; }
    
    public void setId(int id) { 
        this.id = id; }

    public String getNome() { 
        return nome; }
    
    public void setNome(String nome) { 
        this.nome = nome; }

    public String getCrm() { 
        return crm; }
    
    public void setCrm(String crm) { 
        this.crm = crm; }

    public String getEspecialidade() { 
        return especialidade; }
    
    public void setEspecialidade(String especialidade) { 
        this.especialidade = especialidade; }
}