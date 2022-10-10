/*
Tau bir sayının, pozitif tam bölenlerinin sayısına tam bölünebilen sayılara denir. Örneğin 8 sayısının bölenleri 1,2,4 ve 8 dir. Yani 4 böleni var. 
4 sayısı 8 sayısını tam böleceğinden, 8 sayısı bir Tau sayısıdır.
*/

package tausayisibulanprogram;

import java.util.Scanner;

public class TauSayisiBulanProgram {
    
     static int sayi2 = 0; //Burada bölen sayılarını tutacağımız global bir değişken oluşturduk.
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int sayi = 0;
        
        while(1 == 1){ //Sonsuz bir döngü oluşturduk. Bu döngü duruma göre sonlanacak.
            
            System.out.println("Bir sayi giriniz: ");
            sayi = scn.nextInt();
        
            if(sayi <= 0){ //Eğer girilen sayı 0 veya negatifse program sonlanacak.
                System.out.println("Program durduruluyor...");
                break;
            }
            
            int bolen_sayisi = TauSayisiBulanProgram.top(sayi, sayi); //Rekursif fonksiyonumuza bölen sayısını bulması için girilen sayıyı gönderiyoruz.
               System.out.println("Sayinin bolen sayisi: " + bolen_sayisi); //İki kere gönderme sebebini aşağıda açıklayacağım. 
        
            if(sayi % bolen_sayisi == 0){ //Tau sayısının ana kuralı, en üstte bahsettiğimiz.
               System.out.println("Tau sayisidir.");

            } else {
                System.out.println("Tau sayisi degildir.");

            }
            sayi2 = 0; //Önemli! Sayıyı kontrol ettikten sonra global değişkenimiz olan bölen sayısına tekrar 0 atıyoruz. 
        }
    }
    
    public static int top(int a, int b){
        
        if(a > 0){
            
            if(b % a == 0){ //aslında a ve b sayısı aynı sayı ancak a sayısı az sonra değişirken b sabit kalacak.
                sayi2++; //eğer sayı, kendinden başlayarak 1 e kadar olan sayılara tam bölünüyorsa bölen sayısı yani sayi2 artacak<
                return top(a-1, b); //daha sonra sayının bir eksiğini gönderiyoruz. Örneğin 8 girildiyse 7,8 gönderilecek 8 % 7 kontorl edilecek bir sonraki etapta
                
            } else {
                return top(a-1, b); //eğer gelen sayı tam bölünmüyorsa böleni değildir, işlemlere devam ediyoruz.
            }
            
        } else {
            return sayi2; //Burada da artık bölen kontrolü olarak atadığımız a değeri 0 a geldise fonksiyonu durdurup bölen sayımızı döndürüyoruz.
        }
    }
}


   
