package app;
import java.util.Scanner;
public class Menu {
    Scanner cin = new Scanner(System.in);
    public int piliHp(PhoneUser user){
            System.out.println();
            System.out.println("===== Menu Pilih Handphone =====");
            System.out.println();
            System.out.println("1. Xiomi");
            System.out.println("2. Iphone");
            System.out.println("3. Samsung");
            System.out.println("4. Infinix");
            System.out.println("0. Keluar");
            System.out.print("Silakan masukan pilihan Anda : ");
            return cin.nextInt();
    }
    public int pilihFitur(PhoneUser user){
        System.out.println();
        System.out.println("===== Menu =====");                
        System.out.println("Merek handphone : " + user.getType());
        System.out.println("Status : " + user.getStatus());
        System.out.println("Volume handphone : " + user.getVolume());
        System.out.println();
        System.out.println("1. Nyalakan handphone");
        System.out.println("2. Naikan volume");
        System.out.println("3. Turunkan volume");
        System.out.println("4. Matikan handphone");
        System.out.println("0. Ganti Hp");
        System.out.print("Silakan masukan pilihan Anda : ");
        return cin.nextInt();
    }
}
