import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String burc = null;


        System.out.println("Dogum Yilinizi Giriniz");
        int year = input.nextInt();

        if (year >= 12) {
            int mod = year % 12;

            switch (mod) {
                case 0:
                    burc = "Maymun";
                    break;
                case 1:
                    burc = "Horoz";
                    break;

                case 2:
                    burc = "Kopek";
                    break;
                case 3:
                    burc = "Domuz";
                    break;
                case 4:
                    burc = "Fare";
                    break;
                case 5:
                    burc = " Okuz";
                    break;
                case 6:
                    burc = "Kaplan";
                    break;
                case 7:
                    burc = "Tavsan";
                    break;
                case 8:
                    burc = "Ejderha";
                    break;

                case 9:
                    burc="Yilan";
                    break;
                case 10:
                    burc="At";
                    break;
                case 11:
                    burc="Koyun";

                default:System.out.println("Yanlis giris yaptiniz!");

            }
        } else {
            System.out.println("Hatali giris yaptiniz!");
        } System.out.println("Cin Zodyagi Burcunuz:"+burc);


        System.out.println("Sitemizi Kullandiginiz icin tesekkur ederiz!");
    }
}