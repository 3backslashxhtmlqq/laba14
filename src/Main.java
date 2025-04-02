import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static int random() {
        return (int) (Math.random() * 325 + 1);
    }

    public static void main(String[] args) {

        String[] random_ips = new String[5];
        random_ips[0] = random() + "." + random() + "." + random() + "." + random();
        random_ips[1] = random() + "." + random() + "." + random() + "." + random();
        random_ips[2] = random() + "." + random() + "." + random() + "." + random();
        random_ips[3] = random() + "." + random() + "." + random() + "." + random();
        random_ips[4] = random() + "." + random() + "." + random() + "." + random();

        Pattern pattern = Pattern.compile("((1?\\d?\\d|2[0-4]\\d|25[0-5])\\.){3}(1?\\d?\\d|2[0-4]\\d|25[0-5])");

        System.out.println("Айпи адреса: ");

        for (int i = 0; i < random_ips.length; i++) {
            System.out.println(random_ips[i]);
        }

        System.out.println(" ");

        System.out.println("Валидные айпи адреса: ");

        for (int i = 0; i < random_ips.length; i++) {
            Matcher matcher = pattern.matcher(random_ips[i]);
            while (matcher.find()) {
                System.out.println(matcher.group());
            }
        }
    }
}