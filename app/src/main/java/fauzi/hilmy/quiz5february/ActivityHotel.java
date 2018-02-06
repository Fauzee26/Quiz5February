package fauzi.hilmy.quiz5february;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class ActivityHotel extends AppCompatActivity {
    ListView lvResult;
    String[][] data = new String[][]{{"greenland", "GREENLAND HOTEL BATAM CENTER", "Komp. Ruko Greenland, Blok J, No. 10 – 16, Batam Center", "Koneksi internet gratis di setiap ruangan, spa, massage, BBQ, restoran, lounge, dan conference room.", "Rp 194.458* per malam."},
            {"harbour", "HARBOUR BAY AMIR HOTEL BATAM", "jalan Duyung, Batu Ampar", "AC, TV, DVD player, minibar, kulkas, sandal, kamar mandi dan peralatan mandi yang lengkap.", "Rp 212.893* per malam"},
            {"nagoya", "NAGOYA ONE HOTEL", "Komplek Nagoya Square Blok E No 9 – 18, Nagoya", "fitness center, coffee shop, laundry, dan conference room", "Rp 245.868* per malamnya"},
            {"zest", "ZEST HOTEL HARBOUR BAY BATAM", "Dari Nagoya One Hotel, kamu bisa berkunjung ke Nagoya Hill Mall dengan hanya 10 menit berkendara.", "TV, AC, safety box, kamar mandi dan perlengkapan mandi", "Rp 247.933* per malam"},
            {"kireinn", "HOTEL KIREINN", "jalan Tanjung Pantun, Block F No. 7/8, Seijodoh, Nagoya", "TV, AC, koneksi Wi-Fi gratis, kamar mandi dan perlengkapan mandi.", "Rp 252.893* per malamnya."}};
    int[] dataGambar = {

            R.drawable.greenland, R.drawable.harbour, R.drawable.nagoya, R.drawable.zest,
            R.drawable.kireinn
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel);
        lvResult = (ListView) findViewById(R.id.lv_result);

        lvResult.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent a1 = new Intent(ActivityHotel.this, ActivityDetailHotel.class);
                a1.putExtra("gambara", dataGambar[i]);
                a1.putExtra("namaa", data[i][1]);
                a1.putExtra("alamata", data[i][2]);
                a1.putExtra("fasilitasa", data[i][3]);
                a1.putExtra("hargaa", data[i][4]);
                startActivity(a1);
            }
        });

        ListAdapImage adapter = new ListAdapImage(ActivityHotel.this, data);
        lvResult.setAdapter(adapter);
    }
}
