import java.util.Scanner;

public class Main41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String next = sc.next();
        int [] hashtable = new int[26];
        for(int i = 0 ; i < next.length() ; i++){
            hashtable[next.charAt(i) - 'a']++;
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < hashtable.length ;i++){
            if(hashtable[i] == 0) continue;
            else {
                sb.append((char)'a' + i).append(hashtable[i]);
            }
        }
        System.out.println(sb.toString());
    }
}
