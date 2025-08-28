/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PertemuanDua;

/**
 *
 * @author Alif
 */
public class Manusia {

    /**
     * @return the nama
     */
    protected String getNama() {
        return nama;
    }

    /**
     * @param nama the nama to set
     */
    protected void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * @return the umur
     */
    protected int getUmur() {
        return umur;
    }

    /**
     * @param umur the umur to set
     */
    protected void setUmur(int umur) {
        this.umur = umur;
    }

    private String nama;
    private int umur;

    public Manusia(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    public void perkenalan() {
        System.out.println("Haloo, nama Saya " + getNama() + ", umur Saya " + getUmur() + " tahun.");
    }
}
