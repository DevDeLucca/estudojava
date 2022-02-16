package lucas.com;

import java.util.Scanner;

public class ifCond {

    public static void main(String [] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com sua idade");

        int idade = scan.nextInt();

        if (idade >=18){
            System.out.println("É mair de idade");

        }

        else {

            System.out.println("Você nao possui maior idade");

        }
    }

}
