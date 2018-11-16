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
    }
}
