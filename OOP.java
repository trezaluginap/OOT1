import java.util.Scanner;

public class OOP {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            // Konversi suhu
            System.out.print("Masukkan suhu dalam Reamur: ");
            double reamur = input.nextDouble();
            double celcius = (5.0 / 4.0) * reamur;
            double fahrenheit = (9.0 / 4.0) * reamur + 32;
            double kelvin = (5.0 / 4.0) * reamur + 273;
            System.out.println("Suhu dalam Celcius: " + celcius);
            System.out.println("Suhu dalam Fahrenheit: " + fahrenheit);
            System.out.println("Suhu dalam Kelvin: " + kelvin);

            // Hitung umur
            System.out.print("Masukkan tahun lahir Anda: ");
            int tahunLahir = input.nextInt();
            int umur = 2024 - tahunLahir;
            System.out.println("Umur Anda adalah " + umur + " tahun.");

            // Menghitung luas dan keliling segitiga
            System.out.print("Masukkan panjang sisi pertama segitiga: ");
            double sisi1 = input.nextDouble();
            System.out.print("Masukkan panjang sisi kedua segitiga: ");
            double sisi2 = input.nextDouble();
            System.out.print("Masukkan panjang sisi ketiga segitiga: ");
            double sisi3 = input.nextDouble();
            double keliling = sisi1 + sisi2 + sisi3;
            double setengahKeliling = keliling / 2;
            double luas = Math.sqrt(setengahKeliling * (setengahKeliling - sisi1) * (setengahKeliling - sisi2) * (setengahKeliling - sisi3));
            System.out.println("Keliling segitiga adalah " + keliling);
            System.out.println("Luas segitiga adalah " + luas);
        }
    }
}