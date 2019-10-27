package modul3;

public class NPM06960Cucian {
    NPM06960Pegawai pegawai;
    NPM06960Pelanggan pelanggan;
    float berat, hargaTotal;
    
    void setPegawai(NPM06960Pegawai pegawai){
        this.pegawai = pegawai;
    }
    
    NPM06960Pegawai getPegawai(){
        return pegawai;
    }
    
    void setPelanggan(NPM06960Pelanggan pelanggan){
        this.pelanggan = pelanggan;
    }
    
    NPM06960Pelanggan getPelanggan(){
        return pelanggan;
    }
    
    void setBerat(float berat){
        float perKilo = 5000;
        this.berat = berat;
        this.hargaTotal = this.getBerat() * perKilo;
    }
    
    float getBerat(){
        return berat;
    }
    
    float getHargaTotal(){
        return hargaTotal;
    }
}
