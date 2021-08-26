import java.util.StringTokenizer;

public class TextFormatter {

    public static int countOfWords(String str2) {
        int count = 0;
        String strings[] = str2.split("\\.\\s*");
        for (int i = 0; i < strings.length; i++) {
            count = strings[i].split(" ").length;
        }
        return count;
    }

    public static boolean isPalindrome(String strings) {
        StringTokenizer stringTokenizer = new StringTokenizer(strings, " ");
        boolean isPal = false;
        while (stringTokenizer.hasMoreTokens()) {
            String token = stringTokenizer.nextToken();
            StringBuilder stringBuilder = new StringBuilder(token);
            String token1 = stringBuilder.reverse().toString();
            if (token.length() > 1 && token.equalsIgnoreCase(token1)) {
                isPal = true;
            }
        }
        return isPal;
    }
}
