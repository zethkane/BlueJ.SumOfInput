

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class SumOfInputTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class SumOfInputTest
{
    /**
     * Default constructor for test class SumOfInputTest
     */
    //Bonus Question! How is this constructor used when none is defined
    //in the class?
    public SumOfInputTest()
    {
    }

    @Before
    public void setUp()
    {
    }

    @After
    public void tearDown()
    {
    }
    
    @Test
    public void test1(){
        SumOfInput testSum = new SumOfInput();
        
        assertEquals(Integer.valueOf(3), testSum.oneToNumber(2));
    }
    
    @Test
    public void test2(){
        SumOfInput testSum = new SumOfInput();
        
        assertEquals(Integer.valueOf(4465), testSum.oneToNumber(94));
        assertEquals(Integer.valueOf(171), testSum.oneToNumber(18));
    }
    
    @Test
    public void test3(){
        SumOfInput testSum = new SumOfInput();
        
        assertNotEquals(Integer.valueOf(9000), testSum.oneToNumber(42));
        assertNotEquals(Integer.valueOf(99999999), testSum.oneToNumber(2425804));
    }
}
