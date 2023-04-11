public class Circulo implements  FiguraGeometrica {
    private int diametro;
    private int radio;

    public Circulo(int diametro, int radio) {
        this.diametro = diametro;
        this.radio = radio;
    }

    public int getDiametro() {
        return diametro;
    }

    public void setDiametro(int diametro) {
        this.diametro = diametro;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    @Override
    public float calularPerimetro() {
        float perimetroCirculo = (float) (diametro * (Math.PI));
        return perimetroCirculo;
    }

    @Override
    public float calcularSuperficie() {
        float superficieCirculo = (float)((Math.PI) * (Math.pow(2, radio)));
        return superficieCirculo;
    }
    public String toString(){
        return ("\n\nDATOS DEL CIRCULO:" + "\nDiametro: " +this.diametro + "\nRadio: " + this.radio +
                "\nSuperficie: " + calcularSuperficie() + "\nPerimetro: " + calularPerimetro());
    }
}



