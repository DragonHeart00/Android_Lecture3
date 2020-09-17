package com.solo.myfirstandroidapp.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.solo.myfirstandroidapp.R;

public class MainImplicitteActivity extends AppCompatActivity {
    private Button button;
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_implicitte);
        button=findViewById(R.id.button);
        editText = findViewById(R.id.editTextweb);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String strUserName = editText.getText().toString();

                Uri uri = Uri.parse("http://"+strUserName+".dk");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
                Toast.makeText(getApplication(), "Welcome to " + editText.getText().toString() + " Webpage", Toast.LENGTH_SHORT).show();

            }
        });


    }
}