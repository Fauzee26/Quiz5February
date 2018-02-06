package fauzi.hilmy.quiz5february;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

/**
 * Created by 26FaUZeE02 on 2/6/18.
 */

public class ActivityListMain extends AppCompatActivity {

    ListView lvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_main);

        lvResult = (ListView) findViewById(R.id.lv_result);

        final String[][] data = new String[][]{{"RS Awal Bros Batam", "Jl. Gajah Mada", "Jl. Gajah Mada Kav.I Batam", "0778-431777"}, {"RS Santa Elisabeth Batam", "Lubuk Baja", "Jl. Anggrek Blok II,Lubuk Baja Batam", "0778-457357"}, {"RSIA Mutiara Aini", "Batu Aji", "Jl. Batu Aji II Blok A No.01, Kel.Buliang, Kec.Batu Aji Batam.", "0778- 332002"},
                {"Rumah Sakit Umum Daerah (RSUD) Embung Fatimah Batam", "Batu Aji", "Jl. R. Soeprapto. Blok D 1 – 9. Batu Aji. Batam.", "0778-364446."}, {"RS Ibu dan Anak Nuruddiniyah", "Sei Panas", "Jl. Raya Sei Panas Batam", "0778-427911"}};

        lvResult.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent a1 = new Intent(ActivityListMain.this, ActivityDetail.class);
                a1.putExtra("nama", data[i][0]);
                a1.putExtra("letak", data[i][1]);
                a1.putExtra("alamat", data[i][2]);
                a1.putExtra("telepon", data[i][3]);
                startActivity(a1);
            }
        });

        ListAdapter adapter = new ListAdapter(ActivityListMain.this, data);
        lvResult.setAdapter(adapter);
    }
}

