package m326;

public class Konto {

	private String kontoTyp;
	private Integer kontoNummer;
	private Float kontoStand;
	private Float kreditRahmen;
	
	public void eroeffnen() {
		
	}
	public void einzahlen(Float betrag) {
		
	}
	public void aufloesen() {
		
	}
	public void abheben(Float betrag) {
		
	}
	public void kontoStandaendern(Float betrag) {
		
	}
	public Boolean guthabenPruefen(Float betrag) {
		return null;
	}
	public String getKontoTyp() {
		return kontoTyp;
	}
	public void setKontoTyp(String kontoTyp) {
		this.kontoTyp = kontoTyp;
	}
	public Integer getKontoNummer() {
		return kontoNummer;
	}
	public void setKontoNummer(Integer kontoNummer) {
		this.kontoNummer = kontoNummer;
	}
	public Float getKontoStand() {
		return kontoStand;
	}
	public void setKontoStand(Float kontoStand) {
		this.kontoStand = kontoStand;
	}
	public Float getKreditRahmen() {
		return kreditRahmen;
	}
	public void setKreditRahmen(Float kreditRahmen) {
		this.kreditRahmen = kreditRahmen;
	}
}
