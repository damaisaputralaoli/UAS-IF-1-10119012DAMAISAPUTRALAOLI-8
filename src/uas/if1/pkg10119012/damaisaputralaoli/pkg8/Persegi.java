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
public class Persegi implements BangunDatar{
    private int luas;
    private final int sisi;

    public Persegi(int sisi) {
        this.sisi = sisi;
    }

    @Override
    public void hitungLuas() {
        luas = sisi * sisi;
        System.out.println("Luas Persegi : " + luas);
    }
}
