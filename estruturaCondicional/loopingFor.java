package lucas.com;

public class loopingFor {

    public static void main(String [] args) {
        //Executa um bloco de codigo que esta detro do for
        //enquanto uma expressão for verdadeira

        //Muito utilizado na programação

        /*for (inicialização; condição; atualização) {
         *bloco de código*/


        //for (int i = 0; i < 5; i++) {
        //System.out.println("i tem valor: " + i);
        //}

        for (int i = 5; i > 0; i--) {
            System.out.println("i tem valor: " + i);
        }


        // utilizando o bloco for com mais variaveis
        for (int i = 0, j = 10 ; i < j ; i++, j--) {
            System.out.println("i = " + i + "; j = " + j);
        }


    }

}
