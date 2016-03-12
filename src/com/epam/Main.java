package com.epam;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Hrinchenko on 12.03.2016.
 */
public class Main {
    public static boolean checkPersonWithRegExp(String userNameString) {
        Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]*");
        Matcher match = pattern.matcher(userNameString);
        return match.matches();
    }
    public static void main(String[] args) {

        String[] array = {"VOVA", "Ivan", "R2d2", "ZX", "Anna", "12345", "ToAd", "TomCat", "Bolto", "Bright", "RoS2"};
        for (String element : array) {
            System.out.println(checkPersonWithRegExp(element));
        }
    }
}
