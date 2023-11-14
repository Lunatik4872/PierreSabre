package histoire;

import personnages.Commercant;
import personnages.GrandMere;
import personnages.Ronin;
import personnages.Samourai;
import personnages.Traitre;
import personnages.Yakuza;

public class HistoireTP5 {

	public static void main(String[] args) {
		Commercant marco = new Commercant("Marco", "the", 20);
		Commercant chonin = new Commercant("Chonin", "the",40);
		Commercant kumi = new Commercant("Kumi", "the",10);
		Yakuza yaku = new Yakuza("Yaku Le Noir", "whisky", 30, "Warsong");
		Ronin roro = new Ronin("Roro", "shochu", 60);
		Samourai akimoto = new Samourai("Miyamoto", "Akimoto", "sake", 80);
		Traitre masako = new Traitre("Miyamoto", "Masako", "whisky", 100);
		GrandMere grandMere = new GrandMere("Grand-Mère", 10);

		// marco.faireConnaissanceAvec(roro);
		// marco.faireConnaissanceAvec(yaku);
		// marco.faireConnaissanceAvec(chonin);
		// marco.faireConnaissanceAvec(kumi);
	
		// marco.listerConnaissance();
		// roro.listerConnaissance();
		// yaku.listerConnaissance();
		
		//yaku.direBonjour();
		// roro.direBonjour();
		// chonin.direBonjour();
		//masako.direBonjour();
		
		// akimoto.faireConnaissanceAvec(marco);
		// marco.listerConnaissance();
		// akimoto.boire("thé");

		// masako.faireLeGentil();
		// masako.ranconner(kumi);
		// masako.ranconner(chonin);
		// masako.ranconner(marco);
		// akimoto.faireConnaissanceAvec(masako);
		// masako.ranconner(kumi);
		// masako.faireConnaissanceAvec(yaku);
		// masako.faireLeGentil();
		// masako.faireConnaissanceAvec(roro);

		grandMere.faireConnaissanceAvec(akimoto);
		grandMere.faireConnaissanceAvec(yaku);
		grandMere.faireConnaissanceAvec(masako);
		grandMere.faireConnaissanceAvec(kumi);
		grandMere.faireConnaissanceAvec(marco);
		grandMere.faireConnaissanceAvec(chonin);
		grandMere.ragoter();

	}

}
