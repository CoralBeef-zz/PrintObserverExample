package PrintObserverExample;

import java.util.ArrayList;

public abstract class PrintObserver {
    private final ArrayList<Printable> printerList = new ArrayList<>();

    public void notifyAllPrinters(String toPrint) {
        if(!toPrint.equals("")) {
            for(Printable printer : printerList) {
                System.out.println("\n");
                printer.print(toPrint);
            }
        } else {
            System.out.println("Quitting! Thank you!");
        }
    }
    
    public void addPrinter(Printable printer) {
        this.printerList.add(printer);
    }
    
    public void removePrinter(Printable printer) {
        this.printerList.remove(printer);
    }
}