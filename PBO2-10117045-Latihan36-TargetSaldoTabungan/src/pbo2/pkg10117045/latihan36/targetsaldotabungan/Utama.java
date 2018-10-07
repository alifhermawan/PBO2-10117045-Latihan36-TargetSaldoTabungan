/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117045.latihan36.targetsaldotabungan;

/**
 * @author
 * NAMA     : Alif Hermawan
 * KELAS    : PBO2
 * NIM      : 10117045
 * Deskripsi Program :  Program ini berisi perintah untuk menampilkan saldo awal
 * bulan hingga saldo memenuhi target
 *
 */
public class Utama {

    public static void main(String[] args) {
        Saldotabungan tab = new Saldotabungan();

        tab.saldo = 3500000;
        tab.bunga = 8;
        int saldoTarget = 6000000;

        tab.HitungLamaSaldoTarget(tab.saldo,saldoTarget);
    }
}