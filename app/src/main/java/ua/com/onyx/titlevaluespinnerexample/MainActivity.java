package ua.com.onyx.titlevaluespinnerexample;


import android.os.Bundle;
import android.support.v4.content.ContextCompat;
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
        titleValueSpinner.setTitle("Title");
        titleValueSpinner.setValue(values[0]);
        titleValueSpinner.setValues(values);
        titleValueSpinner.setImage(ContextCompat.getDrawable(this, R.drawable.ic_arrow_drop_down));
        titleValueSpinner.setTitleTextSize(getResources().getDimensionPixelSize(R.dimen.title_value_spinner_title_text_size));
        titleValueSpinner.setValueTextSize(getResources().getDimensionPixelSize(R.dimen.title_value_spinner_title_text_size));
        titleValueSpinner.setBottomLineHeight(getResources().getDimensionPixelSize(R.dimen.title_value_spinner_bottom_line_height));
        titleValueSpinner.setImageSize(getResources().getDimensionPixelSize(R.dimen.title_value_spinner_image_size));
        titleValueSpinner.setTitleTextColor(ContextCompat.getColor(this, R.color.title_value_spinner_title_text_color));
        titleValueSpinner.setValueTextColor(ContextCompat.getColor(this, R.color.title_value_spinner_value_text_color));
        titleValueSpinner.setBottomLineColor(ContextCompat.getColor(this, R.color.title_value_spinner_bottom_line_color));
        titleValueSpinner.setOnSelectListener(new TitleValueSpinner.OnSelectListener() {
            @Override
            public void onSelect(TitleValueSpinner titleValueSpinner, String[] values, String value) {

            }
        });
    }
}
