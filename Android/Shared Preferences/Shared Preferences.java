package com.example.android.helloworld;
import android.os.Bundle;
import android.app.Activity;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    //deklarasi variabel
    private SharedPreferences pref;
    private final String KEY_NAME = "key_name";

    @Override
	//method onCreate
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pref = getSharedPreferences("mypreferences", MODE_PRIVATE);

        showSavedName();

        final EditText etName = (EditText) findViewById(R.id.et_name);//membaca text data dari EditText id:et_name 

        Button bSave = (Button) findViewById(R.id.bt_save);//save nama dengan button id:bt_save
        bSave.setOnClickListener(new View.OnClickListener() {//pembaca aktivitas klik button

            @Override
			//method onClick
            public void onClick(View arg0) {
                String name = etName.getText().toString();
				//pengeceka apakah nama kosong atau tidak
                if(name.equals("")){
                    Toast.makeText(MainActivity.this,
                            "Nama tidak boleh kosong",
                            Toast.LENGTH_SHORT).show();//menampilkan peringatan
                }else{
                    saveName(name);//menyimpan dengan method saveName dengan parameter nama yang telah dibaca
                    showSavedName();//menampilkan hasil simpan nama
                }
            }
        });
    }

	//method menampilkan nama
    private void showSavedName(){
        String savedName = getSavedName();

        TextView tvSavedName = (TextView) findViewById(R.id.tv_saved_name);
        tvSavedName.setText(savedName);
    }

	//method membaca nilai dari variabel nama
    private String getSavedName(){
        return pref.getString(KEY_NAME, "-");
    }

	//method menyimpan nama
    private void saveName(String name){
        Editor editor = pref.edit();
        editor.putString(KEY_NAME, name);
        editor.commit();
    }
}
