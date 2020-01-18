package pl.comp.it.Set;

import java.util.Iterator;
import java.util.Set;
import java.util.HashSet;
public class Main {

	public static void main(String[] args) {

		Set <String> zbior = new HashSet<>();
			zbior.add("a");
			zbior.add("y");
			zbior.add("x");
			zbior.add("b");
			zbior.add("m");

			zbior.add("b");   // tego elementu nie doda tylko go zignoruje
			// porównuje po wartościach czyli po equals i dobrze bo

		// equals działa tylko na obiektach
		// na typach prostych nie możemy tego wywołać
		// Wyjątkowo pomimo że String jest obiektem to ma przeciazony equals i porównuje po wartości
		// wyjątkowo przy Stringu
		// W typach obiektowych equals porównuje po referencjach


		// Jeżeli chcemy
		// Jest obiekt iteratr

		//  Iterator <String> i = zbior.iterator();
		 Iterator  i = zbior.iterator();         // iterator działa niezależnie
		// Iterator działa domyślnie ja nadklasya wszystkicj obiektów i nie opiera się na typie
		// zbioru tylo przez referencje pobiera obiekty
		/* ponieważ przypisujemy do zmiennej element obiekt typu object to powstanie błąd i dlatego
		 * muszę zrzutowac obiekt na String przez (String).
		 * Żeby się pozbyć rzutowania w czasie podstawienia mozna powiedziec już iteratorowi:
		  Iterator <String> i = zbior.iterator();
		  że dostanie od razu elementy zbioru String
		 *
		 * */

		while (i.hasNext()){
			String element  = (String) i.next();
			System.out.println(element);

//
		// entrySet daje Klucz i Wartość czyli klucz jest przechowywany


		}
	}


}
