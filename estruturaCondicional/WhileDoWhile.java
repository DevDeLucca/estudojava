package lucas.com;

public class whileDoWhile {
    public static void main(String [] args) {

        int i = 0;
        int max = 10;

        System.out.println("Contando até " + max);

        //While primeiro avalia a expressão depois executa o bloco de codigo
        while (i < max) {

            System.out.println("Valor de i: " + i);
            i++;


            //DoWhile executa o bloco de codigo, pois verifica a condição
            do {
                i++;
                System.out.println("valor de i: " + i);

            }

            while (i < 15);
            System.out.println(i);

        }
    }

}
