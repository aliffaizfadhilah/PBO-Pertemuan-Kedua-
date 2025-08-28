/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PertemuanDua;

/**
 *
 * @author Alif
 */
public class GuruSma extends Manusia implements Guru, Barista, KontenKreator {

//    /**
//     * @return the asal
//     */
//    protected String getAsal() {
//        return asal;
//    }
//
//    /**
//     * @param asal the asal to set
//     */
//    protected void setAsal(String asal) {
//        this.asal = asal;
//    }
//
//    /**
//     * @return the lulusan
//     */
//    protected String getLulusan() {
//        return lulusan;
//    }
//
//    /**
//     * @param lulusan the lulusan to set
//     */
//    protected void setLulusan(String lulusan) {
//        this.lulusan = lulusan;
//    }
//
//   
//
//    private String asal;
//    private String lulusan;
    public static void main(String[] args) {
        GuruSma muda = new GuruSma("Alif Faiz", 19);

        muda.tampilkanData();
        muda.Lokasi("SMA Gunung Anyar");
        muda.Mengajar("Matematika");
        muda.TotalMengajar(5);
        muda.Tempat("Kedai Ruang Rasa");
        muda.JenisMinuman("Berbagai Minuman Kopi maupun non Kopi");
        muda.JamBekerja(9);
        muda.JenisKonten("Edukasi Matematika");
        muda.MediaUpload("Youtube, Tiktok, dan Instagram");
        muda.CiriKhas("Bentuk Animasi Ilustrasi Sederhana");
    }

    public GuruSma(String nama, int umur) {
        super(nama, umur); // panggil constructor Manusia
    }

    public void tampilkanData() {
        perkenalan(); // dari class Manusia
        System.out.println("Dan di usia yang cukup muda ini, Saya mencoba bekerja di beberapa pekerjaan");
        System.out.println();

    }

    // Implementasi dari interface Guru
    @Override
    public void Lokasi(String Tempat) {
        System.out.println("Pertama, Saya bekerja sebagai Guru SMA");
        System.out.println("Saya mengajar di salah satu SMA yaitu : " + Tempat);
    }

    @Override
    public void Mengajar(String MataPelajaran) {
        System.out.println("Di sana, Saya mengajar mata pelajaran : " + MataPelajaran);

    }

    @Override
    public void TotalMengajar(int Waktu) {
        System.out.println("Dengan total waktu mengajar sebesar : " + Waktu + " jam sehari");
        System.out.println();
    }
    // Implementasi dari interface Barista

    @Override
    public void Tempat(String Kedai) {
        System.out.println("Selain itu, Saya juga bekerja sebagai Barista");
        System.out.println("Saya bekerja di sebuah kedai dekat rumah Saya bernama : " + Kedai);
    }

    @Override
    public void JenisMinuman(String Dibuat) {
        System.out.println("Disana, Saya bertugas membuat : " + Dibuat);
    }

    @Override
    public void JamBekerja(int Waktu) {
        System.out.println("Biasanya Saya bekerja mulai dari sore hari hingga sampai jam : " + Waktu + " malam ");
        System.out.println();
    }
    // Implementasi dari interface KontenKreator

    @Override
    public void JenisKonten(String Jenis) {
        System.out.println("Saya juga aktif menjadi Konten Kreator, lhoo");
        System.out.println("Khususnya aktif dalam konten berjenis : " + Jenis);
    }
    public void MediaUpload(String SosialMedia) {
        System.out.println("Saya membuat konten di beberapa Sosial Media seperti : " + SosialMedia);
    }

    @Override
    public void CiriKhas(String Unik) {
        System.out.println("Ciri Khas konten Saya adalah membuat tutorial menghitung dalam : " + Unik + " sehingga cukup mudah dipahami");
    }

    @Override
    public void MediapUpload(String SosialMedia) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
}
