package newcode;

import java.util.LinkedList;

public class yueSefuHuan {
    //n个人  每次报数报到m
    public int LastRemaining_Solution(int n, int m) {
        LinkedList<Integer> list = new LinkedList<>();
        for(int i = 0 ; i < n ; i ++){
            list.add(i);
        }
        int index = 0;
        while (list.size() > 1){
            index = (index +  m - 1 ) %  list.size();
            list.remove(index);
        }
        return list.size() == 1 ? list.get(0) : -1;
    }
}
