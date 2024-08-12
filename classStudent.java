public class classStudent {
  
        private int id_no;
        private String student_name1;
        private String student_name2;
        private String student_name3;
        private int marks;
        private double percentage;
    
        // Constructor to initialize values and calculate percentage
        public classStudent(int id_no, String student_name1, String student_name2, String student_name3, int marks) {
            this.id_no = id_no;
            this.student_name1 = student_name1;
            this.student_name2 = student_name2;
            this.student_name3 = student_name3;
            this.marks = marks;
            this.percentage = (double) marks / 3;
        }
    
        // Getters
        public int getId_no() {
            return id_no;
        }
    
        public String getStudent_name1() {
            return student_name1;
        }
    
        public String getStudent_name2() {
            return student_name2;
        }
    
        public String getStudent_name3() {
            return student_name3;
        }
    
        public int getMarks() {
            return marks;
        }
    
        public double getPercentage() {
            return percentage;
        }
    
        public static void main(String[] args) {
            // Example usage
            classStudent student = new classStudent(1, "John", "Doe", "Smith", 85);
            System.out.println("ID Number: " + student.getId_no());
            System.out.println("Student Name: " + student.getStudent_name1() + " " + student.getStudent_name2() + " " + student.getStudent_name3());
            System.out.println("Marks: " + student.getMarks());
            System.out.println("Percentage: " + student.getPercentage());
        }
    }
    

