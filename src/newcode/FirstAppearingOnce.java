package newcode;
public class FirstAppearingOnce {
    //字符流中的第一个不重复字符
    char [] hashTable = new char[256];
    StringBuffer s=new StringBuffer();
    //Insert one char from stringstream
    public  void Insert(char ch)
    {   s.append(ch);
        if(hashTable[ch] == 0){
            hashTable[ch] = 1;
        }else {
            hashTable[ch]++;
        }
    }
    //return the first appearence once char in current stringstream
    public char FirstAppearingOnce()
    {
        char[] chars = s.toString().toCharArray();
        for(char a : chars){
            if(hashTable[a] == 1){
                return a;
            }
        }
        return '#';
    }
}
