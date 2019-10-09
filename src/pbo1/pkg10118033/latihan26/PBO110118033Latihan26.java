
/**
 * 
 * @author 
 * NAMA  : Ikrar Anugrah Bastary
 * KELAS : PBO1
 * NIM   : 10118033
 * Deskripsi Program : Program ini berisi program untuk menampilkan waktu saat
 * ini
 */

package pbo1.pkg10118033.latihan26;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class PBO110118033Latihan26 {
    public static void main(String[] args) {
        LocalDateTime tanggal1 = LocalDateTime.now();
        DateTimeFormatter formatTanggal = DateTimeFormatter.ofPattern("EEEE, dd MMM yyyy HH:mm:ss");
        String tanggal2 = tanggal1.format(formatTanggal);
        System.out.println("Hari ini adalah hari : "+tanggal2);
        System.out.println("(Developed By : Ikrar AB)");
    }
}