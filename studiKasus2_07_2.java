import java.util.Scanner;
public class studiKasus2_07_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String namaMahasiswa, jenisKegiatan;
        int jmlDokumen = 0, juara = 0, statusPKM = 0;

       System.out.println("=== Validasi Dokumen Prestasi Mahasiswa ==="); 
       System.out.print("Nama : ");
       namaMahasiswa = sc.nextLine();
       System.out.print("Jenis kegiatan (BELMAWA, BAKORMA, PKM, Mandiri, dll) : ");
       jenisKegiatan = sc.nextLine();

       if (jenisKegiatan.equalsIgnoreCase("belmawa") || jenisKegiatan.equalsIgnoreCase("bakorma") || jenisKegiatan.equalsIgnoreCase("mandiri")) {
            System.out.print("Masukkan Juara : ");
            juara = sc.nextInt();
            if (juara >=1 && juara <= 3) {
                System.out.print("Jumlah dokumen (0-4): ");
                jmlDokumen = sc.nextInt();
                if (jmlDokumen == 4) {
                    System.out.println("Status: Dokumen Lengkap. Dana penghargaan diberikan");
                } else {
                    int bnykDokumen = 4, dokKurang;
                    dokKurang = 4 - jmlDokumen;
                    System.out.println("Status: Dokumen tidak lenkap (kurang " + dokKurang + "). Dana penghargaan tidak diberikan.");
                }
            } else {
                System.out.println("Tidak memperoleh dana penghargaan (hanya untuk juara 1/2/3)");
            }

        } else if (jenisKegiatan.equalsIgnoreCase("PKM") || jenisKegiatan.equalsIgnoreCase("program kreativitas mahasiswa")) {
            System.out.print("Masukkan Status Kelolosan (1=lolos,  0=tidak lolos) : ");
            statusPKM = sc.nextInt();
            if (statusPKM == 1) {
                System.out.print("Jumlah dokumen (0-4): ");
                jmlDokumen = sc.nextInt();
                    if (jmlDokumen == 4) {
                        System.out.println("Status: Dokumen Lengkap. Dana penghargaan diberikan");
                    } else {
                        int bnykDokumen = 4, dokKurang;
                        dokKurang = 4 - jmlDokumen;
                        System.out.println("Status: Dokumen tidak lenkap (kurang " + dokKurang + "). Dana penghargaan tidak diberikan.");
            }
            } else {
                System.out.println("Tidak memperoleh dana penghargaan (tidak lolos PKM)");
            }
        } else {
            System.out.println("Selain kegiatan yang dicantumkan, tidak memperoleh dana penghargaan.");
        } 
    }
}