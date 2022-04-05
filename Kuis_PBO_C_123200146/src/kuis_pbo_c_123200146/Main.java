
package kuis_pbo_c_123200146;

import java.util.Scanner;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner (System.in);
        int menu;
        double Alur,Konten,Kreatifanimasi,Sinema;
        double struktur,isi,KreatifSurat,bahasa;
        String nama,sekolah;
        System.out.println(" Lomba Apresiasi Pahlawan Wanita Indonesia ");
        System.out.println(" Input Kategori Lomba                      ");
        System.out.println(" 1. Animasi (Tim)                          ");
        System.out.println(" 2. Menulis Surat (Individu)               ");
        System.out.print("menu : ");
        menu = keyboard.nextInt();
        
        if (menu == 1) {
            System.out.println(" Form Pendaftaran ");
            System.out.print("Masukan Nama   : ");
            nama = keyboard.next();
            
            System.out.print("Asal Sekolah   : ");
            sekolah = keyboard.next();
            do {
                System.out.println("  Form Penilaian  ");
                System.out.println("Ket: Nilai dari 1-100");
                System.out.print("Nilai Alur Cerita   : ");
                Alur = keyboard.nextDouble();
                System.out.print("Nilai Konten        : ");
                Konten = keyboard.nextDouble();
                System.out.print("Nilai Kreativitas   : ");
                Kreatifanimasi = keyboard.nextDouble();
                System.out.print("Nilai Sinematografi : ");
                Sinema = keyboard.nextDouble();
            } while (Alur > 100 || Alur < 0 || Konten > 100 || Konten < 0 || Kreatifanimasi < 0 || Kreatifanimasi > 100 || Sinema < 0 || Sinema > 100);
            do {
                System.out.println("============");
                System.out.println("   Menu   ");
                System.out.println(" 1. Tampil ");
                System.out.println(" 2. Edit   ");
                System.out.println(" 3. Exit   ");
                System.out.println("============");
                System.out.print("menu : ");
                menu = keyboard.nextInt();
                if (menu == 1) {
                    double hasil;
                    seleksiAnimasi pa;
                    pa = new seleksiAnimasi (Alur,Konten,Kreatifanimasi,Sinema);
                    hasil = pa.hasil();
                    System.out.println("Nilai Akhir : " + hasil);
                    if (hasil < 85) {
                        System.out.println("Keterangan : GAGAL");
                        System.out.println("MOHON MAAF " + nama + " dari sekolah " + sekolah + " belum berhasil lolos seleksi LOMBA ANIMASI!");
                    }
                    else if (hasil >= 85) {
                        System.out.println("Keterangan : BERHASIL");
                        System.out.println("SELAMAT! " + nama + " dari sekolah " + sekolah + " berhasil lolos seleksi LOMBA ANIMASI!");
                    }
                }
                else if (menu == 2) {
                    do {
                        System.out.println("  Form Penilaian  ");
                        System.out.println("Ket: Nilai dari 1-100");
                        System.out.print("Nilai Alur Cerita   : ");
                        Alur = keyboard.nextDouble();
                        System.out.print("Nilai Konten        : ");
                        Konten = keyboard.nextDouble();
                        System.out.print("Nilai Kreativitas   : ");
                        Kreatifanimasi = keyboard.nextDouble();
                        System.out.print("Nilai Sinematografi : ");
                        Sinema = keyboard.nextDouble();
                    } while (Alur > 100 || Alur < 0 || Konten > 100 || Konten < 0 || Kreatifanimasi > 100 || Kreatifanimasi < 0 || Sinema > 100 || Sinema < 0);
                }
            } while (menu != 3);
            
        }
        
        else if (menu == 2) {
            System.out.println(" Form Pendaftaran ");
            System.out.print("Masukan Nama   : ");
            nama = keyboard.next();
            System.out.print("Asal Sekolah   : ");
            sekolah = keyboard.next();
            
            do {
                System.out.println("  Form Penilaian  ");
                System.out.println("Ket: Nilai dari 1-100");
                System.out.print("Nilai Struktur                : ");
                struktur = keyboard.nextDouble();
                System.out.print("Nilai Isi                     : ");
                isi = keyboard.nextDouble();
                System.out.print("Nilai Kreativitas             : ");
                KreatifSurat = keyboard.nextDouble();
                System.out.print("Nilai Penerapan Kaidah Bahasa : ");
                bahasa = keyboard.nextDouble();
            } while (struktur > 100 || struktur < 0 || isi > 100 || isi < 0 ||  KreatifSurat > 100 || KreatifSurat<0 || bahasa > 100|| bahasa < 0);
            
             do {
                System.out.println("============");
                System.out.println("   Menu   ");
                System.out.println(" 1. Tampil ");
                System.out.println(" 2. Edit   ");
                System.out.println(" 3. Exit   ");
                System.out.println("============");
                System.out.print("menu : ");
                menu = keyboard.nextInt();
                if (menu == 1) {
                    double hasil;
                    seleksiSurat ps;
                    ps = new seleksiSurat (struktur,isi,KreatifSurat,bahasa);
                    hasil = ps.hasil();
                    System.out.println("Nilai Akhir : " + hasil);
                    if (hasil < 85) {
                        System.out.println("Keterangan : GAGAL");
                        System.out.println("MOHON MAAF " + nama + " dari sekolah " + sekolah + " belum berhasil lolos seleksi LOMBA MENULIS SURAT!");
                    }
                    else if (hasil >= 85) {
                        System.out.println("Keterangan : BERHASIL");
                        System.out.println("SELAMAT! " + nama + " dari sekolah " + sekolah + " berhasil lolos seleksi LOMBA MENULIS SURAT!");
                    }
                }
                else if (menu == 2) {
                    do {
                        System.out.println("|  Form Penilaian  |");
                        System.out.println("Ket: Nilai dari 1-100");
                        System.out.print("Nilai Struktur                : ");
                        struktur = keyboard.nextDouble();
                        System.out.print("Nilai Isi                     : ");
                        isi = keyboard.nextDouble();
                        System.out.print("Nilai Kreativitas             : ");
                        KreatifSurat = keyboard.nextDouble();
                        System.out.print("Nilai Penerapan Kaidah Bahasa : ");
                        bahasa = keyboard.nextDouble();
                    } while (struktur > 100 || struktur < 0 || isi > 100 || isi < 0 ||  KreatifSurat > 100 || KreatifSurat<0 || bahasa > 100|| bahasa < 0);
                 }
             }while (menu != 3);
        }
    }
}