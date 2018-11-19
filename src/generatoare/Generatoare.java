/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generatoare;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import static java.lang.Character.getNumericValue;
import java.math.BigInteger;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Sofia Kub
 */
public abstract class Generatoare {

    public String XOR(String a, String b) {
        String c = new String();
        for (int i = 0; i < a.length(); i++) {
            int l = getNumericValue(a.charAt(i));
            int m = getNumericValue(b.charAt(i));
            if (l == 0 & m == 0) {
                c = c.concat("0");
            }
            if (l == 0 & m == 1) {
                c = c.concat("1");
            }
            if (l == 1 & m == 0) {
                c = c.concat("1");
            }
            if (l == 1 & m == 1) {
                c = c.concat("0");
            }

        }
        return c;
    }

    public String binar(String a) {

        String binary = new BigInteger(a.getBytes()).toString(2);
        return binary;
    }

    abstract String getAlpha(Integer lungime) throws FileNotFoundException, IOException;

    public static void main(String[] args) {
        Generator1 x = new Generator1();
        String d;
        Scanner sc = new Scanner(System.in);
        d = sc.next();

    }

}
