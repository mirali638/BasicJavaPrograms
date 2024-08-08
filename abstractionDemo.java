abstract class car {
    public abstract double getAverage();
}

class swift extends car {
    public double getAverage() {
        return 22.5;
    }
}

class Baleno extends car {
    public double getAverage() {
        return 23.5;
    }
}

public class abstractdemo {
    public static void main(String args[]) {
        swift s = new swift();
        Baleno b = new Baleno();
        System.out.println(s.getAverage());
        System.out.println(b.getAverage());
    }

}
