import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;

public class Greeting {


    public static void main(String[] args) {

        Locale defaultLocale = Locale.getDefault();
        ResourceBundle bundle = ResourceBundle.getBundle("format", defaultLocale);
        int currentHour = Calendar.getInstance().getTime().getHours();
        System.out.println(displayValues(currentHour,bundle));

    }

    public static String displayValues(int hours, ResourceBundle bundle) {

        if(hours >= 6 & hours < 9){
            return bundle.getString("morning");
        }else if(hours >= 9 & hours < 19){
            return bundle.getString("day");
        }else if(hours >= 19 & hours < 23){
            return bundle.getString("evening");
        }else {
            return bundle.getString("night");
        }

    }

}
