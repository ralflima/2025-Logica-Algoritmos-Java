public class OperadoresLogicos {
    
    void main() {

        // VARIÁVEIS
        String formaPagamento = "à vista";
        double valor = 200;

        // VERIFICAÇÃO
        System.out.println(formaPagamento == "a prazo" || valor >= 100);

    }

}












// TABELA VERDADE - E
// VERIFICAÇÃO 01   -    OPERADOR   -   VERIFICAÇÃO 02   -   SITUAÇÃO
//      TRUE                E               TRUE               TRUE
//      TRUE                E               FALSE              FALSE
//      FALSE               E               TRUE               FALSE
//      FALSE               E               FALSE              FALSE








// TABELA VERDADE - OU
// VERIFICAÇÃO 01   -    OPERADOR   -   VERIFICAÇÃO 02   -   SITUAÇÃO
//      TRUE                OU               TRUE               TRUE
//      TRUE                OU               FALSE              TRUE
//      FALSE               OU               TRUE               TRUE
//      FALSE               OU               FALSE              FALSE




