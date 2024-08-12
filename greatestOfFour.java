public class greatestOfFour {
    
        public static void main(String[] args) {
            if (args.length != 4) {
                System.out.println("Usage: java GreatestOfFour <num1> <num2> <num3> <num4>");
                return;
            }
    
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);
            int num3 = Integer.parseInt(args[2]);
            int num4 = Integer.parseInt(args[3]);
    
            int max = (num1 > num2 ? (num1 > num3 ? (num1 > num4 ? num1 : num4) :
             (num3 > num4 ? num3 : num4)) : (num2 > num3 ? (num2 > num4 ? num2 : num4) : 
             (num3 > num4 ? num3 : num4)));
    
            System.out.println("The greatest number is: " + max);
        }
    }
    

