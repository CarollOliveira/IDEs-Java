package Retornos;

public class Main {
    public static void main(String[] args) {

        System.out.println("Exercícios Retorno");

        double areaQuadrado = Quadrilateros_Retorno.area(3);
        System.out.println("Àrea do quadrado" + areaQuadrado);

        double areaRetangulo = Quadrilateros_Retorno.area(5,5);
        System.out.println("Àrea do quadrado" + areaRetangulo);

        double areaTrapezio = Quadrilateros_Retorno.area(7,8,9);
        System.out.println("Àrea do trapezio" + areaTrapezio);


    }


}
