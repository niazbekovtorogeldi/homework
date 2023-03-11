import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
       ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<Integer> arrayList3 = new ArrayList<>();
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            arrayList.add(random.nextInt(1, 100));

            if (arrayList.get(i) % 2 == 1) {
                arrayList2.add(arrayList.get(i));
            } else if (arrayList.get(i) % 2 == 0) {
                arrayList3.add(arrayList.get(i));

            }
        }
        System.out.println("рандом сандар :" + arrayList);
        System.out.println("жуп сан  :" + arrayList3);
        System.out.println("так сан :" + arrayList2);


    }
}