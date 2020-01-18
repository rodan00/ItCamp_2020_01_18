package pl.comp.it;

public abstract class Abstrakta {

	// Może posiadac abstrakcyjne metody
/*
* Może miec metody konkretne
* Może mieć konstruktor
*
* pola w klasie abstrakcyjnej są różne
*
*
* */
	// pomimo ze jest konstruktor to nie mozna go użyć żeby stworzyć
	// egzemplarza. Ale on się przyda po to żeby inna klasa która
	// dziedziczy po klasie abstrakcyjne która implementuje wszystkie
	// metody klasy abstrakcyjnej mogła wystartować

	Abstrakta(){
		System.out.println("konstuuje");
	};

static final int a=7;
			int b=10;


	abstract void metodaAbstrakcyjna();

/*
* Interface posiada tylko definicje abstrakcyjne to tylko umowa
* klasa abstrakcyjna to mieszanka klasy obstrakcyjnej oraz interfacu
* KA jest czymś pomiędzy klasą a interfacem
* KA to klasa czyli mozna po niej dzidziczyć, ale TYLKO PO NIEJ
* INT Można pdopinać do jednej klasy kilka interfaców
*
* Klasa podpięta od dwóch intefejsów spełnia dwie umowty
* W INT nie dochodzi (ło) do sytuacji w których nie woadomo było co robić.
*
*
*
* */

}
