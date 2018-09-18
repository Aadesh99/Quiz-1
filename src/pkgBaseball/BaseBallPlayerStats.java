package pkgBaseball;

import java.util.Scanner;

public class BaseBallPlayerStats {
	private String name;
	private int AB;
	private int H;
	private int Btwo;
	private int Bthree;
	private int HR;
	private int R;
	private int BB;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAB() {
		return AB;
	}

	public void setAB(int aB) {
		AB = aB;
	}

	public int getH() {
		return H;
	}

	public void setH(int h) {
		H = h;
	}

	public int getBtwo() {
		return Btwo;
	}

	public void setBtwo(int btwo) {
		Btwo = btwo;
	}

	public int getBthree() {
		return Bthree;
	}

	public void setBthree(int bthree) {
		Bthree = bthree;
	}

	public int getHR() {
		return HR;
	}

	public void setHR(int hR) {
		HR = hR;
	}

	public int getR() {
		return R;
	}

	public void setR(int r) {
		R = r;
	}

	public int getBB() {
		return BB;
	}

	public void setBB(int bB) {
		BB = bB;
	}
	
	public double BA() {
		double BA = ((H) / AB);
		return BA; 
	}

	public double OBP() {

		double OBP=(((H) + BB) / (AB + BB));
		return OBP;

	}

	public double SLG() {

		double SLG = (H + 2 * Btwo + 3 * Bthree + 4 * HR) / AB;
		return SLG;

	}

	public double OBS() {

		double OBS = (OBP() + SLG());
		return OBS;
		

	}

	public double TB() {

		double TB =((HR * 4) + (Bthree * 3) + (Btwo * 2) + (H - Btwo - Bthree - HR));
		return TB;
	}
	
}

