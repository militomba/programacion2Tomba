public class Rectangulo implements FiguraGeometrica{
    private int largo;
    private int ancho;

    public Rectangulo(int largo, int ancho) {
        this.largo = largo;
        this.ancho = ancho;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    @Override
    public float calularPerimetro() {
        float perimetroRectangulo = (largo*2)+(ancho*2);
        return  perimetroRectangulo;
    }

    @Override
    public float calcularSuperficie() {
        float superficieRectangulo = largo * ancho;
        return superficieRectangulo;
    }
    public String toString(){
        return ("\n\nDATOS DEL RECTANGULO:" + "\nLargo: " +this.largo + "\nAncho: " + this.ancho +
                "\nSuperficie: " + calcularSuperficie() + "\nPerimetro: " + calularPerimetro());
    }
}
