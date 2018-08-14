package Arrays.leetcode_array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by Administrator on 2018/4/25.
 */
public class NumJewelesInStones {
    public static int numJewelsInStones(String J, String S) {
        if(J.length()>50 || S.length()>50){
            return 0;
        }
        Map<Character,Integer> map = new HashMap<Character,Integer>();
        for(int i = 0;i<J.length();i++){
            if(map.get(J.charAt(i))!= null){
                return 0;
            }
            map.put(J.charAt(i),1);
        }
        int count = 0;
        for(int i = 0;i<S.length();i++){
            if(map.containsKey(S.charAt(i))){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
       String J = "aA";
       String S = "aAAbbbb";
        System.out.println(numJewelsInStones2(J,S));
    }
    /**直接用HashSet存储元素
     * */
    public static int numJewelsInStones2(String J, String S){
        Set set = new HashSet();
        for(char j : J.toCharArray()) set.add(j);
        int count = 0;
        for(char s : S.toCharArray()){
            if(set.contains(s)){
                count ++;
            }
        }
        return count;
    }
}

