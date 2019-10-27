package modul_3;

public class search {
    data angka = new data();
    sorting sort = new sorting();
    
    void seq_search(int cari){
        int found = 0;
        for(int i=0; i<10; i++){
                if(sort.getdata(i) == cari){
                    found = i+1;
                }
            }
        if(found == 0){
            System.out.println("\nData Tidak Ada");
        }else{
            System.out.println("\nData ada di index-"+found);
        }
    }
    
    
    void bin_search(int cari){
        sort.sorting();
        cetak();
        int awal = 0, akhir= sort.banyakdata()-1, found=0;
        for(int i = 0; i < sort.banyakdata(); i++){
            int tengah = (akhir-awal)/2;
            if(sort.getdata(i) == cari){
                found = i+1;
            }else if(sort.getdata(tengah) > cari){
                akhir = tengah - 1;
            }else{
                awal = tengah+1;
            }
        }
        
        if(found == 0){
            System.out.println("\nData Tidak Ada");
        }else{
            System.out.println("\nData ada di index-"+found);
        }
    }
    
    void cetak(){
        for(int i=0; i<10; i++){
                System.out.println(sort.getdata(i));
            }
        System.out.println("");
    }
    
}
