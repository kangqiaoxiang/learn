package Arrays;

/**
 * Created by Administrator on 2018/4/25.
 */
public class StringCount {
    public int compareTo2(String s1,String s2){
        int len1 = s1.length();
        int len2 = s2.length();
        int len = Math.min(len1,len2);
        char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();
        int i = 0;
        while(i<len){
           if(ch1[i] != ch2[i]){
               return ch1[i] - ch2[i];
           }
        }
        return len1-len2;
    }

}
