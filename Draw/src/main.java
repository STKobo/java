
public class main {
	
	public static void stars(int nbStar) {
		for(int i = 0; i <= nbStar; i++) {
			System.out.print("*");
		}
		System.out.println("");
	}
	
	public static void rectangle(int hauteur, int largeur) {
		for(int i = 0; i < hauteur; i++) {
			  for(int j = 0; j < largeur; j++) {
				  System.out.print("*");
			  }
      
			  System.out.println("");
			}
}
	public static void main(String[] args) {
		rectangle(4, 10);
	}
}
