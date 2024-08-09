public class constructorDemo {
    private String name;
    private int age;

    // default constructur
    //non paremeterized constructor
    public constructorDemo() 
    {
        name = " mirali";
        age = 18;
    }

    // parameterized construstor
    public constructorDemo(String name, int age) 
    {
        this.name = name;
        this.age = age;
    }

    // constructor with name only 
    // constructor overloading
    public constructorDemo(String name) 
    {
        this.name = name;
    }

    // copy constructor
    public constructorDemo(constructorDemo c1) 
    {
        this.name = c1.name;
        this.age = c1.age;
    }
    public void show() 
    {
        System.out.println(name+" "+ age);
    }
    public static void main(String args[]) {
        constructorDemo c1 = new constructorDemo();
        constructorDemo c2 = new constructorDemo("heer", 14);
        constructorDemo c3 = new constructorDemo("aman");
        constructorDemo c4 = new constructorDemo();
        c1.show();
        c2.show();
        c3.show();
        c4.show();
    }
}