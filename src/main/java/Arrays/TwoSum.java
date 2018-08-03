package Arrays;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2018/4/25.
 */
public class TwoSum {
    /**改变选择排序的方式，通过HashMap的哈希表的方式来进行，
     * 将时间复杂度从O(n2)降为O(n)
     * */
    /**方法1：通过选择排序的方式来做
     * */
    public  int[] twoSum(int[] nums, int target) {

        int[] a = new int[2];
        for(int i = 0;i<nums.length;i++){
            for(int j = 0;j<nums.length;j++){
                if(nums[i]+nums[j]==target && i!=j){
                    a[0] = i;
                    a[1] = j;
                }
            }
        }
        return a;
    }
    /**方式2：通过hash表的方式来做，此方法更好
     * */
    public static int[] twoSum2(int[] nums,int target){
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i = 0;i<nums.length;i++){
            int x = nums[i];
            if(map.containsKey(target-x)){
                return new int[]{map.get(target-x)+1,i+1};
            }
            map.put(x,i);
        }
        throw new IllegalArgumentException("no two sum");
    }
    public static void main(String[] args) {
        int[] nums = new int[]{2,7,11,15};
        int target = 9;
        int[] b = twoSum2(nums,target);

        System.out.println(b[0]+"--"+b[1]);
    }

}