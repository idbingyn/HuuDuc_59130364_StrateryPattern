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
public abstract class ThanhToanCOD implements IThanhToan{

    @Override
    public double thanhtoan(int tienHang) {
        if(tienHang > 2000000)
            return 0.98*tienHang;
        else return tienHang;
    }
}
