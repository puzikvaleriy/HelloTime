package com.valeriypuzik.core;

import junit.framework.Assert;
import org.junit.Test;

import java.time.LocalDateTime;
import java.time.Month;

import java.time.format.DateTimeFormatter;

import static org.junit.Assert.*;


/**
 * Created by Valeriy on 08.09.2017.
 */
public class HelloTest {

    private static String GOOD_MORNING="Good morning, World!";
    private static String GOOD_DAY="Good day, World!";
    private static String GOOD_EVENING="Good evening, World!";
    private static String GOOD_NIGHT="Good night, World!";

    private static LocalDateTime date1;
    private static LocalDateTime date2;
    private static LocalDateTime date3;
    private static LocalDateTime date4;
    private static LocalDateTime date5;
    private static LocalDateTime date6;
    private static LocalDateTime date7;
    private static LocalDateTime date8;
    private static LocalDateTime date9;
    private static LocalDateTime date10;

    static {
            date1= LocalDateTime.of(1970, Month.JANUARY, 1, 5, 59, 59);
            date2= LocalDateTime.of(1980, Month.FEBRUARY, 2, 6, 0, 0);
            date3= LocalDateTime.of(1990, Month.MARCH, 3, 8, 59, 59);
            date4= LocalDateTime.of(2000, Month.APRIL, 4, 9, 0, 0);
            date5= LocalDateTime.of(2010, Month.MAY, 5, 18, 59, 59);
            date6= LocalDateTime.of(2020, Month.JUNE, 6, 19, 0, 0);
            date7= LocalDateTime.of(2030, Month.JULY, 7, 22, 59, 59);
            date8= LocalDateTime.of(2040, Month.AUGUST, 8, 23, 0, 0);
            date9= LocalDateTime.of(2050, Month.SEPTEMBER, 9, 23, 59, 59);
            date10= LocalDateTime.of(2060, Month.OCTOBER, 10, 0, 0, 0);
    }

    //region message tests
    @Test
    public void test1() {
        Assert.assertEquals(GOOD_NIGHT,new HelloTime(date1).hello());
    }

    @Test
    public void test2() {
        Assert.assertEquals(GOOD_MORNING,new HelloTime(date2).hello());
    }

    @Test
    public void test3() {
        Assert.assertEquals(GOOD_MORNING,new HelloTime(date3).hello());
    }

    @Test
    public void test4() {
        Assert.assertEquals(GOOD_DAY,new HelloTime(date4).hello());
    }

    @Test
    public void test5() {
        Assert.assertEquals(GOOD_DAY,new HelloTime(date5).hello());
    }

    @Test
    public void test6() {
        Assert.assertEquals(GOOD_EVENING,new HelloTime(date6).hello());
    }

    @Test
    public void test7() {
        Assert.assertEquals(GOOD_EVENING,new HelloTime(date7).hello());
    }

    @Test
    public void test8() {
        Assert.assertEquals(GOOD_NIGHT,new HelloTime(date8).hello());
    }

    @Test
    public void test9() {
        Assert.assertEquals(GOOD_NIGHT,new HelloTime(date9).hello());
    }

    @Test
    public void test10() {
        Assert.assertEquals(GOOD_NIGHT,new HelloTime(date10).hello());
    }

    //endregion

    //region locale tests
    @Test
    public void testLocale() {

    }
    //endregion
}
