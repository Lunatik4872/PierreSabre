package personnages;

public class Traitre extends Samourai{

    private int treachery = 0;

    public Traitre(String seigneur,String nom, String boisson_fav, int argent){
        super(seigneur,nom, boisson_fav, argent);
    }

    public void ranconner(Commercant commercant){
        if(treachery < 3){
            int argentComercant = commercant.getArgent();
            int argentRanconner = (argentComercant*2)/10;
            commercant.perdreArgent(argentRanconner);
            this.gagnerArgent(argentRanconner);
            treachery++;
            parler("Si tu veux ma protection contre les Yakuzas, il va falloir payer ! Donne-moi "+ argentRanconner +" sous ou gare à toi !");
            commercant.parler("Tout de suite grand "+getNom()+".");
        }
        else{
            parler("Mince je ne peux plus rançonner personne sinon un samouraï risque de me démasquer !");
        }
    }

    public void faireLeGentil(){
        if(nbConnaissance< 1){
            parler(" Je ne peux faire ami ami avec personne car je ne connais personne ! Snif");
        }
        else{
            int don = getArgent()/20;
            int randomIndex = (int) (Math.random() * nbConnaissance);
            Humain ami = Connaissance[randomIndex];

            parler("Il faut absolument remonter ma cote de confiance. Je vais faire ami ami avec "+ami.getNom()+".");
            parler("Bonjour l'ami ! Je voudrais vous aider en vous donnant "+ don +" sous.");
            ami.gagnerArgent(don);
            perdreArgent(don);
            ami.parler("Merci "+ getNom() +". Vous êtes quelqu'un de bien.\r");

            if (treachery > 0) {
                treachery--;
            }

        }
    }

    @Override
	public String toString() {
		String etat = super.toString();
		return etat.substring(0,etat.length()) + "\n("+getNom()+")-Mais je suis un traître et mon niveau de traîtrise est : "+treachery+". Chut !";
    }
}
