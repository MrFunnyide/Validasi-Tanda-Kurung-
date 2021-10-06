/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pemroggramanmahir;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class MainValidasiKurung {
    public static void main(String[] args) {
        
        
        validasiTandaKurung<String> validasiStack = new validasiTandaKurung<>(26);
        
        String input = "f(x)=(2x+y)-(3x+(2x-x)+20)";
        Scanner scan = new Scanner(input);
        
        scan.useDelimiter("");
        
        for (int i = 0; i < 26; i++) {
            String karakter = scan.next();
            
            // mengecek tanda kurung
            if (karakter.equals("(")) {
                validasiStack.push("(");
            } else if(karakter.equals(")")) {
                validasiStack.pop();
            }
        }
       
        // mengecek apakah valid atau tidak 
        if(validasiStack.isEmpety()) {
           System.out.println("valid");
        } else {
           System.out.println("tidak valid!");
       }
    }
}
