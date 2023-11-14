package personnages;

import java.util.Random;

public class GrandMere extends Humain{

    private final int nbMaxConnaissance = 5;

    public GrandMere(String nom, int argent) {
		super(nom, "tisane", argent);
	}

    public void memoriser(Humain autreHumain) {
		if (nbConnaissance < nbMaxConnaissance) {
			Connaissance[nbConnaissance] = autreHumain;
			nbConnaissance++;
		}
		
		else {
            parler(" Oh ma tête ! Je ne peux plus retenir le nom d'une personne supplémentaire !");
        }
	}

    private enum TypeHumain {
        COMMERCANT("un commercant"), RONIN("un ronin"), SAMOURAI("un samouraï"), TRAITRE("un traître. Petit chenapan !"), YAKUZA("un yakuza"), GRANDMERE("une grand-mère"), HUMAIN("un habitant");
        private String nom;

        private TypeHumain(String nom) {
            this.nom = nom;
        }
        
        @Override
        public String toString() {
            return nom;
        }
    }

    private String humainHasard() {
        Random random = new Random();
        TypeHumain[] types = TypeHumain.values();
        int index = random.nextInt(types.length);
        return types[index].toString();
    }

    public void ragoter(){
        for (int i = 0; i < nbConnaissance; i++) {
            parler("Je crois que "+Connaissance[i].getNom()+" est " + humainHasard());
        }
    }

}
