import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        int temp = 0;
        String ips = "192.168.0.105, 145.198.44.105, 255.255.255.0, 256.123.79.105, 192-167-5-133, 19216753249";

        Pattern pattern = Pattern.compile("(\\b(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?\\b)");
        Matcher matcher = pattern.matcher(ips);

        System.out.println("Айпи адреса, которые валидны: ");

        while (matcher.find()) {
            temp++;
            System.out.println(matcher.group());
        }
        System.out.println("Найденных валидных айпи адресов: " + temp);
    }
}