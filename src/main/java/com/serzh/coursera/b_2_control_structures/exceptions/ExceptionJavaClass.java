package com.serzh.coursera.b_2_control_structures.exceptions;

import java.io.IOException;

import com.serzh.example.coursera.b_2_control_structures.exceptions.ExceptionsKt;

public class ExceptionJavaClass {

    public static void main(String[] args) {
        ExceptionsKt.foo2();

     /*   try {
            ExceptionsKt.foo2();
        } catch (IOException e) {
        }
*/
        //        ExceptionsKt.foo();
        try {
            ExceptionsKt.foo();
        } catch (IOException e) {

        }
    }

}
