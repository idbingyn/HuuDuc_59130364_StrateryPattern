/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2;

/**
 *
 * @author Pistol
 */
public class HangHoa {
    private String tenHH;
    private int gia;
    private String moTa;
    public String getTenHH() {
        return tenHH;
    }
    public String getMota() {
        return moTa;
    }
    public int getGia() {
        return gia;
    }
    public void setHangHoa(String tenHH, int gia, String moTa) {
        this.tenHH = tenHH;
        this.gia = gia;
        this.moTa = moTa;
    }
    public String thongTinHH(){
        return "Tên hàng hóa: "+tenHH+"\tGiá: "+gia+"\tMô tả: "+moTa;
    }
}
