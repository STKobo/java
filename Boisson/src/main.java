import java.util.Scanner;

public class main {
	public static void main(String[] args) {
	Scanner scannerObject = new Scanner(System.in);
	System.out.println("Quel �ge avez-vous ?");
	
	int age = scannerObject.nextInt();
	if(age < 0) {
	    System.out.println("Saisie incorrecte !");
	}
	else {
		
		
		System.out.println("1. Jus d'orange");
		System.out.println("2. Coca-Cola");
		System.out.println("3. Grenadine");
		System.out.println("4. Whisky");
		System.out.println("Que souhaitez-vous prendre ?");
		
		
		int choixUtilisateur = scannerObject.nextInt();
		switch(choixUtilisateur) {
	    case 1:
			    System.out.println("Boisson di�t�tique, hydratez-vous bien !");
					break;
		case 2:
			    System.out.println("Boisson tr�s sucr�e, � consommer avec mod�ration !");
					break;
		case 3:
					System.out.println("C'est parti pour une boisson rafra�chissante !");
					break;
		case 4:
			    if(age < 18) {
					    System.out.println("D�sol� ! Vous �tes mineur, vous n'y avez pas droit.");
					} else if(age < 60) {
					    System.out.println("Un peu de Whisky... juste un peu, nous sommes d'accord, hein !");
					} else {
					    System.out.println("OK pour un Whisky, mais faites attention, � votre �ge !");
					}
					break;
		default:
			    System.out.println("Choix incorrect");
		  }
		
				scannerObject.close();
			}
		}
	}