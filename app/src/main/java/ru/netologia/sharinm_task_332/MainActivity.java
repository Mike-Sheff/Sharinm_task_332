package ru.netologia.sharinm_task_332;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    private Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = findViewById(R.id.spinner);

        Button btn = findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String lang;

                int selected = (int) spinner.getSelectedItemId();

                switch (selected) {
                    default:
                    case 0:
                        lang = "ru";
                        break;
                    case 1:
                        lang = "en";
                        break;
                    case 2:
                        lang = "fr";
                        break;
                    case 3:
                        lang = "de";
                        break;
                }

                Locale locale = new Locale(lang);
                Configuration config = new Configuration();
                config.setLocale(locale);
                getResources().updateConfiguration(config, getBaseContext().getResources().getDisplayMetrics());
                recreate();
                Toast.makeText(MainActivity.this, getString(R.string.textTextView), Toast.LENGTH_LONG).show();

            }
        });
    }
}

