package stacks.leetcode_stack;
import java.util.Stack;
/**
 * Created by Administrator on 2018/8/9.
 */
public class Solution {
    //括号匹配问题
    public boolean isValid(String s){
        Stack<Character> stack = new Stack<Character>();
        for(int i = 0;i<s.length();i++){
            char c = s.charAt(i);
            if(c=='(' || c== '[' || c=='{'){
                stack.push(c);
            }else{
                if(stack.isEmpty()){
                    return false;
                }
                //取出栈顶元素
                char topChar = stack.pop();
                if(c==')' && topChar != '('){
                    return false;
                }
                if(c == '[' && topChar != ']'){
                    return false;
                }
                if(c=='{' && topChar != '}'){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
    //比较含退格的字符串
    public boolean backspacingCompare(String s,String t){
        return compute(s).equals(compute(t));
    }
    public Stack<Character> compute(String s){
        Stack<Character> stack = new Stack<Character>();
        if(s == null){
            System.out.println("数据输入有问题");
        }
        for(char str : s.toCharArray()){
           if(str != '#') {
               stack.push(str);
           }else{
               if(!stack.isEmpty()){
                   stack.pop();
               }
           }
        }
        return stack;
    }

    public static void main(String[] args) {

        System.out.println((new Solution()).isValid("()[]{}"));
    }
}
