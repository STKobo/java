import java.util.Scanner;

public class main {
	public static void main(String[] args) {
	Scanner scannerObject = new Scanner(System.in);
	System.out.println("Quel âge avez-vous ?");
	
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
			    System.out.println("Boisson diététique, hydratez-vous bien !");
					break;
		case 2:
			    System.out.println("Boisson très sucrée, à consommer avec modération !");
					break;
		case 3:
					System.out.println("C'est parti pour une boisson rafraîchissante !");
					break;
		case 4:
			    if(age < 18) {
					    System.out.println("Désolé ! Vous êtes mineur, vous n'y avez pas droit.");
					} else if(age < 60) {
					    System.out.println("Un peu de Whisky... juste un peu, nous sommes d'accord, hein !");
					} else {
					    System.out.println("OK pour un Whisky, mais faites attention, à votre âge !");
					}
					break;
		default:
			    System.out.println("Choix incorrect");
		  }
		
				scannerObject.close();
			}
		}
	}