package pl.comp.it;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListaZmiana {

	public static void main(String[] args) {

		/*    Działa podchwytliwie niepoprawnie */
		List<Integer> lista = new ArrayList<Integer>() {{
			add(1);
			add(2);
			add(3);
			add(4);
			add(5);
			add(6);
			add(7);
		}};  // średnik musi być

		// Lista size jest wyliczona zawsze dynamicznie przy każdym wywołaniu pętli
		// size list się zmniejsza \
		// program nie usunie wszystkich elementów tylko co drugi, żeby usuwać po kolei elementy
		// trzebaby dodać na końcu i---
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
			lista.remove(i);
		}

//		/*********** działa juz poprawnie  *************   */
		List<Integer> lista1 = new ArrayList<Integer>() {{
			add(1);
			add(2);
			add(3);
			add(4);
			add(5);
			add(6);
			add(7);
		}};  // średnik musi być


		for (int i = 0; i < lista1.size(); i++) {
			System.out.println(lista1.get(i));
			lista1.remove(i);
			i--;                     // jak to dodamy to juz nie bedzie kasowane co drugie
		}

		/*    NIE DZIAłA dla Pętli for Each - kompilator przepusci ale nie zadziała*/
		List<Integer> lista2 = new ArrayList<Integer>() {{
			add(1);
			add(2);
			add(3);
			add(4);
			add(5);
			add(6);
			add(7);
		}};  // średnik musi być

		for (Integer element : lista2) {
			System.out.println(element);
			lista2.remove(element);
			// jak to dodamy to juz nie bedzie kasowane co drugie
		}


		/*    NIE DZIAłA dla Pętli nawet jak działamy na jej indeksie - kompilator przepusci ale nie zadziała*/
		List<Integer> lista3 = new ArrayList<Integer>() {{
			add(1);
			add(2);
			add(3);
			add(4);
			add(5);
			add(6);
			add(7);
		}};  // średnik musi być

		Iterator<Integer> iterator= lista3.iterator();

		while (iterator.hasNext()) {
			Integer elementListy=iterator.next();
			System.out.println(elementListy);
			lista3.remove(elementListy);
			// jak to dodamy to juz nie bedzie kasowane co drugie
		}

		/*    to DZIAła - usuwamy iterator !!!!*/
		List<Integer> lista4 = new ArrayList<Integer>() {{
			add(1);
			add(2);
			add(3);
			add(4);
			add(5);
			add(6);
			add(7);
		}};  // średnik musi być

		Iterator<Integer> iteratorA= lista4.iterator();

		while (iterator.hasNext()) {
			Integer elementLi=iteratorA.next();
			System.out.println(elementLi);
			iteratorA.remove();
			// jak to dodamy to juz nie bedzie kasowane co drugie
		}


	}
}
