import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {

        String str = "avadakedabravadakedabra";
        System.out.println(str.substring(str.indexOf("a"), str.lastIndexOf("b") + 1));
        char n = str.charAt(3);
        char m = str.charAt(0);
        System.out.println(str.replace(n, m));

        String[] str1 = {"Шалаш", "орел", "музей", "Кабак", "друзья", "финал", "кабан", "мадам", "кино"};
        for (int i = 0; i < str1.length; i++) {
            StringBuilder stringBuilder = new StringBuilder(str1[i]);
            String str2 = stringBuilder.reverse().toString();
            if (str1[i].equalsIgnoreCase(str2)) {
                System.out.println("Слово " + str1[i] + " является палиндромом");
            }
        }

        String text = "Наступило теплое лето. Саша, Вова и Дима строят шалаш. В саду поспела смородина.\n" +
                "Даша и Таня собирают ее в ведерко. Затем девочки кладут смородину на блюдо.\n" +
                "Мама будет варить варенье. Зимой в холода дети будут пить чай с вареньем.";
        String[] sentence = text.split("\\.\\s*");
        for (int i = 0; i < sentence.length; i++) {
            int count = sentence[i].split(" ").length;
            if (count >= 3 && count <= 5) {
                System.out.println(sentence[i] + "(количество слов = " + count + ")");
            } else {
                StringTokenizer stringTokenizer = new StringTokenizer(sentence[i], " ");
                while (stringTokenizer.hasMoreTokens()) {
                    String token = stringTokenizer.nextToken();
                    StringBuilder stringBuilder = new StringBuilder(token);
                    String token1 = stringBuilder.reverse().toString();
                    if (token.length() > 1 && token.equalsIgnoreCase(token1)) {
                        System.out.println(sentence[i] + "(" + token + " - является палиндромом)");
                    }
                }
            }
        }


        String str2 = "Шура и Миша бегут на речку. С ними их пес Казак. Друзья бросились в воду и \n" +
                "поплыли. Казак тоже любит купаться. Не раздумывая, он прыгнул следом. Пришел дед и позвал всех домой.";
        String[] strings = str2.split("\\.\\s*");
        for (int i = 0; i < strings.length; i++) {
            if (TextFormatter.isPalindrome(strings[i])) {
                System.out.println(strings[i]);
                System.out.println("Количество слов в строке = " + TextFormatter.countOfWords(strings[i]));
            }
        }
    }
}





