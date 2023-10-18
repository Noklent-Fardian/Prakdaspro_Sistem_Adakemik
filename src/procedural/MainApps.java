package procedural;

import java.util.Scanner;

public class MainApps {
    public static void main(String[] args) throws InterruptedException {
        System.out.print("\033[H\033[2J");
        Scanner input = new Scanner(System.in);
        String pilih;
        boolean berhenti = true;
        while (berhenti) {
            while (true) {
                //login TUI
                System.out.print("==Selamat Datang di SIAKAD==\nMasuk sebagai : \n1. Admin\n2. Dosen\n3. Mahasiswa\n4. keluar\n");
                System.out.print("Pilih : ");
                pilih = input.nextLine();
                System.out.print("\033[H\033[2J");
                if (pilih.matches("1|2|3")) break;
                if (pilih.equals("4")) {
                    berhenti = false;
                    break;
                }
                System.out.println("Input tidak dimengerti");
            }
            String username, password;
            boolean ifWrong = false;
            boolean notWrong = false;
            if (pilih.equals("1")) {
                //Admin
                for (int i = 1; i <= 3; i++) {
                    System.out.println("==Login Admin SIAKAD=="); 
                    System.out.print("USERNAME : ");
                    username = input.nextLine();
                    System.out.print("PASSWORD : ");
                    password = input.nextLine();
                    if (username.equals("admin") && password.equals("admin")) {
                        notWrong = true;
                                System.out.print("\033[H\033[2J");
                        break;
                    }
                    System.out.println("Username dan password salah");
                    if (i == 3) ifWrong = true;
                }
                while (notWrong) {
                    System.out.println("Dashboard Admin");
                    System.out.println("1. Mahasiswa\n2. Dosen\n3. Kursus\n4. Keluar");
                    System.out.print("Pilih : ");
                    pilih = input.nextLine();
                            System.out.print("\033[H\033[2J");
                    switch (pilih) {
                        case "1" -> {
                            while (notWrong) {
                                System.out.println("Modul Mahasiswa");
                                System.out.println("1. List Mahasiswa\n2. Transkip nilai\n3. Presensi Mahasiswa\n4. user\n5. Kembali");
                                System.out.print("pilih : ");
                                pilih = input.nextLine();
                                        System.out.print("\033[H\033[2J");
                                if (pilih.matches("1|2|3|4")) System.out.println("Maintenance");
                                else if (pilih.equals("5")) break;
                                else System.out.println("Input tidak dimengerti");
                            }
                        }
                        case "2" -> {
                            while (notWrong) {
                                System.out.println("Modul Dosen");
                                System.out.println("1. List Dosen\n2. user\n3. Kembali");
                                System.out.print("pilih : ");
                                pilih = input.nextLine();
                                        System.out.print("\033[H\033[2J");
                                if (pilih.matches("1|2")) System.out.println("Maintenance");
                                else if (pilih.equals("3")) break;
                                else System.out.println("Input tidak dimengerti");
                            }
                        }
                        case "3" -> {
                            while (notWrong) {
                                System.out.println("Modul Kursus");
                                System.out.println("1. Kelas mahasiswa\n2. Matkul pengajar\n3. Penjadwalan\n4. Kembali");
                                System.out.print("pilih : ");
                                pilih = input.nextLine();
                                        System.out.print("\033[H\033[2J");
                                if (pilih.matches("1|2|3")) System.out.println("Maintenance");
                                else if (pilih.equals("4")) break;
                                else System.out.println("Input tidak dimengerti");
                            }
                        }
                        case "4" -> {
                            notWrong = false;
                            berhenti = false;
                            System.out.println("Keluar......");
                        }
                        default -> System.out.println("Input tidak dimengerti");
                    }
                }
            }
            if (pilih.equals("2")) {
                //Dosen
                
            }
            if (pilih.equals("3")) {
                //Mahasiswa
                
            }
        }
    }    
}
