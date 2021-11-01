
package com.crypting.jboussouf;

import java.util.Scanner;


public class ComCryptingJBoussouf {

    
    public static void main(String[] args) {
        String crypte= "";
        
        //entre du text
        Scanner input = new Scanner(System.in);
        System.out.print("donner le text qui vous vodrez a crypter: ");
        String txt = input.nextLine();
        txt = txt.toLowerCase();
        
        //entrer de clée
        System.out.print("donner le clée de cryptage: ");
        int key = input.nextInt();
        key = key%26;
         
        for (int i = 0; i < txt.length(); i++) {
            char c = txt.charAt(i);
            if (c != ' ') {
                int code = (int) c;
            
                code += key;
                if (code>122) {
                    int d = c - 120;
                    code = d+98;
                }
            
                crypte += (char) code;
            } else {
                crypte += ' ';
            }
            
        }
        System.out.println(crypte);
        
    }
    
    
}
