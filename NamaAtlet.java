import java.util.Scanner;

public class NamaAtlet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah Politeknik yang mendaftar: ");
        int jumlahPoliteknik = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= jumlahPoliteknik; i++) {
            System.out.println("\nPoliteknik ke-" + i);

            System.out.println("-----Cabang Olahraga Badminton-----");
            for (int j = 1; j <= 5; j++) {
                System.out.print("Nama atlet Badmintoon ke-" + j + " : ");
                String namaAtlet = scanner.nextLine();
                
            }
            System.out.println("-----Cabang Olahraga Tenis Meja-----");
            for (int j = 1; j <= 5; j++) {
                System.out.print("Nama atlet Tenis Meja ke-" + j + " : ");
                String namaAtlet = scanner.nextLine();
               
            }
            System.out.println("-----Cabang Olahraga Basket-----");
            for (int j = 1; j <= 5; j++) {
                System.out.print("Nama atlet Basket ke-" + j + " : ");
                String namaAtlet = scanner.nextLine();
                
            }
            System.out.println("-----Cabang Olahraga Bola Voli-----");
            for (int j = 1; j <= 5; j++) {
                System.out.print("Nama atlet Bola Voli ke-" + j + " : ");
                String namaAtlet = scanner.nextLine();
                
            }
        }
    }
}
