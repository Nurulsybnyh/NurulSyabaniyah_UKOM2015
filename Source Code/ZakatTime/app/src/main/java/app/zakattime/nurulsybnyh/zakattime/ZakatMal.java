package app.zakattime.nurulsybnyh.zakattime;

import android.content.Intent;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class ZakatMal extends ActionBarActivity {

    TextView textView;
    EditText zakatEmas, zakatPerak, zakatUang, zakatPerniagaan, zakatUnta, zakatKerbau, zakatKambing, zakatBarangTambang, jmlemasperak, jmluang, jmlbinatangternak;
    Integer inputEmas, inputPerak, inputUang, inputPerniagaan, inputUnta, inputKerbau, inputKambing, inputBarangTambang;
    Button buttonHitungMal;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zakat_mal);

        zakatEmas = (EditText) findViewById(R.id.zakatemas);
        zakatPerak = (EditText) findViewById(R.id.zakatperak);
        zakatUang = (EditText) findViewById(R.id.zakatuang);
        zakatPerniagaan = (EditText) findViewById(R.id.zakatperniagaan);


        buttonHitungMal = (Button) findViewById(R.id.btnlihatzakatmal);
        buttonHitungMal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                inputEmas = Integer.valueOf(zakatEmas.getText().toString());
                inputPerak = Integer.valueOf(zakatPerak.getText().toString());
                inputUang = Integer.valueOf(zakatUang.getText().toString());
                inputPerniagaan = Integer.valueOf(zakatPerniagaan.getText().toString());


                double emas = (inputEmas * 2.5 / 100);

                double perak = (inputPerak * 2.5 / 100);

                double uang = (inputUang * 2.5/100) + (inputPerniagaan * 2.5 / 100);

                Intent intent = new Intent(getApplicationContext(), TotalZakatMal.class);
                Bundle b = new Bundle();
                b.putDouble("dataemas", emas);
                b.putDouble("dataperak", perak);
                b.putDouble("datauang", uang);
                intent.putExtras(b);
                startActivity(intent);
            }

        });
    }
}
