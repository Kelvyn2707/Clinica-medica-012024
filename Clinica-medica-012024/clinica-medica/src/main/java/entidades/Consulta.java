package entidades;

import java.util.Date;

// Table MySQL

// CREATE TABLE Consulta (
//    registroAgenda INT PRIMARY KEY AUTO_INCREMENT,
//    codigoUsuario INT,
//    codigoPaciente INT,
//    codigoMedico INT,
//    data DATE,
//    hora VARCHAR(5),
//    retorno VARCHAR(1),
//    cancelado VARCHAR(1),
//    motivoCancelamento VARCHAR(100),
//    FOREIGN KEY (codigoUsuario) REFERENCES Usuario(id),
//    FOREIGN KEY (codigoPaciente) REFERENCES Paciente(id),
//    FOREIGN KEY (codigoMedico) REFERENCES Funcionario(id)
//);

public class Consulta {
    private int registroAgenda;
    private int codigoUsuario;
    private int codigoPaciente;
    private int codigoMedico;
    private Date data;
    private String hora;
    private String retorno;
    private String cancelado;
    private String motivoCancelamento;

    public int getRegistroAgenda() {
        return registroAgenda;
    }

    public void setRegistroAgenda(int registroAgenda) {
        this.registroAgenda = registroAgenda;
    }

    public int getCodigoUsuario() {
        return codigoUsuario;
    }

    public void setCodigoUsuario(int codigoUsuario) {
        this.codigoUsuario = codigoUsuario;
    }

    public int getCodigoPaciente() {
        return codigoPaciente;
    }

    public void setCodigoPaciente(int codigoPaciente) {
        this.codigoPaciente = codigoPaciente;
    }

    public int getCodigoMedico() {
        return codigoMedico;
    }

    public void setCodigoMedico(int codigoMedico) {
        this.codigoMedico = codigoMedico;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getRetorno() {
        return retorno;
    }

    public void setRetorno(String retorno) {
        this.retorno = retorno;
    }

    public String getCancelado() {
        return cancelado;
    }

    public void setCancelado(String cancelado) {
        this.cancelado = cancelado;
    }

    public String getMotivoCancelamento() {
        return motivoCancelamento;
    }

    public void setMotivoCancelamento(String motivoCancelamento) {
        this.motivoCancelamento = motivoCancelamento;
    }

    @Override
    public String toString() {
        return "Consulta{" +
                "registroAgenda=" + registroAgenda +
                ", codigoUsuario=" + codigoUsuario +
                ", codigoPaciente=" + codigoPaciente +
                ", codigoMedico=" + codigoMedico +
                ", data=" + data +
                ", hora='" + hora + '\'' +
                ", retorno='" + retorno + '\'' +
                ", cancelado='" + cancelado + '\'' +
                ", motivoCancelamento='" + motivoCancelamento + '\'' +
                '}';
    }
}