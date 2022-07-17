package Sobrecarga;

public class Quadrilatero {

    public static void area(double lado){

        System.out.println( "Área quadrado:" +  lado * lado);
    }

    public static void area(double lado1, double lado2){

        System.out.println( "Área quadrado:" + lado1 * lado2);
    }

    public static void area(double baseMaior, double basemenor, double altura){

            System.out.println( "Área quadrado:" + ((baseMaior+basemenor) * altura)/2);
    }

    public static void losango(float diagonal1, float diagonal2){

            System.out.println( "Área quadrado:" + ((diagonal1 * diagonal2)/2));
    }
}
