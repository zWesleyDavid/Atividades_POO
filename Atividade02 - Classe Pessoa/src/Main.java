import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Pessoa wesley = new Pessoa();
        wesley.setNome("Wesley");
        wesley.setDataNascimento("06/04/2003");

        System.out.println("Nome: " + wesley.getNome());
        System.out.println("Data de nascimento: " + wesley.getDataNascimentoFormatada());
        System.out.println("Idade: " + wesley.getIdade());

    }
}