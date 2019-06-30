package oldexams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main56 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();
        while (sc.hasNext()){
            arrayList.add(sc.nextInt());
        }
        Integer integer = arrayList.get(arrayList.size() - 1);
        arrayList.remove(arrayList.size() - 1);
        Object[] objects = arrayList.toArray();
        Arrays.sort(objects);
        for(int i = 0 ; i < integer ; i++){
            if(i == integer - 1){
                System.out.println((Integer)objects[i]);
                break;
            }
            System.out.print((Integer)objects[i] + " ");
        }
    }
}
