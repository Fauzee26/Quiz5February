package fauzi.hilmy.quiz5february;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ActivityDetailRestoran extends AppCompatActivity {

    TextView lblNama, lblAlamat;

    String nama, alamat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_restoran);

        Intent gfds = getIntent();
        nama = gfds.getStringExtra("nama");
        alamat = gfds.getStringExtra("alamat");

        lblNama = (TextView)findViewById(R.id.lblNama);
        lblAlamat = (TextView)findViewById(R.id.lblAlamat);

        lblNama.setText(nama);
        lblAlamat.setText("Alamat : " + alamat);
    }
}
