package mao.android_timepicker;


import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TimePicker timePicker = findViewById(R.id.TimePicker);
        TextView textView = findViewById(R.id.result1);
        Button button = findViewById(R.id.button_TimePicker);

        button.setOnClickListener(new View.OnClickListener()
        {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v)
            {
                int hour = timePicker.getHour();
                int minute = timePicker.getMinute();
                textView.setText("当前选择的是" + hour + "时" + minute + "分");
            }
        });
    }
}