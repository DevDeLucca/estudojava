package lucas.com;

public class operadoresAritimeticos {
    public static void main (String []args) {
        /*tratamento aritimetico com os principais operadores*/

        /*soma*/
        int resultado = 1 + 2;
        System.out.println(resultado);

        /*subtração*/
        resultado = resultado - 1;
        System.out.println(resultado);

        /*multiplicação*/
        resultado = resultado * 2;
        System.out.println(resultado);

        /*divisão*/
        resultado = resultado / 2;
        System.out.println(resultado);

        /*Modulo ou restante*/
        resultado = resultado % 2;
        System.out.println(resultado);

        /*concatnação*/
        String primeiroNome = "Esta é";
        String segundoNome = "uma string concatenada.";
        String terceiroNome = primeiroNome + segundoNome;
        System.out.println(terceiroNome);

        resultado = resultado + 1;
        System.out.println(resultado);

        resultado ++;
        System.out.println(resultado);

        ++resultado;
        System.out.println(resultado);

        System.out.println(resultado ++);

        System.out.println(++resultado);


		/*Operadores
		 *-----------------------
		 |*== Sinal de igualdade|
		 |*!= Diferente de      |
		 |* > Maior que         |
		 |* < Menor que         |
		 |*>= Maior ou igual que|
		 |*<= Menor ou igual que|
		 ------------------------*/


        /*Existem tambem os operadores Logicos do java, em condicionais.
         * Operadores
         * ------------------------
         * |        			  |
         * |& And                 |
         * || Or                  |
         * |^ Xor                 |
         * ||| Or curto circuito  |
         * |&& And curto circuito |
         * |! Not                 |
         * -----------------------
         * */

    }

}
