package Chapter12;

public class BinaryFormatException extends NumberFormatException{
    public BinaryFormatException(){
        super("Input not binary");
    }
}
