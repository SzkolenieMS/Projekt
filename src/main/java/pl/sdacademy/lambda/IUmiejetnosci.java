package pl.sdacademy.lambda;

import pl.sdacademy.lambda.model.Bulka;
import pl.sdacademy.lambda.model.Kanapka;
import pl.sdacademy.lambda.model.Maslo;
import pl.sdacademy.lambda.model.Warzywo;

public interface IUmiejetnosci {

	
	Kanapka zrobKanapke(Bulka bulka, Maslo maslo, Warzywo warzywo);
	
}
