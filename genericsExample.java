// Define a generic class
class genericsExample<T> {
    private T content;

    // Constructor
    public genericsExample(T content) {
        this.content = content;
    }

    // Method to get the content
    public T getContent() {
        return content;
    }

    // Method to set the content
    public void setContent(T content) {
        this.content = content;
    }

    public static void main(String[] args) {
        // Create instances of the generic class
        genericsExample<Integer> intBox = new genericsExample<>(123);
        genericsExample<String> strBox = new genericsExample<>("hello");

        // Access the content
        System.out.println(intBox.getContent());  // Output: 123
        System.out.println(strBox.getContent());  // Output: hello
    }
}
