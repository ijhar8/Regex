/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regex;

import java.util.regex.Pattern;

/**
 *
 * @author ijhar
 */
public class metachar {
    public static void main(String[] args) {
        System.out.println(Pattern.matches("\\d", "2"));
        System.out.println(Pattern.matches("\\d+", "222"));
        System.out.println(Pattern.matches("\\w?", "l"));
        System.out.println(Pattern.matches("\\D..", "p22"));
        System.out.println(Pattern.matches("\\w", "3"));
    }
    
    
}
