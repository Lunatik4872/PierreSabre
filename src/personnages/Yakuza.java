package personnages;

public class Yakuza extends Humain {
	private String clan;
	private int reputation = 0;

	public Yakuza(String nom, String boisson_fav, int argent, String clan) {
		super(nom, boisson_fav, argent);
		this.clan = clan;
	}
	
	public void extorquer(Commercant victime) {
		this.parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par la ?");
		this.parler(victime.getNom()+", si tu tiens a la vie donne moi ta bourse !");
		
		if(victime.getArgent() > 0) {
			int voler = victime.seFaireExtorquer();
			this.gagnerArgent(voler);
			reputation++;
			this.parler("J'ai pique les "+voler+" sous de "+victime.getNom()+", ce qui me fait "+this.getArgent()+" sous dans ma poche. Hi ! Hi !");
		}
		else {
			this.parler("Serieux t'as meme pas une piece ...");
		}
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