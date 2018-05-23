package regex;


import java.util.regex.Pattern;
import sun.applet.Main;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ijhar
 */
public class Quantifires {
    public static void main(String[] args) {
        System.out.println(Pattern.matches("[amn]?","n"));
        System.out.println(Pattern.matches("[amn]+","amnn"));
        System.out.println(Pattern.matches("[amn]*","amnn"));//zero or more
         

    }
    
}
