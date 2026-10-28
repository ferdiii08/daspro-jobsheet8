import java.util.Scanner;
public class Tugas314 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah toko: ");
        int jumlahToko = sc.nextInt();

        if (jumlahToko < 1) {
            System.out.println("Jumlah toko minimal 1.");
        } else {
            int totalSemuaToko = 0;   
            int barangTerbanyak = -1; 
            int tokoTerbanyak = 0;

            String ringkasan = "";

            for (int toko = 1; toko <= jumlahToko; toko++) {      
                int jumlahPelanggan;
                do {
                    System.out.print("Toko " + toko + " - jumlah pelanggan: ");
                    jumlahPelanggan = sc.nextInt();
                    if (jumlahPelanggan < 0) {
                        System.out.println("  Tidak boleh negatif. Ulangi input!");
                    }
                } while (jumlahPelanggan < 0);

                int totalBarangToko = 0; 

                for (int p = 1; p <= jumlahPelanggan; p++) {      
                    int barang;
                    do {                                          
                        System.out.print("  Pelanggan " + p + " - jumlah barang: ");
                        barang = sc.nextInt();
                        if (barang < 0) {
                            System.out.println("  Tidak boleh negatif. Ulangi input!");
                        }
                    } while (barang < 0);
                    totalBarangToko += barang;
                }

                ringkasan += "Toko " + toko + " - pelanggan: " + jumlahPelanggan
                        + ", total barang: " + totalBarangToko + "\n";
                totalSemuaToko += totalBarangToko;

                if (totalBarangToko > barangTerbanyak) { 
                    barangTerbanyak = totalBarangToko;
                    tokoTerbanyak = toko;
                }
            }

            System.out.print(ringkasan);
            System.out.println("Total barang seluruh toko: " + totalSemuaToko);
            System.out.println("Toko dengan barang terbanyak: " + tokoTerbanyak);
        }
        sc.close();
    }
}