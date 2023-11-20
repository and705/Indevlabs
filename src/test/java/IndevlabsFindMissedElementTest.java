import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.nd705.IndevlabsFindMissedElement.findMissedNumber;

public class IndevlabsFindMissedElementTest {
    @Test
    public void testFindMissedNumber_ContainsZero() {
        int[] arr = {0, 1, 2, 3, 5};
        assertEquals(4, findMissedNumber(arr));
    }
    @Test
    public void testFindMissedNumber_NotContainsZero() {
        int[] arr = {1, 2, 3, 5};
        assertEquals(4, findMissedNumber(arr));
    }
    @Test
    public void testFindMissedNumber_MixedSequence() {
        int[] arr = {5, 0, 1, 3, 2};
        assertEquals(4, findMissedNumber(arr));
    }
    @Test
    public void testFindMissedNumber_LessThenTwoElements() {
        int[] arr = {1};
        assertThrows(IllegalArgumentException.class, () -> findMissedNumber(arr));
    }

    @Test
    public void testFindMissedNumber_MissedMoreThenOneElement() {
        int[] arr = {1, 2, 3, 6};
        assertThrows(IllegalArgumentException.class, () -> findMissedNumber(arr));
    }

    @Test
    public void testFindMissedNumber_MistakeInSequence() {
        int[] arr = {1, 4, 4, 6};
        assertThrows(IllegalArgumentException.class, () -> findMissedNumber(arr));
    }

}

