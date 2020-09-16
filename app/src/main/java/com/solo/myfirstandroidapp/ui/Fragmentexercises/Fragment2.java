package com.solo.myfirstandroidapp.ui.Fragmentexercises;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.solo.myfirstandroidapp.R;

public class Fragment2 extends Fragment {
    private Button button;
    private TextView textView;
    private EditText editText;
    private WebView webView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment2_layout,container,false);

        button =view.findViewById(R.id.button);
        textView=view.findViewById(R.id.textView2);
        editText=view.findViewById(R.id.editTextweb);
        webView=view.findViewById(R.id.webview);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strUserName = editText.getText().toString();

                if(TextUtils.isEmpty(strUserName)) {
                    editText.setError("miss!");
                    return;
                }
                if (editText.getText().toString().equals("Java")|| editText.getText().toString().equals("java")){

                    webView.loadUrl("https://javabog.dk");

                    Toast.makeText(getActivity(),"Welcome to " + editText.getText().toString() + " Webpage",Toast.LENGTH_SHORT).show();

                }else if (editText.getText().toString().equals("Dr") || editText.getText().toString().equals("dr")){
                    webView.loadUrl("https://www.dr.dk/");

                    Toast.makeText(getActivity(),"Welcome to " + editText.getText().toString() + " Webpage",Toast.LENGTH_SHORT).show();
                }else
                    textView.setText(editText.getText().toString() + " is not found");
            }

        });

        return view;
    }
}
