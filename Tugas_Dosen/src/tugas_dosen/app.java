package tugas_dosen;
import java.awt.event.*;

public class app extends Frame{
    data data = new data();

    public app() {
        label_angka.setBounds(20, 60, 200, 30);
        frame.add(label_angka);
        form_angka.setBounds(85, 70, 110, 20);
        frame.add(form_angka);
        btn_submit.setBounds(200, 70, 90, 20);
        btn_submit.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                int angka = Integer.parseInt(form_angka.getText());
                data.setAngka(angka);
                System.out.println("Angka "+angka+" Telah Dimasukkan");
            }
        });
        frame.add(btn_submit);
        
        label_search.setBounds(20, 120, 200, 30);
        frame.add(label_search);
        form_search.setBounds(85, 130, 110, 20);
        frame.add(form_search);
        btn_search.setBounds(200, 130, 90, 20);
        btn_search.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                String output;
                int cari = Integer.parseInt(form_search.getText());
                int found = data.search(cari);
                if(found != -1){
                    output = "Data Ada di Index ke - "+found;
                    hasil.setText(output);
                }else{
                    output = "Data Tidak Ditemukan";
                    hasil.setText(output);
                }
            }
        });
        frame.add(btn_search);
        
        hasil.setBounds(20, 180, 260, 100);
        frame.add(hasil);
        
        frame.setLayout(null);
        frame.setSize(300, 500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args) {
        new app();
    }
}
