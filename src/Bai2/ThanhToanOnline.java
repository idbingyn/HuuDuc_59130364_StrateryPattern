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
public abstract class ThanhToanOnline implements IThanhToan{

    @Override
    public double thanhtoan(int tienHang) {
        if(tienHang < 1000000)
            return 0.95*tienHang;
        else 
            return 0.93*tienHang;
    }
}
