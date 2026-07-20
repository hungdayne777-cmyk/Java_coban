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
public class BaiTap02 {
    public static void main(String[] args) {
        //Bài 2. Viết chương trình nhập họ tên và tuổi từ bàn phím, sau đó hiển thị lại kết quả.
        //khai báo 2 biến nhận giá trị
        String HoTen;
        int Tuoi;
        //tạo luồng đọc giá trị từ bàn phím
        Scanner sc = new Scanner (System.in);
        //nhận giá trị từ bàn phím
        System.out.print("Cho biet ten cua ban:");
        HoTen = sc.nextLine();
        System.out.print("Cho biet tuoi cua ban:");
        Tuoi = sc.nextInt();
        //xuất kết quả
        System.out.println("Chao ban: "+ HoTen + " - Nam nay ban: "+ Tuoi + " Tuoi");
        
    }
}
