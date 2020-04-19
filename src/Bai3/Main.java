/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai3;

import java.text.SimpleDateFormat;

/**
 *
 * @author Pistol
 */
public class Main {
        public static void main(String[] args) throws Exception {
        QLSV ql = new QLSV();
        SimpleDateFormat df = new SimpleDateFormat("dd/mm/yyyy");
        
        SinhVien sv1, sv2, sv3, sv4;
        sv1 = new SinhVien("Nguyễn Phạm Hữu Đức", df.parse("09/06/1999"), 10);
        sv2 = new SinhVien("Ngô Bá Dương", df.parse("26/05/1999"), 8);
        sv3 = new SinhVien("Trần Nghị", df.parse("23/07/1999"), 9);
        sv4 = new SinhVien("Hoàng Vân", df.parse("15/03/1999"), 7);
        
        ql.them(sv1);
        ql.them(sv2);
        ql.them(sv3);
        ql.them(sv4);
        
        ql.inDS();
        
        ISoSanh sxTheoTen = new SoSanhTheoTen();
        ISoSanh sxTheoDiem = new SoSanhTheoDiem();
        
        System.out.println("\nSắp xếp danh sách sinh viên theo tên: ");
        ql.setSoSanh(sxTheoTen);
        ql.sapXep();
        ql.inDS();
        
        System.out.println("\nSắp xếp danh sách sinh viên theo điểm: ");
        ql.setSoSanh(sxTheoDiem);
        ql.sapXep();
        ql.inDS();
    }
}
