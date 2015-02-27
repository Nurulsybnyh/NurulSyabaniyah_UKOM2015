package app.zakattime.nurulsybnyh.zakattime;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by nurul on 2/15/2015.
 */
public class ZakatFitrah extends ActionBarActivity{

    TextView textView;
    EditText editText;
    Button buttonHitung;
    Integer inputFitrah;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zakat_fitrah);

        textView = (TextView) findViewById(R.id.txttotalfitrah);
        editText = (EditText) findViewById(R.id.edtfitrah);

        buttonHitung = (Button) findViewById(R.id.hitungfitrah);
        buttonHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputFitrah = Integer.parseInt(editText.getText().toString());
                double hasilhitung = inputFitrah * 2.5 / 100 ;
                textView.setText(String.valueOf(hasilhitung));
                }
            });
       }
}
