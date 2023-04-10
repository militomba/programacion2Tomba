public class Excepciones  extends Exception{
    public Excepciones(){
        super("Texto generico");
    }
    public Excepciones(String msg){
        super(msg);
    }
}
