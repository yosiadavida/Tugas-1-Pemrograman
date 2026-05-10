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

        // TAMPILKAN MENU MANUAL (tanpa loop)
        System.out.println("=========== DAFTAR MENU RESTORAN ===========");
        System.out.println("1. " + daftarMenu[0].nama + " - Rp" + daftarMenu[0].harga);
        System.out.println("2. " + daftarMenu[1].nama + " - Rp" + daftarMenu[1].harga);
        System.out.println("3. " + daftarMenu[2].nama + " - Rp" + daftarMenu[2].harga);
        System.out.println("4. " + daftarMenu[3].nama + " - Rp" + daftarMenu[3].harga);
        System.out.println("5. " + daftarMenu[4].nama + " - Rp" + daftarMenu[4].harga);
        System.out.println("6. " + daftarMenu[5].nama + " - Rp" + daftarMenu[5].harga);
        System.out.println("7. " + daftarMenu[6].nama + " - Rp" + daftarMenu[6].harga);
        System.out.println("8. " + daftarMenu[7].nama + " - Rp" + daftarMenu[7].harga);
        System.out.println("9. " + daftarMenu[8].nama + " - Rp" + daftarMenu[8].harga);
        System.out.println("10. " + daftarMenu[9].nama + " - Rp" + daftarMenu[9].harga);
        System.out.println("============================================");

        System.out.println("\nMASUKKAN 4 PESANAN (Format: Nama Menu = Jumlah)");
        
        // INPUT 4 PESANAN
        System.out.print("Pesanan 1: "); String p1 = input.nextLine(); String[] b1 = p1.split(" = "); String nama1 = b1[0].trim(); int qty1 = Integer.parseInt(b1[1].trim());
        System.out.print("Pesanan 2: "); String p2 = input.nextLine(); String[] b2 = p2.split(" = "); String nama2 = b2[0].trim(); int qty2 = Integer.parseInt(b2[1].trim());
        System.out.print("Pesanan 3: "); String p3 = input.nextLine(); String[] b3 = p3.split(" = "); String nama3 = b3[0].trim(); int qty3 = Integer.parseInt(b3[1].trim());
        System.out.print("Pesanan 4: "); String p4 = input.nextLine(); String[] b4 = p4.split(" = "); String nama4 = b4[0].trim(); int qty4 = Integer.parseInt(b4[1].trim());

        // CARI HARGA & KATEGORI PESANAN 1 (FULL IF-ELSE)
        int harga1 = 0; String kat1 = "";
        if(nama1.equalsIgnoreCase(daftarMenu[0].nama)) { harga1 = daftarMenu[0].harga; kat1 = daftarMenu[0].kategori; }
        else if(nama1.equalsIgnoreCase(daftarMenu[1].nama)) { harga1 = daftarMenu[1].harga; kat1 = daftarMenu[1].kategori; }
        else if(nama1.equalsIgnoreCase(daftarMenu[2].nama)) { harga1 = daftarMenu[2].harga; kat1 = daftarMenu[2].kategori; }
        else if(nama1.equalsIgnoreCase(daftarMenu[3].nama)) { harga1 = daftarMenu[3].harga; kat1 = daftarMenu[3].kategori; }
        else if(nama1.equalsIgnoreCase(daftarMenu[4].nama)) { harga1 = daftarMenu[4].harga; kat1 = daftarMenu[4].kategori; }
        else if(nama1.equalsIgnoreCase(daftarMenu[5].nama)) { harga1 = daftarMenu[5].harga; kat1 = daftarMenu[5].kategori; }
        else if(nama1.equalsIgnoreCase(daftarMenu[6].nama)) { harga1 = daftarMenu[6].harga; kat1 = daftarMenu[6].kategori; }
        else if(nama1.equalsIgnoreCase(daftarMenu[7].nama)) { harga1 = daftarMenu[7].harga; kat1 = daftarMenu[7].kategori; }
        else if(nama1.equalsIgnoreCase(daftarMenu[8].nama)) { harga1 = daftarMenu[8].harga; kat1 = daftarMenu[8].kategori; }
        else if(nama1.equalsIgnoreCase(daftarMenu[9].nama)) { harga1 = daftarMenu[9].harga; kat1 = daftarMenu[9].kategori; }

        // CARI HARGA & KATEGORI PESANAN 2 (ULANG IF-ELSE SAMA)
        int harga2 = 0; String kat2 = "";
        if(nama2.equalsIgnoreCase(daftarMenu[0].nama)) { harga2 = daftarMenu[0].harga; kat2 = daftarMenu[0].kategori; }
        else if(nama2.equalsIgnoreCase(daftarMenu[1].nama)) { harga2 = daftarMenu[1].harga; kat2 = daftarMenu[1].kategori; }
        else if(nama2.equalsIgnoreCase(daftarMenu[2].nama)) { harga2 = daftarMenu[2].harga; kat2 = daftarMenu[2].kategori; }
        else if(nama2.equalsIgnoreCase(daftarMenu[3].nama)) { harga2 = daftarMenu[3].harga; kat2 = daftarMenu[3].kategori; }
        else if(nama2.equalsIgnoreCase(daftarMenu[4].nama)) { harga2 = daftarMenu[4].harga; kat2 = daftarMenu[4].kategori; }
        else if(nama2.equalsIgnoreCase(daftarMenu[5].nama)) { harga2 = daftarMenu[5].harga; kat2 = daftarMenu[5].kategori; }
        else if(nama2.equalsIgnoreCase(daftarMenu[6].nama)) { harga2 = daftarMenu[6].harga; kat2 = daftarMenu[6].kategori; }
        else if(nama2.equalsIgnoreCase(daftarMenu[7].nama)) { harga2 = daftarMenu[7].harga; kat2 = daftarMenu[7].kategori; }
        else if(nama2.equalsIgnoreCase(daftarMenu[8].nama)) { harga2 = daftarMenu[8].harga; kat2 = daftarMenu[8].kategori; }
        else if(nama2.equalsIgnoreCase(daftarMenu[9].nama)) { harga2 = daftarMenu[9].harga; kat2 = daftarMenu[9].kategori; }

        // CARI HARGA & KATEGORI PESANAN 3 (ULANG LAGI)
        int harga3 = 0; String kat3 = "";
        if(nama3.equalsIgnoreCase(daftarMenu[0].nama)) { harga3 = daftarMenu[0].harga; kat3 = daftarMenu[0].kategori; }
        else if(nama3.equalsIgnoreCase(daftarMenu[1].nama)) { harga3 = daftarMenu[1].harga; kat3 = daftarMenu[1].kategori; }
        else if(nama3.equalsIgnoreCase(daftarMenu[2].nama)) { harga3 = daftarMenu[2].harga; kat3 = daftarMenu[2].kategori; }
        else if(nama3.equalsIgnoreCase(daftarMenu[3].nama)) { harga3 = daftarMenu[3].harga; kat3 = daftarMenu[3].kategori; }
        else if(nama3.equalsIgnoreCase(daftarMenu[4].nama)) { harga3 = daftarMenu[4].harga; kat3 = daftarMenu[4].kategori; }
        else if(nama3.equalsIgnoreCase(daftarMenu[5].nama)) { harga3 = daftarMenu[5].harga; kat3 = daftarMenu[5].kategori; }
        else if(nama3.equalsIgnoreCase(daftarMenu[6].nama)) { harga3 = daftarMenu[6].harga; kat3 = daftarMenu[6].kategori; }
        else if(nama3.equalsIgnoreCase(daftarMenu[7].nama)) { harga3 = daftarMenu[7].harga; kat3 = daftarMenu[7].kategori; }
        else if(nama3.equalsIgnoreCase(daftarMenu[8].nama)) { harga3 = daftarMenu[8].harga; kat3 = daftarMenu[8].kategori; }
        else if(nama3.equalsIgnoreCase(daftarMenu[9].nama)) { harga3 = daftarMenu[9].harga; kat3 = daftarMenu[9].kategori; }

        // CARI HARGA & KATEGORI PESANAN 4 (ULANG TERAKHIR)
        int harga4 = 0; String kat4 = "";
        if(nama4.equalsIgnoreCase(daftarMenu[0].nama)) { harga4 = daftarMenu[0].harga; kat4 = daftarMenu[0].kategori; }
        else if(nama4.equalsIgnoreCase(daftarMenu[1].nama)) { harga4 = daftarMenu[1].harga; kat4 = daftarMenu[1].kategori; }
        else if(nama4.equalsIgnoreCase(daftarMenu[2].nama)) { harga4 = daftarMenu[2].harga; kat4 = daftarMenu[2].kategori; }
        else if(nama4.equalsIgnoreCase(daftarMenu[3].nama)) { harga4 = daftarMenu[3].harga; kat4 = daftarMenu[3].kategori; }
        else if(nama4.equalsIgnoreCase(daftarMenu[4].nama)) { harga4 = daftarMenu[4].harga; kat4 = daftarMenu[4].kategori; }
        else if(nama4.equalsIgnoreCase(daftarMenu[5].nama)) { harga4 = daftarMenu[5].harga; kat4 = daftarMenu[5].kategori; }
        else if(nama4.equalsIgnoreCase(daftarMenu[6].nama)) { harga4 = daftarMenu[6].harga; kat4 = daftarMenu[6].kategori; }
        else if(nama4.equalsIgnoreCase(daftarMenu[7].nama)) { harga4 = daftarMenu[7].harga; kat4 = daftarMenu[7].kategori; }
        else if(nama4.equalsIgnoreCase(daftarMenu[8].nama)) { harga4 = daftarMenu[8].harga; kat4 = daftarMenu[8].kategori; }
        else if(nama4.equalsIgnoreCase(daftarMenu[9].nama)) { harga4 = daftarMenu[9].harga; kat4 = daftarMenu[9].kategori; }

        // PERHITUNGAN
        int sub1 = harga1 * qty1;
        int sub2 = harga2 * qty2;
        int sub3 = harga3 * qty3;
        int sub4 = harga4 * qty4;
        int totalBiaya = sub1 + sub2 + sub3 + sub4;
        int pajak = (int)(totalBiaya * 0.10);
        int pelayanan = 20000;
        int totalKeseluruhan = totalBiaya + pajak + pelayanan;

        // DISKON
        int diskon = (totalKeseluruhan > 100000) ? (int)(totalKeseluruhan * 0.10) : 0;

        // PROMO B1G1 MANUAL (tanpa fungsi)
        int promoB1G1 = 0;
        if (totalKeseluruhan > 50000) {
            int minHargaMinuman = Integer.MAX_VALUE;
            if(kat1.equals("minuman")) minHargaMinuman = harga1;
            if(kat2.equals("minuman") && harga2 < minHargaMinuman) minHargaMinuman = harga2;
            if(kat3.equals("minuman") && harga3 < minHargaMinuman) minHargaMinuman = harga3;
            if(kat4.equals("minuman") && harga4 < minHargaMinuman) minHargaMinuman = harga4;
            if(minHargaMinuman != Integer.MAX_VALUE) promoB1G1 = minHargaMinuman;
        }

        int totalAkhir = totalKeseluruhan - diskon - promoB1G1;

        // CETAK STRUK MANUAL
        System.out.println("\n========= STRUK PEMBAYARAN =========");
        System.out.println(nama1 + " x" + qty1 + " : Rp " + sub1);
        System.out.println(nama2 + " x" + qty2 + " : Rp " + sub2);
        System.out.println(nama3 + " x" + qty3 + " : Rp " + sub3);
        System.out.println(nama4 + " x" + qty4 + " : Rp " + sub4);
        System.out.println("------------------------------------");
        System.out.println("Subtotal        : Rp " + totalBiaya);
        System.out.println("Pajak (10%)     : Rp " + pajak);
        System.out.println("Pelayanan       : Rp " + pelayanan);
        if(diskon > 0) System.out.println("Diskon (10%)    : -Rp " + diskon);
        if(promoB1G1 > 0) System.out.println("Promo B1G1      : -Rp " + promoB1G1);
        System.out.println("------------------------------------");
        System.out.println("TOTAL BAYAR     : Rp " + totalAkhir);
        System.out.println("====================================");

        input.close();
        }
    }
}