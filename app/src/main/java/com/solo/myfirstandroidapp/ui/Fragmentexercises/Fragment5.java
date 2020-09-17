package com.solo.myfirstandroidapp.ui.Fragmentexercises;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.solo.myfirstandroidapp.R;
import com.solo.myfirstandroidapp.activities.MainActivity2;
import com.solo.myfirstandroidapp.activities.MainEksplicitteActivity;
import com.solo.myfirstandroidapp.activities.MainImplicitteActivity;

public class Fragment5 extends Fragment {
    private Button implicitte, eksplicitte;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment5_layout,container,false);
        implicitte = view.findViewById(R.id.implicitte);
        eksplicitte = view.findViewById(R.id.eksplicitte);

        implicitte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), MainImplicitteActivity.class);
                startActivity(intent);
            }
        });


        eksplicitte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), MainEksplicitteActivity.class);
                startActivity(intent);

            }
        });

        return view;
    }
}
