package pbo1.pkg10118031.latihan39.objectoriented.nilaiterbesardanterkecil;

import java.util.Scanner;

/**
 *
 * @author Vendetta 
 * NAMA : RIZKI ARIA PUTRA 
 * KELAS : PBO1 
 * NIM : 10118031
 * Deskripsi Program : Program ini berisi program untuk menentukan nilai terbesar dan terkecil
 */
public class PBO110118031Latihan39ObjectOrientedNilaiTerbesardanTerkecil {

    public static void main(String[] args) {

        Mahasiswa mhs1 = new Mahasiswa();
        Scanner scn = new Scanner(System.in);

        int bykMah;
        String nama;
        System.out.println("========Program Nilai Terbesar dan Terkecil nilai Mahasiswa========");
        System.out.print("Masukkan Nama Petugas : ");
        nama = scn.nextLine();
        System.out.print("Masukkan Banyaknya Mahasiswa : ");
        bykMah = scn.nextInt();
        mhs1.inputNilai(mhs1.nilai, bykMah);
        mhs1.tampilBesarKecil(mhs1.nilai, bykMah);

        System.out.println("\n" + "Petugas : " + nama);

    }

}
