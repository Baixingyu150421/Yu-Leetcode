package oldexams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main57 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();
        while (sc.hasNext()){
            arrayList.add(sc.nextInt());
        }
        Object[] objects = arrayList.toArray();
        Arrays.sort(objects);
        int mid = arrayList.size() / 2;
        System.out.println((Integer) objects[mid - 1]);
    }
}
