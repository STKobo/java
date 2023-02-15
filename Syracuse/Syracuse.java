package Syracuse;

import java.util.Scanner;

public class Syracuse {

    public static void main( String[] args){

    }

    public static void syracuse(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez votre entier : ");
        int entier = sc.nextInt();
        int compteur = 0;
        int compteurHautSaut = 0;
        int compteurHautSautTmp = 0;

        if(entier == 1 || entier <= 0){
            System.out.println("compteur : 0");
        } else {
            while(entier != 1){
                compteur++;

                if(entier >= 10){
                    compteurHautSautTmp ++;
                } else {
                    if(compteurHautSautTmp > compteurHautSaut) {
                        compteurHautSaut = compteurHautSautTmp;
                    }
                }

                if(entier % 2 == 0){
                    entier = entier / 2;
                } else {
                    entier = 3*entier+1;
                }
            }
            System.out.println("le compteur est : " + compteur + " celui des hauts sauts est : " + compteurHautSaut);
        }
    }
}
