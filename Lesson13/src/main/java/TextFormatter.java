import java.util.StringTokenizer;

public class TextFormatter {

    public static int countOfWords(String str2) {
        int count = 0;
        String strings[] = str2.split("\\. ");
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
            if (token.equalsIgnoreCase(token1) && token.length() > 1) {
                System.out.println(strings);
                System.out.println(token + " - палиндром");
                isPal = true;
            }
        }
        return isPal;
    }
}
