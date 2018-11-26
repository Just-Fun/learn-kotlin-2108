package com.serzh.my;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionJava {

    public static void main(String[] args) {

        Collection<String> collection = new ArrayList<>();
        String s = CollectionsFunctions.joinToStringOld(collection, "", "", "");

        CollectionsFunctions.performOperation();
        CollectionsFunctions.reportOperationCount(); // Operation performed 1 times

        int opCount= CollectionsFunctions.getOpCount();
        String unixLineSeparator = CollectionsFunctions.getUNIX_LINE_SEPARATOR();
        String unixLineSeparator2 = CollectionsFunctions.UNIX_LINE_SEPARATOR2;

        char lastChar1 = InlineFunctionKt.lastChar1("Java");

        View view = new Button();
        InlineFunctionKt.showOff(view); // I'm a view!

        char sbLastChar = InlineFunctionKt.getLastChar("Kotlin?");
        System.out.println(sbLastChar);

        StringBuilder stringBuilder = new StringBuilder("Kotlin?");
        InlineFunctionKt.setLastChar(stringBuilder, '!');
        System.out.println(stringBuilder);

        String date = "$DATE$";
        String time = "$TIME$";
        System.out.println(date);
        System.out.println(time);

    }
}
