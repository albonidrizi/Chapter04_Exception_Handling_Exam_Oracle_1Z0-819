package U7_creatingException;

public class CustomException extends Exception {

    public CustomException(){
        super("Ky eshte nje gabim i pershtatur sipas nevojes se aplikacionit");
    }

    public CustomException (String message){
        super(message);
    }


    public CustomException(String message, Throwable cause){
        super(message,cause);
    }

}
