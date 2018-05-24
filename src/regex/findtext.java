/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author ijhar
 */
public class findtext {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter regex");
        Pattern p=Pattern.compile(sc.nextLine());
        System.out.println("Enter  text ");
        Matcher m=p.matcher(sc.nextLine());
        boolean f=false;
        while(m.find())
        {
               System.out.println("found text from index "+m.start()+" to "+m.end());
               f=true;
        }
        if(!f)
        {
               System.out.println("not found");
        
        }
    }
}
