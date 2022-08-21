package Questions;

public class Frequency {

    static int findFreq(int a[], int x){
        int count = 0;
        for(int i=0; i<a.length; i++){
            if(a[i] == x){
                count++;
            }
        }
        return count;
    }
    
    
    public static void main(String[] args) {

        int a[] = {0, 5, 5, 5, 4};
        int x = 5;
        System.out.println(findFreq(a, x));
        
    }

}
