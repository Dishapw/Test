package Test;

import java.util.Scanner;

class LargestNumber{
    public static int largestNum(int num1, int num2,int num3){
       if(num1 >= num2 && num1 >= num3)
          return num1;
       else if(num2 >= num1 && num2 >= num3)
          return num2;
       else
         return num3;      
    }
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;
        int num3 = 3;
        int largest;

        largest = largestNum(num1, num2, num3);
        System.out.println(largest + " is the largest number.");
    }
}