package pl.sdacademy.produkty;

import java.util.function.Predicate;

public interface IProdukt {
	

	public <T> Produkt znajdzProdukt(Predicate<T> predicate, Produkt[] listaProduktow);

}
