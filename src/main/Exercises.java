package main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.Random;

public class Exercises {

    private final Random rand = new Random();
    private static final Logger LOG = LoggerFactory.getLogger(Exercises.class);

    /* Exercise 1
     * Escriba un programa que defina 3 variables con números enteros positivos, y que
     * de esas variables calcule e imprima en pantalla el menor y el mayor.
     */
    public int[] minAndMaxNumbers(int first, int second, int third) {
        if (first < 0 || second < 0 || third < 0) {
            LOG.error("Numbers must be positive");
            return new int[0];
        }
        int[] numbers = {first, second, third};
        Arrays.sort(numbers);
        LOG.info("The minimum number is: {}",numbers[0]);
        LOG.info("The maximum number is: {}",numbers[2]);

        return new int[]{numbers[0], numbers[2]};
    }

    /* Exercise 2
     * Crear un vector entero con 10 números aleatorios, después leer el vector aquellos
     * valores que sean menores a 5 eliminarlos del vector y por último imprimir el vector.
     */
    public int[] randomVector() {
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt();
        }
        LOG.info("Original array is: {}",numbers);

        int[] numbersWithout5 = Arrays.stream(numbers).filter(n -> n >= 5).toArray();

        LOG.info("New array with numbers greater than 5 is: {}",numbersWithout5);

        return numbersWithout5;
    }

    /* Exercise 3
     * Construir un programa que simule el funcionamiento de una calculadora que
     * puede realizar las cuatro operaciones aritméticas básicas (suma, resta, producto
     * y división) con valores numéricos enteros. Donde cada operación esté en un
     * método y pida los datos necesarios para la operación y retorne el resultado, ya
     * para ejecutarlo en el método main ponga el nombre del método, los valores e
     * imprima el resultado.
     */
    public static class Calculator {

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
                LOG.error("Can't divide by 0, the answer is an infinite number, in this case, the maximum possible integer in Java");
                return Integer.MAX_VALUE;
            }
        }

    }

}
