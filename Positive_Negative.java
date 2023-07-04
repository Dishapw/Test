package Test;

class Positive_Negative{
    public static void checkNumber(int num){
        
        if(num>0)
            System.out.println(num + " is POSITIVE NUMBER.");
        else if(num<0)
            System.out.println(num + " is NEGATIVE NUMBER.");
        else
            System.out.println(num + " is a ZERO.");
    }
    public static void main( String args[] ) {
       
        int no1 = 20;
        int no2 = 0;
        int no3 = -100;

        checkNumber(no1);
        checkNumber(no2);
        checkNumber(no3);
    }
}
