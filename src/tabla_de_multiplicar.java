import java.util.Scanner;

public class tabla_de_multiplicar {


    public static void main(String[] args) {
        int contador = 0;
        int resultado = 1;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Dime un numero y te hago la tabla);
        int valor = entrada.nextInt();
        while (contador <= 10) {
            resultado = valor * contador;
            System.out.println(valor + "X" + contador + "=" + resultado);
            contador++;
        }

    }
}