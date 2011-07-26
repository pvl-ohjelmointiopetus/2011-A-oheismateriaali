
public class Funktio {

	// pŠŠohjelma
	public static void main(String[] args) {

		double[] table;
		table = new double[10];

		for(int laskuri=2; laskuri < 12; laskuri = laskuri + 1;) {
			// lisŠtŠŠn taulukkoon funktion arvo piseessŠ x...
			table[i] = funktio( laskuri );
		}
		
		for (double v : laskuri) {
			System.out.println( v );
		}
	}

	// funktio f(x) = x^2 / 2 toteuttuna javalla
	public static double funktio(double x){
		return x*x/2;
	}

}

//Ohjelma tulostaa funktion arvot kohdissa 2-11
