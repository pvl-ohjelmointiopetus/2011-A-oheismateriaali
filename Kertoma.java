
public class Kertoma {

	public static void main(String[] args) {

		//Muuttuja johon tulo lasketaan
		int tulo;
		// alustetaan 1 koska se ei vaikuta kertolaskussa ( x * 1 = x )
		tulo = 1;
		
		//kertoo vanhan tulon arvon seuraavalla luvulla, kunnes i on käynyt läpi luvut 1-1000
		for( int laskuri=1; laskuri<=1000; laskuri = laskuri+1 ){
			tulo = tulo*i;
		}
		
		System.out.println("Tuhannen kertoma 1000! on " + tulo);

	}
}
