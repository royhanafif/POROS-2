package com.example.android.untukcobacoba;

import android.app.ListActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends ListActivity {

    static final String[] list_demo_error = new String[] { "Information",
            "Debug Info", "Warning", "Error" };

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setListAdapter(new ArrayAdapter<String>(this, R.layout.activity_main,list_demo_error));

        ListView listView = getListView();
        listView.setTextFilterEnabled(true);

        listView.setOnItemClickListener(new OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
        /* demo mengirim kode error ke LogCat */
                switch (position) {
                    case 0:
                        Log.i("Pesan Info", "Ini pesan info, warna hijau");
                        break;
                    case 1:
                        Log.d("Pesan Debug", "Ini pesan debug, warna Biru ");
                        break;
                    case 2:
                        Log.w("Pesan Warning",
                                "Ini pesan warning, warning warna kuning");
                        break;
                    case 3:
                        Log.e("Pesan Error", "Ini pesan error, warna merah");
                        break;
                }
            }
        });
    }
}