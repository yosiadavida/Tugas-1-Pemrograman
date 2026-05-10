import java.util.Scanner;

public class Main {
    static Menu[] daftarMenu = {
        new Menu("Nasi Goreng", 20000, "makanan"), new Menu("Soto Ayam", 15000, "makanan"),
        new Menu("Mie Ayam", 15000, "makanan"), new Menu("Ayam Goreng", 25000, "makanan"),
        new Menu("Bakso", 18000, "makanan"), new Menu("Jus Alpukat", 15000, "minuman"),
        new Menu("Es Teh", 5000, "minuman"), new Menu("Jus Jeruk", 10000, "minuman"),
        new Menu("Air Mineral", 4000, "minuman"), new Menu("Jus Mangga", 12000, "minuman")
    };

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            
            // MENU DENGAN KATEGORI 
            System.out.println("=========== DAFTAR MENU ===========");
            System.out.println("\nMAKANAN:\n1.Nasi Goreng-Rp20k 2.Soto Ayam-Rp15k\n3.Mie Ayam-Rp15k 4.Ayam Goreng-Rp25k 5.Bakso-Rp18k");
            System.out.println("\nMINUMAN:\n6.Jus Alpukat-Rp15k 7.Es Teh-Rp5k 8.Jus Jeruk-Rp10k\n9.Air Mineral-Rp4k 10.Jus Mangga-Rp12k");
            System.out.println("===================================");

            // INPUT 4 PESANAN 
            System.out.println("\nMASUKKAN 4 PESANAN (Format: Nama = Jumlah)");
            String[] pesanan = {input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine()};
            String[] nama = new String[4]; int[] qty = new int[4];
            for(int i=0; i<4; i++) { String[] b = pesanan[i].split(" = "); nama[i] = b[0].trim(); qty[i] = Integer.parseInt(b[1].trim()); }

            // CARI HARGA & KATEGORI
            String[] kategori = {"", "", "", ""}; int[] harga = {0, 0, 0, 0};
            for(int i=0; i<4; i++) {
                for(int j=0; j<10; j++) {
                    if(nama[i].equalsIgnoreCase(daftarMenu[j].nama)) { 
                        harga[i] = daftarMenu[j].harga; kategori[i] = daftarMenu[j].kategori; break; 
                    }
                }
            }

            int[] sub = {harga[0]*qty[0], harga[1]*qty[1], harga[2]*qty[2], harga[3]*qty[3]};
            int totalBiaya = sub[0]+sub[1]+sub[2]+sub[3];
            int pajak = (int)(totalBiaya*0.10), pelayanan = 20000;
            int totalKeseluruhan = totalBiaya + pajak + pelayanan;
            int diskon = (totalKeseluruhan > 100000) ? (int)(totalKeseluruhan*0.10) : 0;

            // PROMO B1G1
            int promoB1G1 = 0;
            if(totalKeseluruhan > 50000) {
                int minHargaMinuman = Integer.MAX_VALUE;
                for(int i=0; i<4; i++) if(kategori[i].equals("minuman") && harga[i] < minHargaMinuman) 
                    minHargaMinuman = harga[i];
                if(minHargaMinuman != Integer.MAX_VALUE) promoB1G1 = minHargaMinuman;
            }
            int totalAkhir = totalKeseluruhan - diskon - promoB1G1;

            // STRUK 
            System.out.println("\n========= STRUK PEMBAYARAN =========");
            boolean adaMakanan = false;
            
            // MAKANAN
            for(int i=0; i<4; i++) if(kategori[i].equals("makanan") && sub[i]>0) { 
                System.out.println(nama[i]+" x"+qty[i]+" : Rp"+sub[i]); adaMakanan = true; 
            }
            if(adaMakanan) { System.out.println("                    ----------\nMAKANAN\n----------"); }
            
            // MINUMAN
            for(int i=0; i<4; i++) if(kategori[i].equals("minuman") && sub[i]>0) 
                System.out.println(nama[i]+" x"+qty[i]+" : Rp"+sub[i]);
            
           
            System.out.println("------------------------------------");
            System.out.println("Subtotal     : Rp"+totalBiaya);
            System.out.println("Pajak(10%)   : Rp"+pajak);
            System.out.println("Pelayanan    : Rp"+pelayanan);
            if(diskon>0) System.out.println("Diskon(10%)  :-Rp"+diskon);
            if(promoB1G1>0) System.out.println("Promo B1G1   :-Rp"+promoB1G1);
            System.out.println("------------------------------------");
            System.out.println("TOTAL BAYAR  : Rp"+totalAkhir);
            System.out.println("====================================");
        }
    }
}
