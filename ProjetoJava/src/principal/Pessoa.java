package principal;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

//Declaring the Pessoa class with its attributes and gets and setters
public class Pessoa {
    private String nome;
    private LocalDate dataNascimento;

    public Pessoa(String nome, LocalDate dataNascimento) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    // Method to calculate age accurately
    public int getIdade() {
        return Period.between(dataNascimento, LocalDate.now()).getYears();
    }

    // Method to format the date 
    public String getDataNascimentoFormatada() {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return dataNascimento.format(formato);
    }

    @Override
    public String toString() {
        return "Nome: " + nome + 
               ", Data de Nascimento: " + getDataNascimentoFormatada();
    }
}
