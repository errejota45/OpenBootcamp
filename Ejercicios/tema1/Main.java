package Ejercicios.tema1;

public class Main {
    public static void main(String[] args) {

        // Enteros
        byte byte1 = 127;             // 1 byte : -128 hasta +127
        short short2 = 32767;          // 2 bytes: -32.768 hasta 32.767
        int int3 = 1232323323;       // 4 bytes: desde -2^31 hasta (2^31)-1
        long long4 = 213122323;       // 8 bytes: desde -2^63 a (2^63)-1

        // Coma flotante
        float float5 = 231.23f;        // 1.4x10^-45 hasta 3.4028235x10^38
        double double6 = 12.33d;         // 4.9x10^-324 hasta 1.7976931348623157x10^308

        // Binarios
        boolean booleano = false;       // Valores posibles: true y false

        // Carácteres
        char caracter = 'b';
        String cadena = "Esto es una cadena"; // Esta es una clase envoltura.



        // Impresión de los tipos de datos.

        System.out.println("Tipos de datos enteros:");
        System.out.println("----------------------:");
        System.out.println("Byte: " + byte1);
        System.out.println("Short: " + short2);
        System.out.println("Entero: " + int3);
        System.out.println("Entero largo: " + long4);
        System.out.println();
        System.out.println("----------------------:");
        System.out.println("Tipos de datos decimales o coma flotante:");
        System.out.println("----------------------:");
        System.out.println("Float: " + float5);
        System.out.println("Double: " + double6);
        System.out.println();
        System.out.println("----------------------:");
        System.out.println("Tipos de datos booleanos");
        System.out.println("----------------------:");
        System.out.println("Boolean: " + booleano);
        System.out.println();
        System.out.println("----------------------:");
        System.out.println("Tipos de datos caracteres");
        System.out.println("----------------------:");
        System.out.println("char: " + caracter);
        System.out.println();
        System.out.println("----------------------:");
        System.out.println("Tipos de datos cadenas");
        System.out.println("----------------------:");
        System.out.println("Cadena: " + cadena);





    }
}
