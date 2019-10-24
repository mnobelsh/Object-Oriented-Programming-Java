package Penduduk;

import Interfaces.InterfacePenduduk;

public class UsiaProduktif extends Penduduk implements InterfacePenduduk {

	@Override
	public void getDataPenduduk() {
		this.pembuatanKartuLansia();
		System.out.println("=============================================");
		System.out.println("NAMA LENGKAP : "+this.getNamaLengkap());
		System.out.println("TEMPAT & TANGGAL LAHIR : "+this.getTempatLahir()+", "+this.getTanggalLahir());
		System.out.println("ALAMAT : "+this.getAlamat());
		System.out.println("NO KTP : "+this.getKodeKTP());
		
	}
	
	@Override
	public void pembuatanKTP() {
		String kodeKTP = "P-KTP" + this.getTanggalLahir();
		this.setKodeKTP(kodeKTP);
	}

	@Override
	public void pembuatanKartuLansia() {
		
		System.out.println("Penduduk Produktif Tidak Mendapatkan Kartu Lansia");
	}
	
	
}
