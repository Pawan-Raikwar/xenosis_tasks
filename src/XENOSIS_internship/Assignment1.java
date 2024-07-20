package XENOSIS_internship;

import java.util.*;
public class Assignment1 {

    /// convet the decimal to hexdecimal
    public static void main(String[] args) {

        //for store the ans;
        Stack<Integer> s = new Stack<>();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the decimal number ");
        int decimal = sc.nextInt();

        int ans = Integer.MIN_VALUE;
        int remender = 0;
        if(decimal>16) {
            while (decimal > 17) {

                ans = decimal / 16;  // --> provide next value
                remender = decimal % 16;    //---> give the remender
                s.push(remender);
                decimal = ans;
            }
            s.push(ans);
        }else{
             s.push(decimal);
        }
        // for print the
        while (!s.isEmpty()) {
            int n = s.pop();
            if (n > 9) {
                if (n == 10) {
                    System.out.print("A ");
                } else if (n == 11) {
                    System.out.print("B ");
                } else if (n == 12) {
                    System.out.println("C ");
                } else if (n == 13) {
                    System.out.println("D ");
                } else if (n == 14) {
                    System.out.print("E ");
                } else {
                    System.out.print("F ");
                }
            } else {
                System.out.print(n+" ");
            }

        }
    }
}
