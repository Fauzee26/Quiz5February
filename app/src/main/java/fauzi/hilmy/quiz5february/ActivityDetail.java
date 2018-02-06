package fauzi.hilmy.quiz5february;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ActivityDetail extends AppCompatActivity {

    TextView lblNama, lblLetak, lblAlamat, lblTelepon;
    String nama, letak, alamat, telepon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent aqwer = getIntent();
        nama = aqwer.getStringExtra("nama");
        letak = aqwer.getStringExtra("letak");
        alamat = aqwer.getStringExtra("alamat");
        telepon = aqwer.getStringExtra("telepon");

        lblNama = (TextView)findViewById(R.id.lblNama);
        lblLetak = (TextView)findViewById(R.id.lblLetak);
        lblAlamat = (TextView)findViewById(R.id.lblAlamat);
        lblTelepon = (TextView)findViewById(R.id.lblTelepon);

        lblNama.setText(nama);
        lblLetak.setText(letak);
        lblAlamat.setText("Alamat : " + alamat);
        lblTelepon.setText("No telp : " + telepon);
    }
}
