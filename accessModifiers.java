public class accesExample 
   {
    public int publicVar = 10;
    protected int protectedVar = 20;
    private int privateVar = 30;
    int defaultVar = 40; // Default access modifier

    public void display() {
        System.out.println("Public variable: " + publicVar);
        System.out.println("Protected variable: " + protectedVar);
        System.out.println("Private variable: " + privateVar);
        System.out.println("Default variable: " + defaultVar);
    }

    protected void protectedMethod() {
        System.out.println("This is a protected method");
    }

    private void privateMethod() {
        System.out.println("This is a private method");
    }

    public static void main(String[] args) {
        accesExample example = new accesExample();
        example.display();
        example.protectedMethod();
        example.privateMethod(); // Cannot access private method from outside the class
    }
}