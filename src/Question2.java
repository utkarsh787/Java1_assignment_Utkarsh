// Parent Class: Bank
abstract class Bank {
    abstract void getDetails(); // Abstract method
}

// Subclass 1: SBI
class SBI extends Bank {
    @Override
    void getDetails() {
        System.out.println("Bank: SBI");
        System.out.println("Interest Rate: 5.5%");
        System.out.println("Minimum Balance: Rs. 3000");
        System.out.println("Head Office: Mumbai\n");
    }
}

// Subclass 2: BOI
class BOI extends Bank {
    @Override
    void getDetails() {
        System.out.println("Bank: BOI");
        System.out.println("Interest Rate: 6.0%");
        System.out.println("Minimum Balance: Rs. 2000");
        System.out.println("Head Office: Mumbai\n");
    }
}

// Subclass 3: ICICI
class ICICI extends Bank {
    @Override
    void getDetails() {
        System.out.println("Bank: ICICI");
        System.out.println("Interest Rate: 6.5%");
        System.out.println("Minimum Balance: Rs. 5000");
        System.out.println("Head Office: Mumbai\n");
    }
}

// Main Class
public class Question2 {
    public static void main(String[] args) {
        // Creating objects of each bank
        Bank sbi = new SBI();
        Bank boi = new BOI();
        Bank icici = new ICICI();

        // Printing details of each bank
        sbi.getDetails();
        boi.getDetails();
        icici.getDetails();
    }
}
