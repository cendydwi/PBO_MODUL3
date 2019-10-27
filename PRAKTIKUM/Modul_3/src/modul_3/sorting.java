package modul_3;

public class sorting extends data{
    void sorting() {
        System.out.println("\nHasil Sorting: ");
        int temp, kecil;
            for(int i = 0; i < 10 ; i++){
                kecil = i;
                for(int j = i+1; j < 10; j++){
                    if (getdata(j) < getdata(kecil))
                        kecil = j;
                }
              
                temp = getdata(i);
                setdata(i,getdata(kecil));
                setdata(kecil, temp);
            }
    }
}
