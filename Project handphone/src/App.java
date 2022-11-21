import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

import javax.transaction.xa.Xid;

import app.Infinix;
import app.Iphone;
import app.Menu;
import app.Phone;
import app.PhoneUser;
import app.Samsung;
import app.Xiomi;
public class App {
    public static void main(String[] args) throws Exception {
        int pilihan;
        Scanner cin = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Menu menuX = new Menu();
        PhoneUser redmi10 = new PhoneUser(new Xiomi("Xiomi redmi10"));
        PhoneUser iphone14 = new PhoneUser(new Iphone("Iphone 14"));
        PhoneUser samsungS8 = new PhoneUser(new Iphone("Samsung S8"));
        PhoneUser infinixHot12 = new PhoneUser(new Infinix("Infinix Hot 12"));
        PhoneUser fadil; 
        
        do{
            pilihan = menuX.piliHp(null);

            switch(pilihan){
                case 1 :
                    fadil = redmi10;
                    do{
                        pilihan = menuX.pilihFitur(fadil);
                        System.out.println();
                        switch(pilihan){
                            case 1 :
                                fadil.turnOnThePhone();
                                break;
                            case 2 : 
                                fadil.makePhoneLouder();
                                break;
                            case 3 : 
                                fadil.makePhoneSilent();
                                break;
                            case 4 : 
                                fadil.turnOffThePhone();
                                break;
                            case 0 :
                                break;
                            default :
                                System.out.println("Pilihan Anda salah");
                                break;
                        }
                        if(pilihan != 0){
                            System.out.print("Keluar ? (1/0) : ");
                            int keluar = cin.nextInt();
                            if(keluar == 1) pilihan = 0;
                        }      
                    }while(pilihan != 0);
                    pilihan = 1;
                    break;
                case 2 :
                    fadil = iphone14;
                    do{
                        pilihan = menuX.pilihFitur(fadil);

                        switch(pilihan){
                            case 1 :
                                fadil.turnOnThePhone();
                                break;
                            case 2 : 
                                fadil.makePhoneLouder();
                                break;
                            case 3 : 
                                fadil.makePhoneSilent();
                                break;
                            case 4 : 
                                fadil.turnOffThePhone();
                                break;
                            case 0 :
                                break;
                            default :
                                System.out.println("Pilihan Anda salah");
                                break;
                        }
                        if(pilihan != 0){
                            System.out.print("Keluar (1/0) : ");
                            int keluar = cin.nextInt();
                            if(keluar == 1) pilihan = 0;
                        }      
                    }while(pilihan != 0);
                    pilihan = 1;
                    break;
                case 3 :
                    fadil = samsungS8;
                    do{
                        pilihan = menuX.pilihFitur(fadil);

                        switch(pilihan){
                            case 1 :
                                fadil.turnOnThePhone();
                                break;
                            case 2 : 
                                fadil.makePhoneLouder();
                                break;
                            case 3 : 
                                fadil.makePhoneSilent();
                                break;
                            case 4 : 
                                fadil.turnOffThePhone();
                                break;
                            case 0 :
                                break;
                            default :
                                System.out.println("Pilihan Anda salah");
                                break;
                        }
                        if(pilihan != 0){
                            System.out.print("Keluar (1/0) : ");
                            int keluar = cin.nextInt();
                            if(keluar == 1) pilihan = 0;
                        }      
                    }while(pilihan != 0);
                    pilihan = 1;
                    break; 
                case 4 :
                    fadil = infinixHot12;
                    do{
                        pilihan = menuX.pilihFitur(fadil);

                        switch(pilihan){
                            case 1 :
                                fadil.turnOnThePhone();
                                break;
                            case 2 : 
                                fadil.makePhoneLouder();
                                break;
                            case 3 : 
                                fadil.makePhoneSilent();
                                break;
                            case 4 : 
                                fadil.turnOffThePhone();
                                break;
                            case 0 :
                                break;
                            default :
                                System.out.println("Pilihan Anda salah");
                                break;
                        }
                        if(pilihan != 0){
                            System.out.print("Keluar (1/0) : ");
                            int keluar = cin.nextInt();
                            if(keluar == 1) pilihan = 0;
                        }      
                    }while(pilihan != 0);
                    pilihan = 1;
                    break;
                default :
                    System.out.println("Pilihan Anda salah");
                    break;
            }
            
        }while(pilihan != 0);
    }
}
