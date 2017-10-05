# TitleValueSpinner
Spinner which shows the current value

![](https://github.com/alexanderhudym/titlevaluespinner/blob/master/screenshots/hide.png?raw=true)
![](https://github.com/alexanderhudym/titlevaluespinner/blob/master/screenshots/show_dialog.png?raw=true)

* Full customizable
* Support only dialog mode

## Getting Started
### Usage
* XML

```
<ua.com.onyx.titlevaluespinner.TitleValueSpinner
        app:title="Title"
        app:value="Value 1"
        app:values="@array/values"
        app:titleTextSize="@dimen/title_value_spinner_title_text_size"
        app:valueTextSize="@dimen/title_value_spinner_value_text_size"
        app:titleTextColor="@color/title_value_spinner_title_text_color"
        app:valueTextColor="@color/title_value_spinner_value_text_color"
        app:bottomLineColor="@color/title_value_spinner_bottom_line_color"
        app:bottomLineHeight="@dimen/title_value_spinner_bottom_line_height"
        app:imageSize="@dimen/title_value_spinner_image_size"
        app:image="@drawable/ic_arrow_drop_down"
        android:layout_margin="20dp"
        android:id="@+id/title_value_spinner"
        android:layout_width="match_parent"
        android:layout_height="40dp"/>
```
        
        
* Java

```
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

        titleValueSpinner.setOnPreShowListener(new TitleValueSpinner.OnPreShowListener() {
            @Override
            public boolean onPreShow(TitleValueSpinner titleValueSpinner) {
                return false; //or true if you want to show dialog
            }
        });
        
        titleValueSpinner.setOnShowListener(new TitleValueSpinner.OnShowListener() {
            @Override
            public void onShow(TitleValueSpinner titleValueSpinner) {
                
            }
        });
        
        titleValueSpinner.setOnDismissListener(new TitleValueSpinner.OnDismissListener() {
            @Override
            public void onDismiss(TitleValueSpinner titleValueSpinner) {
                
            }
        });
```

## Evolution
* Add to jCenter
* Dropdown mode
* Custom values adapter
* More customizables
* Add middleware on show event
