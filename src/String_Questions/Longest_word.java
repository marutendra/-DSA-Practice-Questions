package String_Questions;

public class Longest_word {
    static String longestWord(String s) {
        String t = s.trim();
        if (t.isEmpty()) return "";
        String best = "";
        for (String w : t.split("\\s+")) if (w.length() > best.length()) best = w;
        return best;
    }
    public static void main(String[] args) {
        String s= "hey alex mahto";
        System.out.println(longestWord(s));
    }
}
