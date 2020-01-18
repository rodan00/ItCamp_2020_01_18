package pl.comp.it;

public interface MojInterfejs {

	     // zmienne muszą być final - i domyślnie są final
		// nie da się innych zmiennych tu trzymać
		// iInterface może dla nas idealnie trzymać stałe
		// interface nie moze mieć kostruktora

	// wszstkie metody bez ciała są domyślnie abstrakcyjne
	//


	int a=11;
	String napis= "abcd";

	 void abc ();
	public void mojaMetoda();


// nie zadziala bo nie mozna mieć tu zwykłych metod
//	void metoda1(){
//		System.out.println();
//	}

	default void metoda2(){
		System.out.println();
	}


	// jak przesłonie



}
