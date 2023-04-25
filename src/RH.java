import java.util.Date;

public class RH {
    String nome;
    String cpf;
    String telefone;
    Date nascimento;
    Date agendamento;
    String período;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

    public Date getAgendamento() {
        return agendamento;
    }

    public void setAgendamento(Date agendamento) {
        this.agendamento = agendamento;
    }

    public String getPeríodo() {
        return período;
    }

    public void setPeríodo(String período) {
        this.período = período;
    }

    public RH(String nome, String cpf, String telefone, Date nascimento, Date agendamento, String período) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.nascimento = nascimento;
        this.agendamento = agendamento;
        this.período = período;
    }

    public String toString() {
        return "RH{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", telefone='" + telefone + '\'' +
                ", nascimento=" + nascimento +
                ", agendamento=" + agendamento +
                ", período='" + período + '\'' +
                '}';
    }
}
