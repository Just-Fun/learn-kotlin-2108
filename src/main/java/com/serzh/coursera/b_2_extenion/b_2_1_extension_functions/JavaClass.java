package com.serzh.coursera.b_2_extenion.b_2_1_extension_functions;

import com.serzh.example.coursera.b_2_extenion.b_2_1_extension_functions.ExtensionFunctionsKt;

import static com.serzh.example.coursera.b_2_extenion.b_2_1_extension_functions.ExtensionFunctionsKt.lastChar2;
import static com.serzh.example.coursera.b_2_extenion.b_2_1_extension_functions.ExtensionFunctionsKt.repeat;

public class JavaClass {

    public static void main(String[] args) {
        char lastChar = ExtensionFunctionsKt.lastChar("abc");
        char lastChar2 = lastChar2("abc");

        String sf = repeat("sf", 1);
    }

}
