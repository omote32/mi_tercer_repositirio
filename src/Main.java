

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int contador= 1;
        double resultado=1;
        Scanner entrada=new Scanner(System.in);
        System.out.println("Que factorial quieres calcular");
        int valor= entrada.nextInt();
        while(contador<=valor){
            resultado=resultado*contador;
            contador=contador+1;
        }
        System.out.println("El factorial de " + valor + " es " + resultado);
    }
}
