package datoer;

import java.text.NumberFormat;

public class Dato {
    int year, month, day;

    public Dato(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public String danish() {
        return day + "/" + month + "-" + year;
    }

    public String danishText() {
        String monthText = null;
        switch (month) {
            case 1:
                monthText = "januar";
                break;
            case 2:
                monthText = "februar";
                break;
            case 3:
                monthText = "marts";
                break;
            case 4:
                monthText = "april";
                break;
            case 5:
                monthText = "maj";
                break;
            case 6:
                monthText = "juni";
                break;
            case 7:
                monthText = "juli";
                break;
            case 8:
                monthText = "august";
                break;
            case 9:
                monthText = "september";
                break;
            case 10:
                monthText = "oktober";
                break;
            case 11:
                monthText = "november";
                break;
            case 12:
                monthText = "december";
                break;

        }
        return day + ". " + monthText + " " + year;
    }

    public String iso() {
        NumberFormat nf = NumberFormat.getNumberInstance();
        nf.setMinimumIntegerDigits(2);

        return year + "-" + nf.format(month) + "-" + nf.format(day);
    }


}
