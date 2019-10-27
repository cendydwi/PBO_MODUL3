package modul_3;

public class data {
    private int[] data = new int[10];

    public void setdata(int i, int angka) {
        this.data[i] = angka;
    }
    
    public  int getdata(int i){
        return data[i];
    }
    
    public int banyakdata(){
        int banyak = data.length;
        return banyak;
    }
}
