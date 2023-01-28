import java.io.FileReader;
import java.io.IOException;
public class MonProgramme {
    public static void main(String[] args) {
        try (FileReader fr = new FileReader("fichierInexistant.txt")){
            char [] a = new char[50];
            fr.read(a);
            for(char c : a)
                System.out.print(c);
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }
}