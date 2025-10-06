import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk input pengguna
        Scanner scanner = new Scanner(System.in);
        
        // Meminta input gaji per jam
        System.out.print("Masukkan gaji per jam: ");
        double hourlyWage = scanner.nextDouble();
        
        // Meminta input jumlah jam kerja reguler dalam seminggu
        System.out.print("Masukkan jam kerja reguler dalam seminggu: ");
        double regularHours = scanner.nextDouble();
        
        // Meminta input jumlah jam kerja lembur dalam seminggu
        System.out.print("Masukkan jam kerja lembur dalam seminggu: ");
        double overtimeHours = scanner.nextDouble();
        
        // Menghitung gaji kotor: gaji reguler + gaji lembur (1.5 kali gaji per jam untuk lembur)
        double regularPay = regularHours * hourlyWage;
        double overtimePay = overtimeHours * hourlyWage * 1.5;
        double grossPay = regularPay + overtimePay;
        
        // Menghitung potongan pajak: 20% dari gaji kotor
        double taxRate = 0.20;
        double taxDeduction = grossPay * taxRate;
        
        // Menghitung gaji bersih: gaji kotor dikurangi potongan pajak
        double netPay = grossPay - taxDeduction;
        
        // Menampilkan hasil mingguan dalam format mata uang IDR
        System.out.println("\n=== Gaji Mingguan ===");
        System.out.println("Gaji Per Jam: " + String.format("IDR %.2f", hourlyWage));
        System.out.println("Jam Kerja Reguler: " + regularHours);
        System.out.println("Jam Kerja Lembur: " + overtimeHours);
        System.out.println("Gaji Kotor: " + String.format("IDR %.2f", grossPay));
        System.out.println("Potongan Pajak (20%): " + String.format("IDR %.2f", taxDeduction));
        System.out.println("Gaji Bersih: " + String.format("IDR %.2f", netPay));
        
        // Menghitung dan menampilkan gaji bulanan (asumsi 4 minggu per bulan)
        double monthlyGrossPay = grossPay * 4;
        double monthlyTaxDeduction = taxDeduction * 4;
        double monthlyNetPay = netPay * 4;
        
        System.out.println("\n=== Gaji Bulanan (Asumsi 4 Minggu) ===");
        System.out.println("Gaji Kotor Bulanan: " + String.format("IDR %.2f", monthlyGrossPay));
        System.out.println("Potongan Pajak Bulanan (20%): " + String.format("IDR %.2f", monthlyTaxDeduction));
        System.out.println("Gaji Bersih Bulanan: " + String.format("IDR %.2f", monthlyNetPay));
        
        // Menutup scanner
        scanner.close();
    }
}