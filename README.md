# SalaryCalculator - Kalkulator Gaji Java

Program sederhana ini menghitung gaji mingguan dan bulanan karyawan berdasarkan input gaji per jam, jam kerja reguler, dan jam kerja lembur. Program menggunakan bahasa Java dan menghitung potongan pajak 20% dari gaji kotor.

## Cara Perhitungan

### Gaji Mingguan
- **Gaji Reguler**: Jam kerja reguler × gaji per jam
- **Gaji Lembur**: Jam kerja lembur × gaji per jam × 1.5 (faktor lembur standar)
- **Gaji Kotor**: Gaji reguler + gaji lembur
- **Potongan Pajak**: Gaji kotor × 20%
- **Gaji Bersih**: Gaji kotor - potongan pajak

### Gaji Bulanan
- Mengalikan hasil mingguan dengan 4 (asumsi 4 minggu per bulan).
- **Gaji Kotor Bulanan**: Gaji kotor mingguan × 4
- **Potongan Pajak Bulanan**: Potongan pajak mingguan × 4
- **Gaji Bersih Bulanan**: Gaji bersih mingguan × 4

## Asumsi
- Hari kerja: Senin-Jumat (5 hari/minggu), Sabtu-Minggu libur.
- Jam kerja per hari: 8 jam (total 40 jam reguler per minggu).
- Pajak: 20% dari gaji kotor (bisa diubah di kode).
- Mata uang: IDR (Rupiah Indonesia).

## Cara Menjalankan
1. Pastikan JDK sudah terinstall (minimal versi 8). Jalankan `java -version` di terminal untuk memeriksa.
2. Kompilasi kode: `javac SalaryCalculator.java`
3. Jalankan program: `java SalaryCalculator`
4. Masukkan input sesuai prompt:
   - Gaji per jam (contoh: 50000)
   - Jam kerja reguler per minggu (contoh: 40)
   - Jam kerja lembur per minggu (contoh: 0)

## Contoh Input dan Output
```
Masukkan gaji per jam: 50000
Masukkan jam kerja reguler dalam seminggu: 40
Masukkan jam kerja lembur dalam seminggu: 0

=== Gaji Mingguan ===
Gaji Per Jam: IDR 50000.00
Jam Kerja Reguler: 40.0
Jam Kerja Lembur: 0.0
Gaji Kotor: IDR 2000000.00
Potongan Pajak (20%): IDR 400000.00
Gaji Bersih: IDR 1600000.00

=== Gaji Bulanan (Asumsi 4 Minggu) ===
Gaji Kotor Bulanan: IDR 8000000.00
Potongan Pajak Bulanan (20%): IDR 1600000.00
Gaji Bersih Bulanan: IDR 6400000.00
```

## Catatan
- Input harus angka desimal (gunakan titik untuk desimal, misalnya 50000.0).
- Jika ada lembur, gaji lembur dihitung dengan faktor 1.5.
- Kode dapat dimodifikasi untuk menyesuaikan pajak atau asumsi lainnya.