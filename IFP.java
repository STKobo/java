public class IFP {
    @FunctionalInterface 
    interface Carre {
        int calculer(int x);
    }
    public static void main(String[] args) {
        int nombre = 10;
        Carre expression = (int x) -> x * x;
        int carre = expression.calculer(nombre);
        System.out.println(carre);
    }
}
