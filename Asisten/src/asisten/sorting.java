package asisten;

public class sorting extends data{
    void sorting() {
        int tempUmr, kecil;
        String tempNama, tempAlmt, tempGndr;
        
            for(int i = 0; i < getSize() ; i++){
                kecil = i;
                for(int j = i+1; j < getSize(); j++){
                    if (getUmur(j) < getUmur(kecil))
                        kecil = j;
                }
                
                tempNama = getNama(i);
                edtNama(i, getNama(kecil));
                edtNama(kecil, tempNama);
                
                tempUmr = getUmur(i);
                edtUmur(i,getUmur(kecil));
                edtUmur(kecil, tempUmr);
                
                tempAlmt = getAlmt(i);
                edtAlmt(i,getAlmt(kecil));
                edtAlmt(kecil, tempAlmt);
                
                tempGndr = getGndr(i);
                edtGndr(i,getGndr(kecil));
                edtGndr(kecil, tempGndr);
            }
    }
    
}
