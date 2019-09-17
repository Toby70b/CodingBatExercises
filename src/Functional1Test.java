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
        assertEquals( functional1.square(nums), Arrays.asList());
    }

    @Test
    void square_3_Positive_Numbers() {
        List<Integer> nums = Arrays.asList(1,2,3);
        assertEquals( functional1.square(nums), Arrays.asList(1,4,9));
    }

    @Test
    void square_Numerous_Positive_And_Negative_Numbers() {
        List<Integer> nums = Arrays.asList(6, 8, -6, -8, 1);
        assertEquals( functional1.square(nums), Arrays.asList(36, 64, 36, 64, 1));
    }

    @Test
    void square_Empty_List() {
        List<Integer> nums = Arrays.asList();
        assertEquals( functional1.doubling(nums), Arrays.asList());
    }

    @Test
    void addStarToLetters() {
        List<String> strings = Arrays.asList("a", "bb", "ccc");
        assertEquals( functional1.addStar(strings), Arrays.asList("a*", "bb*", "ccc*"));
    }

    @Test
    void addStarToWords() {
        List<String> strings = Arrays.asList("hello", "there");
        assertEquals( functional1.addStar(strings), Arrays.asList("hello*", "there*"));
    }

    @Test
    void addStarToStar() {
        List<String> strings = Arrays.asList("*");
        assertEquals( functional1.addStar(strings), Arrays.asList("**"));
    }

    @Test
    void copies3Letters() {
        List<String> strings = Arrays.asList("a", "bb", "ccc");
        assertEquals( functional1.copies3(strings), Arrays.asList("aaa", "bbbbbb", "ccccccccc"));
    }

    @Test
    void copies3Words() {
        List<String> strings = Arrays.asList("24", "a", "");
        assertEquals( functional1.copies3(strings), Arrays.asList("242424", "aaa", ""));
    }

    @Test
    void copies3Words2() {
        List<String> strings = Arrays.asList("hello", "there");
        assertEquals( functional1.copies3(strings), Arrays.asList("hellohellohello", "theretherethere"));
    }

    @Test
    void moreYLetters() {
        List<String> strings = Arrays.asList("a", "b", "c");
        assertEquals( functional1.moreY(strings), Arrays.asList("yay", "yby", "ycy"));
    }

    @Test
    void moreYWords() {
        List<String> strings = Arrays.asList("hello", "there");
        assertEquals( functional1.moreY(strings), Arrays.asList("yhelloy", "ytherey"));
    }

    @Test
    void moreYWordWithY() {
        List<String> strings = Arrays.asList("yay");
        assertEquals( functional1.moreY(strings), Arrays.asList("yyayy"));
    }

    @Test
    void math1TestWithSomeNumbers() {
        List<Integer> nums = Arrays.asList(1, 2, 3);
        assertEquals( functional1.math1(nums), Arrays.asList(20, 30, 40));
    }

    @Test
    void math1TestWithSomeMoreNumbers() {
        List<Integer> nums = Arrays.asList(6, 8, 6, 8, 1);
        assertEquals( functional1.math1(nums), Arrays.asList(70, 90, 70, 90, 20));
    }

    @Test
    void math1TestWith10() {
        List<Integer> nums = Arrays.asList(10);
        assertEquals( functional1.math1(nums), Arrays.asList(110));
    }

    @Test
    void rightDigitSingleDigitNumbers() {
        List<Integer> nums = Arrays.asList(1, 22, 93);
        assertEquals( functional1.rightDigit(nums), Arrays.asList(1, 2, 3));
    }

    @Test
    void rightDigitMultipleDigitNumbers() {
        List<Integer> nums = Arrays.asList(16, 8, 886, 8, 1);
        assertEquals( functional1.rightDigit(nums), Arrays.asList(6, 8, 6, 8, 1));
    }

    @Test
    void rightDigitNumbersEndingWithZero() {
        List<Integer> nums = Arrays.asList(10, 0);
        assertEquals( functional1.rightDigit(nums), Arrays.asList(0, 0));
    }

    @Test
    void lower() {
    }

    @Test
    void noX() {
    }
}