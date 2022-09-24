package mao.android_timepicker;


import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity4 extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        TimePicker timePicker = findViewById(R.id.TimePicker3);
        TextView textView = findViewById(R.id.result3);
        Button button = findViewById(R.id.button_TimePicker3);

        timePicker.setIs24HourView(true);

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