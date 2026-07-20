/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chuong_02;
import java.util.Scanner;
/**
 *
 * @author ADMIN
 */
public class BaiTap07 {
    //Bài 7. Viết chương trình giải phương trình bậc nhất ax+b=0.
    public static void main(String[] args) {
        double a,b;
     Scanner sc = new Scanner (System.in);
        System.out.println("Nhap so a:");
        a = sc.nextDouble();
         System.out.println("Nhap so b:");
        b = sc.nextDouble();
        System.out.println(a+"x"+"+"+b+"="+"0");
        System.out.println("X"+"=" +-b/a);
    }
    
                
             
}
