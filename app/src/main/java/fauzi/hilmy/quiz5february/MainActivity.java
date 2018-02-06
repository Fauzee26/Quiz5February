package fauzi.hilmy.quiz5february;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    GridView grid;
    String[] tempat = {
            "Rumah Sakit", "Sekolah", "Restoran", "Hotel", "Mall", "Exit"
    } ;

    int[] imageId = {
            R.drawable.hospital, R.drawable.school, R.drawable.restoran, R.drawable.hotel, R.drawable.mall, R.drawable.exit
    };
    Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GridSingle adapter = new GridSingle(MainActivity.this, tempat, imageId);

        grid=(GridView)findViewById(R.id.grid);
        grid.setAdapter(adapter);
        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                if (position == 0) {
                    Intent n2 = new Intent(getApplicationContext(), ActivityListMain.class);
                    startActivity(n2);
                } else if (position == 1) {
                    Intent n32 = new Intent(getApplicationContext(), ActivitySchool.class);
                    startActivity(n32);
                } else if (position == 2) {
                    Intent tt = new Intent(getApplicationContext(), ActivityRestoran.class);
                    startActivity(tt);
                } else if (position == 3) {
                    Intent t55 = new Intent(getApplicationContext(), ActivityHotel.class);
                    startActivity(t55);
                } else if (position == 4) {
                    Intent dddd = new Intent(getApplicationContext(), ActivityMall.class);
                    startActivity(dddd);
                } else if (position == 5) {
                    AlertDialog.Builder alertDialog = new AlertDialog.Builder(context);
                    alertDialog.setTitle("Caution!!");
                    alertDialog.setMessage("Apakah anda yakin akan keluar dari aplikasi ini?")
                            .setCancelable(false)
                            .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(
                                        DialogInterface dialog, int which) {
                                    //kondisi ketika kita pencet yes
                                    MainActivity.this.finish();
                                }
                            })
                            .setNegativeButton("No", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });

                    AlertDialog alert = alertDialog.create();
                    alert.show();
                }
            }
        });
    }
}
