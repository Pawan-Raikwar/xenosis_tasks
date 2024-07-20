package XENOSIS_internship;

//NUMBER-INCREASING REVERSE PYRAMID PATTER
import java.util.*;
public class Assignment2 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number ");
        int number=sc.nextInt();

         while (number>0){

             for(int i=1;i<=number;i++){
                  System.out.print(i+" ");
             }
             System.out.println();
             number--;
         }


    }
}
