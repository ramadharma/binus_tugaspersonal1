package aplikasiinputbarang;
/**
 *
 * @author USER
 */
// import scanner untuk inputan dan import package java math
//untuk kebutuhan membulatkan angka dibelakang koma
import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class AplikasiInputBarang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
//        Deklarasi variable
        String nama, barang;
        int qty;
        double hargabeli, hargajual;
        
        System.out.print("Masukan nama Anda: ");
        nama = in.next();
        
        System.out.println("");
        
        System.out.println("Stok Gudang Input Barang");
        System.out.println("########################");
        
        System.out.println("Selamat Datang " + nama + "!");
        
        System.out.print("Masukan nama barang yang mau ditambah: ");
        barang = in.next();
        
        System.out.print("Masukan Jumlah barang yang mau ditambah: ");
        qty = in.nextInt();
        
        System.out.print("Masukan harga beli untuk barang tersebut: ");
        hargabeli = in.nextDouble();
        
        System.out.print("Masukan harga jual untuk barang tersebut: ");
        hargajual = in.nextDouble();
        
        System.out.println("");
        
        System.out.println("Stok Gudang Rincian Barang");
        System.out.println("##########################");
        
//      Membulatkan ke dua angka dibelakang koma
        BigDecimal hargabeli1 = new BigDecimal(hargabeli).setScale
        (2, RoundingMode.CEILING);
        BigDecimal hargajual1 = new BigDecimal(hargajual).setScale
        (2, RoundingMode.CEILING);
        
        System.out.println("Nama Barang: " + barang);
        System.out.println("Jumlah Barang: " + qty);
        System.out.println("Harga Beli: Rp. " + hargabeli1);
        System.out.println("Harga Jual: Rp. " + hargajual1);
    }
    
}
