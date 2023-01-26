
public class main {
    public static void main(String[] args) {
        CouleurRectangle rectangle = new
                CouleurRectangle(1.5, 3.5, 12.5, 40.5, "Bleu");
        rectangle.afficher();
        System.out.println("-----------------------------------");
        System.out.println("-----------------------------------");
        Cercle cercle = new Cercle(2.5, 4.5, 12.5);
        cercle.afficher();
    }
}
