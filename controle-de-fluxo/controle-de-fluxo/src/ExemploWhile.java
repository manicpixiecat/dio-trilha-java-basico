// ExemploWhile.java
import java.util.concurrent.ThreadLocalRandom;
public class ExemploWhile {
public static void main(String[] args) {
	double mesada = 50.0;
        while(mesada>0) {
            Double valorDoce = valorAleatorio();
            if(valorDoce > mesada)
            //adicionado para não ter valor negativo
                valorDoce = mesada; 

            System.out.println("Doce do valor: " + valorDoce + " Adicionado no carrinho");
            mesada = mesada - valorDoce; //decrementa
        }
        System.out.println("Mesada:" + mesada);
        System.out.println("Dante gastou toda a sua mesada em doces");
   }
   //metodo
   private static double valorAleatorio() {
	return ThreadLocalRandom.current().nextDouble(2, 8);
   }
}