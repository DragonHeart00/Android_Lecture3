package com.solo.myfirstandroidapp.ui.Fragmentexercises;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.solo.myfirstandroidapp.R;

public class Fragment1 extends Fragment {
    private Button clickme;
    private TextView textView;
    private EditText editText;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment1_layout,container,false);
        clickme = view.findViewById(R.id.clickme);
        textView =view.findViewById(R.id.textView3);
        editText =view.findViewById(R.id.editTextText);


        clickme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = editText.getText().toString();
                if (TextUtils.isEmpty(str)) {
                    editText.setError("missed me!");
                    return;
                }else {
                    textView.setText(editText.getText().toString());
                }
            }
        });

        return view;
    }
}
