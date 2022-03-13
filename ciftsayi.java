import java.util.Scanner;

public class ciftsayi {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);

        int sayi;
        int sum = 0;
        int count = -1;

        System.out.println("Sayıyı giriniz: ");
        sayi = inp.nextInt();

        for(int i = 0; i < sayi ; i++){
            if(i % 3 == 0 && i % 4 == 0){
                sum += i;
                count++;
            }
        }
        double cevap = sum / count;

        System.out.println("Cevap: " + cevap);
    }
}