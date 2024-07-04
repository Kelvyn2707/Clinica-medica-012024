package entidades;

// Table SQL

//CREATE TABLE Convenio (
//    id INT PRIMARY KEY AUTO_INCREMENT,
//    empresa VARCHAR(100) NOT NULL,
//    cnpj VARCHAR(14) NOT NULL,
//    telefone VARCHAR(20),
//    codigo VARCHAR(50) NOT NULL
//);


public class Convenio {
    private int id;
    private String empresa;
    private String cnpj;
    private String telefone;
    private String codigo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
}