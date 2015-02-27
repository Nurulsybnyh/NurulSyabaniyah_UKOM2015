package app.zakattime.nurulsybnyh.zakattime;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;
import android.widget.RelativeLayout;
import android.widget.Switch;
import android.widget.TimePicker;

/**
 * Created by nurul on 2/15/2015.
 */
public class Pengaturan extends Fragment {
    View rootview;
    RelativeLayout rl;
    DatePicker datePicker;
    TimePicker timePicker;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootview = inflater.inflate(R.layout.pengaturan_layout, container, false);
        return super.onCreateView(inflater, container, savedInstanceState);



    }
}
