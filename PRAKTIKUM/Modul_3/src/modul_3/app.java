package modul_3;
import java.util.Scanner;
public class app{
    
    public static void main(String[] args) {
        search data = new search();
        
        Scanner in = new Scanner(System.in);
        
        data.sort.setdata(0, 1);
        data.sort.setdata(1, 4);
        data.sort.setdata(2, 12);
        data.sort.setdata(3, 15);
        data.sort.setdata(4, 25);
        data.sort.setdata(5, 33);
        data.sort.setdata(6, 3);
        data.sort.setdata(7, 20);
        data.sort.setdata(8, 19);
        data.sort.setdata(9, 21);
        
        System.out.println("Data:");
        data.cetak();
        int cari;
        System.out.print("Masukkan Angka: ");
        cari = in.nextInt();
        
        System.out.println("Pilihan Cari\n1.Sequential search\n2.Binary search\nPilih ");
        int pilih = in.nextInt();
        
        switch(pilih){
            case 1:
                data.seq_search(cari);
                break;
                
                case 2:
                    data.bin_search(cari);
                    break;
        }
        
    }
    
}
