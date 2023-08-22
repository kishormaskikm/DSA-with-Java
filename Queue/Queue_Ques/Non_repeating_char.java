package Interview_Course.Queue.Queue_Ques;

import com.sun.security.jgss.GSSUtil;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Non_repeating_char {
    public static void main(String[] args) {
        String str = "aabc";
        int[] freq = new int[26];
        Arrays.fill(freq, 0);
        String ans = "";

        Queue<Character> q = new LinkedList<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Increment freq
            freq[ch - 'a']++;
            q.add(ch);

            while (!q.isEmpty()) {
                if (freq[q.peek() - 'a'] > 1) {
                    q.remove();
                } else {
                    ans += q.peek();
                    break;
                }
            }

            // For non-repeating character
            if (q.isEmpty()) {
                ans += '#';
            }
        }
        System.out.println("Final ans: " + ans);
    }
}
