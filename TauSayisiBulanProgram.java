
package tausayisibulanprogram;

import java.util.Scanner;

/**
 *
 * @author BuRKi_1903
 */
public class TauSayisiBulanProgram {
    
     static int sayi2 = 0;
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int sayi = 0;
        
        while(1 == 1){
            System.out.println("Bir sayi giriniz: ");
            sayi = scn.nextInt();
        
            if(sayi <= 0){
                System.out.println("Program durduruluyor...");
                break;
            }
            
            int bolen_sayisi = TauSayisiBulanProgram.top(sayi, sayi);
               System.out.println("Sayinin bolen sayisi: " + bolen_sayisi);
        
            if(sayi % bolen_sayisi == 0){
               System.out.println("Tau sayisidir.");

            } else {
                System.err.println("Tau sayisi degildir.");

            }
            sayi2 = 0;
        }
    }
    
    public static int top(int a, int b){
        
        if(a > 0){
            
            if(b % a == 0){
                sayi2++;
                return top(a-1, b);
            } else {
                return top(a-1, b);
            }
            
        } else {
            return sayi2;
        }
    }
}


   
