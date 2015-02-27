package app.zakattime.nurulsybnyh.zakattime;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class Home extends ActionBarActivity {
    Button info, fitrah, mal, pengaturan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home2);

        info = (Button) findViewById(R.id.btntentang);

        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent masukinfo = new Intent(Home.this, Info.class);
                startActivity(masukinfo);
            }
        });

        fitrah = (Button) findViewById(R.id.fitrah);

        fitrah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent masukfitrah = new Intent(Home.this, ZakatFitrah.class);
                startActivity(masukfitrah);
            }
        });

        mal = (Button) findViewById(R.id.mal);

        mal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent masukmal = new Intent(Home.this, ZakatMal.class);
                startActivity(masukmal);
            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_home2, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
