

import java.util.HashSet;

public class Pangrams {


    static HashSet hashSet;

    public static void main(String[] args) {

        String[] str = {"Hello world!", "Hey Siri, what's foo bar?"};
            System.out.println("Is Pangram? 0 - NO, 1 - YES \n" + isPangram(str));

    }

    static String isPangram(String[] strings) {

        String string = "", result = "";
        for (int i = 0; i < strings.length; i++) {
            hashSet = new HashSet();

            string = strings[i];
            for (int ch = 0; ch < string.length(); ch++) {

                hashSet.add(string.charAt(ch));
            }

            if (hashSet.size() == 26) {
                result += "1";
            } else {
                result += "0";
            }

        }
        return result;
    }
}
