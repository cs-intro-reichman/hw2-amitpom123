public class TimeCalc {
    public static void main(String[] args) {
        int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        int minutesToAdd = Integer.parseInt(args[1]);
        int totalMin = (hours * 60) + minutes + minutesToAdd;
        int totalHours = totalMin / 60;
        int newHours = totalHours % 24;
        int newMinutes = totalMin - (totalHours * 60);
        if (newMinutes >= 10) {
            if (newHours < 10) {
                System.out.println("0" + newHours + ":" + newMinutes);
            } else if ((newHours >=10) && (newHours != 24)) {
                System.out.println(newHours + ":" + newMinutes);
            } else {
                System.out.println("00" + ":" + newMinutes);
            }
        } else {
            if (newHours < 10) {
                System.out.println("0" + newHours + ":" + "0" + newMinutes);
            } else if ((newHours >=10) && (newHours != 24)) {
                System.out.println(newHours + ":" + "0" + newMinutes);
            } else {
                System.out.println("00" + ":" + "0" + newMinutes);
            }
        }
    }
}
