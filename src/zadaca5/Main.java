package zadaca5;

public class Main {

	public static void main(String[] args) {
		//Instanca za objekt1 so default konstruktor
		Predmet obj1 = new Predmet ();				
		//Instanca za objekt2 so dinamicki konstruktor
		Predmet obj2 = new Predmet ("Napredno programiranje");
		//Instanca za objekt3 so drugiot dinamicki konstruktor
		Predmet obj3 = new Predmet ("Veb tehnologii", "Zoran Kotevski", 6);
		
		//Zadavanje vrednosti na atributite na objektot1
		obj1.ime = "Matematika 2";
		obj1.profesor = "Sonja Manchevska";
		obj1.krediti = 6;
		obj1.semestar = "II";
		
		//Pecatenje na atributite na trite objekti
		System.out.println(obj1.ime + " " + obj1.profesor + " " + obj1.krediti + " " + obj1.semestar);
		System.out.println(obj2.ime);
		System.out.println(obj3.ime + " " + obj3.profesor + " " + obj3.krediti);
	}
}

