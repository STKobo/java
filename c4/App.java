package c4;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        saisie_note();
    }

    public static void saisie_note(){
        Scanner sc = new Scanner(System.in);
        System.out.println("entrez le nombre d'eleves : ");
        int nombreEleve = sc.nextInt();

        double sum = 0.0;

        for (int i = 0; i < nombreEleve; i++){
            System.out.println("entrez votre note : ");
            sum = sum + sc.nextFloat();
        }
        double resultat = sum / nombreEleve;

        System.out.println(resultat);
    }
}
