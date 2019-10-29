package asisten;
import java.util.ArrayList;

public class data {
    private ArrayList nama = new ArrayList();
    private ArrayList umur = new ArrayList();
    private ArrayList alamat = new ArrayList();
    private ArrayList gender = new ArrayList();
    
    int getSize(){
        return umur.size();
    }
    
    void setNama(String nama){
        this.nama.add(nama);
    }
    
    String getNama(int i){
        return (String) nama.get(i);
    }
    
    void edtNama(int i, String nama){
        this.nama.set(i, nama);
    }
    
    void setUmur(int umur){
        this.umur.add(umur);
    }
    
    int getUmur(int i){
        return (int) umur.get(i);
    }
    
    void edtUmur(int i, int Umur){
        this.umur.set(i, Umur);
    }
    
    void setAlmt(String alamat){
        this.alamat.add(alamat);
    }
    
    String getAlmt(int i){
        return (String) alamat.get(i);
    }
    
    void edtAlmt(int i, String alamat){
        this.alamat.set(i, alamat);
    }
    
    void setGndr(String gender){
        this.gender.add(gender);
    }
    
    String getGndr(int i){
        return (String) gender.get(i);
    }
    
    void edtGndr(int i, String gender){
        this.gender.set(i, gender);
    }
    
}
