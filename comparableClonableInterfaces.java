public class comparableClonableInterfaces implements Comparable<comparableClonableInterfaces>, Cloneable {
    private String name;
    private int age;

    public comparableClonableInterfaces(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(comparableClonableInterfaces other) {
        return this.age - other.age;
    }
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    @Override
    public String toString() {
        return "ccinterface{name='" + name + "', age=" + age + "}";
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        comparableClonableInterfaces person1 = new comparableClonableInterfaces("mirali", 18);
        comparableClonableInterfaces person2 = new comparableClonableInterfaces("dhruv", 4);

        comparableClonableInterfaces clonedPerson = (comparableClonableInterfaces) person2.clone();
        int comparisonResult = person1.compareTo(person2);

        System.out.println("Original Person1: " + person1);
        System.out.println("original person : "+person2);
        System.out.println("Cloned Person: " + clonedPerson);
        System.out.println("Comparison Result: " + comparisonResult);
    }
}
