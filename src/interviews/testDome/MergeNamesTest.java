package interviews.testDome;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MergeNamesTest {
    private MergeNamesTest mergeNamesTest;

    @Test
    void ArraysContainingDuplicateNamesBetweenThemShouldReturnUniqueNamesArray(){
        String[] names1 = new String[] {"Ava", "Emma", "Olivia"};
        String[] names2 = new String[] {"Olivia", "Sophia", "Emma"};
        assertArrayEquals( new String[]{"Olivia","Ava","Emma","Sophia"}, MergeNames.uniqueNames(names1, names2) );
    }

    @Test
    void ArraysContainingDuplicateNamesWithinThemShouldReturnUniqueNamesArray(){
        String[] names1 = new String[] {"Ava", "Ava", "Olivia"};
        String[] names2 = new String[] {"Sophia", "Sophia", "Sophia"};
        assertArrayEquals( new String[]{"Olivia","Ava","Sophia"}, MergeNames.uniqueNames(names1, names2) );
    }

    @Test
    void ArraysContainingEmptyStringShouldReturnUniqueNamesArray(){
        String[] names1 = new String[] {"", "", "Tony"};
        String[] names2 = new String[] {"Olivia", "Sophia", "John"};
        assertArrayEquals( new String[]{"","Olivia","Tony","John","Sophia",}, MergeNames.uniqueNames(names1, names2) );
    }

    @Test
    void ArraysContainingUniqueNamesShouldReturnUniqueNamesArray(){
        String[] names1 = new String[] {"Ava", "Emma", "Tony"};
        String[] names2 = new String[] {"Olivia", "Sophia", "John"};
        assertArrayEquals( new String[]{"Olivia","Tony","John","Ava","Emma","Sophia",}, MergeNames.uniqueNames(names1, names2) );
    }
}
