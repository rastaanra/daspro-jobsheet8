import java.util.Scanner;
public class RataNilai19 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
         
        for (int i=1; i<=5; i++){
            System.out.println("Input Nilai Mahasiswa ke-" + i + ": ");
            int totalNilai = 0;
            int nilaiMhs = 0;
            for (int j=1; j<=5; j++) {
                System.out.print("Nilai ke-" + j + ": ");
                nilaiMhs=sc.nextInt();
                totalNilai+=nilaiMhs;
            }
            double rataNilai=totalNilai/5;
            System.out.println("Rata-rata Nilai Mahasiswa ke- " +i + ": " +rataNilai);
            
        }
    }
}