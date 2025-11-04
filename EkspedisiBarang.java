import java.util.Scanner;

public class EkspedisiBarang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan berat barang: ");
        int berat = input.nextInt();
        System.out.println("Masukkan panjang barang: ");
        int panjang = input.nextInt();
        System.out.println("Masukkan lebar barang: ");
        int lebar = input.nextInt();
        System.out.println("Masukkan tinggi barang: ");
        int tinggi = input.nextInt();
        

        int volume = panjang * lebar * tinggi;
        System.out.println("Volume barang adalah: " + volume + " cm");
        

        System.out.println("Masukkan jarak pengiriman: ");
        int jarak = input.nextInt();
        int biaya = 0;
        if (jarak <= 10) {
            biaya = 4250;
        } else
            if (jarak >= 10){
            biaya = 6000;
        }  
            

        double total;

        if (volume > 100 ){
 biaya = 50000;
        }
       
        total = biaya * berat;
        System.out.println("Jadi total biaya pengiriman adalah: " + total);
        System.out.println("Jadi total berat paket: " + berat);
        System.out.println("Jadi total volume: " + volume);
        System.out.println("Jadi total jarak: " + jarak);
        System.out.println("Jadi total biaya: " + biaya);

    }


       
    
    }