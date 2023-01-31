package demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class Hello {

    public static void main(String[] args) throws ParseException {
        String iso8601Date = "2022-01-02";
        Date date = new SimpleDateFormat("yyyy-MM-dd").parse(iso8601Date);
        System.out.println(date);

        Date date2 = Date.from(LocalDate.parse(iso8601Date).atStartOfDay(ZoneId.systemDefault()).toInstant());
        System.out.println(date2);
    }

}
