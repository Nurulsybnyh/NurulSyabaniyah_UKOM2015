package app.zakattime.nurulsybnyh.zakattime;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;


public class TotalZakatMal extends ActionBarActivity {

    EditText edtemas, edtperak, edtuang, edtbinatangternak;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.total_zakat_mal_layout);

        Bundle b = getIntent().getExtras();
        double dataemasnih = b.getDouble("dataemas");
        double dataperaknih = b.getDouble("dataperak");
        double uangnih = b.getDouble("datauang");

        edtemas = (EditText) findViewById(R.id.jmlemas);
        edtperak = (EditText) findViewById(R.id.jmlperak);
        edtuang = (EditText) findViewById(R.id.jmluang);


        edtemas.setText(String.valueOf(dataemasnih));
        edtperak.setText(String.valueOf(dataperaknih));
        edtuang.setText(String.valueOf(uangnih));

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_total_zakat_mal, menu);
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
