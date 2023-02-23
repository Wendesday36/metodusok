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

    public static void main() {
         
      feladatok();
        
        
      
       
    }
    
    public static void feladatok(){
        feladat1();
        feladat2();
    }
    public static void feladat1(){
        int osszeg= elso10szamosszege();
       String kimenet = "az elso 10 szám osszege: "+osszeg+ "\n";
       kiir(kimenet);
       
       int szam1 = 7, szam2=4;
       osszeg = osszead(szam1,szam2);
       kiir("%d + %d = %d\n.".formatted(szam1,szam2,osszeg));
        osszeg =osszead(1, 2);
        osszeg =osszead(osszeg, 3);
        osszeg =osszead(osszeg, 4);
        kiir("1+2+3+4="+osszeg+"\n");
    }
    public static void feladat2(){
        feladat1();
        double gyok;
        int osszeg = osszead(7,5);
        osszeg = osszead(osszeg,4);
        gyok = Math.sqrt(osszeg);
       
        kiir("7+5+4 gyoke ="+gyok);
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
