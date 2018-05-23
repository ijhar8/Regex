/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regex;

import java.util.regex.*;

/**
 *
 * @author ijhar
 */
public class Regex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Pattern exp=Pattern.compile("s.");
      System.out.println(exp.matcher("si").matches());   
    }
    
}
