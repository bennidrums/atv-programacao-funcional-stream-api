import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.time.Period;

public class Main {

    public static void main(String[] args) {

        Funcionario f1 = new Funcionario(
                "Ada",
                LocalDate.of(1974, 9, 10),
                2800.00,
                "Secret Agent"
        );

        Funcionario f2 = new Funcionario(
                "Leon",
                LocalDate.of(1977, 9, 7),
                2800.00,
                "Special Forces"
        );

        Funcionario f3 = new Funcionario(
                "Chris",
                LocalDate.of(1970, 3, 15),
                2500.00,
                "Stars"
        );

        Funcionario f4 = new Funcionario(
                "Jill",
                LocalDate.of(1985, 7, 10),
                5100.00,
                "Stars"
        );

        Funcionario f5 = new Funcionario(
                "Carlos",
                LocalDate.of(2005, 5, 10),
                4500.00,
                "CLT"
        );

        Funcionario f6 = new Funcionario(
                "Claire",
                LocalDate.of(2004, 3, 15),
                5200.00,
                "CLT"
        );

        Funcionario f7 = new Funcionario(
                "Rebecca",
                LocalDate.of(2003, 8, 20),
                3900.00,
                "CLT"
        );

        List<Funcionario> funcionariosEmpresa1 = Arrays.asList(f1, f2);

        Empresa empresa1 = new Empresa(
                "RE Solutions",
                funcionariosEmpresa1
        );

        List<Funcionario> funcionariosEmpresa2 = Arrays.asList(f3, f4);

        Empresa empresa2 = new Empresa(
                "S.T.A.R.S",
                funcionariosEmpresa2
        );

        List<Funcionario> funcionariosEmpresa3 = Arrays.asList(f5, f6, f7);
        Empresa empresa3 = new Empresa(
                "Umbrella",
                funcionariosEmpresa3
        );

        List<Empresa> empresas = Arrays.asList(empresa1, empresa2, empresa3);

        List<Funcionario> resultado = filtrarFuncionarios(empresas);

        resultado.forEach(funcionario ->
                System.out.println(funcionario.getNomeFuncionario())
        );

        List<Integer> numeros = Arrays.asList(10, 3, 8, 5, 2, 7);
        System.out.println(somarPares(numeros));

        List<Funcionario> maioresSalarios = maioresSalariosCLT(empresas);

        maioresSalarios.forEach(funcionario ->
                System.out.println(
                        funcionario.getNomeFuncionario()
                                + " - R$ "
                                + funcionario.getSalarioFuncionario()
                )
        );

    }

    public static List<Funcionario> filtrarFuncionarios(List<Empresa> empresas) {
        return empresas.stream()
                .flatMap(empresa -> empresa.getFuncionarios().stream())
                .filter(funcionario -> {
                    LocalDate nascimento = funcionario.getDataNascimentoFuncionario();

                    return !nascimento.isBefore(LocalDate.of(1975, 1, 1))
                            && !nascimento.isAfter(LocalDate.of(1985, 12, 31))
                            && funcionario.getSalarioFuncionario() <= 3000.00;
                })
                .collect(Collectors.toList());
    }

    public static int somarPares(List<Integer> numeros) {
        return numeros.stream()
                .filter(numero -> numero % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();
    }

    public static List<Funcionario> maioresSalariosCLT(List<Empresa> empresas) {
        return empresas.stream()
                .flatMap(empresa -> empresa.getFuncionarios().stream())
                .filter(funcionario -> {
                    int idade = Period.between(
                            funcionario.getDataNascimentoFuncionario(),
                            LocalDate.now()
                    ).getYears();

                    return funcionario.getTipoContratacaoFuncionario().equals("CLT")
                            && idade < 25;
                })
                .sorted((f1, f2) ->
                        Double.compare(
                                f2.getSalarioFuncionario(),
                                f1.getSalarioFuncionario()
                        )
                )
                .limit(30)
                .collect(Collectors.toList());

    }
}