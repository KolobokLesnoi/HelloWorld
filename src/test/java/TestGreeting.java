import org.junit.Test;

import java.util.Locale;
import java.util.ResourceBundle;

import static org.junit.Assert.*;

public class TestGreeting {

    @Test
    public void testGoodMorning(){
        Locale defaultLocale = new Locale("ru","RU");
        ResourceBundle bundle = ResourceBundle.getBundle("format", defaultLocale);

        assertEquals("Доброе утро, Мир!", Greeting.displayValues(8,bundle));
    }

    @Test
    public void testGoodDay(){
        Locale defaultLocale = new Locale("ru","RU");
        ResourceBundle bundle = ResourceBundle.getBundle("format", defaultLocale);

        assertEquals("Добрый день, Мир!", Greeting.displayValues(9,bundle));
    }

    @Test
    public void testGoodEvening(){
        Locale defaultLocale = new Locale("ru","RU");
        ResourceBundle bundle = ResourceBundle.getBundle("format", defaultLocale);

        assertEquals("Добрый вечер, Мир!", Greeting.displayValues(19,bundle));
    }

    @Test
    public void testGoodNight(){
        Locale defaultLocale = new Locale("ru","RU");
        ResourceBundle bundle = ResourceBundle.getBundle("format", defaultLocale);

        assertEquals("Спокойной ночи, Мир!", Greeting.displayValues(23,bundle));
    }

}
