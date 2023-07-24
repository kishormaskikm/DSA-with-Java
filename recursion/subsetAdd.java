package recursion;

import java.util.ArrayList;

public class subsetAdd {
    public static void main(String[] args) {
        ArrayList<String> ans = new ArrayList<>();
        ans = subset("","246");
        System.out.println(ans);

        for(int i = 0; i< ans.size();i++){
            String temp = ans.get(i);

            int sum=0;
            for(int j=0; j<temp.length();j++){
                sum = sum + temp.charAt(j)-'0';
            }
            if(sum==6){
                System.out.println(sum);
            }

        }

    }
    static ArrayList<String> subset(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        char ch = up.charAt(0);
        list.addAll(subset(p+ch,up.substring(1)));
        list.addAll(subset(p,up.substring(1)));
        return list;
    }

}
