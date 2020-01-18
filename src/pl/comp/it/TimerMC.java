package pl.comp.it;

public class TimerMC {


	public static void main(String[] args) {

		/*    ten czas jest dłuższy*/
		long before;
		long after;
		before=System.nanoTime();
		Integer zmiennaglobalna;
		for (int i=0; i<1000_000; i++){
			zmiennaglobalna=5;
		}
		after=System.nanoTime();
		long result1=after-before;
		System.out.println(result1);




		//long after=System.currentTimeMillis();

		/*    ten czas jest krótszy*/
		before=System.nanoTime();
		for (int i=0; i<1000_000; i++){
			Integer zmiennalokalna=5;
		}
		after=System.nanoTime();
		long result2=after-before;
		System.out.println(result2);





	}


}
