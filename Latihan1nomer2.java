import java.util.Scanner;
class Latihan1nomer2{
	static Scanner data = new Scanner (System.in);
	public static void  main(String[] abc){
		int barang_a;
		int barang_b;
		double harga_barang_a;
		double harga_barang_b;
		double total_pembayaran;

	System.out.println("----Menghitung Total Pembayaran----");
	System.out.println("     ");
	
	System.out.print("Masukkan jumlah barang a:");
	barang_a = data.nextInt();
	System.out.print("Masukkan jumlah barang b:");
	barang_b = data.nextInt();
	
	//perhitungan mencari total harga 
	harga_barang_a=(double)barang_a*1000*(1-0.1);
	harga_barang_b=(double)barang_b*2000*(1-0.05);
	total_pembayaran=(double)harga_barang_a+harga_barang_b;
	
	System.out.println("Harga barang a: " +harga_barang_a + "rupiah");
	System.out.println("Harga barang b: " +harga_barang_b + "rupiah");
	System.out.println("Total Pembayaran: " +total_pembayaran + "rupiah");
	}
}