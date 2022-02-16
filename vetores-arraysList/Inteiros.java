package vetores;

import java.util.Scanner;

public class Inteiros {

    public static void main(String[]args){

        Scanner scan = new Scanner(System.in);

        int [] vetorA = new int[5];
        int [] vetorB = new int[vetorA.length];

        for (int i=0; i<vetorA.length; i++) {

            System.out.println("Digite o valor da posição" + i);
            vetorA[i] = scan.nextInt();

            vetorB[i] = vetorA[i];
        }

        /*for (int i=0; i<vetorA.length; i++) {
            vetorB[i] = vetorA[i];5
        }*/

        System.out.print("vetor A = ");
        for(int i=0; i<vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();

        System.out.print("vetor B = ");
        for(int i=0; i<vetorB.length; i++){
            System.out.print(vetorB[i] + " ");
        }
        System.out.println();
    }
}