import java.util.*;

class A 
 {
    static int x = 10;
    int y = 20;
    private static int z = 30;
    
    static class B 
    {
        void get()
        {
            System.out.println("x: " + x);
            //System.out.println("y:"+y);
            System.out.println("z: " + z);
        }
    }
    class B1 
    {
        void get()
        {
            System.out.println("x: " + x);
            System.out.println("y: " + y);
            System.out.println("z: " + z);
        }
    }
}

public class innerclass 
{
    public static void main(String[] args)
    {
        A ob = new A();
        A.B ob1 = new A.B();
        ob1.get();
        A.B1 ob2 = ob.new B1();
        ob2.get();
    }
}
// Creating an object of static nested class
// defined outside Main class
//aam na kari shakiye
//ClassA.ClassB1 ob2 = new ClassA.ClassB1();
