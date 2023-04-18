public class Cuadrado implements FiguraGeometrica{
    private int lado1;
    private int x;
    private int y;

    public Cuadrado(int lado1, int x, int y) throws Excepciones{
        if(lado1<0 || x<0 || y<0){
            throw new Excepciones("los parametros del cuadrado no pueden ser negativos");
        }
        this.lado1 = lado1;
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) throws Excepciones{
        if(x<0){
            throw new Excepciones("El parametro del eje X del cuadrado no puede ser negativo");
        }
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) throws Excepciones {
        if(y<0){
            throw new Excepciones("El parametro del eje Y del cuadrado no puede ser negativo");
        }
        this.y = y;
    }

    public int getLado1() {
        return lado1;
    }

    public void setLado1(int lado1)  throws Excepciones{
        if(lado1<0){
            throw new Excepciones("El parametro del lado del cuadrado no puede ser negativo");
        }
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
                "\nEje X: "+this.x+"\nEje Y: "+this.y+"\nSuperficie: " + calcularSuperficie() + "\nPerimetro: " + calularPerimetro());
    }
}
