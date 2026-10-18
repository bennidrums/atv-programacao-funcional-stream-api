import java.util.List;

public class Empresa {

    private String nomeEmpresa;
    private List<Funcionario> funcionarios;

    public Empresa(String nomeEmpresa, List<Funcionario> funcionarios) {
        this.nomeEmpresa = nomeEmpresa;
        this.funcionarios = funcionarios;
    }
    public String getNomeEmpresa() {
        return nomeEmpresa;
    }
    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }
}