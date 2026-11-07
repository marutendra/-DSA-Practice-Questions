package String_Questions;

public class Find_the_character_with_the_highest_frequency {
    static Character highestFrequencyChar(String s) {
        java.util.Map<Character, Integer> freq = charFrequency(s);
        Character best = null; int max = 0;
        for (java.util.Map.Entry<Character, Integer> e : freq.entrySet())
            if (e.getValue() > max) { best = e.getKey(); max = e.getValue(); }
        return best;
    }
    public static void main(String[] args) {

    }
}
