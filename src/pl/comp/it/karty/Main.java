package pl.comp.it.karty;

public class Main {

	public static void main(String[] args) {

		Talia mojaTalia = new Talia();
		// słaba asercja - dwie rónoległe kalsy użytkujące siebie nawzajem
		// muszę posiadać egzemplarz klasy Talia żeby móc utowrzyć klasę Karta !!!
		// silna asercja nikt inny poza klasą Talia nie jest w stanie wykorzystać
		// obiektu Talia. Jak obiekt Talia lub klasa Talia zginie to nie ma
		// żadnego obiketu klasy Talia

		// Odwołanie do
		Talia.Karta karta1= mojaTalia.new Karta();

		// to jest rzadko uzywane bo żadko chcemy tak nierozerwalnie
		// na zasadzie niewolnictwa powiązać jedną klasę z drugą

		// Ogólnie nie mogliśmy

		// odwołanie do klasy wewnętrznej static !!!
		Talia.Karta2 karta2= new Talia.Karta2();
	}


}
