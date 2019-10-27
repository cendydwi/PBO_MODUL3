package modul3;
import java.util.ArrayList;
import java.util.Scanner;

public class NPM06960Main {
    static Scanner scan = new Scanner(System.in);
    static ArrayList<NPM06960Pegawai> pegawaiArr = new ArrayList<>();
    static ArrayList<NPM06960Pelanggan> pelangganArr = new ArrayList<>();
    static ArrayList<NPM06960Cucian> cucianArr = new ArrayList<>();
    
    public static void main(String[] args) {
        int menu;
        do{
            System.out.println("\n\nSisten Informasi Laundry!!!");
            NPM06960Main.tampilkanData();
            
            System.out.println("\n\nMenu: ");
            System.out.println("1. Tambah Kasir");
            System.out.println("2. Tambah Pelanggan");
            System.out.println("3. Tambah Transaksi");
            System.out.println("0. Selesai");
            System.out.println("Masukkan nomor menu: ");menu = scan.nextInt();
            
            switch(menu){
                case 1:
                    NPM06960Main.tambahKasir();
                    break;
                    
                case 2:
                    NPM06960Main.tambahPelanggan();
                    break;
                    
                case 3:
                    NPM06960Main.tambahCucian();
                    break;
                
                default:
                    menu = 0;
                    System.out.println("Terima kasih telah menggunakan Sistem Informasi Laundry!!");
            }
        }while(menu != 0);
    }
    
    static void tampilkanData(){
        System.out.println("\n\nData Pegawai: ");
        for(int i = 0; i < pegawaiArr.size(); i++){
            System.out.println("ID Pegawai: "+ pegawaiArr.get(i).getId() +
                    ", Nama: "+ pegawaiArr.get(i).getNama() +
                    ", No HP: "+pegawaiArr.get(i).getNoHP());
        }
        
        System.out.println("\n\nData Pelanggan: ");
        for(int i = 0; i < pelangganArr.size(); i++){
            System.out.println("ID Pelanggan: "+ pelangganArr.get(i).getId() +
                    ", Nama: "+ pelangganArr.get(i).getNama() +
                    ", No HP: "+pelangganArr.get(i).getNoHP());
        }
        
        System.out.println("\n\nData Cucian: ");
        for(int i = 0; i < cucianArr.size(); i++){
            System.out.println("Nama Pegawai: "+ cucianArr.get(i).getPegawai().getNama() +
                    ", Nama Pelanggan: "+ cucianArr.get(i).getPelanggan().getNama() +
                    ", Berat Cucian: "+ cucianArr.get(i).getBerat() +"KG, Harga Total Cucian: Rp. " +
                    cucianArr.get(i).getHargaTotal());
        }
    }
    
    static void tambahKasir(){
        System.out.println("Tambah Data Pegawai!");
        NPM06960Pegawai pegawai = new NPM06960Pegawai();
        
        System.out.println("ID Pegawai: "+ String.valueOf(pegawaiArr.size()+1));
        pegawai.setId(pegawaiArr.size()+1);
        System.out.print("Nama Pegawai: ");pegawai.setNama(scan.next());
        System.out.print("Kata Sandi Pegawai: ");pegawai.setKataSandi(scan.next());
        System.out.print("Nomor HP Pegawai: ");pegawai.setNoHP(scan.next());
        
        pegawaiArr.add(pegawai);
        
    }
    
    static void tambahPelanggan(){
        System.out.println("Tambah Data Pelanggan!");
        NPM06960Pelanggan pelanggan = new NPM06960Pelanggan();
        
        System.out.println("ID Pelanggan: "+ String.valueOf(pelangganArr.size()+1));
        pelanggan.setId(pelangganArr.size()+1);
        System.out.print("Nama Pelanggan: ");pelanggan.setNama(scan.next());
        System.out.print("Nomor HP Pelanggan: ");pelanggan.setNoHP(scan.next());
        
        pelangganArr.add(pelanggan);
        
    }
    
    static void tambahCucian(){
        System.out.println("Tambah Data Cucian!");
        NPM06960Cucian cucian = new NPM06960Cucian();
        
        System.out.println("ID Pegawai: ");
        cucian.setPegawai(pegawaiArr.get(scan.nextInt()-1));
        System.out.println("ID Pelanggan: ");
        cucian.setPelanggan(pelangganArr.get(scan.nextInt()-1));
        System.out.print("Berat Cucian (KG): ");cucian.setBerat(scan.nextFloat());
        System.out.print("Harga totalnya adalah: Rp. "+ cucian.getHargaTotal());
        
        cucianArr.add(cucian);
        
    }
}
