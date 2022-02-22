/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package App2;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class App2 {
private static Scanner scanner = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("Nhập vào số đo cạnh thứ nhất: ");
        int a = scanner.nextInt();
        System.out.print("Nhập vào số đo cạnh thứ 2: ");
        int b = scanner.nextInt();
        System.out.print("Nhập vào số đo cạnh thứ 3");
        int c = scanner.nextInt();
        if(a<b+c && b<a+c && c<a+b){
            if(a==b && a==c && b==c){
            System.out.println("đây là tam giác đều");
            }
            else if( (a*a==b*b+c*c && b==c) || (b*b==a*a+c*c && a==c) || (c*c==a*a+b*b && a==b) ){
                System.out.println("Đây là tam giác vuông cân ");
            }
            else if(a==b || a==c || b==c){
                System.out.println("Đây là tam giác cân");
            }
            else if(a*a==b*b+c*c || b*b==a*a+c*c || c*c==a*a+b*b ){
                System.out.println("Đây là tam giác vuông");
            }
            else{
                System.out.println("Đây là tam giác thường");
            }
        }
        else 
            System.out.println("3 cạnh không hợp lên");
    }   
}// TODO code application logic here
    
    
