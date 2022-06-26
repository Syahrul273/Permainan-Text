import java.util.Scanner;

public class TebakKata {

    static Scanner cin = new Scanner(System.in);

    public static void main(String[] args){

        int benar = 0;

        int salah=0;

        int kesempatan = 12;

        System.out.println("+----------------------------------------------------+");
        System.out.println("       Selamat Datang di game tebak kata HORI20N      ");
        System.out.println("!Perhatikan setiap tanda - itu menentukan panjang nama");
        System.out.println("        Perhatikan setiap pilihan A/B/C/D            ");
        System.out.println("+----------------------------------------------------+");
        String[][] tebakhori = {

                {"Kata Kunci Orangnya Besar ","\n A. ------ \n B. ---- \n C. ----","A Engkel"},
                {"Kata Kunci China ","\n A. ---- \n B. ---- \n C. ---","B Chou"},
                {"Kata Kunci tai lalat di mata ","\n A. ---- \n B. ----- \n C. ---","B Nadia"},
                {"Kata Kunci sipaling cool ","\n A. ----- \n B. ---- \n C. ----","B Muiz"},
                {"Kata Kunci sipaling Hacker ","\n A. ---- \n B. --- \n C. ----- -----","C Rizki Madya"},
                {"Kata Kunci sipaling banyak tidur ","\n A. ----- \n B. ---- \n C. ------","A Fadli"},
                {"Kata Kunci yang pegang korea selatan ","\n A. ----- \n B. ---- \n C. --- ---- --","B Allu"},
                {"Kata Kunci sipaling setia ","\n A. ---- \n B. ---- \n C. -----","A Muiz"},
                {"Kata Kunci Orang Jawa ","\n A. --- --- \n B. ---- \n C. ---","A Mas Tin"},
                {"Kata Kunci sipaling ROG ","\n A. ----- \n B. ----- \n C. -----","A Boska"},
                {"Kata Kunci Orang Korea ","\n A.------  \n B. ----- \n C. ------","C Nuuran"},
                {"Kata Kunci Ketua Horizon ","\n A. ----- \n B. ----- \n C. ----","C Amul"},
        };



        String[] bermain = new String[(int) kesempatan];

        int i=0;



        do {

            System.out.print("" + (i+1) + ". " + tebakhori[i][0] + "   "+tebakhori[i][1]);
            bermain[i] = String.valueOf(cin.next().charAt(0));
            if(tebakhori[i][2].equals(bermain[i])) {
                System.out.println("\n anda benar!");
                benar++;
            }else{
                System.out.println("\n jawaban benar "+tebakhori[i][2]);
                salah--;
            }
            i++;


        }while(i<kesempatan);



        System.out.println("\n Jawaba salah: "+ benar);
        System.out.println("\n Jawaban benar : "+ salah);
        System.exit(0);

    }
}