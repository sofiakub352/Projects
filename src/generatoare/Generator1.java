/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generatoare;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import static java.lang.Character.getNumericValue;
import java.math.BigInteger;
import java.util.Random;

/**
 *
 * @author Sofia Kub
 */
class Generator1 extends Generatoare {

    public String getAlpha(Integer lungime) throws FileNotFoundException, IOException {
        {
            char[] ch = {
                'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L',
                'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X',
                'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j',
                'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v',
                'w', 'x', 'y', 'z'};

            char[] c = new char[lungime];
            Random random = new Random();
            for (int i = 0; i < lungime; i++) {
                c[i] = ch[random.nextInt(ch.length)];
            }

            return new String(c);
        }
    }

}
