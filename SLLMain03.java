import java.util.Scanner;
public class SLLMain03 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        SingleLinkedList03 sll = new SingleLinkedList03();

        System.out.print("Masukkan jumlah mahasiswa yang ingin diinput: ");
        int jumlah = sc.nextInt();
        sc.nextLine(); 

        for (int i = 0; i < jumlah; i++) {
            System.out.println("\n--- Input Data Mahasiswa ke-" + (i + 1) + " ---");
            System.out.print("Nama  : ");
            String nama = sc.nextLine();
            System.out.print("NIM   : ");
            String nim = sc.nextLine();
            System.out.print("Kelas : ");
            String kelas = sc.nextLine();
            System.out.print("IPK   : ");
            double ipk = sc.nextDouble();
            sc.nextLine(); 

            Mahasiswa03 mhs = new Mahasiswa03(nim, nama, kelas, ipk);
            
            sll.addLast(mhs);
        }

        System.out.println("\n--- Hasil Akhir Seluruh Data ---");
        sll.print();
    }
}