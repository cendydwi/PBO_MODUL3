package modul3;

public class NPM06960Pegawai extends NPM06960Manusia{
    int id;
    String kataSandi;
    
    void setId(int id){
        this.id = id;
    }
    
    int getId(){
        return id;
    }
    
    void setKataSandi(String kataSandi){
        this.kataSandi = kataSandi;
    }
    
    String getKataSandi(){
        return kataSandi;
    }
}
