package pboif2.pkg10119052.latihan35.programtunjangan;

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
public class Karyawan {
  private double gaji;
    private String status;

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    private double hitungTunjangan() {
        return status.equals("Menikah") ? gaji * 0.35 : 0;
    }
    
    private double hitungTotalGaji() {
        return gaji + hitungTunjangan();
    }
    
    public void tampilHasilPerhitungan() {
        System.out.println("\n========Hasil Perhitungan Gaji Anda========");
        System.out.println("Gaji Pokok\t\t: Rp." + gaji);
        System.out.println("Tunjangan\t\t: Rp." + hitungTunjangan());
        System.out.println("Total Gaji\t\t: Rp." + hitungTotalGaji());
        System.out.println("===========================================");
        System.out.println("(Developed by : Rizki Dwi Nugraha)");
    }  
}
