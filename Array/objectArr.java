package Array;

class Student {
    public int rollNo;
    public String name;

    Student(int rollNo, String name){
        this.rollNo = rollNo;
        this.name = name;
    }
}

public class objectArr {
    
    public static void main (String[] args){
        Student[] arr;

        arr = new Student[5];

        arr[0] = new Student(1, "Aman");
        arr[1] = new Student(2, "X");
        arr[2] = new Student(3, "Y");
        arr[3] = new Student(4, "Z");
        arr[4] = new Student(5, "A");

        for(int i=0; i<arr.length; i++){
            System.out.println("Roll no."+ " " +arr[i].rollNo );
            System.out.println("Name"+ " " +arr[i].name );
        }
    }

}
