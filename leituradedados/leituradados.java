package lucas.com;

import java.util.Scanner;

public class LeiuraDadosTeclado {

    public static void main(String [] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Digite seu primeiro nome, segundo nome, idade, possue filhos:");
            String primeiroNome = scan.next();
            String segundoNome = scan.next();
            int idade = scan.nextInt();
            boolean possueFilhos = scan.nextBoolean();


            System.out.println("Seu primeiro nome é: " + primeiroNome);
            System.out.println("Seu segundo nome  é: " + segundoNome);
            System.out.println("Seua idade é: " + idade);
            System.out.println("Filhos: " + possueFilhos);
        }


    }

}
