package PrintObserverExample;

import java.util.Scanner;

public class PrintSource extends PrintObserver {
    
    public PrintSource() {
        addPrinter(new PrintTerminalA());
        addPrinter(new Piikun());
        
        String toPrint = "~";
        while(!toPrint.equals("")) {
            System.out.print("\n\nEnter String to print: ");
            Scanner sc = new Scanner(System.in);
            toPrint = sc.nextLine();
            
            notifyAllPrinters(toPrint);
        }
    }
    
    public static void main(String[] args) {
        PrintSource printSource = new PrintSource();
    }
}