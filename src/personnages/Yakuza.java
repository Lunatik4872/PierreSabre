package personnages;

public class Yakuza extends Humain {
	private String clan;
	private int reputation = 0;

	public Yakuza(String nom, String boisson_fav, int argent, String clan) {
		super(nom, boisson_fav, argent);
		this.clan = clan;
	}
	
	public void extorquer(Commercant victime) {
		this.gagnerArgent(victime.seFaireExtorquer());
		reputation++;
	}
	
	@Override
	public String toString() {
		String etat = super.toString();
		return "Yakuza "
				+ etat.substring(1,etat.length()-1) + " clan = "+clan+" reputation = "+reputation;
	}
	
	public static void main(String[] args) {
		Yakuza t = new Yakuza("t", "tkt", 10, "ok");
		System.out.println(t);
	}
}
