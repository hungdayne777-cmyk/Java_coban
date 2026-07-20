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
public class BaiTap13 {
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Cho biet so hang (m>0):");
        int m = sc.nextInt();
        System.out.println("Cho biet so cot (n>0):");
        int n = sc.nextInt();
        
        // Gọi hàm nhập ma trận
        int[][] a = nhapMaTran(sc, m, n);
        
        // Yêu cầu 4: In ma trận theo dạng bảng
        System.out.println("\nMa tran theo dang bang la:");
        inMaTran(a);
        
        // Yêu cầu 1: Tính tổng
        int tong = tinhTongTatCa(a);
        System.out.println("\nTong cac phan tu: " + tong);
        
        // Yêu cầu 2: Tìm max
        int max = timMax(a);
        System.out.println("Phan tu lon nhat: " + max);
        
        // Yêu cầu 3: Tổng từng hàng và từng cột
        System.out.println("\nTong tung hang la:");
        inTongTungHang(a);
        
        System.out.println("\nTong tung cot la:");
        inTongTungCot(a);
        
        sc.close();
    }
    
  
    public static int[][] nhapMaTran(Scanner sc, int m, int n) {
        int[][] a = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Nhap a[" + i + "][" + j + "]:");
                a[i][j] = sc.nextInt();
            }
        }
        return a;
    }

    
    public static void inMaTran(int[][] a) {
        for (int[] row : a) {
            for (int x : row) {
                System.out.print(x + "     ");
            }
            System.out.println();
        }
    }

  
    public static int tinhTongTatCa(int[][] a) {
        int tong = 0;
        for (int[] row : a) {
            for (int x : row) {
                tong += x;
            }
        }
        return tong;
    }

  
    public static int timMax(int[][] a) {
        int maxVal = a[0][0];
        for (int[] row : a) {
            for (int x : row) {
                if (x > maxVal) {
                    maxVal = x;
                }
            }
        }
        return maxVal;
    }


    public static void inTongTungHang(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            int tongHang = 0;
            for (int j = 0; j < a[i].length; j++) {
                tongHang += a[i][j];
            }
            System.out.println("Tong hang " + i + ": " + tongHang);
        }
    }

   
    public static void inTongTungCot(int[][] a) {
        int soHang = a.length;
        int soCot = a[0].length;
        for (int j = 0; j < soCot; j++) {
            int tongCot = 0;
            for (int i = 0; i < soHang; i++) {
                tongCot += a[i][j];
            }
            System.out.println("Tong cot " + j + ": " + tongCot);
        }
    
    }
    }
            

