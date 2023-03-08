package Cucumber;

public class VirtualPet {
    public class VirtualPet {
        private int jaugeFaim;
        public int getJaugeFaim() {
            return jaugeFaim;
        }
        public void setjaugeFaim(int jaugeFaim) {
            this.jaugeFaim = jaugeFaim;
            System.out.println("Faim : " + this.jaugeFaim);
        }
        public void eat(String food) {
            System.out.println("Je mange " + food);
            setjaugeFaim(100);
        }
    }
}
