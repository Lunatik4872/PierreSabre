package histoire;

import personnages.Commercant;
import personnages.Humain;
import personnages.Ronin;
import personnages.Yakuza;

public class HistoireTP4 {
	public static void main(String[] args) {
		Humain prof = new Humain("Prof", "kombucha", 54);
		Commercant marco = new Commercant("Marco", "the", 15);
		Yakuza yln = new Yakuza("Yaku Le Noir", "whisky", 45, "Benarlermite");
		Ronin roro = new Ronin("Roro", "shochu", 10);
		
//		prof.direBonjour();
//		prof.acheter("une boisson", 12);
//		prof.boire();
//		prof.acheter("un jeu", 2);
//		prof.acheter("un kimono", 50);
		
//		marco.direBonjour();
//		marco.seFaireExtorquer();
//		marco.recevoir(15);
//		marco.boire();
		
//		yln.direBonjour();
//		yln.extorquer(marco);
		
//		roro.direBonjour();
//		roro.donner(marco);
//		roro.donner(marco);
		
		roro.provoquer(yln);
		System.out.println(roro.getArgent());
		System.out.println(yln.getArgent());

	}

}
