package fauzi.hilmy.quiz5february;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ActivityDetailMall extends AppCompatActivity {
    TextView lblNama, lblAlamat, lblTelepon;

    String nama, alamat, telepon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_mall);
        Intent fgh = getIntent();
        nama = fgh.getStringExtra("nama");
        alamat = fgh.getStringExtra("alamat");
        telepon = fgh.getStringExtra("telepon");

        lblNama = (TextView)findViewById(R.id.lblNama);
        lblAlamat = (TextView)findViewById(R.id.lblAlamat);
        lblTelepon = (TextView)findViewById(R.id.lblTelepon);

        lblNama.setText(nama);
        lblAlamat.setText("Alamat : " + alamat);
        lblTelepon.setText("No telp : " + telepon);
    }
}
