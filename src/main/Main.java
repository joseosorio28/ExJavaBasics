package main;
/*
 * Comunidad de Calidad de Software
 * Ejercicio
 * Java Básico
 *
 */
public class Main {
    public static void main(String[] args) {

        var obj = new Exercises();
        var calculator = new Exercises().new Calculator();

        //Exercise 1
        obj.minAndMaxNumbers(10, 3, 5);

        //Exercise 2
        obj.randomVector();

        //Exercise 3
        System.out.println("Sum is: " + calculator.sum(10, 20));
        System.out.println("Subtraction is: " + calculator.subtract(10, 20));
        System.out.println("Product is: " + calculator.multiply(10, 20));
        System.out.println("Division is: " + calculator.divide(10, 20));

    }

}

