package entidades;

// Table MySQL

//CREATE TABLE Prontuario (
//    id INT PRIMARY KEY AUTO_INCREMENT,
//    registro VARCHAR(50) NOT NULL UNIQUE,
//    exames_realizados TEXT,
//    historico TEXT,
//    receituario TEXT
//);


public class Prontuario {
    private int id;
    private String registro;
    private String examesRealizados;
    private String historico;
    private String receituario;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    public String getExamesRealizados() {
        return examesRealizados;
    }

    public void setExamesRealizados(String examesRealizados) {
        this.examesRealizados = examesRealizados;
    }

    public String getHistorico() {
        return historico;
    }

    public void setHistorico(String historico) {
        this.historico = historico;
    }

    public String getReceituario() {
        return receituario;
    }

    public void setReceituario(String receituario) {
        this.receituario = receituario;
    }
}