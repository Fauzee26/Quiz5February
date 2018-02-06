package fauzi.hilmy.quiz5february;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class ActivityRestoran extends AppCompatActivity {
    ListView lvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restoran);
        lvResult = (ListView) findViewById(R.id.lv_result);

        final String[][] data = new String[][]{{"Pondok Gurih", "Jl. Engku Putri No. 8A (seberang Masjid Agung Batam)"}, {"Salero Basamo", "Jl. Engku Putri Blok C3 No. 12 B"}, {"Racikan Bumbu Sunda", "Mega Mall lantai 1"}
                , {"Bakso Lapangan Tembak", "Mega Mall lantai 2"}, {"Mie Zhou", "Mitra Raya Blok F No. 7"}};

        lvResult.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent aq = new Intent(ActivityRestoran.this, ActivityDetailRestoran.class);
                aq.putExtra("nama", data[i][0]);
                aq.putExtra("alamat", data[i][1]);
                startActivity(aq);
            }
        });

        ListAdapter adapter12 = new ListAdapter(ActivityRestoran.this, data);
        lvResult.setAdapter(adapter12);
    }
}

