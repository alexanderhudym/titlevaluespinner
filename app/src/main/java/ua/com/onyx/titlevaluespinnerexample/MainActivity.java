package ua.com.onyx.titlevaluespinnerexample;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import ua.com.onyx.titlevaluespinner.TitleValueSpinner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] values = {
                "Value 1",
                "Value 2",
                "Value 3"
        };

        TitleValueSpinner titleValueSpinner = (TitleValueSpinner) findViewById(R.id.title_value_spinner);
        titleValueSpinner.setValue(values[0]);
        titleValueSpinner.setValues(values);
        titleValueSpinner.setOnSelectListener(new TitleValueSpinner.OnSelectListener() {
            @Override
            public void onSelect(TitleValueSpinner titleValueSpinner, String[] values, String value) {

            }
        });
    }
}
