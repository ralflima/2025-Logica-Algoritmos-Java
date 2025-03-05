public class Escolha {
    
    void main() {
    
        // Variável
        String cidade = "São Paulo";

        // Switch Expressions (Java 12+)
        String mensagem = switch(cidade){
            case "São Paulo" -> "Maior cidade do país.";
            case "Rio de Janeiro" -> "Cidade de belas praias.";
            default -> "Cidade não encontrada.";
        };

        System.out.println(mensagem);

        // Estrutura de escolha
        // switch(cidade){
        //     case "São Paulo":
        //     System.out.println("A maior cidade do país.");
        //     break;

        //     case "Rio de Janeiro":
        //     System.out.println("Cidade de belas praias.");
        //     break;

        //     default:
        //     System.out.println("Cidade não encontrada.");
        // }
    
    }

}