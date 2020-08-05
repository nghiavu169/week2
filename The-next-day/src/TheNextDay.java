public class TheNextDay {
    static boolean isLeap;
    public static boolean isLeapYear(int year) {
        if(year % 4 == 0) {
            if( year % 100 == 0) {
                if(year % 400 == 0) {
                    isLeap = true;
                }
            } else isLeap = true;
        } else isLeap = false;
        return isLeap;
    }
    public static int getMonthYear(int month, int year) {
        switch (month){
            case 2:
                if (isLeapYear(year)) return 29;
                else return 28;
            case 4, 6, 9, 11:
                return 30;
            case 1, 3, 5, 7, 8, 10, 12:
                return 31;
            default:
                return 0;
        }
    }

    public static int[] getDayMonthYear(int day, int month, int year) {
            if (day == getMonthYear(month, year)){
                day = 1;
                if (month == 12) {
                    month = 1;
                    year++;
                } else month++;
            } else day++;

        int[] day_month_year = {day, month, year};
        return day_month_year;
    }
}
