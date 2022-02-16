package vetores;

import java.util.Scanner;

public class intQuad {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] VetorA  = new int[15];
        double[] VetorB = new double[VetorA.length];

        for (int i = 0; i<VetorA.length; i++) {

            System.out.println("Digite o valor da posição" + i);
            VetorA[i] = scan.nextInt();

            VetorB[i] = Math.sqrt (VetorA[i]);
        }
        System.out.print("vetor A = ");

        for (int i = 0; i <VetorA.length; i++){
            System.out.print(VetorA[i] + " ");
        }
        System.out.println();

        System.out.print("vetor B = ");
        for(int i = 0; i <VetorB.length; i++){
            System.out.print(VetorB[i] + " ");
        }
        System.out.println();
    }

}
