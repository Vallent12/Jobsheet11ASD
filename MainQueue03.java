import java.util.Scanner;
public class MainQueue03 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QueueLinkedList03 antrian = new QueueLinkedList03(5);
        int pilih;

        do {
            System.out.println("\n=== ANTRIAN UNIT KEMAHASISWAAN ===");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Panggil Antrian");
            System.out.println("3. Tampilkan Semua Antrian");
            System.out.println("4. Tampilkan Antrian Terdepan");
            System.out.println("5. Tampilkan Antrian Paling Belakang");
            System.out.println("6. Tampilkan Jumlah Antrian");
            System.out.println("7. Kosongkan Antrian");
            System.out.println("8. Cek Antrian Kosong");
            System.out.println("9. Cek Antrian Penuh");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu : ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    if (antrian.isFull()) {
                        System.out.println("Antrian sudah penuh!");
                    } else {
                        System.out.print("NIM : ");
                        String nim = sc.nextLine();

                        System.out.print("Nama : ");
                        String nama = sc.nextLine();

                        System.out.print("Keperluan : ");
                        String keperluan = sc.nextLine();

                        Mahasiswaa03 mhs = new Mahasiswaa03(nim, nama, keperluan);

                        antrian.enqueue(mhs);
                    }
                    break;

                case 2:
                    antrian.dequeue();
                    break;

                case 3:
                    antrian.print();
                    break;

                case 4:
                    antrian.tampilFront();
                    break;

                case 5:
                    antrian.tampilRear();
                    break;

                case 6:
                    antrian.tampilJumlah();
                    break;

                case 7:
                    antrian.clear();
                    break;

                case 8:
                    System.out.println("Antrian kosong : " + antrian.isEmpty());
                    break;

                case 9:
                    System.out.println("Antrian penuh : " + antrian.isFull());
                    break;

                case 0:
                    System.out.println("Program selesai");
                    break;

                default:
                    System.out.println("Menu tidak valid!");
            }

        } while (pilih != 0);
    }
}