package pboif2.pkg10119052.latihan35.programtunjangan;
import java.util.Scanner;
/**
 *
 * NAMA   : Rizki Dwi nugraha
 * KELAS  : IF-2
 * NIM    : 10119052
 * Deskripsi Program : Program ini berisi program untuk menampilkan
 * program tunjangan menggunakan enkasuplapsi(dua class berbeda) dan akses
 * modifier public, private
 * 
 */
public class PBOIF210119052Latihan35ProgramTunjangan {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Gaji gaji = new Gaji();
        
        System.out.println("===========Program Tunjangan===============");
        System.out.print("Berapa gaji pokok anda perbulan?: Rp.");
        gaji.setGaji(scanner.nextDouble());
        
        System.out.print("Status Anda? (Menikah/Belum)\t: ");
        gaji.setStatus(scanner.next());
        
        gaji.hasilPerhitungan();
    }
    
}
