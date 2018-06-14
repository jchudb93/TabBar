package com.example.user.tabbar;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by user on 14/06/2018.
 */

public class Tab2Fragment extends Fragment {

    private static final String TAG = "Tab 2 Fragment";
    private Button btnTEST;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.tab2_fragment, null, false);
        btnTEST = (Button) view.findViewById(R.id.btnTEST2);

        btnTEST.setOnClickListener((otherView) -> {
            Toast.makeText(getActivity(), "TEST CLICK BOTON 2", Toast.LENGTH_SHORT).show();
        });
        return view;
    }
}
