package Task25;

public class NotEnoughGas extends Exception{
    public NotEnoughGas(String errorMessage){
        super(errorMessage);
        System.err.println("Not enough gas in the tank.");
    }

}
