import java.util.ArrayList;

public class prog1 {

    public static void main(String[] args) {

        int[] v = new int[3];

        v[0] = 1;
        v[1] = 10;
        v[2] = 40;


        ArrayList<Integer> v2 = new ArrayList<>();

        v2.add(1);
        v2.add(10);
        v2.add(40);


        System.out.println("Vetor:");
        for (int i = 0; i < v.length; i++) {
            System.out.println(v[i]);
        }


        System.out.println("ArrayList:");
        for (int i = 0; i < v2.size(); i++) {
            System.out.println(v2.get(i));
        }
    }
}