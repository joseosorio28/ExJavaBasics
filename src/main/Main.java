package main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
 * Comunidad de Calidad de Software
 * Ejercicio
 * Java Básico
 *
 */
public class Main {

    private static final Logger LOG = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {

        var obj = new Exercises();
        var calculator = new Exercises.Calculator();

        //Exercise 1
        obj.minAndMaxNumbers(10, 3, 5);

        //Exercise 2
        obj.randomVector();

        //Exercise 3
        LOG.info("Sum is: {}",calculator.sum(10, 20));
        LOG.info("Subtraction is: {}",calculator.subtract(10, 20));
        LOG.info("Product is: {}",calculator.multiply(10, 20));
        LOG.info("Division is: {}",calculator.divide(10, 20));

    }

}

