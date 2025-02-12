package principal;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;
import java.time.LocalDate;

public class Funcionario extends Pessoa {
    private BigDecimal salario;
    private String funcao;

    public Funcionario(String nome, LocalDate dataNascimento, BigDecimal salario, String funcao) {
        super(nome, dataNascimento);
        this.salario = salario;
        this.funcao = funcao;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    public String getFuncao() {
        return funcao;
    }

    // Método para formatar o salário 
    public String getSalarioFormatado() {
        NumberFormat formatoMoeda = NumberFormat.getCurrencyInstance(Locale.forLanguageTag("pt-BR"));
        return formatoMoeda.format(salario);
    }

    @Override
    public String toString() {
        return "Nome: " + getNome() + 
               ", Data de Nascimento: " + getDataNascimentoFormatada() + 
                              ", Salário: " + getSalarioFormatado() + 
                              ", Função: " + funcao;
                   }
               
                   
                   
}
