import java.util.Scanner;

public class Interacao {
    
    void main() {
        
        // Criar um objeto da classe Scanner
        Scanner obj = new Scanner(System.in);

        // Obter nome
        System.out.println("Qual é o seu nome?");
        String nome = obj.nextLine();

        // Obter idade
        System.out.println("Qual é a sua idade?");
        int idade = obj.nextInt();

        // Finalizar interação
        obj.close();

        // Concatenação
        System.out.println("Olá " + nome + " você tem " + idade + " anos.");

    }

}
