import java.util.ArrayList;

public class main {
	public static void main(String[] args) {
		int[][] monTableau = {{1, 2, 3}, {4, 5, 6}};
		for (int[] chiffres : monTableau) {
			for(int chiffre : chiffres) {
				System.out.println(chiffre);
			}
		}
	}
}
