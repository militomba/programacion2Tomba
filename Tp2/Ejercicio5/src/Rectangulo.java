public class Rectangulo implements FiguraGeometrica{
    private int largo;
    private int ancho;
    private int x;
    private int y;

    public Rectangulo(int largo, int ancho, int x, int y)  throws Excepciones{
        if(largo<0 || ancho<0 || x<0 || y<0){
           throw new Excepciones("los parametros del rectangulo no pueden ser negativos");
        }
        this.largo = largo;
        this.ancho = ancho;
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) throws Excepciones {
        if(x<0){
            throw new Excepciones("El parametro del eje X del rectangulo no puede ser negativo");
        }
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) throws Excepciones{
        if(y<0){
            throw new Excepciones("El parametro del eje Y del rectangulo no puede ser negativo");
        }
        this.y = y;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) throws Excepciones{
        if(largo<0){
            throw new Excepciones("El parametro del largo del rectangulo no puede ser negativo");
        }
        this.largo = largo;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) throws Excepciones{
        if(ancho<0){
            throw new Excepciones("El parametro del ancho del rectangulo no puede ser negativo");
        }
        this.ancho = ancho;
    }

    @Override
    public float calularPerimetro(){
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
                "\nEje X: "+this.x+"\nEje Y: "+this.y+"\nSuperficie: " + calcularSuperficie() + "\nPerimetro: " + calularPerimetro());
    }
}
