/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package baithuchanh1904;

public class Student extends Person{
    protected String masv;
    protected float diemtrungbinh;
    protected String email;
    public void intPutStudent(){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap ma sinh vien");
        this.masv = input.nextLine();
        System.out.println("Nhap diem trung binh");
        this.diemtrungbinh = input.nextFloat();
        System.out.println("Nhap email");
        this.email = input.nextLine();
    }
    public void showStudent(){
        System.out.println("Ma sinh vien : " +this.masv +" Diem trung binh " + this.diemtrungbinh);
    }
    public void kiemtrahocbong(){
        if(this.diemtrungbinh >=8){
            System.out.println("Duoc hoc bong");
        }else{
            System.out.println("Khong duoc hoc bong");
        }
    }
