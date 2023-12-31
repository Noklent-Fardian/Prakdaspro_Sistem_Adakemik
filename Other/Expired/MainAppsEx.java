
import java.util.Scanner;

public class MainAppsEx {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        Scanner input = new Scanner(System.in);
        String pilih;
        String[][] dataMahasiswa;
        String[][] userMahasiswa = {
            {"1111111111", "1111111111"},
            {"2222222222", "2222222222"},
            {"3333333333", "3333333333"}
        };

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
            boolean login = true;
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
                                if (pilih.matches("2|3|4")) System.out.println("Maintenance");
                                else if (pilih.equals("1")) {
                                    
                                    System.out.print("Masukan jumlah mahasisawa : ");
                                    int jumlahMahasiswa = input.nextInt();
                                    dataMahasiswa  = new String[jumlahMahasiswa][5];
                                    String[] labelData = {"NIM", "Nama", "Kelamin", "Alamat", "Kelas"};
                                    System.out.println();
                                    input.nextLine();
                                    
                                    for (int i = 0; i < dataMahasiswa.length; i++) {
                                        System.out.println("Mahasiswa nomor urut ke-" + (i+1));
                                        for (int j = 0; j < dataMahasiswa[i].length; j++) {
                                            System.out.print("Masukan " + labelData[j] + " : ");
                                            dataMahasiswa[i][j] = input.nextLine();
                                        }          
                                    }
                                    System.out.println("=".repeat(50));
                                    for (int i = 0; i < dataMahasiswa.length; i++) {
                                        System.out.println("Data Mahasiswa nomor urut ke-" + (i+1));
                                        for (int j = 0; j < dataMahasiswa[i].length; j++) {
                                            System.out.printf("%s : %s%n", labelData[j], dataMahasiswa[i][j]);
                                        }
                                    }
                                }
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
                // iniBug = input.nextLine();
                for (int i = 1; i <= 3; i++) {
                    System.out.println("==Login Dosen SIAKAD=="); 
                    System.out.print("USERNAME : ");
                    username = input.nextLine();
                    System.out.print("PASSWORD : ");
                    password = input.nextLine();
                    if (username.equals("dosen") && password.equals("dosen")) {
                        notWrong = true;
                                System.out.print("\033[H\033[2J");
                        break;
                    }
                    System.out.println("Username dan password salah");
                    if (i == 3) ifWrong = true;
                }
                while (notWrong) {
                    while (notWrong) {
                        System.out.println("Dashboard Dosen");
                        System.out.println("1. Penilaian\n2. Presensi\n3. Matkul\n4. Keluar");
                        System.out.print("Pilih : ");
                        pilih = input.nextLine();
                                System.out.print("\033[H\033[2J");
                        switch (pilih) {
                            case "1" -> {
                                while (notWrong) {
                                    System.out.println("Penilaian Mahasiswa");
                                    System.out.println("1. Kelas \n2. Kelas\n3. Kelas\n4. Kembali");
                                    System.out.print("pilih : ");
                                    pilih = input.nextLine();
                                            System.out.print("\033[H\033[2J");
                                    if (pilih.matches("1|2|3")) {
                                        int total = 0;
                                        System.out.println("-----------------------------------------");
                                        for (int i = 1; i <= 5; i++) {
                                            System.out.print("Masukan nilai ke-" + i + " :");
                                            total += input.nextInt();
                                        } 
                                        System.out.println("Rata-rata nilai adalah " + total/5);
                                        System.out.println("-----------------------------------------");
                                        input.nextLine();

                                    }else if (pilih.equals("4")){
                                        break;
                                    
                                    }else System.out.println("Input tidak dimengerti");
                                }
                            }
                            case "2" -> {
                                while (notWrong) {
                                    System.out.println("Presensi Mahasiswa");
                                    System.out.println("1. Kelas \n2. Kelas\n3. Kelas\n4. Kembali");
                                    System.out.print("pilih : ");
                                    pilih = input.nextLine();
                                            System.out.print("\033[H\033[2J");
                                    if (pilih.matches("1|2|3")) System.out.println("Maintenance");
                                    else if (pilih.equals("4")) break;
                                    else System.out.println("Input tidak dimengerti");
                                }
                            }
                            case "3" -> {
                                while (notWrong) {
                                    System.out.println("MENAMPILAKN MATKUL");
                                    System.out.println("Maintenance");
                                    System.out.println("1. Kembali");
                                    System.out.print("pilih : ");
                                    pilih = input.nextLine();
                                            System.out.print("\033[H\033[2J");
                                    if (pilih.equals("1")) break;
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
            }
            if (pilih.equals("3")) {
                //Mahasiswa
                for (int i = 1; i <= 3 && login; i++) {
                    System.out.println("==Login Mahasiswa SIAKAD=="); 
                    System.out.print("USERNAME : ");
                    username = input.nextLine();
                    System.out.print("PASSWORD : ");
                    password = input.nextLine();
                    for (int baris = 0; baris < userMahasiswa.length; baris++) {
                        if (username.equals(userMahasiswa[baris][0]) && password.equals(userMahasiswa[baris][1])) {
                            System.out.print("\033[H\033[2J");
                            notWrong = true;
                            login = false;
                            break;
                        }
                        System.out.println("Username dan password salah");
                        if (i == 3) ifWrong = true;
                    }
                }
                while (notWrong) {
                    System.out.println("Dashboard Mahasiswa");
                    System.out.println("1. Biodata\n2. Presensi\n3. Matkul\n4. Nilai\n5. Keluar");
                    System.out.print("Pilih : ");
                    pilih = input.nextLine();
                            System.out.print("\033[H\033[2J");
                    switch (pilih) {
                        case "1" -> {
                            while (notWrong) {
                                System.out.println("MENAMPILKAN BIODATA");
                                System.out.println("Maintenance");
                                System.out.println("1. Kembali");
                                System.out.print("pilih : ");
                                pilih = input.nextLine();
                                        System.out.print("\033[H\033[2J");
                                if (pilih.equals("1")) break;
                                else System.out.println("Input tidak dimengerti");
                            }
                        }
                        case "2" -> {
                            while (notWrong) {
                                System.out.println("MENAMPILKAN PRESENSI");
                                System.out.println("Maintenance");
                                System.out.println("1. Kembali");
                                System.out.print("pilih : ");
                                pilih = input.nextLine();
                                        System.out.print("\033[H\033[2J");
                                if (pilih.equals("1")) break;
                                else System.out.println("Input tidak dimengerti");
                            }
                        }
                        case "3" -> {
                            while (notWrong) {
                                System.out.println("MENAMPILAKN MATKUL");
                                System.out.println("Maintenance");
                                System.out.println("1. Kembali");
                                System.out.print("pilih : ");
                                pilih = input.nextLine();
                                        System.out.print("\033[H\033[2J");
                                if (pilih.equals("1")) break;
                                else System.out.println("Input tidak dimengerti");
                            }
                        }
                        case "4" -> {
                            while (notWrong) {
                                System.out.println("MENAMPILAKN NILAI");
                                System.out.println("Maintenance");
                                System.out.println("1. Kembali");
                                System.out.print("pilih : ");
                                pilih = input.nextLine();
                                        System.out.print("\033[H\033[2J");
                                if (pilih.equals("1")) break;
                                else System.out.println("Input tidak dimengerti");
                            }
                        }
                        case "5" -> {
                            notWrong = false;
                            berhenti = false;
                            System.out.println("Keluar......");
                        }
                        default -> System.out.println("Input tidak dimengerti");
                    }
                }
            }

            // Uji coba
            if (ifWrong) {
                int detik = 60;
                int left = detik / 60, right = detik % 60;
                for (int j = 0; j < detik; j++) {
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    System.out.printf("Input salah 3x silahkan tunggu %d:%02d%n",left,right);
                    try{
                        Thread.sleep(250);
                    } catch (InterruptedException e){
                        
                    }
                    if (right == 0) {
                        left --;
                        right = 59;
                    } else right--;
                }
                System.out.print("\033[H\033[2J");
            }
        }
    }    
}