package Recursion;

public class ReplacePi {

    public String replacingPi(String str) {
        if(str.length() <= 1){
            return str;
        }

        if(str.charAt(0) == 'p' && str.length() >= 2 && str.charAt(1) == 'i'){
            return "3.14" + replacingPi(str.substring(2, str.length()));
        }

        return str.charAt(0) + replacingPi(str.substring(1, str.length()));
    }
    
    public static void main(String[] args){

        ReplacePi RPi = new ReplacePi();
        String str = "pipppppipipppi";
        System.out.println(RPi.replacingPi(str));


    }

}
