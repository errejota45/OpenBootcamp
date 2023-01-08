package Ejercicios.tema2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // El IVA se supone que es del 21%

        float precioNeto;
        float precioIVA;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un precio: ");
        precioNeto = teclado.nextFloat();
        teclado.close();

        // Llamo a la función calcularIVA y le paso el valor obtenido por teclado.
        precioIVA = calcularIVA(precioNeto);

        System.out.println(precioIVA);
    }

    static float calcularIVA(float precio){
        return precio * 1.21f;
    }
}
