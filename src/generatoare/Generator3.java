/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generatoare;

import static java.lang.Character.getNumericValue;
import java.math.BigInteger;

/**
 *
 * @author Sofia Kub
 */
public class Generator3 extends Generatoare {

    private static final String ALPHA_NUMERIC_STRING = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

    public String getAlpha(Integer lungime) {

        StringBuilder builder = new StringBuilder();

        while (lungime-- != 0) {

            int character = (int) (Math.random() * ALPHA_NUMERIC_STRING.length());

            builder.append(ALPHA_NUMERIC_STRING.charAt(character));

        }

        return builder.toString();

    }

}
