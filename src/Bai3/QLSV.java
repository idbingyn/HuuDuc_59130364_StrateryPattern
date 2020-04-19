/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai3;

import java.util.ArrayList;

/**
 *
 * @author Pistol
 */
public class QLSV {
    ArrayList<SinhVien> ds = new ArrayList<>();
    ISoSanh<SinhVien> SoSanh;
    
    public ISoSanh<SinhVien> getSoSanh() {
        return SoSanh;
    }
    public void setSoSanh(ISoSanh<SinhVien> SoSanh) {
        this.SoSanh = SoSanh;
    }

    public void setDs(ArrayList<SinhVien> ds) {
        this.ds = ds;
    }
    public ArrayList<SinhVien> getDanhSach() {
        return ds;
    }
    //them sv vao ds
    public void them(SinhVien sv){
        ds.add(sv);
    }
    public void sapXep(){
        SinhVien tam ;
        for(int i = 0; i < ds.size(); i++){
            for(int j = i + 1; j <= ds.size()-1; j++)
                if(SoSanh.soSanh(ds.get(i),ds.get(j)) == 1){
                    tam = ds.get(i);
                    ds.set(i,ds.get(j));
                    ds.set(j,tam);
                }
        }
}
    public void inDS(){
        for (int i = 0; i < ds.size(); i++){
            SinhVien sv = ds.get(i);
            System.out.println(ds.get(i).InThongTin());
        }
    }
}
