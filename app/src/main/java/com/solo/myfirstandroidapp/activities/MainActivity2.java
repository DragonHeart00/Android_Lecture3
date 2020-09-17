package com.solo.myfirstandroidapp.activities;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.ImageSpan;
import android.text.util.Linkify;
import android.widget.TextView;


import com.solo.myfirstandroidapp.R;


public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView tv = new TextView(this);

        String htmltekst = "<html>\n" +
                "<body>\n" +
                "\n" +
                "<h1> Android Studio :)</h1>\n" +
                "\n" +
                "<p>Android Studio is the official[7] integrated development environment " +
                "(IDE) for Google's Android operating system, built on JetBrains' IntelliJ IDEA " +
                "software and designed specifically for Android development.[8] It is available " +
                "for download on Windows, macOS and Linux based operating systems or as a subscription-based " +
                "service in 2020.[9][10] It is a replacement for the Eclipse Android Development Tools " +
                "(E-ADT) as the primary IDE for native Android application development.</p>\n" +
                "https://en.wikipedia.org/wiki/Android_Studio" +
                "\n" +
                "</body>\n" +
                "</html>";

        Spanned tekst = Html.fromHtml(htmltekst);
        tv.setText(tekst);

        Linkify.addLinks(tv, Linkify.ALL);

        setContentView(tv);

    }
}



