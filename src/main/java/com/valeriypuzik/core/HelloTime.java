package com.valeriypuzik.core;

import java.time.LocalDateTime;
import java.util.*;

/**
 * Created by Valeriy on 08.09.2017.
 */

public class HelloTime {
    private LocalDateTime localDateTime;

     public HelloTime(){
        this.localDateTime=LocalDateTime.now();
    }

     public HelloTime(LocalDateTime localDateTime){
        this.localDateTime=localDateTime;
    }

     public HelloTime(Locale locale){
        this.localDateTime=LocalDateTime.now();
    }

     public String hello() {
        String message;
        Locale defaultLocale = Locale.getDefault();
        ResourceBundle bundle = ResourceBundle.getBundle("HelloBundle", defaultLocale);

        if(localDateTime.getHour()>=6&&localDateTime.getHour()<9)
            message=bundle.getString("goodmorning");
        else if(localDateTime.getHour()>=9&&localDateTime.getHour()<19)
            message=bundle.getString("goodday");
        else if(localDateTime.getHour()>=19&&localDateTime.getHour()<23)
            message=bundle.getString("goodevening");
        else
        message=bundle.getString("goodnight");
        return message;
    }
}
