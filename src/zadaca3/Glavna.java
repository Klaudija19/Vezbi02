package zadaca3;

public class Glavna {
	public static void main(String[]args) {
		Covek c = new Covek();
		c.ime = "Daniel";
		c.prezime = "Ivanovski";
		c.embg = "1411974430010";
		
		System.out.println("Imeto na covekot e:" +c.ime);
		System.out.println("Prezimeto na covekot e:" +c.prezime);
		System.out.println("Covekot ima maticen broj:" +c.embg);
		
	}

}
