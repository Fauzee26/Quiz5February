package fauzi.hilmy.quiz5february;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class ActivitySchool extends AppCompatActivity {
    ListView lvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_school);
        lvResult = (ListView) findViewById(R.id.lv_result);

        final String[][] data = new String[][]{{"TK Cendana", "Kompl Cendana Bl A-4/1 Batam", "( 0778 ) 475481"}, {"TK Bahtera", "Kompl Boulevard Bl CC/2 Batam", "( 0778 ) 7034234"}, {"SD Negeri 007 Batam", "Kantor: Jl Bunga Raya Kompl Baloi BATAM", "(0778)428821"}, {"SD Negeri 005 Batam", "Jl Tiban III BATAM", "(0778)324276"}
                , {"SMP Ibnu Sina", "Jl Teuku Umar BATAM", "(0778)426241"}, {"SMP Islam Terpadu Nurul Muhajirin", "Jl Masjid Al Muhajirin BATAM", "(0778)326486"}, {"Madrasah Aliyah Negeri Batam", "Jl Brigjen Katamso 10 BATAM", "(0778)393153"}, {"SMA Kartini", "Jl Kampung Seraya BATAM", "(0778)453731"}
                , {"Lembaga Pendidikan Manajemen Indonesia", "Jl Raya Batam Center Gedung Graha Pena BATAM", "0778-460787"}, {" Akademi Keperawatan Griya Husada (Batam)", "Jln. Kampus Abulyatama BATAM 29400", "0778 7485055"}};

        lvResult.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent as = new Intent(ActivitySchool.this, ActivityDetailSchool.class);
                as.putExtra("nama", data[i][0]);
                as.putExtra("alamat", data[i][1]);
                as.putExtra("telepon", data[i][2]);
                startActivity(as);
            }
        });

        ListAdapterSchool adapter12 = new ListAdapterSchool(ActivitySchool.this, data);
        lvResult.setAdapter(adapter12);
    }
}
