package de.dauer.rest.clientService;

public class ModelRest {
	
	private String vorname;
	
	private String nachname;
	
	private String stadt;

	public ModelRest(String vorname, String nachname, String stadt) {
		
		this.vorname = vorname;
		this.nachname = nachname;
		this.stadt = stadt;
	}
	
	public ModelRest() {}

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public String getNachname() {
		return nachname;
	}

	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

	public String getStadt() {
		return stadt;
	}

	public void setStadt(String stadt) {
		this.stadt = stadt;
	}

	@Override
	public String toString() {
		return "GermanPerson [vorname=" + vorname + ", nachname=" + nachname + ", stadt=" + stadt + "]";
	}
	
	
}
