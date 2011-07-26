import java.util.Scanner;


public class SuurinJaPienin {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		// käyttäjän syöttämät luvut olivat välillä 1-100 => valitaan luvut siten, etteivät ne näy
		int suurin;
		suurin = 0;
		int pienin;
		pienin = 101;
		int luku;
		luku = 0;
		
		System.out.println("Anna positiivisia kokonaislukuja. Negatiivinen luku lopettaa antamisen.");
		
		// jatketaan niin kauan kun käyttäjä antaa positiivisia lukua
		while(luku >=0){

			// pyydä uusi luku
			luku = input.nextInt();
			
			// jos luku on suurempi kuin suurin luku... 
			if(luku > suurin){
				// uusi suurin luku on tämä luku!
				suurin = luku;
			}
			// ja samoin pienimmälle luvulle
			// tässä on ylimääräinen tarkastus sille, että annettu luku on todella tarpeeksi iso
			if(luku < pienin && luku > 0){
				pienin = luku;
			}

		}
		
		System.out.println("Suurin luku: " + suurin + " ja pienin luku: " + pienin);
	}
}
