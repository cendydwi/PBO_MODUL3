package asisten;
import java.util.ArrayList;

public class kelompok {
    data data = new data();
    sorting sort = new sorting();
    
    void cetak(){
        sort.sorting();
        System.out.println("\nBalita: ");
        for(int i = 0; i < sort.getSize(); i++){
            if(sort.getUmur(i) < 5){
                System.out.println("\nNama: " + sort.getNama(i));
                System.out.println("Umur: " + sort.getUmur(i));
                System.out.println("Alamat: " + sort.getAlmt(i));
                System.out.println("Jenis Kelamin: " + sort.getGndr(i) + "\n");
            }
        }
        
        System.out.println("\nAnak - Anak: ");
        for(int i = 0; i < sort.getSize(); i++){
            if(sort.getUmur(i) >= 5 && sort.getUmur(i) < 17){
                System.out.println("\nNama: " + sort.getNama(i));
                System.out.println("Umur: " + sort.getUmur(i));
                System.out.println("Alamat: " + sort.getAlmt(i));
                System.out.println("Jenis Kelamin: " + sort.getGndr(i) + "\n");
            }
        }
        
        System.out.println("\nDewasa: ");
        for(int i = 0; i < sort.getSize(); i++){
            if(sort.getUmur(i) >= 17 && sort.getUmur(i) < 50){
                System.out.println("\nNama: " + sort.getNama(i));
                System.out.println("Umur: " + sort.getUmur(i));
                System.out.println("Alamat: " + sort.getAlmt(i));
                System.out.println("Jenis Kelamin: " + sort.getGndr(i) + "\n");
            }
        }
        
        System.out.println("\nTua: ");
        for(int i = 0; i < sort.getSize(); i++){
            if(sort.getUmur(i) >= 50){
                System.out.println("\nNama: " + sort.getNama(i));
                System.out.println("Umur: " + sort.getUmur(i));
                System.out.println("Alamat: " + sort.getAlmt(i));
                System.out.println("Jenis Kelamin: " + sort.getGndr(i) + "\n");
            }
        }
        
    }
}
