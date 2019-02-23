package org.pursuit.junittest_drivendevelopmentappfromscratch;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.HashSet;

public class ArrayMethodTestingTest {

    private ArrayMethodTesting arrayMethodTesting;
    @Before
    public void setUp() throws Exception{
        arrayMethodTesting = ArrayMethodTesting.getSingleInstance();
    }

    @Test
    public void check_is_less_than_10(){
        //Given
        String[] numbers = {"1", "2", "3", "4", "5"};

        //When
        boolean actual = arrayMethodTesting.isLessThan10(numbers);

        //Then
        Assert.assertTrue(actual);
    }

    @Test
    public void check_is_less_than_10_with_more_than_10(){
        //Given
        String[] numbers = {"1","2","3", "4","5","6","7","8","9","10","11"};

        //When
        boolean actual = arrayMethodTesting.isLessThan10(numbers);

        //Then
        Assert.assertFalse(actual);
    }

    @Test
    public void check_is_less_than_10_with_null_value(){
        //Given
        String[] numbers = null;

        //When
        boolean actual = arrayMethodTesting.isLessThan10(numbers);

        //Then
        Assert.assertTrue(actual);
    }

    @Test
    public void check_small_evens_only(){
        //Given
        String[] input = {"Lola","is","very","happy"};

        //When
        String[] expected = {"Lola","is","very"};
        String[] actual = arrayMethodTesting.smallEvensOnly(input);

        //Then
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void check_small_evens_only_with_odd_number(){
        //Given
        String[] input = {"Lola", "is", "very", "happy", "today"};

        //When
        String[] expected = {"Lola", "is", "very", "happy", "today"};
        String[] actual = arrayMethodTesting.smallEvensOnly(input);

        //Then
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void check_small_evens_only_with_null(){
        //Given
        String[] input = null;

        //When
        String[] expected = null;
        String[] actual = arrayMethodTesting.smallEvensOnly(input);

        //Then
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void check_sort_alphabetically(){
        char[] input = {'a', 'f', 'b'};
        char[] expected = {'a', 'b', 'f'};
        char[] actual =arrayMethodTesting.sortAlphabetically(input);
        Assert.assertArrayEquals(expected,actual);
    }

    @Test
    public void check_sort_alphabetically_with_null_value(){
        char[] input = null;
        char[] expected = null;
        char[] actual =arrayMethodTesting.sortAlphabetically(input);
        Assert.assertArrayEquals(expected,actual);
    }

    @Test
    public void check_return_sum(){
        double[] input = {1.1, 2.2, 3.3};
        double expected = 6.6;
        double actual = arrayMethodTesting.returnSum(input);
        Assert.assertEquals(expected, actual, 1);
    }

    @Test
    public void check_return_sum_with_negative_values(){
        double[] input = {-1.1, -2.2, 3.3, 2.3};
        double expected = 2.3;
        double actual = arrayMethodTesting.returnSum(input);
        Assert.assertEquals(expected, actual, 1);
    }

    @Test
    public void check_remove_case_sensitive_duplicates(){
        String[] input = {"LOLA", "LolA", "BEN", "Ben"};
        HashSet<String> expected = new HashSet<>();
        expected.add("lola");
        expected.add("ben");
        Assert.assertEquals(expected, arrayMethodTesting.removeCaseSensitiveDuplicates(input));
    }

    @Test
    public void check_remove_case_sensitive_duplicates_with_null_value(){
        String[] input = null;
        HashSet<String> expected = new HashSet<>();
        Assert.assertNull(input);
    }

    @Test
    public void check_remove_case_sensitive_duplicates_with_extra_spaces(){
        String[] input = {"LOLA", "   LolA", "BEN", "Ben    "};
        HashSet<String> expected = new HashSet<>();
        expected.add("lola");
        expected.add("ben");
        Assert.assertEquals(expected, arrayMethodTesting.removeCaseSensitiveDuplicates(input));
    }

    @Test
    public void check_map_duplicates(){
        String[] input = {"1", "2", "1", "2", "3"};
        HashMap<String, Integer> expected = new HashMap<>();
        expected.put("1", 2);
        expected.put("2", 2);
        expected.put("3", 1);
        Assert.assertEquals(expected, arrayMethodTesting.mapDuplicates(input));
    }

    @Test
    public void check_map_duplicates_with_letters(){
        String[] input = {"abc", "abc", "def", "def", "ghi"};
        HashMap<String, Integer> expected = new HashMap<>();
        expected.put("abc", 2);
        expected.put("def", 2);
        expected.put("ghi", 1);
        Assert.assertEquals(expected, arrayMethodTesting.mapDuplicates2(input));
    }

    @Test
    public void check_map_duplicates_with_null_value(){
        String[] input = null;
        HashMap<String, Integer> expected = null;
        Assert.assertEquals(expected, arrayMethodTesting.mapDuplicates(input));
    }

    @After
    public void tearDown() throws Exception{
        arrayMethodTesting = null;
    }
}
