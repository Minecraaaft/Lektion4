public class Test {
    public static void main(String[] args) {
        String x="sko" ; String ms;
        switch (x) {
            case "taske": ms = "January"; System.out.print(ms + " ");
                break;
            case "sko":  ms = "February"; System.out.print(ms + " ");

            case "bukser":  ms = "March"; System.out.print(ms + " ");
                break;
            case "trøje": ms = "April"; System.out.print(ms + " ");
                break;
            case "sokker": ms = "May"; System.out.print(ms + " ");
                break;
            case "hat": ms = "June"; System.out.print(ms + " ");
            default: ms = "Invalid month"; System.out.print(ms + " ");
        }
        System.out.println(x);
    }
}
