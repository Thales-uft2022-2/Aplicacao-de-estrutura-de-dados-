import java.io.FileReader;
import java.io.IOException;

public class Prog2 {

    public static void main(String[] args) throws IOException {

        FileReader fr = new FileReader("dados.txt");

        int c;

        while ((c = fr.read()) != -1) {
            System.out.print((char) c);
        }

        System.out.println();

        int x = 5;
        System.out.println(x);

        fr.close();
    }
}