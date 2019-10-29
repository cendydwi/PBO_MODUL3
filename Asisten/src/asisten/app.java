package asisten;
import java.util.Scanner;

public class app{
    static void menu(){
        System.out.print("Menu\n1.Input Data\n2.Cetak\nPilih ");
    }
    
    public static void main(String[] args) {
        kelompok data = new kelompok();
        Scanner input = new Scanner(System.in);
        
        String nama, alamat, gender;
        int umur, pilih = 0;
        do {          
            menu();
            pilih = input.nextInt();
            
            switch(pilih){
                case 1:
                    System.out.println("");
                    input.nextLine();
                    System.out.print("Masukkan Nama: ");nama = input.nextLine();
                    System.out.print("Masukkan Umur: ");umur = input.nextInt();
                    input.nextLine();
                    System.out.print("Masukkan Alamat: ");alamat = input.nextLine();
                    System.out.print("Masukkan Jenis Kelamin(L/P): ");gender = input.nextLine();
                    data.sort.setNama(nama);
                    data.sort.setUmur(umur);
                    data.sort.setAlmt(alamat);
                    data.sort.setGndr(gender);
                    System.out.println("");
                    break;
                    
                case 2:
                    data.cetak();
                    break;
            }
            
        } while (pilih != 3);
        
    }
}
