import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random rand = new Random();
        int int_random = rand.nextInt(11);//0-10 arası sayı üret
        Scanner scan = new Scanner (System.in);
        System.out.println("1-10 arası bir sayıyı tahmin ediniz");
        while(true){
try{
    int sayi =scan.nextInt();
    if (int_random == sayi) {
        System.out.println("Tebrikler bildiniz " + int_random);
        break;
    } else if (int_random > sayi) {
        System.out.println("Sayınız küçük,yeniden deneyin");
    } else {
        System.out.println("Sayınız büyük, yeniden deneyin");
    }
}
catch (Exception e){
    System.out.println("Sayı girmelisiniz, yeniden başlatın");
    break;
}
        }

        }
}