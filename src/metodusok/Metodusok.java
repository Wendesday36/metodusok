/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package metodusok;

/**
 *
 * @author berta
 */
public class Metodusok {

    public static void main(String[] args, int osszeg) {
        String kimenet ="Elso 10 szam osszege:"+elso10szamosszege();
        kiir(kimenet);
        
        
        int szam1 =4, szam2= 5;
        osszeg = osszead(szam1,szam2);
        kiir("%d +%+d = %d\n".formatted(szam1,szam2,osszeg));
    }
    public static int elso10szamosszege() {
      int osszeg = 0;
        for (int i = 0; i < 10; i++) {
            osszeg += i;
            
        }
        return osszeg;
    }

   
    public static int osszead(int a,int b){
        return a +b;
    }
    public static void kiir(String szoveg) {
        System.out.println(szoveg);
    }
    
}
