import java.util.Scanner;
public class maksVEminSayiBulma {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int max=0,min=0;

        System.out.print("Kaç sayı gireceksiniz:");
        int girisayi= input.nextInt();

        for(int i=1;i<=girisayi;i++){
            System.out.print(i+". sayıyı giriniz:");
            int sayi= input.nextInt();

            if(i==1){
                max=sayi;
                min=sayi;
            }
            if(sayi>=max){
                max=sayi;
            }
           else if(sayi<=min){
                min=sayi;
            }
        }
        System.out.println("*********************");
        System.out.print("Maksimum değer:"+max);
        System.out.print("\nMinimum değer:"+min);
    }
}
