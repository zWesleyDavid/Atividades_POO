import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.Period;

public class Pessoa {

    private String nome;
    private LocalDate dataNascimento;

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public LocalDate getDataNascimento(){
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.dataNascimento = LocalDate.parse(dataNascimento, formatter);
    }

    public int getIdade() {
        LocalDate hoje = LocalDate.now();
        Period periodo = Period.between(dataNascimento, hoje);
        return periodo.getYears();
    }

    public String getDataNascimentoFormatada(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return dataNascimento.format(formatter);
    }

}
