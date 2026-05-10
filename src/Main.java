import java.util.Scanner;

public class Main {
    static Menu[] daftarMenu = {
        new Menu("Nasi Goreng", 20000, "makanan"),
        new Menu("Soto Ayam", 15000, "makanan"),
        new Menu("Mie Ayam", 15000, "makanan"),
        new Menu("Ayam Goreng", 25000, "makanan"),
        new Menu("Bakso", 18000, "makanan"),
        new Menu("Jus Alpukat", 15000, "minuman"),
        new Menu("Es Teh", 5000, "minuman"),
        new Menu("Jus Jeruk", 10000, "minuman"),
        new Menu("Air Mineral", 4000, "minuman"),
        new Menu("Jus Mangga", 12000, "minuman")
    };

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {

            // MENU DENGAN KATEGORI
            System.out.println("=========== DAFTAR MENU RESTORAN ===========");
            System.out.println("\n=== KATEGORI MAKANAN ===");
            for (int i = 0; i < 5; i++) {
                System.out.println((i+1) + ". " + daftarMenu[i].nama + " - Rp " + daftarMenu[i].harga);
            }
            System.out.println("\n=== KATEGORI MINUMAN ===");
            for (int i = 5; i < 10; i++) {
                System.out.println((i+1) + ". " + daftarMenu[i].nama + " - Rp " + daftarMenu[i].harga);
            }
            System.out.println("============================================\n");

            // INPUT NOMOR MENU & JUMLAH
            System.out.println("PILIH 4 PESANAN (Format: NomorMenu,Jumlah)");
            
            System.out.print("Pesanan 1: "); 
            String[] d1 = input.nextLine().split(",");
            int no1 = Integer.parseInt(d1[0].trim()) - 1;
            String nama1 = daftarMenu[no1].nama;
            int qty1 = Integer.parseInt(d1[1].trim());
            int harga1 = daftarMenu[no1].harga;
            String kat1 = daftarMenu[no1].kategori;
            
            System.out.print("Pesanan 2: "); 
            String[] d2 = input.nextLine().split(",");
            int no2 = Integer.parseInt(d2[0].trim()) - 1;
            String nama2 = daftarMenu[no2].nama;
            int qty2 = Integer.parseInt(d2[1].trim());
            int harga2 = daftarMenu[no2].harga;
            String kat2 = daftarMenu[no2].kategori;
            
            System.out.print("Pesanan 3: "); 
            String[] d3 = input.nextLine().split(",");
            int no3 = Integer.parseInt(d3[0].trim()) - 1;
            String nama3 = daftarMenu[no3].nama;
            int qty3 = Integer.parseInt(d3[1].trim());
            int harga3 = daftarMenu[no3].harga;
            String kat3 = daftarMenu[no3].kategori;
            
            System.out.print("Pesanan 4: "); 
            String[] d4 = input.nextLine().split(",");
            int no4 = Integer.parseInt(d4[0].trim()) - 1;
            String nama4 = daftarMenu[no4].nama;
            int qty4 = Integer.parseInt(d4[1].trim());
            int harga4 = daftarMenu[no4].harga;
            String kat4 = daftarMenu[no4].kategori;

            // PERHITUNGAN 
            int sub1 = harga1 * qty1;
            int sub2 = harga2 * qty2;
            int sub3 = harga3 * qty3;
            int sub4 = harga4 * qty4;
            
            int totalBiaya = sub1 + sub2 + sub3 + sub4;  // Subtotal pesanan
            int pajak = (int)(totalBiaya * 0.10);
            int pelayanan = 20000;
            int totalSebelumDiskon = totalBiaya + pajak + pelayanan;
            
            // DISKON dari totalBiaya > 100k
            int diskon = (totalBiaya > 100000) ? (int)(totalBiaya * 0.10) : 0;

            // PROMO B1G1 - minuman termurah GRATIS jika total > 50k
            int promoB1G1 = 0;
            if (totalSebelumDiskon > 50000) {
                int minHargaMinuman = Integer.MAX_VALUE;
                if (kat1.equals("minuman")) minHargaMinuman = Math.min(minHargaMinuman, harga1);
                if (kat2.equals("minuman")) minHargaMinuman = Math.min(minHargaMinuman, harga2);
                if (kat3.equals("minuman")) minHargaMinuman = Math.min(minHargaMinuman, harga3);
                if (kat4.equals("minuman")) minHargaMinuman = Math.min(minHargaMinuman, harga4);
                if (minHargaMinuman != Integer.MAX_VALUE) {
                    promoB1G1 = minHargaMinuman;
                }
            }
            
            int totalAkhir = totalSebelumDiskon - diskon - promoB1G1;

            // STRUK PEMBAYARAN
            System.out.println("\n========= STRUK PEMBAYARAN =========");
            boolean adaMakanan = false;
            
            // MAKANAN
            if (kat1.equals("makanan") && sub1 > 0) { 
                System.out.println(nama1 + " x" + qty1 + " : Rp " + sub1); 
                adaMakanan = true; 
            }
            if (kat2.equals("makanan") && sub2 > 0) { 
                System.out.println(nama2 + " x" + qty2 + " : Rp " + sub2); 
                adaMakanan = true; 
            }
            if (kat3.equals("makanan") && sub3 > 0) { 
                System.out.println(nama3 + " x" + qty3 + " : Rp " + sub3); 
                adaMakanan = true; 
            }
            if (kat4.equals("makanan") && sub4 > 0) { 
                System.out.println(nama4 + " x" + qty4 + " : Rp " + sub4); 
                adaMakanan = true; 
            }
            
            if (adaMakanan) {
                System.out.println("                    ----------");
                System.out.println("                   MAKANAN");
                System.out.println("                    ----------");
            }
            
            // MINUMAN
            if (kat1.equals("minuman") && sub1 > 0) System.out.println(nama1 + " x" + qty1 + " : Rp " + sub1);
            if (kat2.equals("minuman") && sub2 > 0) System.out.println(nama2 + " x" + qty2 + " : Rp " + sub2);
            if (kat3.equals("minuman") && sub3 > 0) System.out.println(nama3 + " x" + qty3 + " : Rp " + sub3);
            if (kat4.equals("minuman") && sub4 > 0) System.out.println(nama4 + " x" + qty4 + " : Rp " + sub4);
            
            System.out.println("------------------------------------");
            System.out.println("Subtotal        : Rp " + totalBiaya);
            System.out.println("Pajak (10%)     : Rp " + pajak);
            System.out.println("Biaya Pelayanan : Rp " + pelayanan);
            System.out.println("------------------------------------");
            if (diskon > 0) {
                System.out.println("Diskon (10%)    : -Rp " + diskon);
            }
            if (promoB1G1 > 0) {
                System.out.println("Promo B1G1      : -Rp " + promoB1G1);
            }
            System.out.println("------------------------------------");
            System.out.println("TOTAL BAYAR     : Rp " + totalAkhir);
            System.out.println("====================================");
        } catch (Exception e) {
            System.out.println("Input tidak valid! Pastikan format: NomorMenu,Jumlah");
        }
    }
}
