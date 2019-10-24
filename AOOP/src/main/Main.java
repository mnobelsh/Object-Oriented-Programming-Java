package main;

import java.util.ArrayList;
import java.util.Scanner;

import Penduduk.LanjutUsia;
import Penduduk.UsiaProduktif;

public class Main {
	Scanner scan = new Scanner(System.in);
	ArrayList<LanjutUsia> pendudukLanjutUsia = new ArrayList<>();
	ArrayList<UsiaProduktif> pendudukProduktif = new ArrayList<>();
	LanjutUsia lanjutUsia = new LanjutUsia();
	UsiaProduktif produktif = new UsiaProduktif();
	String namaLengkap="";
	String tempatLahir="";
	String tanggalLahir="";
	String alamat = "";
	
	private void  inputLansia(){
	
		System.out.println("NAMA :");
		namaLengkap = scan.nextLine();
		lanjutUsia.setNamaLengkap(namaLengkap);
		
		System.out.println("TEMPAT LAHIR :");
		tempatLahir = scan.nextLine();
		lanjutUsia.setTempatLahir(tempatLahir);
		
		System.out.println("TANGGAL LAHIR :");
		tanggalLahir=scan.nextLine();
		lanjutUsia.setTanggalLahir(tanggalLahir);
		
		System.out.println("ALAMAT :");
		alamat=scan.nextLine();
		lanjutUsia.setAlamat(alamat);
		
		lanjutUsia.pembuatanKartuLansia();
		
		pendudukLanjutUsia.add(lanjutUsia);
		
	}

	
	private void inputUsiaProduktif(){
		System.out.println("NAMA :");
		namaLengkap = scan.nextLine();
		produktif.setNamaLengkap(namaLengkap);
		
		System.out.println("TEMPAT LAHIR :");
		tempatLahir = scan.nextLine();
		produktif.setTempatLahir(tempatLahir);
		
		System.out.println("TANGGAL LAHIR :");
		tanggalLahir=scan.nextLine();
		produktif.setTanggalLahir(tanggalLahir);
		
		System.out.println("ALAMAT :");
		alamat=scan.nextLine();
		produktif.setAlamat(alamat);
		
		pendudukProduktif.add(produktif);
	}
	private void  inputPenduduk(){
		int choose;
		System.out.println("1. Usia Produktif");
		System.out.println("2. Lansia");
		choose = scan.nextInt();	scan.nextLine();
		if (choose == 1){
			inputUsiaProduktif();
		}else if (choose == 2){
			inputLansia();
		}
	}
	
	private void dataPenduduk(){
		System.out.println("PRODUKTIF");
		if (pendudukProduktif.size()<=0){
			System.out.println("Tidak Ada Data");
		}else{
			for (int i=0;i<pendudukProduktif.size();i++){
				pendudukProduktif.get(i).getDataPenduduk();
				System.out.println();
			}
		}
		System.out.println();
		System.out.println("LANJUT USIA");
		if(pendudukLanjutUsia.size()<=0){
			System.out.println("Tidak Ada Data");
		}else{
			for (int i=0;i<pendudukLanjutUsia.size();i++){
				pendudukLanjutUsia.get(i).getDataPenduduk();
				System.out.println();
			}
		}

	}
	
	private void menu(){
		int input;
		do{
			System.out.println();
			System.out.println("KEPENDUDUKAN");
			System.out.println("===============");
			System.out.println("1. Input Penduduk");
			System.out.println("2. Data Penduduk");
			System.out.println("3. Exit");
			input = scan.nextInt();
			
			switch(input){
				case 1:
					inputPenduduk();
				break;
				
				case 2:
					dataPenduduk();
				break;
				
			}
			
		}while(input!=3);

	}
	
	public Main() {
		menu();
	}
	
	public static void main(String[] args) {
		new Main();
	}
	
}
