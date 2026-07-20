/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chuong_02;

import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author MSI
 */
public class BaiTap12 {
    public static void main(String[] args) {
              int [] a;
        int n;
         Scanner sc = new Scanner(System.in);
        System.out.println("Cho biet so phan tu (n>0):");
        n= sc.nextInt();
        a = new int[n];
      
        nhapMang(a,sc);
        System.out.print("\nNhap gia tri can tim X: ");
        int x = sc.nextInt();
        
       
        int viTri = timKiem(a, x);
        if (viTri != -1) {
            System.out.println("=> Gia tri " + x + " CO xuat hien trong mang, Vi tri la: " + viTri);
        } else {
            System.out.println("=> Gia tri " + x + " KHONG xuat hien trong mang.");
        }
Arrays.sort(a);
System.out.println("\nMang sau khi sap xep la");
        for (int pt : a) {
            System.out.print(pt + " ");
        }
    }
    public static void nhapMang(int[] a, Scanner sc) {
        for (int i = 0; i < a.length; i++) {
            System.out.print("Nhap a [" + i + "]: ");
            a[i] = sc.nextInt();
        }
    }
    public static int timKiem(int[] a, int x) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == x) {
                return i; //tìm thấy trả về vị trí đầu
            }
        }
        return -1; // Duyệt hết mảng mà không thấy thì trả về -1
    }
}
