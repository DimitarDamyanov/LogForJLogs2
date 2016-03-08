package com.springapp.mvc.logger;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by D on 24.12.2015 ã..
 */
public class ThrowRandomException {

    ArrayList<Throwable> listOfExceptions = new ArrayList<Throwable>();

    public ThrowRandomException(){
        initBuiltInExceptionsList();
    }

    private void initBuiltInExceptionsList(){
        listOfExceptions.add(new ArithmeticException());
        listOfExceptions.add(new ArrayIndexOutOfBoundsException());
        listOfExceptions.add(new ArrayStoreException());
        listOfExceptions.add(new ClassCastException());
        listOfExceptions.add(new IllegalArgumentException());
        listOfExceptions.add(new IllegalMonitorStateException());
        listOfExceptions.add(new IllegalStateException());
        listOfExceptions.add(new IllegalThreadStateException());
        listOfExceptions.add(new IndexOutOfBoundsException());
        listOfExceptions.add(new NegativeArraySizeException());
        listOfExceptions.add(new NullPointerException());
        listOfExceptions.add(new NumberFormatException());
        listOfExceptions.add(new SecurityException());
        listOfExceptions.add(new UnsupportedOperationException());

    }

    public void addAdditionalException(Throwable e){
        this.listOfExceptions.add(e);
    }

    public void throwException(){
        //generate random number from 0 to Exception list size
        int number = 0;
        Random random = new Random();
        number = random.nextInt(listOfExceptions.size());
        try {
            throw this.listOfExceptions.get(number);
        } catch (Throwable throwable) {
           AppLogger.exception(throwable);
        }

    }
}
