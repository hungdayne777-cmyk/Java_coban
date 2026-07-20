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
public class BaiTap08 {
    public static void main(String[] args) {
        double toan,ly,hoa;
        double dtb;
        String kq = " ";
        Scanner sc = new Scanner (System.in);
        System.out.println("Nhap diem toan:");
        toan = sc.nextDouble();
         System.out.println("Nhap diem ly:");
        ly = sc.nextDouble();
         System.out.println("Nhap diem hoa:");
        hoa = sc.nextDouble();
        dtb = (toan+ly+hoa)/3;
        if( dtb >= 9 )
        {
         kq = "Xuat Sac";
    }else if( dtb >= 8 )
        {
         kq = "Gioi";
    } else if( dtb >= 6.5 )
        {
         kq = "Kha";
    }  else if( dtb >= 5 )
        {
         kq = "Trung Binh";
    }else{
        kq ="Yếu";
    }
        System.out.println("===KET QUA===");
        System.out.println("Diem trung binh: "+ dtb + "\n Xep loai: "+ kq );
    }
}
        
        
       
            

