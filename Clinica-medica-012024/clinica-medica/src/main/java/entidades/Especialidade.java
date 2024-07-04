package entidades;

// Table MySQL

// CREATE TABLE Especialidade (
//     id INT PRIMARY KEY AUTO_INCREMENT,
//     nome VARCHAR(100) NOT NULL,
//     especialidade VARCHAR(100) UNIQUE NOT NULL,
// );

public class Especialidade {
    private int id;
    private String nome;
    private String especialidade;
    
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

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    @Override
    public String toString() {
        return nome + " - " + especialidade;
    }
}