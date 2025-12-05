package h3;

public class Mensch {
	public String name;
	public int gebJahr;
	public int alter;

	public Mensch() {
		name = "Unbekannt";
		gebJahr = 2025;
		alter = 2025 - gebJahr;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setGebJahr(int a) {
		gebJahr = a;
	}

	public void setAlter() {
		alter = 2025 - gebJahr;
	}

	public String getName() {
		return name;
	}

	public int getGebJahr() {
		return gebJahr;
	}

	public int getAlter() {
		return alter;
	}
}
