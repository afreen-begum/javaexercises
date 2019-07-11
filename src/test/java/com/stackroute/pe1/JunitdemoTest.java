package com.stackroute.pe1;

import org.junit.*;

import static org.junit.Assert.*;

public class JunitdemoTest {
    Junitdemo junitdemo;

    @Before
    public void setup() {
        //arrange
        System.out.println("Inside Before");
        this.junitdemo = new Junitdemo();
    }

    @After
    public void testDown() {
        System.out.println("Inside After");
        junitdemo = null;
    }

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Before Class");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("After Class");
    }

    @Test
    public void givenTwoStringsShouldReturnConcattedUpperString() {
        // act
        String actualResult = junitdemo.concatAndUpperCase("hello", "world");
        //assert
        assertNotNull(actualResult);
        assertEquals("HELLOWORLD", actualResult);

    }

    @Test
    public void givenStringAndShouldReturnErrorMessage() {

        // act
        String actualResult = junitdemo.concatAndUpperCase("hello", null);
        //assert
        assertNotNull(actualResult);
        assertEquals("Null Value Not Allowed", actualResult);
    }

    @Test
    public void givenStringShouldReturnTheReverse() {
        //act
        String actualResult = junitdemo.reverseString("Hello");
        //assert
        assertEquals("olleH", actualResult);

    }
//@Test
    // public void givenStringShouldThrowNullPointException(){
    //act
    //String actualResult=junitdemo.reverseString("Hello");
//}
}
