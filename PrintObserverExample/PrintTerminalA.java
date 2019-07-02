package PrintObserverExample;

public class PrintTerminalA implements Printable {
    @Override
    public void print(String toPrint) {
        System.out.println("This is terminal A");
        System.out.println("It seems that someone has printed this message: "+toPrint);
    }
}