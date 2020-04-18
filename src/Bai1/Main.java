/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai1;

/**
 *
 * @author Pistol
 */
public class Main {
    public static void main(String[] args) {
        ConText ct = new ConText();
        ct.setTinhToan(new Cong());
        System.out.println("75 + 12 = " + ct.tinh(75, 12));
        ct.setTinhToan(new Tru());
        System.out.println("54 - 78 = " + ct.tinh(54, 78));
    }
}
