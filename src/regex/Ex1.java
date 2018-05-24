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
public class Ex1 {
    public static void main(String[] args) {
        System.out.println(Pattern.matches("[a-zA-Z0-9]{5}","12klo"));//alfanumeric
        System.out.println(Pattern.matches("[123]{1}[0-9]{9}","12klo"));//alfanumeric
        System.out.println(Pattern.matches("[123]{1}[0-9]{9}","1569878963"));
        System.out.println(Pattern.matches("[123]\\d{9}","3969696969"));
        System.out.println(Pattern.matches("[123]\\d{9}","8969696969"));
        
        
        
    }
    
}
