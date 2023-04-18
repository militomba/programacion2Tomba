public class Circulo implements  FiguraGeometrica {
    private int diametro;
    private int radio;
    private int x;
    private int y;

    public Circulo(int diametro, int radio, int x, int y) throws Excepciones {
        if(diametro<0 ||radio<0||x<0||y<0){
            throw new Excepciones("los parametros del circulo no pueden ser negativos");
        }
        this.diametro = diametro;
        this.radio = radio;
        this.x = x;
        this.y = y;
    }

    public int getDiametro() {
        return diametro;
    }

    public void setDiametro(int diametro) throws Excepciones{
        if(diametro<0){
            throw new Excepciones("El parametro diametro del circulo no puede ser negativo");
        }
        this.diametro = diametro;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) throws Excepciones{
        if(radio<0){
            throw new Excepciones("El parametro del radio del circulo no puede ser negativo");
        }
        this.radio = radio;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) throws Excepciones{
        if(x<0){
            throw new Excepciones("El parametro del eje X del circulo no puede ser negativo");
        }
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) throws Excepciones{
        if(y<0){
            throw new Excepciones("El parametro  del eje Y del circulo no puede ser negativo");
        }
        this.y = y;
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
                "\nEje X: "+this.x+"\nEje Y: "+this.y+"\nSuperficie: " + calcularSuperficie() + "\nPerimetro: " + calularPerimetro());
    }
}



