package recursion;

public class String_Que {
    public static void main(String[] args) {
        String mystr = skip("baddaaca");
        System.out.println(mystr);
    }
    static String skip(String str){
        if(str.isEmpty()){
            return "";
        }
        char ch = str.charAt(0);
        if(ch == 'a'){
            return skip(str.substring(1));
        }
        else {
            return ch + skip(str.substring(1));
        }
    }

}
