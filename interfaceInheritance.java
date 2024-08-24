/*Write a program that illustrates interface inheritance. Interface P is extended by P1
and P2. Interface P12 inherited from both p1 and p2. Each interface declares constant
and one method. Class Q implements P12. Instantiate Q and invoke each of its method.
Each method displays one of the constants. */

interface P {
    int CONST_P = 1;
    void methodP();
}
interface P1 extends P {
    int CONST_P1 = 2;
    void methodP1();
}
interface P2 extends P {
    int CONST_P2 = 3;
    void methodP2();
}
interface P12 extends P1, P2 {
    int CONST_P12 = 4;
    void methodP12();
}

class Q implements P12 {
    public void methodP() {
        System.out.println("CONST_P: " + CONST_P);
    }
    public void methodP1() {
        System.out.println("CONST_P1: " + CONST_P1);
    }
    public void methodP2() {
        System.out.println("CONST_P2: " + CONST_P2);
    }
    public void methodP12() {
        System.out.println("CONST_P12: " + CONST_P12);
    }
}

public class interfaceInheritance {
    public static void main(String[] args) {
        Q obj = new Q();
        obj.methodP();
        obj.methodP1();
        obj.methodP2();
        obj.methodP12();
    }
}
