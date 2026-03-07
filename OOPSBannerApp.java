import java.util.HashMap;
import java.util.Map;

public class OOPSBannerApp {

    public static void main(String[] args) {

        Map<Character, String[]> patternMap = buildCharacterPatterns();

        String message = "OOPS";

        renderBanner(message, patternMap);
    }

    // Method to create and store character patterns
    public static Map<Character, String[]> buildCharacterPatterns() {

        Map<Character, String[]> map = new HashMap<>();

        String[] O = {
                "  ***  ",
                " *   * ",
                " *   * ",
                " *   * ",
                " *   * ",
                " *   * ",
                "  ***  "
        };

        String[] P = {
                " ***** ",
                " *   * ",
                " ***** ",
                " *     ",
                " *     ",
                " *     ",
                " *     "
        };

        String[] S = {
                " ***** ",
                " *     ",
                " ***** ",
                "     * ",
                "     * ",
                " *   * ",
                " ***** "
        };

        map.put('O', O);
        map.put('P', P);
        map.put('S', S);

        return map;
    }

    // Method to display banner
    public static void renderBanner(String message, Map<Character, String[]> map) {

        int rows = 7;

        for (int i = 0; i < rows; i++) {

            StringBuilder line = new StringBuilder();

            for (char ch : message.toCharArray()) {

                String[] pattern = map.get(ch);

                line.append(pattern[i]).append(" ");
            }

            System.out.println(line);
        }
    }
}