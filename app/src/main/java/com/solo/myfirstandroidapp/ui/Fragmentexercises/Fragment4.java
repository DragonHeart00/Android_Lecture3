package com.solo.myfirstandroidapp.ui.Fragmentexercises;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.solo.myfirstandroidapp.R;

public class Fragment4 extends Fragment {
    Button button1,button2,button3,button4;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment4_layout,container,false);

        button2 = view.findViewById(R.id.button72);
        button3 = view.findViewById(R.id.button73);

        button1 = view.findViewById(R.id.button71);
        button1.setText("tryk på mig Først");



        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                long etTal = System.currentTimeMillis();
                if (view == button1) {
                    button1.setText("Du trykkede på mig.Tak! " + etTal);
                    button2.setText("så er min tur, tryk på mig");


                }
            }
        });


        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                long etTal = System.currentTimeMillis();
                if (view == button2) {
                    button3.setText("Nej nej,tryk på mig i stedet! " + etTal);

                }
            }
        });



        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                long etTal = System.currentTimeMillis();
                if (view == button3) {

                    button2.setText("Hvis der skal trykkes, så er det på MIG! "+ etTal);

                }
            }
        });

        return view;


    }

}
