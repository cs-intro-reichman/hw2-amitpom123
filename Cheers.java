public class Cheers {
        public static void main(String[] args) {
                String word = args[0];
                int runTimes = Integer.parseInt(args[1]);
                String aOrAn = "";
                String x = "AEFHILMNORSX";
                for (int i = 0; i < word.length(); i++) {
                        for (int j = 0; j < x.length(); j++) {
                                if (word.charAt(i) != x.charAt(j)) {
                                        aOrAn = "a ";
                                } else {
                                        aOrAn = "an ";
                                        break;
                                }
                        }
                        System.out.println("Give me " + aOrAn + word.charAt(i) + " : " + word.charAt(i) + "!");
                }
                System.out.println("What does that spell?");
                int a = 0;
                while (a < runTimes) {
                        System.out.println(word + "!!!");
                        a++;
                }
        }
}
