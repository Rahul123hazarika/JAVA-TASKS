//1.	Multiplication Table Generator : Write a program that generates the multiplication table for a given number. Perform using looping, conditionals statements and functions. 
//Provide proper validations wherever required. Comment on the code with proper naming convention to explain the loop and output

 import java.util.*;
import java.util.Scanner;
class mult {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);  // create a Scanner object to read input
        System.out.println("Enter the number:");
        int x=sc.nextInt();
        if(x==-1){
            System.out.println("invalid input");
        }
        else{
             for (int i = 1; i <= 10; i++) {  // loop from 1 to 10
            int result = x * i;   // multiply with i
            System.out.println(x+ "x"+i+"="+result);  // print the result after each step
        }

        }
       
    }
}
