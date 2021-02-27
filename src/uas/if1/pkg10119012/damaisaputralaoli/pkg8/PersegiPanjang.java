/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas.if1.pkg10119012.damaisaputralaoli.pkg8;

/**
 *
 * @author 
 */
public class PersegiPanjang implements BangunDatar{

    private int luas;
    private final int panjang, lebar;

    public PersegiPanjang(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    @Override
    public void hitungLuas() {
        luas = panjang * lebar;
        System.out.println("Luas Persegi Panjang : " + luas);
    }
}
