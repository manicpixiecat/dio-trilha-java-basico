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
    }
}