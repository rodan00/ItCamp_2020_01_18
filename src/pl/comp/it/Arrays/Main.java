package pl.comp.it.Arrays;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		ArrayList lista=new ArrayList();
		lista.add(8734);
		System.out.println(lista.size());

		lista.add("abc");
		lista.add("abc");
		lista.remove("abc");   // usówa tylko pierwszy napotkany

		// usuwa jeden pierwszy napotkany
		// String pool w javie wykorzystywane są stringi juz istniejące i tworzone

		System.out.println(lista.get(0));

		lista.remove(0);
		System.out.println(lista.size());

		ArrayList list1=new ArrayList();
				list1.add("a");
				list1.add("b");
				list1.add("c");
				list1.add("d");
				list1.add("f");
				list1.add("f");

	ArrayList tab=new ArrayList();
	tab.add( new ArrayList());
	tab.add( "ABC");
	tab.add(345);

	String t1 =(String) tab.get(0);
	Object t2 = tab.get(2);

	// typy generyczne to typ to dowolny za który mogę coś podstawić
		// tu mogę wrzucać tylko stringi
		ArrayList<String> tString=new ArrayList();
		tString.add( "ABC");
		String tString1 =(String) tString.get(0);

		// definicja tablicy dwuwymiarowej na razie
		ArrayList<String> tablica2D=new ArrayList<String>();
		// < string>  powyże jest nieistotny
		ArrayList<String> tablica2DD=new ArrayList();
		// ale koledzy programiści zostawiają <>
		ArrayList<String> tablica2DDD=new ArrayList<>();

		// przy przekazywaniu do tablicy powinniśmy typować na ten sam typ
		// bo jest ryzyko że będzie nie

		// LinkedList() = działa tak samo jak Arraylist jeżeli chodzi o sposób uzycia
		// mają takie same metody i funkcjonalność ale są szczegóły techniczne

		// skompiluje się ale przy wykonaniu będzie Exception ponieważ nie ma tego elementu to nie zadziala
//		tablica2D.get(6).get(6);
/*
* Podsumowanie ArrayList i LinkList:
* metody add, get, remowe i jest indeksowane
*
* */


		ArrayList<ArrayList<ArrayList>> tablica3D=new ArrayList();

	}

}
