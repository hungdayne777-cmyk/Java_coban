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
public class BaiTap09 {
    public static void main(String[] args) {
        //Nhập một số nguyên n và in bảng cửu chương của n từ 1 đến 10.
         Scanner sc = new Scanner (System.in);
        int n ;
        System.out.println("Nhập cuu chuong n:");
        n = sc.nextInt();
          System.out.println("==BANG CUU CHUONG " + n + "==");
        for(int i = 1 ; i<=10 ; i++)
        {
          
            System.out.println(n + " X " + i + " = " + (i*n) );
        }
    }
}
