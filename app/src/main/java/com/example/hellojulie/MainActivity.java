package com.example.hellojulie;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((TextView) findViewById(R.id.textView3)).setTextColor(
                        getResources().getColor(R.color.colorDarkRed));
            }
        });

        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                findViewById(R.id.rootView).setBackgroundColor(
                        getResources().getColor(R.color.colorPink));
            }
        });

        findViewById(R.id.button3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // grab the user input text
                String newText = ((EditText) findViewById(R.id.editText)).getText().toString();

                // put the text into our text view once the "Change Text" button is clicked
                if (TextUtils.isEmpty(newText)) {
                    ((TextView) findViewById(R.id.textView3)).setText("Hello from Julie!");
                } else {
                    ((TextView) findViewById(R.id.textView3)).setText(newText);
                }
            }
        });

        findViewById(R.id.rootView).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // reset the text color back to FFC107
                ((TextView) findViewById(R.id.textView3)).setTextColor(
                        getResources().getColor(R.color.colorYellow));

                // reset the background color to colorPrimary
                findViewById(R.id.rootView).setBackgroundColor(
                        getResources().getColor(R.color.colorPrimary));

                // reset the text back to "Hello from Julie!"
                ((TextView) findViewById(R.id.textView3)).setText("Hello from Julie!");
            }
        });

    }
}
