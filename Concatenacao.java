public class Concatenacao {

    void main() {
        
        // Variáveis
        String nome = "Ralf";
        int idade = 35;

        // Concatenação
        //System.out.println("Olá " + nome + " você tem " + idade + " anos.");
        System.out.println(String.format("Olá %s você tem %s anos.", nome, idade));

    }
    
}
