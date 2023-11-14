package personnages;

public class Humain {
	
	private final int nbMaxConnaissance = 3;
	private String nom;
	private String boisson_fav;
	private int argent;
	protected int nbConnaissance = 0;
	protected Humain[] Connaissance = new Humain[nbMaxConnaissance];
	
	public Humain(String nom, String boisson_fav, int argent) {
		super();
		this.nom = nom;
		this.boisson_fav = boisson_fav;
		this.argent = argent;
	}

	public String getNom() {
		return nom;
	}

	public int getArgent() {
		return argent;
	}
	
	public void parler(String texte){
		System.out.println("("+nom+")-"+texte);
	}
	
	public void direBonjour() {
    	parler(toString());
	}
	
	public void boire() {
		parler("Mmmm, un bon verre de "+boisson_fav+"! GLOUPS !");
	}
	
	public void gagnerArgent(int gain){
		argent+=gain;
	}
	
	public void perdreArgent(int perte) {
		argent-=perte;
	}
	
	public void acheter(String bien, int prix) {
		if(prix <= argent) {
			parler("J'ai "+argent+" sous en poche. Je vais pouvoir m'offrir "+bien+" a "+prix+" sous");
			perdreArgent(prix);
		}
		else {
			parler("Je n'ai plus que "+argent+" sous en poche. Je ne peux meme pas m'offrir "+bien+" a "+prix+" sous");
		}
	}
	
	public void repondre (Humain autreHumain) {
		this.direBonjour();
		autreHumain.memoriser(this);
		this.memoriser(autreHumain);
	}
	
	public void memoriser(Humain autreHumain) {
		if (nbConnaissance < nbMaxConnaissance) {
			Connaissance[nbConnaissance] = autreHumain;
			nbConnaissance++;
		}
		
		else {
			Humain[] new_Connaissance = new Humain[nbMaxConnaissance];
			
			for (int i = 1; i < nbMaxConnaissance; i++) {
				new_Connaissance[i-1] = Connaissance[i];
			}
			
			new_Connaissance[nbMaxConnaissance-1] = autreHumain;
			Connaissance = new_Connaissance;
		}
	}
	
	public void faireConnaissanceAvec(Humain autreHumain) {
		this.direBonjour();
		autreHumain.repondre(this);
	}
	
	public void listerConnaissance() {
		if (nbConnaissance == 0){
			parler("Je ne connais personne triste :( !");
		}
		else {
			parler("Je ne connais beaucoup de monde comme : ");
			for (int i = 0; i < nbConnaissance; i++) {
				System.out.print(Connaissance[i].getNom()+" ");
			}
			System.out.println("");
		}			
	}

	@Override
	public String toString() {
		return "Bonjour ! Je m'appelle " + nom + " et j'aime boire du " + boisson_fav;
	}
	
	
}
