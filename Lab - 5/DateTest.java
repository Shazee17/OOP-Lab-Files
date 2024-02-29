class Date {
    int month;
    int day;
    int year;

    public Date(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public String displayDate() {
        return month + "/" + day + "/" + year;
    }
}

public class DateTest {
    public static void main(String[] args) {
        // Creating instances of Date
        Date date1 = new Date(7, 17, 2002);
        Date date2 = new Date(12, 31, 2023);
        Date date3 = new Date(7, 17, 2002);
        
        // Displaying dates
        System.out.println("Date 1: " + date1.displayDate());
        System.out.println("Date 2: " + date2.displayDate());
        System.out.println("Date 3: " + date3.displayDate());

    }
}
