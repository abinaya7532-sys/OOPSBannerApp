/**
 * OOPS Banner App
 * UC5 - Banner using new Array Initialization
 * @author Abiniya
 * @version 1.4
 */

public class OOPSBannerApp {

    public static void main(String[] args) {

        String[] banner = new String[] {
                String.join("", " *****   ", " *****  ", "******   ", " ****** "),
                String.join("", "*     * ", "*     * ", " *     * ", "  *        "),
                String.join("", "*     * ", "*     * ", " *     * ", "* *      "),
                String.join("", "*     * ", " *****   ", "******    ", " ***** "),
                String.join("", "*     * ", "*       ", "*          ", "      *     "),
                String.join("", "*     * ", "*       ", "*          ", "      *     "),
                String.join("", " *****  ", "*       ", "*          ", " ***** ")
        };

        for (String line : banner) {
            System.out.println(line);
        }
    }
}