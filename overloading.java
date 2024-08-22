class a 
  {
    static int Multiply(int a, int b)
     {
        return a * b;
     }
    static double Multiply(double a, double b)
     {
        return a * b;
     }
    static int Multiply(int a, int b, int c)
     {
        return a * b * c;
     }
  }
  
class overloading {
        public static void main(String[] args)
        {
            System.out.println(a.Multiply(2, 4));
            System.out.println(a.Multiply(5.5, 6.3));
            System.out.println(a.Multiply(2,3,4));
        }
    }

