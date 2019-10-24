package Penduduk;

import Interfaces.InterfacePenduduk;

public class LanjutUsia extends Penduduk implements InterfacePenduduk {
	private String nomorKartuLansia;
	
	@Override
	public void getDataPenduduk() {
		System.out.println("KODE LANSIA : "+this.getNomorKartuLansia());
		System.out.println("=============================================");
		System.out.println("NAMA LENGKAP : "+this.getNamaLengkap());
		System.out.println("TEMPAT & TANGGAL LAHIR : "+this.getTempatLahir()+", "+this.getTanggalLahir());
		System.out.println("ALAMAT : "+this.getAlamat());
		System.out.println("NO KTP : "+this.getKodeKTP());
		
	}

	@Override
	public void pembuatanKTP() {
		String kodeKTP = "L-KTP" + this.getTanggalLahir();
		this.setKodeKTP(kodeKTP);
	}

	
	@Override
	public void pembuatanKartuLansia() {
		String kodeLansia = "L-123"+this.getTanggalLahir();
		this.nomorKartuLansia = kodeLansia;
	}

	public String getNomorKartuLansia() {
		return nomorKartuLansia;
	}

	
	
	
	
	
}
