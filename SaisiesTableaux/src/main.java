import java.util.Arrays;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] people = new int[15];
        int age;
        
        System.out.println("Ins�rer les donn�es : ");
        for (int i = 0; i < people.length; i++) {
            age = scan.nextInt();
            if (i != 0) {
                for (int j = i; j > 0; j--) {
                    people[j] = Math.max(people[j - 1], age);
                    if (people[j] == age) {
                        break;
                    } else if (j - 1 == 0) {
                        people[j - 1] = age;
                        break;
                    }
                }
            } else {
                people[i] = age;
            }
        }
        System.out.println("Les donn�es : " + Arrays.toString(people));
        scan.close();
    }
}