package Penduduk;

import Interfaces.InterfacePenduduk;

public abstract class Penduduk implements InterfacePenduduk {
	
	private String namaLengkap;
	private String tempatLahir;
	private String tanggalLahir;
	private String alamat;
	private String kodeKTP;
	private int usia;

	public Penduduk(){}
	
	public abstract void getDataPenduduk();

	public String getNamaLengkap() {
		return namaLengkap;
	}

	public void setNamaLengkap(String namaLengkap) {
		this.namaLengkap = namaLengkap;
	}

	public String getTempatLahir() {
		return tempatLahir;
	}

	public void setTempatLahir(String tempatLahir) {
		this.tempatLahir = tempatLahir;
	}

	public String getTanggalLahir() {
		return tanggalLahir;
	}

	public void setTanggalLahir(String tanggalLahir) {
		this.tanggalLahir = tanggalLahir;
	}

	public int getUsia() {
		return usia;
	}

	public void setUsia(int usia) {
		this.usia = usia;
	}
	
	public String getAlamat() {
		return alamat;
	}

	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}

	public String getKodeKTP() {
		return kodeKTP;
	}

	public void setKodeKTP(String kodeKTP) {
		this.kodeKTP = kodeKTP;
	}

	
}
