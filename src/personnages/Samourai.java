package personnages;

public class Samourai extends Ronin{

    private String seigneur;

    public Samourai(String seigneur,String nom, String boisson_fav, int argent) {
		super(nom, boisson_fav, argent);
        this.seigneur = seigneur;
	}

    public void boire(String boisson) {
        parler("("+getNom()+")-Qu'est-ce que je vais choisir comme boisson ? Tiens je vais prendre du " + boisson);
    }
    
    @Override
	public String toString() {
		String etat = super.toString();
		return etat.substring(0,etat.length()) + "\n("+getNom()+")-Je suis fier de servir le seigneur " + seigneur;
	}
    
}
