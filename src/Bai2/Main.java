/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2;

import java.util.ArrayList;

/**
 *
 * @author Pistol
 */
public class Main {
    public static void main(String[] args) {
        HangHoa hh1 = new HangHoa();
        HangHoa hh2 = new HangHoa();
        HangHoa hh3 = new HangHoa();
        
        hh1.setHangHoa("Áo sơ mi caro nam",200000,"Sơ mi Trắng");
        
        hh2.setHangHoa("Quần tây nam",150000,"Quần tây đen");
        
        hh3.setHangHoa("Áo Khoác nữ",3000000,"Lông thú");

        GioHang gh1 = new GioHang();
        gh1.setHinhThucTt(new ThanhToanCOD() {});
        System.out.println("\n----Danh sách sản phẩm----"); 
        gh1.them(hh1);
        gh1.them(hh2);
        System.out.println("Giỏ hàng 1:");
        gh1.xuat();
        gh1.tongTien();

        GioHang gh2 = new GioHang();
        gh2.setHinhThucTt(new ThanhToanOnline() {});
        System.out.println("\n----Danh sách sản phẩm----"); 
        gh2.them(hh3);
        System.out.println("Giỏ hàng 2:");
        gh2.xuat();
        gh2.tongTien();

    }
}
