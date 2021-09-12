package delegationexample;

public class Delegation {
    public static void main(String[] args) {
        // to the outside world it looks like Printer is actually printer
        Printer printer = new Printer();
        printer.print();
    }
}

class RealPrinter {
    // the "delegate"
    void print() {
        System.out.println("The Delegate");
    }
}

class Printer {
    // the "delegator"
    RealPrinter realPrinter = new RealPrinter();

    // use the delegate
    void print() {
        realPrinter.print();
    }
}
