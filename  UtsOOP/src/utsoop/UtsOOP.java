package utsoop;

/**
 *
 * @author Linvianti Chemychel
 * Tgl 6 Mei 2025
 */
public class UtsOOP {

    /**
     * @param args the command line arguments
     */
 class Pencatatan {
    private String[] data;
    private int count;

    // Konstruktor untuk mengatur kapasitas awal array
    public Pencatatan(int kapasitas) {
        data = new String[kapasitas];
        count = 0;
    }

    // Menambah data baru ke dalam array
    public void tambahData(String catatan) {
        if (count < data.length) {
            data[count] = catatan;
            count++;
            System.out.println("Data berhasil ditambahkan.");
        } else {
            // Jika kapasitas array penuh, perbesar kapasitas array
            perbesarKapasitas();
            // Setelah kapasitas diperbesar, tambah data baru
            data[count] = catatan;
            count++;
            System.out.println("Kapasitas penuh. Kapasitas diperbesar dan data berhasil ditambahkan.");
        }
    }

    // Memperbesar kapasitas array jika kapasitas penuh
    private void perbesarKapasitas() {
        int newSize = data.length * 2;  // Menggandakan kapasitas
        String[] newData =


    public Pencatatan(int kapasitas) {
        data = new String[kapasitas];
        count = 0;
    }

    // Menambah data baru
    public void tambahData(String catatan) {
        if (count < data.length) {
            data[count] = catatan;
            count++;
            System.out.println("Data berhasil ditambahkan.");
        } else {
            System.out.println("Tidak dapat menambah data. Kapasitas penuh.");
        }
    }

    // Menampilkan semua data
    public void tampilkanData() {
        if (count == 0) {
            System.out.println("Tidak ada data yang tercatat.");
        } else {
            System.out.println("Daftar Pencatatan:");
            for (int i = 0; i < count; i++) {
                System.out.println((i + 1) + ". " + data[i]);
            }
        }
    }

    // Mengubah data berdasarkan nomor urut
    public void ubahData(int nomor, String catatanBaru) {
        if (nomor > 0 && nomor <= count) {
            data[nomor - 1] = catatanBaru;
            System.out.println("Data berhasil diubah.");
        } else {
            System.out.println("Nomor tidak valid.");
        }
    }

    // Menghapus data berdasarkan nomor urut
    public void hapusData(int nomor) {
        if (nomor > 0 && nomor <= count) {
            // Geser semua data setelah index yang dihapus
            for (int i = nomor - 1; i < count - 1; i++) {
                data[i] = data[i + 1];
            }
            data[count - 1] = null; // Nullkan data terakhir yang digeser
            count--;
            System.out.println("Data berhasil dihapus.");
        } else {
            System.out.println("Nomor tidak valid.");
        }
    }

    public int getCount() {
        return count;
    }
}



import java.util.Scanner;

class Pencatatan {
    private String[] data;
    private int count;

    // Konstruktor untuk mengatur kapasitas array
    public Pencatatan(int kapasitas) {
        data = new String[kapasitas];
        count = 0;
    }

    // Menambah data baru
    public void tambahData(String catatan) {
        if (count < data.length) {
            data[count] = catatan;
            count++;
            System.out.println("Data berhasil ditambahkan.");
        } else {
            System.out.println("Tidak dapat menambah data. Kapasitas penuh.");
        }
    }

    // Menampilkan semua data
    public void tampilkanData() {
        if (count == 0) {
            System.out.println("Tidak ada data yang tercatat.");
        } else {
            System.out.println("Daftar Pencatatan:");
            for (int i = 0; i < count; i++) {
                System.out.println((i + 1) + ". " + data[i]);
            }
        }
    }

    // Mengubah data berdasarkan nomor urut
    public void ubahData(int nomor, String catatanBaru) {
        if (nomor > 0 && nomor <= count) {
            data[nomor - 1] = catatanBaru;
            System.out.println("Data berhasil diubah.");
        } else {
            System.out.println("Nomor tidak valid.");
        }
    }

    // Menghapus data berdasarkan nomor urut
    public void hapusData(int nomor) {
        if (nomor > 0 && nomor <= count) {
            // Geser semua data setelah index yang dihapus
            for (int i = nomor - 1; i < count - 1; i++) {
                data[i] = data[i + 1];
            }
            data[count - 1] = null; // Nullkan data terakhir yang digeser
            count--;
            System.out.println("Data berhasil dihapus.");
        } else {
            System.out.println("Nomor tidak valid.");
        }
    }

    public int getCount() {
        return count;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Membatasi kapasitas array menjadi 5 atau bisa disesuaikan
        Pencatatan pencatatan = new Pencatatan(5);

        while (true) {
            // Menampilkan menu aplikasi
            System.out.println("\nMenu Aplikasi Pencatatan");
            System.out.println("1. Tambah Data");
            System.out.println("2. Tampilkan Data");
            System.out.println("3. Ubah Data");
            System.out.println("4. Hapus Data");
            System.out.println("5. Keluar");
            System.out.print("Pilih opsi (1-5): ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();  // Membersihkan newline karakter setelah input angka

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan catatan baru: ");
                    String catatan = scanner.nextLine();
                    pencatatan.tambahData(catatan);
                    break;
                case 2:
                    pencatatan.tampilkanData();
                    break;
                case 3:
                    if (pencatatan.getCount() == 0) {
                        System.out.println("Tidak ada data untuk diubah.");
                    } else {
                        System.out.print("Masukkan nomor data yang ingin diubah: ");
                        int nomorUbah = scanner.nextInt();
                        scanner.nextLine(); // Membersihkan newline
                        System.out.print("Masukkan catatan baru: ");
                        String catatanBaru = scanner.nextLine();
                        pencatatan.ubahData(nomorUbah, catatanBaru);
                    }
                    break;
                case 4:
                    if (pencatatan.getCount() == 0) {
                        System.out.println("Tidak ada data untuk dihapus.");
                    } else {
                        System.out.print("Masukkan nomor data yang ingin dihapus: ");
                        int nomorHapus = scanner.nextInt();
                        scanner.nextLine(); // Membersihkan newline
                        pencatatan.hapusData(nomorHapus);
                    }
                    break;
                case 5:
                    System.out.println("Terima kasih, aplikasi selesai.");
                    return;  // Keluar dari aplikasi
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }
}
