import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) throws Exception {
        System.out.println("Introduzca dos números enteros");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca el primer número: ");
        int numero1 = scanner.nextInt();
        System.out.println("Introduzca el segundo número: ");
        int numero2 = scanner.nextInt();
        System.out.printf("La suma de los números es: %d", numero1+numero2);
        scanner.close();    }
}
