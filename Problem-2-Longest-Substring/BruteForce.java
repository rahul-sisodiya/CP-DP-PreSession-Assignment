import java.util.HashSet;

public class BruteForce {

    public static int lengthOfLongestSubstring(String s) {

        int maxLength = 0;

        for (int i = 0; i < s.length(); i++) {

            HashSet<Character> set = new HashSet<>();

            for (int j = i; j < s.length(); j++) {

                char current = s.charAt(j);

                if (set.contains(current)) {
                    break;
                }

                set.add(current);

                maxLength = Math.max(maxLength, j - i + 1);
            }
        }

        return maxLength;
    }

}
