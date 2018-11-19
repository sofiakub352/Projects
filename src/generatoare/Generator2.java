/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generatoare;

import java.io.FileNotFoundException;
import java.io.IOException;
import static java.lang.Character.getNumericValue;
import java.math.BigInteger;
import java.util.Random;

/**
 *
 * @author Sofia Kub
 */
public class Generator2 extends Generatoare {

    public String getAlpha(Integer lungime) {
        String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < lungime) { // length of the random string.
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        String saltStr = salt.toString();
        return saltStr;
    }

}
