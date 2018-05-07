/**
 * Created by Amuri on 5/7/2018.
 */
import java.util.Calendar;
import java.util.Date;

public class TestImportStatement {
    public static void main(String[] args)
    {
        Calendar calendar = Calendar.getInstance();

        calendar.set(2018, Calendar.MAY, 5);
        Date firstDate = calendar.getTime();

        calendar.set(2018, Calendar.MAY, 1);
        Date secondDate = calendar.getTime();

        System.out.println("Is firstDate before secondDate? " + firstDate.before(secondDate));
        System.out.println("Is firstDate after secondDate? " + firstDate.after(secondDate));
    }

}
