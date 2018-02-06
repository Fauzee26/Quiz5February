package fauzi.hilmy.quiz5february;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ActivityDetailSchool extends AppCompatActivity {
    TextView lblNama, lblAlamat, lblTelepon;

    String nama, alamat, telepon;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_school);

        Intent aa = getIntent();
        nama = aa.getStringExtra("nama");
        alamat = aa.getStringExtra("alamat");
        telepon = aa.getStringExtra("telepon");

        lblNama = (TextView)findViewById(R.id.lblNama);
        lblAlamat = (TextView)findViewById(R.id.lblAlamat);
        lblTelepon = (TextView)findViewById(R.id.lblTelepon);

        lblNama.setText(nama);
        lblAlamat.setText("Alamat : " + alamat);
        lblTelepon.setText("No telp : " + telepon);
    }
}
