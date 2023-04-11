public class Cuadrado implements FiguraGeometrica{
    private int lado1;


    public Cuadrado(int lado1) {
        this.lado1 = lado1;

    }

    public int getLado1() {
        return lado1;
    }

    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }

    @Override
    public float calularPerimetro() {
       float perimetroCuadrado = lado1 +lado1+lado1+lado1;
        return  perimetroCuadrado;
    }

    @Override
    public float calcularSuperficie() {
        float superficieCuadrado = lado1 * lado1;
        return superficieCuadrado;
    }
    public String toString(){
        return ("\n\nDATOS DEL TRIANGULO:" + "\nLado1: " +this.lado1+
                "\nSuperficie: " + calcularSuperficie() + "\nPerimetro: " + calularPerimetro());
    }
}
