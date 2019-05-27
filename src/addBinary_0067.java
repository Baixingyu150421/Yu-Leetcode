public class addBinary_0067 {
    public static void main(String[] args) {
        String s = addBinary("11", "1");
        System.out.println(s);
    }
    public static String addBinary(String a, String b) {
        StringBuilder builder = new StringBuilder();
        if(a.length() > b.length()){
            int i = a.length() - b.length();
            while (i > 0){
                builder.append(0);
                i--;
            }
            String s = builder.append(b).toString();
            char[] chars = a.toCharArray();
            for(int j = s.length() - 1 ; j >= 0 ; j--  ){
                if(a.charAt(j) == s.charAt(j) && a.charAt(j) == '0'){
                    continue;
                }else if(a.charAt(j) != s.charAt(j)){
                    if(chars[j] == 2){
                        chars[j] = '0';
                        chars[j - 1] += 1;
                    }
                    chars[j] = '1';
                }else {
                    chars[j] = '0';
                    chars[j - 1] += 1;
                }
            }
            return String.valueOf(chars);

        }else if(a.length() < b.length()){
            int i = b.length() - a.length();
            while (i >=0){
                builder.append(0);
                i--;
            }
            String s1 = builder.append(a).toString();
            char[] chars = a.toCharArray();
            for(int j = s1.length() - 1 ; j >= 0 ; j--  ){
                if(b.charAt(j) == s1.charAt(j) && b.charAt(j) == '0'){
                    continue;
                }else if(a.charAt(j) != s1.charAt(j)){
                    if(chars[j] == 2 ){
                        chars[j] = '0';
                        chars[j - 1] += 1;
                    }
                    chars[j] = '1';
                }else {
                    chars[j] = '0';
                    chars[j - 1] += 1;
                }
            }
            return String.valueOf(chars);
        }
        char[] chars = b.toCharArray();
        for(int j = b.length() - 1 ; j >= 0 ; j-- ){
            if(a.charAt(j) == b.charAt(j) && a.charAt(j) == '0'){
                continue;
            }else if(a.charAt(j) != b.charAt(j)){
                if(a.charAt(j) == 2){
                    chars[j] = '0';
                    chars[j - 1] += 1;
                }
                chars[j] = '1';
            }else {
                chars[j] = '0';
                chars[j - 1] += 1;
            }
        }
        return String.valueOf(chars);
    }
}
