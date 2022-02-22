/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package App3;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class App3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
       System.out.print("Nhập vào 1 số : ");
       int n = s.nextInt();
       if (SNT(n)) {
           System.out.println(n + " là số nguyên tố ");
       } else {
           System.out.println(n + " không phải là số nguyên tố");
       }
   }
    public static boolean SNT(int n) {
       if (n <= 1) {
           return false;
       }
       for (int i = 2; i <= Math.sqrt(n); i++) {
           if (n % i == 0) {
               return false;
           }
       }
       return true;
   }// TODO code application logic here
}// TODO code application logic here
    
  
