package lucas.com;

import java.util.Scanner;

public class SwitchCase {

    public static void main(String [] args) {
        Scanner scan = new Scanner (System.in);

        System.out.print("Entre com um dia da semana(1-7):");
        /*No shitcher podemos utiliar alem dos operadores logicos, byte, short, int ou char
        * que são numeros inteiros, e apartir do java 07 aceita String*/

        int diaSemana =scan.nextInt();

        switch(diaSemana) {
            case 1: System.out.print("Domingo"); break;
            case 2: System.out.print("Segunda"); break;
            case 3: System.out.print("Terça"); break;
            case 4: System.out.print("Quarta"); break;
            case 5: System.out.print("Quinta"); break;
            case 6: System.out.print("Sexta"); break;
            case 7: System.out.print("Sabado"); break;
            default:System.out.print("Esse dia da semana não e valido");

            /*switch(diaSemana) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6: System.out.println("dia util");break
            case 1:
            case 7: System.out.print("Sabado"); break;
            default:System.out.print("Esse dia da semana não e valido");*/
        }

    }
}
