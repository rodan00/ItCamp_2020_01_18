package pl.comp.it.listy;

import java.util.ArrayList;
import java.util.List;

public class Main {


	public static void main(String[] args) {

		/*
		* wiemy że ArrayList zawiera się w LISt
		* */
		//ArrayList<String> lista= new ArrayList() - działa ale nie mamy mozliwości zmienić tego na LinkListe
		// Lista jest interfacem dla klas LinkList i ArrayList więc lepiej implementować interfejs i na nim bazować
		// bo może zamienić LinkListę na ArrayListę - GENIALNY
		// KLASYU AL i LL maja te same funkcjonalnosci i dlatego posługująć się zmienną interfacową

		// LEPIEJ UZYWAć Zmiennych Interfacowych i zbierać obiekty do interfacoowych
		// bo jest to ogólniejsze sposób i możemy podstawiać rózne klasy implementujące
		//

		/*
		aplikacji okienkowych się już nie pisze bo to działa tylko na danym komputerze
				i teraz pisze się aplikacje wyświetlane w przeglądarce bo taki jest trend klientów
		*/
		List<String> lista= new ArrayList();

		cos1(lista);
		cos2(lista);
		cos3(lista);


		System.out.println("xx");
		// out -  Strumień danych PrintStream przekierowany na
		// out StreamPrint to skłasowa klasy System   - strumień danych

			// alias to nazwa zastępcza
		/*
		Arreylista ni obsłuży typów prostych bo one nie są w referencjach do zmiennej tylko są
		typami zmiennymi i jak jestem w stanie opakowanie było typem obiektowym czyli przez referencję
		w zmiennych (moja strona dziesie
			Kalsa Integer która ma gettera i setara
			*/

		// List<int>     to nie zadziała

			Integer a=3;
		// ^ to jest uproszczenie zapisu poniżej podobnie ja w stringach
		Integer aa= new Integer(3);
			// to jest uproszczenie

			Integer b=4;
			int c=5;
			System.out.println(a+b);    // obiekty
			System.out.println(a+b+c);

			Integer.parseInt("5");   // zamienia stringa na typ prost

		List<Integer> mojalist = new ArrayList<>();
		// i to załatwia sprawę z uzywaniem typów porstych w ArrayList i LinkList
		mojalist.add(5);
		// to jest poprawne teraz bo AL jest teraz zdefiniowana jako <Integer>
		//

		// Kolek


	}

/*
	public static void cos1(ArrayList<String> lista){
		//
	};

	public static void cos2(ArrayList<String> lista){
		//
	};

	public static void cos3(ArrayList<String> lista){
		//
	};

*/

	public static void cos1(List<String> lista){
		//
	};

	public static void cos2(List<String> lista){
		//
	};

	public static void cos3(List<String> lista){
		//
	};


}
