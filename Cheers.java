public class Cheers {
        public static void main(String[] args) {
                String word = args[0];
                int runTimes = Integer.parseInt(args[1]);
                String aOrAn = "";
                String x = "AaEeFfHhIiLlMmNnOoRrSsXx";
                for (int i = 0; i < word.length(); i++) {
                        for (int j = 0; j < x.length(); j++) {
                                if (word.charAt(i) != x.charAt(j)) {
                                        aOrAn = "a  ";
                                } else {
                                        aOrAn = "an ";
                                        break;
                                }
                        }
                        String bigLetter = (word.charAt(i) + "").toUpperCase();
                        System.out.println("Give me " + aOrAn + bigLetter + ": " + bigLetter + "!");
                }
                System.out.println("What does that spell?");
                int a = 0;
                while (a < runTimes) {
                        System.out.println(word.toUpperCase() + "!!!");
                        a++;
                }
        }
}
