package pl.sdacademy.lambda;

import java.util.function.Predicate;

import pl.sdacademy.lambda.model.Bulka;
import pl.sdacademy.lambda.model.Jedzenie;
import pl.sdacademy.lambda.model.Kanapka;
import pl.sdacademy.lambda.model.Maslo;
import pl.sdacademy.lambda.model.Warzywo;

public class Main {

	public static void main(String[] args) {
		
		Bulka kajzerka = new Bulka("Kajzerka");
//		kajzerka.setSkladniki("");
		Maslo extra = new Maslo("Extra");
//		extra.setSkladniki("");
		Warzywo pomidor = new Warzywo("Pomidor");
//		pomidor.setSkladniki("");
		
		IUmiejetnosci panKanapka = new IUmiejetnosci() {

			@Override
			public Kanapka zrobKanapke(Bulka bulka, Maslo maslo, Warzywo warzywo) {
				String elementyKanapki = bulka.getNazwa() + " "+ maslo.getNazwa()+ " " + warzywo.getNazwa();
				Kanapka kanapka = new Kanapka("Bulka z pomidorem");
				kanapka.setSkladniki(elementyKanapki);
				return kanapka;
			}
		};
		Kanapka bulkaZPomidorem = panKanapka.zrobKanapke(kajzerka, extra, pomidor);
//		System.out.println(bulkaZPomidorem);
		
		IUmiejetnosci umiejetnosciPaniJadzi = (bulka,maslo,warzywo) -> {return new Kanapka("");};
		Kanapka jesiennaKanapka = umiejetnosciPaniJadzi.zrobKanapke(kajzerka, extra, pomidor);
//		System.out.println("Pani jadzia zrobi kanapke taka ze : " + jesiennaKanapka);
		
		IUmiejetnosci umiejetnsciPanaFranka = (bulka,maslo,warzywo) -> { 
			Kanapka kanapka = new Kanapka("studencka");
			kanapka.setSkladniki(bulka +""+ maslo);
			return kanapka;
		};
		
		Kanapka zimowaKanapka = umiejetnsciPanaFranka.zrobKanapke(kajzerka, extra,null);
//		System.out.println("Pan franek" + zimowaKanapka);
		
		Predicate<Jedzenie> posiadaMasloExtra = (maslo) -> {
			return maslo.getNazwa().equalsIgnoreCase("Extra") || maslo.getSkladniki().contains("Extra");
		};
		
		Jedzenie[] skladniory = new Jedzenie[]{kajzerka,extra,pomidor,zimowaKanapka};
		
		for (int i = 0; i < skladniory.length; i++) {
				if (posiadaMasloExtra.test(skladniory[i])){
				System.out.println("Posiada maslo");
				}
				System.out.println("test");
		}
		
		
	}

}