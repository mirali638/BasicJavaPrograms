class IndianRs {
    private int rs;
    private int paisa;

    public IndianRs(int rs, int paisa) {
        this.rs = rs;
        this.paisa = paisa;
    }

    public int getRs() {
        return rs;
    }

    public int getPaisa() {
        return paisa;
    }

    public void addUSDollars(USDollars dollars) {
        // Convert dollars to rupees and paisa
        int totalCents = dollars.getCents() + dollars.getDollars() * 100;
        int totalRupees = totalCents / 100;
        int totalPaisa = totalCents % 100;

        // Add rupees and paisa
        this.rs += totalRupees;
        this.paisa += totalPaisa;

        // Adjust if paisa exceeds 100
        if (this.paisa >= 100) {
            this.rs += this.paisa / 100;
            this.paisa %= 100;
        }
    }

    public void display() {
        System.out.println("Total Money: " + rs + " Rs " + paisa + " Paisa");
    }
}

class USDollars {
    private int dollars;
    private int cents;

    public USDollars(int dollars, int cents) {
        this.dollars = dollars;
        this.cents = cents;
    }

    public int getDollars() {
        return dollars;
    }

    public int getCents() {
        return cents;
    }
}

public class moneyCalc {
    public static void main(String[] args) {
        // Creating objects
        IndianRs indianMoney = new IndianRs(100, 50);
        USDollars usMoney = new USDollars(10, 75);

        // Display initial money
        System.out.println("Indian Money:");
        indianMoney.display();
        System.out.println("US Dollars:");
        System.out.println(usMoney.getDollars() + " Dollars " + usMoney.getCents() + " Cents");

        // Add US dollars to Indian rupees
        indianMoney.addUSDollars(usMoney);

        // Display updated money
        System.out.println("After Adding US Dollars:");
        indianMoney.display();
    }
}
