package XENOSIS_internship;

import java.util.Scanner;

// : WRITE A PROGRAM THAT HANDLES EXCEPTIONS BY
//   USING TRY, CATCH, AND FINALLY BLOCKS
public class Assignment5 {

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number");

        try{
             int a=sc.nextInt();
             int b=0;
             int c=a/b;
        }
        catch (Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("This is the end of this program");
        }
    }
}
