package iteratorList;
import java.util.*;

public class ListMix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Attributes
		
		List<Iterator>itList=new ArrayList();
		List<Iterator>listIt=new ArrayList();
		Scanner uN = new Scanner(System.in);
		int userNumber;
		boolean completList=true;
		int userOption;
		
		//Main Code
		
		while (!completList) {
			
			System.out.println("Introdueix una opció:"
					+ "\n 1.Afegir un número a la primera llista (no pots afegir més de 10 números)."
					+ "\n 2.Afegir un número a la segona llista (no pots afegir més de 10 números)."
					+ "\n 3.Fussionar les dues llistes."
					+ "\n 4.Sortir.");
			userOption=uN.nextInt();
			switch(userOption) {
			case 1:
				try {
					System.out.println("Introdueix un número aleatori:");
					userNumber=uN.nextInt();
					itList.add(uN);
					if(itList.size()==10) {
						completList=true;
					}
					else {
						System.out.println("Has afegit: "+itList.size());
					}
					userOption=0;
					break;
				}
				catch(InputMismatchException ex){
					System.out.println("Ups! Això que has introduït no és un número, torna-ho a probar.");
					userOption=0;
					break;
				}
			case 2:
				try {
					System.out.println("Introdueix un número aleatori:");
					userNumber=uN.nextInt();
					listIt.add(uN);
					if(listIt.size()==10) {
						completList=true;
					}
					else {
						System.out.println("Has afegit: "+listIt.size());
					}
					userOption=0;
					break;
				}
				catch(InputMismatchException ex){
					System.out.println("Ups! Això que has introduït no és un número, torna-ho a probar.");
					userOption=0;
					break;
				}
			}
			
		}
		
	}
	


}
