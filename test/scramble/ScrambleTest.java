package scramble;

import static junit.framework.Assert.assertEquals;
import org.junit.Test;

public class ScrambleTest {

    @Test
    public void Test() {
        
        Scramble se = new Scramble();

        assertEquals("The simple word has not been scrambled properly.", "Vmaai", se.Scrambling("Valami"));
        assertEquals("The simple character has not been scrambled properly.", " ", se.Scrambling(" "));
        assertEquals("The simple character with punctuation mark has not been scrambled properly.", " .", se.Scrambling(" ."));
        assertEquals("The empty character has not been scrambled properly.", "", se.Scrambling(""));
        assertEquals("The simple word with punctuation mark at its end has not been scrambled properly.", "AOBAMLR?", se.Scrambling("ALMABOR?"));
        assertEquals("The number with punctuation mark at its end has not been scrambled properly.", "4325!", se.Scrambling("4325!"));
        assertEquals("The sentence including punctuation mark and number has not been scrambled properly.  ", "My zip code is 1035, and the your one is the 1042.", se.Scrambling("My zip cdoe is 1035, and the yuor one is the 1042."));

    }

    @Test(expected = NullPointerException.class)
    public void testNullPointerException() {
        new Scramble().Scrambling(null);
    }

}
