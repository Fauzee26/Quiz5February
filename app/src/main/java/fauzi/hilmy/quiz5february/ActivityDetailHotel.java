package fauzi.hilmy.quiz5february;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ActivityDetailHotel extends AppCompatActivity {

    TextView lblNama, lblAlamat, lblHarga, lblFasilitas;
    ImageView img;
    String nama, alamat, harga, fasilitas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_hotel);

        Intent aadf = getIntent();
        nama = aadf.getStringExtra("namaa");
        alamat = aadf.getStringExtra("alamata");
        fasilitas = aadf.getStringExtra("fasilitasa");
        harga = aadf.getStringExtra("hargaa");

        lblNama = (TextView)findViewById(R.id.lblNama);
        lblAlamat = (TextView)findViewById(R.id.lblAlamat);
        lblHarga = (TextView)findViewById(R.id.lblHarga);
        lblFasilitas = (TextView)findViewById(R.id.lblFasilitas);
        img = (ImageView)findViewById(R.id.img);

        lblNama.setText(nama);
        lblAlamat.setText("Alamat : " + alamat);
        lblHarga.setText("Harga : " + harga);
        lblFasilitas.setText("Fasilitas : " + fasilitas);
        Bundle mBundle = getIntent().getExtras();

        if (mBundle != null){

            img.setImageResource(mBundle.getInt("gambara"));
        }
    }
}
