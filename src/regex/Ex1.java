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
    }
    
}
