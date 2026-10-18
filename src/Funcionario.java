import java.time.LocalDate;

public class Funcionario {

    private String nomeFuncionario;
    private LocalDate dataNascimentoFuncionario;
    private double salarioFuncionario;
    private String tipoContratacaoFuncionario;

    public Funcionario(String nomeFuncionario, LocalDate dataNascimentoFuncionario,
                       double salarioFuncionario, String tipoContratacaoFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
        this.dataNascimentoFuncionario = dataNascimentoFuncionario;
        this.salarioFuncionario = salarioFuncionario;
        this.tipoContratacaoFuncionario = tipoContratacaoFuncionario;
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }
    public LocalDate getDataNascimentoFuncionario() {
        return dataNascimentoFuncionario;
    }
    public double getSalarioFuncionario() {
        return salarioFuncionario;
    }
    public String getTipoContratacaoFuncionario() {
        return tipoContratacaoFuncionario;
    }
}
