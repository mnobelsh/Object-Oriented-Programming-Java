package main;

import Airlines.Airlines;
import Airlines.Garuda;

public class Main {
	public Main() {
		Airlines garuda = new Garuda("Garuda","GA127","GA","Jakarta","Surabaya");
		garuda.showAirlines();
	}
	public static void main(String[] args) {
		new Main();
	}
}
