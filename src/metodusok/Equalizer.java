/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodusok;

import java.util.Random;

/**
 *
 * @author berta
 */
    
public class Equalizer {
    private static Random rnd =new Random();
    public static void main(){
       eq5();
    }
    public static void eq5(){
            eq();
            eq();
            eq();
            eq();
            eq();
            
    }
    public static void eq(){
        int db= rnd.nextInt(3,8);
        eq(db);
        
    }  
    private static void eq(int hossz){
       int db= hossz;
        String szin = "\u001B[45m";
        for (int i = 0; i < db; i++) {
            System.out.println(szin + " ");
    }
        System.out.println("");
    }
    private static void eq(){
        boolean True;
        if (true){
            eq(0);
    }
    
    private static void eq(){
        eq(true);
       
}
