package Practice;

public class swapTwoNum {

    public static void swap(int a, int b){
        b = b + a;
        a = b - a;
        b = b - a;

       System.out.printf("a is %d, b is %d", a,b);
    }
    
    public static void main(String[] args){
        
        int a = 10;
        int b = 20;
        System.out.printf("a is %d, b is %d",a,b);
        System.out.println();
        System.out.println("After Swapping");

        swap(a, b);
    }

}
