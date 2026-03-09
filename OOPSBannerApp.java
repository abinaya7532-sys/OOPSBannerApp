/**
 * OOPS Banner App
 * UC8 - Use Map for Character Patterns and Render via Function
 * @author Abiniya
 * @version 1.8
 */

import java.util.*;

public class OOPSBannerApp {

    public static void main(String[] args) {

        // Create Map to store character patterns
        Map<Character, String[]> patternMap = new HashMap<>();

        patternMap.put('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        });

        patternMap.put('P', new String[]{
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    "
        });

        patternMap.put('S', new String[]{
                " ****",
                "*    ",
                " *** ",
                "    *",
                "**** "
        });

        String word = "OOPS";

        renderBanner(word, patternMap);
    }

    // Function to render banner
    public static void renderBanner(String word, Map<Character, String[]> map) {

        int height = 5;

        for (int i = 0; i < height; i++) {

            StringBuilder line = new StringBuilder();

            for (char ch : word.toCharArray()) {

                String[] pattern = map.get(ch);

                if (pattern != null) {
                    line.append(pattern[i]).append("  ");
                }
            }

            System.out.println(line);
        }
    }
}