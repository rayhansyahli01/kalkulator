/**
 * Write a description of class main1 here.
 *
 * @author rayhansyahli01
 * @version 0.5
 */
public class main1
{
    public static void main(String args[]){
        // menciptakan objek baru dari class Calculator
        kalkulator kalkul = new kalkulator();
        
       

         System.out.println("");
       double hasil1 = kalkul.jumlah();
       double hasil2 = kalkul.jumlah(3.4, 5.4);
       System.out.println("Hasil penjumlahan method jumlah tanpa parameter: "+ hasil1);
       System.out.println("Hasil penjumlahan method jumlah dengan parameter: "+ hasil2);

       System.out.println("");
       double hasil3 = kalkul.kurang();
       double hasil4 = kalkul.kurang(10, 5);
       System.out.println("Hasil perkurangan method kurang tanpa parameter: "+ hasil3);
       System.out.println("Hasil perkurangan method kurang dengan parameter: "+ hasil4);
    
       System.out.println("");
       double hasil5 = kalkul.kali();
       double hasil6 = kalkul.kali(3, 5);
       System.out.println("Hasil perkalian method kali tanpa parameter: "+ hasil5);
       System.out.println("Hasil perkalian method kali dengan parameter: "+ hasil6);

       System.out.println("");
       double hasil7 = kalkul.bagi();
       double hasil8 = kalkul.bagi(10, 2);
       System.out.println("Hasil Pembagian method bagi tanpa parameter: "+ hasil7);
       System.out.println("Hasil Pembagian method bagi dengan parameter: "+ hasil8);
    
    
   }       
    }