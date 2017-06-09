package pl.sdacademy.model;

import java.util.function.Predicate;

import pl.sdacademy.enums.Miasto;
import pl.sdacademy.enums.Plec;

public class Predykaty {
	public static int WIEK_PELNOLETNOSCI = 18;

	public Predicate<Kursant> jestDorosly (){
		return kursant -> kursant.getWiek() >= WIEK_PELNOLETNOSCI;
	}

	public Predicate<Kursant> jestNieDorosly (){
		return kursant -> kursant.getWiek() < WIEK_PELNOLETNOSCI;
	}
	
	public Predicate<Kursant> jestPlci(Plec plec){
		return kursant -> kursant.getPlec().equals(plec);
	}
	
	public Predicate<Kursant> jestZMiasta(Miasto miasto){
		return kursant -> kursant.getMiasto().equals(miasto);
	}
	
	public Predicate<Kursant> jestZPoznania(){
		return kursant -> kursant.getMiasto().equals(Miasto.POZNAN);
	}
	
	public Predicate<Kursant> jestMezczyzna() {
		return kursant -> kursant.getPlec().equals(Plec.MEZCZYZNA);		
	}

	public Predicate<Kursant> jestKobieta() {
		return jestPlci(Plec.KOBIETA);
	}
	
	public Predicate<Kursant> jestDoroslaKobieta(){
		return jestDorosly().and(jestKobieta());
	}
	

}
