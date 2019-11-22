package tugas_dosen;
import java.util.ArrayList;

public class data {
    public ArrayList angka = new ArrayList();
    
    void setAngka(int angka){
        this.angka.add(angka);
    }
    
    int getAngka(int i){
        return (int) angka.get(i);
    }
    
    int search(int cari){
        int found = 0;
        for(int i = 0; i<angka.size(); i++){
            int angka = getAngka(i);
            if(angka == cari){
                found = i;
                break;
            }else{
                found = -1;
            }
        }
        return found;
    }
    
}
