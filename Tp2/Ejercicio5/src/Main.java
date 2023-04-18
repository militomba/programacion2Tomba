import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Excepciones {
        ArrayList<FiguraGeometrica> figGeometricas = new ArrayList<FiguraGeometrica>();
    try {
        Circulo c1 = new Circulo(4, 5, 6, 8);
        Circulo c2 = new Circulo(67, 6, 12, 5);
        Rectangulo r1 = new Rectangulo(16, 4, 13, 20);
        Rectangulo r2 = new Rectangulo(25, 12, 33, 20);
        Cuadrado cuadrado1 = new Cuadrado(65, 15, 43);


        figGeometricas.add(c1);
        figGeometricas.add(c2);
        figGeometricas.add(r1);
        figGeometricas.add(r2);
        figGeometricas.add(cuadrado1);

        System.out.println("LISTA DE FIGURAS GEOMETRICAS: \n" + figGeometricas.toString());
    }catch (Excepciones e){
        System.out.println(e.getMessage());
    }


    System.out.println("--------EXCEPCIONES--------");
    try {
        Circulo c1 = new Circulo(4, 5, 6, -8);
    }catch (Excepciones e) {
        System.out.println(e.getMessage());
    }
        try {
            Circulo c2 = new Circulo(-8, 6, 12, 5);
        }catch (Excepciones e) {
            System.out.println(e.getMessage());
        }

        try {
            Rectangulo r1 = new Rectangulo(16, 4, -13, 20);
        }catch (Excepciones e) {
            System.out.println(e.getMessage());
        }

        try {
            Rectangulo r2 = new Rectangulo(25, 12, -33, 20);
        }catch (Excepciones e) {
            System.out.println(e.getMessage());
        }

        try {
            Cuadrado cuadrado1 = new Cuadrado(-65, 15, 43);
        }catch (Excepciones e) {
            System.out.println(e.getMessage());
        }






    }
}