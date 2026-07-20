/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chuong_01;
import java.util.Scanner;
/**
 *
 * @author ADMIN
 */
public class BaiTap03 {
    public static void main(String[] args) {
        //Bài 3. Viết chương trình nhập hai số nguyên và tính tổng, hiệu, tích, thương.
        int soa;
        int sob;
        int tong,hieu,tich;
        double thuong;
        Scanner sc = new Scanner (System.in);
         System.out.println("Nhap so nguyen a");
         soa = sc.nextInt();
          System.out.println("Nhap so nguyen b");
         sob = sc.nextInt();
         tong = soa + sob;
         hieu = soa - sob;
           tich = soa * sob;
             thuong = soa / sob;
             //xuất kết quả
             System.out.println("Ket Qua Tinh Tong: " + tong);
             System.out.println("Ket Qua Tinh Hieu: " + hieu);
             System.out.println("Ket Qua Tinh Tich: " + tich);
             System.out.println("Ket Qua Tinh Thuong: " + thuong);
    }
            
}
