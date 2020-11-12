package pbo2.pkg10119073.latihan42.tabungan;

import java.util.Scanner;

/**
 *
 * @author 
 * NAMA     : Aghnia Dewi Mahiranie
 * KELAS    : PBO2
 * NIM      : 10119073
 * Deskripsi Program : Program ini berisi program untuk menghitung saldo tabungan
 *
 */

public class PBO210119073Latihan42Tabungan {

    public static void main(String[] args) {
        System.out.println("====Program Penarikan Uang====");
        Scanner Scanner = new Scanner(System.in);
        
        System.out.print("Masukan Saldo Awal : ");
        int awal = Scanner.nextInt();
        Tabungan tab = new Tabungan(awal);
        System.out.print("Jumlah uang yang diambil : ");
        int ambil = Scanner.nextInt();
        System.out.println("Saldo Anda Sekarang : "+ tab.ambilUang(ambil));
    }
    
}
