package Interview_Course.Stack.Stack_Que;
//https://leetcode.com/problems/simplify-path
import java.util.Stack;

public class simplify_path {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        String[] components = path.split("/");

        for ( String dir : components){
            if(dir.equals(".") || dir.isEmpty()){
                continue;
            } else if (dir.equals("..")){
                if(!stack.isEmpty()){
                    stack.pop();
                }
            }else{
                stack.add(dir);
            }
        }

        StringBuilder result = new StringBuilder();
        for (String dir : stack ){
            result.append("/");
            result.append(dir);
        }

        return result.length() > 0 ? result.toString() : "/";


    }
}
