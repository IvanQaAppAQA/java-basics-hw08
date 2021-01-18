import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Regular expressions.
 */
public class RegExp {

    /**
     * Get IP address from text.
     *
     * @param text text to parse
     * @return String with IP address
     */
    public static String getIpAddress(String text) {


        String string = "\\b(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)"; // TODO fill in code here for extracting IP address using Regular Expression

        Pattern pattern = Pattern.compile(string);
        Matcher match = pattern.matcher(text);
        String result = "";

        while (match.find()) {
            result = match.group();
            System.out.println(result);
        }

        return result;

    }
}