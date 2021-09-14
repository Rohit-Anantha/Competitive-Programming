import java.util.HashMap;
import java.util.Scanner;

public class ShuffledAnagrams {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cases = scan.nextInt();
        for (int i = 0; i < cases; i++) {
            String toShuffle = scan.nextLine();
            HashMap<Character, Integer> characterValues = new HashMap<>();

            for (int j = 0; j < toShuffle.length(); j++) {
                char c  = toShuffle.charAt(j);
                if(characterValues.containsKey(c))
                {
                    characterValues.put(c, characterValues.get(c) + 1);
                }
                else{
                    characterValues.put(c, 1);
                }
            }
        }
    }
}