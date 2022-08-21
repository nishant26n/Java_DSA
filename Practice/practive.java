package Practice;

  class A 
    {
         int x;
         int y;
         void display() 
         {
              System.out.print(x + " " + y);
         }
    }

public class practive {
   public static void main(String args[]) 
         {
             A obj1 = new A();
             A obj2 = new A();
             obj1.x = 1;
             obj1.y = 2;
             obj2 = obj1;
             obj1.display();
             obj2.display();
         }
}