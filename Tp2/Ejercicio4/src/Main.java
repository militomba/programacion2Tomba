import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
    Circulo c1 = new Circulo(4,5);
    Circulo c2 = new Circulo(67,6);
    Rectangulo r1 = new Rectangulo(16, 4);
    Rectangulo r2 = new Rectangulo(25,12);
    Cuadrado cuadrado1 =new Cuadrado(65);

    ArrayList<FiguraGeometrica> figGeometricas = new ArrayList<FiguraGeometrica>();
    figGeometricas.add(c1);
    figGeometricas.add(c2);
    figGeometricas.add(r1);
    figGeometricas.add(r2);
    figGeometricas.add(cuadrado1);


    System.out.println("LISTA DE FIGURAS GEOMETRICAS: \n" +figGeometricas);





    }
}