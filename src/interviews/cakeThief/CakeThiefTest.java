package interviews.cakeThief;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CakeThiefTest {
    private CakeThief cakeThief;


    @BeforeEach
    void setUp() {
        cakeThief = new CakeThief();
    }

    @Test
    void maxDuffelBagValueTest1() {
        List<Cake> cakes = Arrays.asList(new Cake(7,160),new Cake(3,90),new Cake(2,15));
        int capacity = 20;
        assertEquals(555,cakeThief.maxDuffelBagValue(cakes,capacity));
    }

}