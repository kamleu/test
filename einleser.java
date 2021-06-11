import java.util.Scanner;   
//Schritt 1: Scanner Klasse verf¸gbar machen

public class Einleser {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); 
		//Schritt 2: Scanner-Objekt erzeugen; warum das so notiert
		//werden muss, kˆnnen wir erst sp‰ter kl‰ren
		
		System.out.println("Ganzzahl eingeben: ");
		//Schritt 3: Benutzer zur Dateneingabe auffordern
		int i;
		i = in.nextInt();
		/* Schritt 4.1: Benutzer gibt Ganzzahl ein
		 * Schritt 4.2: die Methode nextInt des Scanner-Objektes
		 * nimmt die vom Benutzer eingegebene Ganzzahl auf
		 * Schritt 4.3: die aufgenommene Ganzzahl wird der 
		 * Variablen i zugewiesen - damit kann jetzt weitergearbeitet werden...
		 */
		System.out.println("Eingegebene Ganzzahl war: " + i);
		//Kontrollausgabe
	}
}
