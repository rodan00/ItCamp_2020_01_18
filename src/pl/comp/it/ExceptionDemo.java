package pl.comp.it;

public class ExceptionDemo {


	public static void main(String[] args) {

		int[] a = new int[4];

		try {
			a[10] = 5;
			System.out.println("to sie nie wyswietli w czasie błędu");
		}
		catch(ArrayIndexOutOfBoundsException wyjatek){
				//System.out.println(" Obsługa wyjątków -index ");
			//wyświetlamy komunikat na czerwono SUPER

			System.err.println(" Obsługa wyjątków -index ");
			System.out.println(wyjatek.getMessage());
			wyjatek.printStackTrace();
					}
		catch(NullPointerException e){
			     System.out.println(" Obsługa wyjątków- Null");
		}
	finally {
			System.out.println("Dzieje się zawsze niezaleznie od try i catch");
			//odpala sie zawsze niezaleznie od tego
		}
		metoda ();

		try{
			metoda();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("zepsuło się");
		}
	}

	private static void metoda() {

		Object a = null;
		a.hashCode();
	}

	public static void metoda2() throws InterruptedException {
				Thread.sleep(2000);
		}

}

