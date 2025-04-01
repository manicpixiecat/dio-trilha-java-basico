public class Operadores {
    public static void main(String[] args) {
        // Exemplos de concatenação com String
        String nomeCompleto = "LINGUAGEM" + " JAVA";
        System.out.println(nomeCompleto);

        String concatenacao = "?";

        concatenacao = 1 + 1 + 1 + "1";
        System.out.println(concatenacao);

        concatenacao = 1 + "1" + 1 + 1;
        System.out.println(concatenacao);

        concatenacao = 1 + "1" + 1 + "1";
        System.out.println(concatenacao);

        concatenacao = "1" + 1 + 1 + 1;
        System.out.println(concatenacao);

        concatenacao = "1" + (1 + 1 + 1);
        System.out.println(concatenacao);

        // Exemplo de operadores unários
        int numero = 5;
        numero = -numero;
        System.out.println(numero);

        // O operador + não muda  apenas mantém o valor atual porque é reconhecido como operador aritmetico
        numero = +numero;
        System.out.println(numero);

        // Usando operação matematica para incrementar
        numero = numero * -1;
        System.out.println(numero);
        numero = 5;
        // Decrementando o numero
        System.out.println(-numero);
        // Incrementando número em 1
        numero++;
        System.out.println(numero);
        // Tentando imprimir com pós-incremento (ORDEM DE PROCEDENCIA)
        System.out.println(numero++);  // Imprime 6, depois incrementa para 7
        System.out.println(numero);
        // Pré-incremento (incrementa antes de imprimir usando a ordem certa de procedencia)
        System.out.println(++numero);

        // Operador lógico de negação usado para inverter o valor booleano
        boolean verdadeiro = true;
        System.out.println("Inverteu" + !verdadeiro);

        //operadores relacionais > < ==  !=  <= >= etc
        int numero1 = 1;
        int numero2 = 2;

        if(numero1 > numero2)
            System.out.print("Numero 1 maior que numero 2");

        if(numero1 < numero2)
            System.out.print("Numero 1 menor que numero 2");

        if(numero1 >= numero2)
            System.out.print("Numero 1 maior ou igual que numero 2");

        if(numero1 <= numero2)
            System.out.print("Numero 1 menor ou igual que numero 2");

        if(numero1 != numero2)
            System.out.print("Numero 1 é diferente de numero 2");

        //exemplos de operadores ternários
        int a,b;
        a = 5;
        b = 6;

        String resultado = a==b ? "verdadeiro" : "falso";

        System.out.println(resultado);

        boolean condicao1=true;
        boolean condicao2=true;
        
        // verifica se as condições juntas são verdadeiras
        if (condicao1 && condicao2) {
            System.out.println("as duas condições são verdadeiras");
        }
        
        //Verifica se PELO MENOS UMA condição é verdadeira com o simbolo || ( Verifica se PELO MENOS UMA condição é verdadeira (OR)
        if (condicao1 || condicao2){
            System.out.println("Uma das condições é verdadeira");
        }
        
        System.out.println("Fim");
    }
}