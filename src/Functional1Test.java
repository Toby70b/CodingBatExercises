import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Functional1Test {
    Functional1 functional1;

    @BeforeEach
    void setUp() {
        functional1 = new Functional1();
    }

    @Test
    void doubling_3_Positive_Numbers() {
        List<Integer> nums = Arrays.asList(1,2,3);
        assertEquals( functional1.doubling(nums), Arrays.asList(2,4,6));
    }

    @Test
    void doubling_Numerous_Positive_And_Negative_Numbers() {
        List<Integer> nums = Arrays.asList(6,8,6,8,-1);
        assertEquals( functional1.doubling(nums), Arrays.asList(12, 16, 12, 16, -2));
    }

    @Test
    void doubling_Empty_List() {
        List<Integer> nums = Arrays.asList();
        assertEquals( functional1.doubling(nums), Arrays.asList());
    }

    @Test
    void square() {
    }

    @Test
    void addStar() {
    }

    @Test
    void copies3() {
    }

    @Test
    void moreY() {
    }

    @Test
    void math1() {
    }

    @Test
    void rightDigit() {
    }

    @Test
    void lower() {
    }

    @Test
    void noX() {
    }
}