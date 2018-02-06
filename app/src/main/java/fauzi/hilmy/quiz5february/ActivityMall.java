package fauzi.hilmy.quiz5february;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class ActivityMall extends AppCompatActivity {
    ListView lvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mall);
        lvResult = (ListView) findViewById(R.id.lv_result);

        final String[][] data = new String[][]{{"Mega Mall Batam Centre", "Jl. Engku Putri No.1", "(0778) 470100"}, {"Nagoya Hill Shopping Mall", "Jl. Teuku Umar No.1", "(0778) 433988"}, {"Mall Top 100 Tembesi, Batu Aji", "Jalan Letjen. Suprapto, Tembesi, Sagulung, Tembesi, Sagulung, Kota Batam, Riau 29436", "(0778) 7492001"}, {"MITRA MALL", "Bukit Tempayan, Batu Aji, Kota Batam, Kepulauan Riau 29425", "0813-7244-9534"}
                , {"Kepri Mall", "Jl. Jend. Sudirman, Sukajadi, Kepulauan Riau, Kota Batam, Kepulauan Riau 29444", "(0778) 7367506"}, {"Panbil Plaza", " Kabil, Nongsa, Kota Batam, Kepulauan Riau 29433", "0812-7007-3772"}, {"Plaza Botania", "Jl. Tengku Sulung, Belian, Batam Kota, Kota Batam, Kepulauan Riau 29465", "0812-6103-020"}, {"STC Mall Sekupang", "Jl. RE. Martadinata, Sungai Harapan, Sekupang, Kota Batam, Kepulauan Riau 29425", "0812-7088-5828"}};

        lvResult.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent as = new Intent(ActivityMall.this, ActivityDetailMall.class);
                as.putExtra("nama", data[i][0]);
                as.putExtra("alamat", data[i][1]);
                as.putExtra("telepon", data[i][2]);
                startActivity(as);
            }
        });

        ListAdapterSchool adapter12 = new ListAdapterSchool(ActivityMall.this, data);
        lvResult.setAdapter(adapter12);
    }

}
