package pl.comp.it.Mapy;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {

		Map<String, Tranlation> mapa = new HashMap<>();


		// nie mogę trzymać po dwie wartości

//		mapa.put("pies", "dog");
//		mapa.put("kot", "cat");

		Tranlation pies = new Tranlation("chien","Dog");
		// Tranlation pies = new Tranlation("chien","Dog","28-11-2020");

		mapa.put("pies",pies);
		mapa.put(pies.english,pies);
		mapa.put(pies.french,pies);
	// do kluczy mogę wrzucać pola obiektu który jest wartością



		System.out.println(mapa.get("pies")); // to daje nuu


		mapa.remove("dog");
		//Set<Map.Entry<String, Translation>> wszystkiewpisy =mapa.entrySet();



		// Jak jest hascode ale nie ma obiektu to zwraca nulla

		// każda konfigurtacja aplikacji to klucz wartość gdzie wartość to kilka pól różnych
		}

		// Entry to nazwa klasy wewnętrznej klasy Map
		// nie może istniec entry bez mapy i dlatego Entry jest podklasą Mapy



	/*
	*
	* Entry to para
	* Mapa to zbiór par (klucz Value)
	*
	* Iterator i Map.entry nie domyślą się co do typów - trzeba im to podać
	*
	*
	* */

}
