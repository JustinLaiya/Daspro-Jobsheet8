import java.util.Scanner;

public class RataNilai10 {
    public static void main(String[] args) {int i,j;
        Scanner sc = new Scanner(System.in);
        float totalNilai, nilaiMhs, rataNilai;
        i = 1;
        while (i <= 5) {
            System.out.println("Input Nilai Mahasiswa ke " +i);
            totalNilai = 0;
            for (j = 1; j <= 5; j++) {
                System.out.print("Nilai ke-" + j + " = ");
                nilaiMhs = sc.nextInt();
                totalNilai += nilaiMhs;
            }
            rataNilai = totalNilai / 5;
            System.out.println("Rata - rata Nilai Mahasiswa ke " +i+ " adalah " +rataNilai);
            i++;
        }
    }
}
