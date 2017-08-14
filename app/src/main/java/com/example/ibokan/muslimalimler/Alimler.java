package com.example.ibokan.muslimalimler;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

/**
 * Created by ibokan on 16.07.2015.
 */
public class Alimler extends Activity {

    private static final String[] items={"Hasan-i Basri","Hasan El-Benna",
            "Ýmam-i Gazzali","Ýmam Nevevi","Ýbn-i Kesir","Ýbnu'l-Kayyim el-Cevziyye","Kurtubi",
            "Muhyiddin-i Arabi","Mevdudi","Muhammed Esed","Muhammed Hamidullah",
            "Ömer b. Abdulaziz","Seyyid Kutub",
            "Taberi","Zemahseri"
            };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.liste);


        ImageView basresim= (ImageView) findViewById(R.id.imageView);
        basresim.setVisibility(View.VISIBLE);

        ListView alimler= (ListView) findViewById(R.id.listAlimler);
        ArrayAdapter<String> veriAdaptoru =new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1,items);
        alimler.setAdapter(veriAdaptoru);
        alimler.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                switch (position) {
                    case 0:
                        Intent hasanbasri = new Intent(Alimler.this, HasaniBasri.class);
                        startActivity(hasanbasri);
                        break;
                    case 1:
                        Intent hasanelbenna = new Intent(Alimler.this, Hasanelbenna.class);
                        startActivity(hasanelbenna);
                        break;
                    case 2:
                        Intent imamgazali = new Intent(Alimler.this, Imamgazali.class);
                        startActivity(imamgazali);
                        break;
                    case 3:
                        Intent imamnevevi = new Intent(Alimler.this, Imamnevevi.class);
                        startActivity(imamnevevi);
                        break;
                    case 4:
                        Intent ibnikesir = new Intent(Alimler.this, IbniKesir.class);
                        startActivity(ibnikesir);
                        break;
                    case 5:
                        Intent elcevziyye = new Intent(Alimler.this, Elcevziyye.class);
                        startActivity(elcevziyye);
                        break;
                    case 6:
                        Intent kuttubi = new Intent(Alimler.this, Kurtubi.class);
                        startActivity(kuttubi);
                        break;
                    case 7:
                        Intent muhiddin = new Intent(Alimler.this, MuhiyydinArabi.class);
                        startActivity(muhiddin);
                        break;
                    case 8:
                        Intent mevdudi = new Intent(Alimler.this, Mevdudi.class);
                        startActivity(mevdudi);
                        break;
                    case 9:
                        Intent esed = new Intent(Alimler.this, MuhammedEsed.class);
                        startActivity(esed);
                        break;
                    case 10:
                        Intent mhamidullah = new Intent(Alimler.this, Mhamidullah.class);
                        startActivity(mhamidullah);
                        break;
                    case 11:
                        Intent omeraziz = new Intent(Alimler.this, OmerAziz.class);
                        startActivity(omeraziz);
                        break;
                    case 12:
                        Intent kutub = new Intent(Alimler.this, SeyyidKutub.class);
                        startActivity(kutub);
                        break;
                    case 13:
                        Intent taberi = new Intent(Alimler.this, Taberi.class);
                        startActivity(taberi);
                        break;
                    case 14:
                        Intent zemahseri = new Intent(Alimler.this, Zemahseri.class);
                        startActivity(zemahseri);
                        break;
                }
            }

        });
    }
}
