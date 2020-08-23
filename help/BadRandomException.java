package please.help;

public class BadRandomException extends RuntimeException{
    public BadRandomException(){
        super("Плохой рандом :(");
    }
}
