public class constructorOverlloading {
    private int salary;
    private String name;

    constructorOverlloading ()
    {
        this.salary=100000;
        this.name="karan";
    }
    constructorOverlloading (int salary,String name)
    {
        this.salary = salary;
        this.name = name;
    }
    public void show()
    {
        System.out.println(salary +" "+ name);
    }

    public static void main (String args[])
    {
        constructorOverlloading ob = new constructorOverlloading ();
        constructorOverlloading ob2 = new constructorOverlloading (130000,"heer");
        ob.show();
        ob2.show();
    }
}
