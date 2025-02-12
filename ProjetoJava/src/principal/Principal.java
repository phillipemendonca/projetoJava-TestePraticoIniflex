package principal;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.math.RoundingMode;

public class Principal {
    public static void main(String[] args) {
        List<Funcionario> funcionarios = new ArrayList<>();

        // 3.1 Inserindo todos os funcionários
        funcionarios.add(new Funcionario("Maria", LocalDate.of(2000, 10, 18), new BigDecimal("2009.44"), "Operador"));
        funcionarios.add(new Funcionario("João", LocalDate.of(1990, 5, 12), new BigDecimal("2284.38"), "Operador"));
        funcionarios.add(new Funcionario("Caio", LocalDate.of(1961, 5, 2), new BigDecimal("9836.14"), "Coordenador"));
        funcionarios.add(new Funcionario("Miguel", LocalDate.of(1988, 10, 14), new BigDecimal("19119.88"), "Diretor"));
        funcionarios.add(new Funcionario("Alice", LocalDate.of(1995, 1, 5), new BigDecimal("2234.68"), "Recepcionista"));
        funcionarios.add(new Funcionario("Heitor", LocalDate.of(1999, 11, 19), new BigDecimal("1582.72"), "Operador"));
        funcionarios.add(new Funcionario("Arthur", LocalDate.of(1993, 3, 31), new BigDecimal("4071.84"), "Contador"));
        funcionarios.add(new Funcionario("Laura", LocalDate.of(1994, 7, 8), new BigDecimal("3017.45"), "Gerente"));
        funcionarios.add(new Funcionario("Heloísa", LocalDate.of(2003, 5, 24), new BigDecimal("1606.85"), "Eletricista"));
        funcionarios.add(new Funcionario("Helena", LocalDate.of(1996, 9, 2), new BigDecimal("2799.93"), "Gerente"));

        // 3.2 Removendo João
        Funcionario remover = null;
        for (Funcionario f : funcionarios) {
            if (f.getNome().equalsIgnoreCase("João")) {
                remover = f;
                break;
            }
        }
        if (remover != null) {
            funcionarios.remove(remover);
        }

        // 3.3 Printing all employees
        System.out.println("\n==================== Lista de Funcionários =====================");
        for (Funcionario f : funcionarios) {
            System.out.println(f);
        }

        // 3.4 Updating salary with 10% increase
        for (Funcionario f : funcionarios) {
            BigDecimal aumento = f.getSalario().multiply(new BigDecimal("0.10"));
            f.setSalario(f.getSalario().add(aumento));
        }

        // 3.5 e 3.6 Grouping and printing by function
        Map<String, List<Funcionario>> agrupadosPorFuncao = new HashMap<>();
        for (Funcionario f : funcionarios) {
            if (!agrupadosPorFuncao.containsKey(f.getFuncao())) {
                agrupadosPorFuncao.put(f.getFuncao(), new ArrayList<>());
            }
            agrupadosPorFuncao.get(f.getFuncao()).add(f);
        }
        System.out.println("\n=== Funcionários Agrupados por Função ===");
        for (String funcao : agrupadosPorFuncao.keySet()) {
            System.out.println("Função: " + funcao);
            for (Funcionario f : agrupadosPorFuncao.get(funcao)) {
                System.out.println(f);
            }
        }

        // 3.8 October and December birthdays
        System.out.println("\n====================== Aniversariantes de Outubro e Dezembro ====================");
        for (Funcionario f : funcionarios) {
            Month mes = f.getDataNascimento().getMonth();
            if (mes == Month.OCTOBER || mes == Month.DECEMBER) {
                System.out.println(f);
            }
        }

        // 3.9 Older employee
        Funcionario maisVelho = funcionarios.get(0);
        for (Funcionario f : funcionarios) {
            if (f.getDataNascimento().isBefore(maisVelho.getDataNascimento())) {
                maisVelho = f;
            }
        }
        System.out.println("\n====================== Funcionário com Maior Idade ========================");
        System.out.println("Nome: " + maisVelho.getNome() + ", Idade: " + maisVelho.getIdade());

        // 3.10 Sort alphabetically
        System.out.println("\n====================== Funcionários em Ordem Alfabética ====================");
        Collections.sort(funcionarios, Comparator.comparing(Funcionario::getNome));
        for (Funcionario f : funcionarios) {
            System.out.println(f);
        }

        // 3.11 Total salaries
        BigDecimal totalSalarios = BigDecimal.ZERO;
        for (Funcionario f : funcionarios) {
            totalSalarios = totalSalarios.add(f.getSalario());
        }
        System.out.println("\n========================== Total dos Salários ==========================");
        System.out.println("R$ " + totalSalarios);

        // 3.12 Quantity of minimum wages
        BigDecimal salarioMinimo = new BigDecimal("1212.00");
        System.out.println("\n=========================== Salários Mínimos por Funcionário =============");
        for (Funcionario f : funcionarios) {
            BigDecimal qtdSalariosMin = f.getSalario().divide(salarioMinimo, 2, RoundingMode.HALF_UP);
            System.out.println(f.getNome() + ": " + qtdSalariosMin + " salários mínimos");
        }
    }
}
