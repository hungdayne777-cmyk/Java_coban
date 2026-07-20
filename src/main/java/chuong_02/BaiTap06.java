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
public class BaiTap06 {
    public static void main(String[] args) {
        //Bài 6. Viết chương trình kiểm tra một số là chẵn hay lẻ.
        double so;
         Scanner sc = new Scanner (System.in);
        System.out.println("Nhap so de kiem tra:");
        so = sc.nextDouble();
        if (so % 2 == 0)
        {
            System.out.println( so + " Là so chan");
        }
        else 
        {
            System.out.println(so + " Là so le");
        }
        
    }
}
