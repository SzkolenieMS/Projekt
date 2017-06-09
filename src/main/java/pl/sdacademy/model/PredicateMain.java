package pl.sdacademy.model;


import java.util.List;
import java.util.ArrayList;

import pl.sdacademy.enums.Miasto;
import pl.sdacademy.enums.Plec;


public class PredicateMain {
	
	

//	public PredicateMain() {
public static void main(String[] args){
	List<Kursant> listaKursantow = new ArrayList<>();
		Kursant pierwszyKur = new Kursant();
		pierwszyKur.setNazwisko("Siebert");
		pierwszyKur.setImie("Siebert");
		pierwszyKur.setWiek(19);
		pierwszyKur.setPlec(Plec.MEZCZYZNA);
		pierwszyKur.setMiasto(Miasto.POZNAN);
		listaKursantow.add(pierwszyKur);
		Kursant dwaKur = new Kursant();
		dwaKur.setNazwisko("Siebert");
		dwaKur.setImie("Ania");
		dwaKur.setWiek(17);
		dwaKur.setPlec(Plec.KOBIETA);
		dwaKur.setMiasto(Miasto.POZNAN);
		listaKursantow.add(dwaKur);
		
		Predykaty predicate = new Predykaty();
		listaKursantow.stream().forEach(System.out::println);
		System.out.println();
		listaKursantow.stream().filter(predicate.jestNieDorosly()).forEach(System.out::println);
		System.out.println();
		listaKursantow.stream().filter(predicate.jestZPoznania()).forEach(System.out::println);
		System.out.println();
		System.out.println("Kobiet w poznaniu");
		System.out.println(listaKursantow.stream().filter(predicate.jestZPoznania().and(predicate.jestKobieta())).count());
		System.out.println();
		System.out.println("Kursantow w poznaniu");
		System.out.println(listaKursantow.stream().filter(predicate.jestZPoznania()).count());
		
//		ile kobiet z poznania+
//		ile jest kursantw w poznaniu
		
	}

}
