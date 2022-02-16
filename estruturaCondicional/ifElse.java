package lucas.com;

import java.util.Scanner;

public class IfElse {

    public static void main(String [] args) {

       //Barato <= 10;
        //10 > valor < 15 - pedir desconto
        //> 15 valor < 17 - pesquiso mais
        //> = 17 muito caro
        /*Sempre e utilizado as expressões logicas, true ou false*/

        Scanner scan = new Scanner(System.in);

        System.out.println("Qual o valor do produto? ");
        double valor = scan.nextDouble();


        if (valor <=10) {
            System.out.println("Valor acessivel, pode finalizar a compra!");
        }

        else if
        (valor >10 && valor <15) {
            System.out.println("Você pode pedir um desconto");
        }

        else if
        (valor>15 && valor <17) {
            System.out.println("Pesquisar mais");
        }

        else {
            System.out.println("Muito caro");
        }

    }
}
