package main;

import java.util.Arrays;
import java.util.Random;

public class Exercises {

    /* Exercise 1
     * Escriba un programa que defina 3 variables con números enteros positivos, y que
     * de esas variables calcule e imprima en pantalla el menor y el mayor.
     */
    public void minAndMaxNumbers(int first, int second, int third) {
        if (first < 0 || second < 0 || third < 0) {
            System.out.println("Numbers must be positive");
            return;
        }
        int[] numbers = {first, second, third};
        Arrays.sort(numbers);
        System.out.println("The minimum number is: " + numbers[0]);
        System.out.println("The maximum number is: " + numbers[2]);
    }

    /* Exercise 2
     * Crear un vector entero con 10 números aleatorios, después leer el vector aquellos
     * valores que sean menores a 5 eliminarlos del vector y por último imprimir todo el vector.
     */
    public void randomVector() {
        Random r = new Random();
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = r.nextInt();
        }
        System.out.println("Original array is: " + Arrays.toString(numbers));

        int[] numbersWithout5 = Arrays.stream(numbers).filter(n -> n >= 5).toArray();

        System.out.println("New array with numbers greater than 5 is: " + Arrays.toString(numbersWithout5));
    }

    /* Exercise 3
     * Construir un programa que simule el funcionamiento de una calculadora que
     * puede realizar las cuatro operaciones aritméticas básicas (suma, resta, producto
     * y división) con valores numéricos enteros. Donde cada operación esté en un
     * método y pida los datos necesarios para la operación y retorne el resultado, ya
     * para ejecutarlo en el método main ponga el nombre del método, los valores e
     * imprima el resultado.
     */
    public class Calculator {

        public int sum(int a, int b) {
            return a + b;
        }

        public int subtract(int a, int b) {
            return a - b;
        }

        public int multiply(int a, int b) {
            return a * b;
        }

        public int divide(int a, int b) {
            if (b != 0)
                return a / b;
            else {
                System.out.println("Can't divide by 0, the answer is an infinite number, in this case, the maximum possible integer in Java");
                return Integer.MAX_VALUE;
            }
        }

    }

}