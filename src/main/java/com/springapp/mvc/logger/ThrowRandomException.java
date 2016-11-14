package com.springapp.mvc.logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/**
 * Created by D on 24.12.2015 �..
 */
@Component
public class ThrowRandomException {

    @Autowired
    private AppLogger logger;

    private ArrayList<Throwable> listOfExceptions = new ArrayList<Throwable>();

    private Random randomGenerator = new Random();

    public ThrowRandomException() {
        initBuiltInExceptionsList();
    }

    private void initBuiltInExceptionsList() {
        Throwable[] predefinedList = new Throwable[]{
                new ArithmeticException(),
                new ArrayIndexOutOfBoundsException(),
                new ArrayStoreException(),
                new ClassCastException(),
                new IllegalArgumentException(),
                new IllegalMonitorStateException(),
                new IllegalStateException(),
                new IllegalThreadStateException(),
                new IndexOutOfBoundsException(),
                new NegativeArraySizeException(),
                new NullPointerException(),
                new NumberFormatException(),
                new SecurityException(),
                new UnsupportedOperationException()
        };

        listOfExceptions.addAll(Arrays.asList(predefinedList));
    }

    public void addAdditionalException(Throwable e) {
        this.listOfExceptions.add(e);
    }

    public void throwException() {
        //generate random number from 0 to Exception list size
        int number = randomGenerator.nextInt(listOfExceptions.size());
        try {
            throw this.listOfExceptions.get(number);
        } catch (Throwable throwable) {
            logger.exception(throwable);
        }
    }
}
