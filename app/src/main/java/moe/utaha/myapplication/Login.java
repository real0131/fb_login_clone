package moe.utaha.myapplication;

import android.annotation.TargetApi;
import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.renderscript.Sampler;
import android.widget.TextView;
import android.widget.TimePicker;

import org.w3c.dom.Text;

/**
 * Created by chojeaho on 2016-01-23.
 */
public class Login extends Activity{

    TimePicker timePicker;
    TextView textView;

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        timePicker = (TimePicker) findViewById(R.id.time_pic);
        textView = (TextView) findViewById(R.id.text_time);
        timePicker.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
            @Override
            public void onTimeChanged(TimePicker view, int hourOfDay, int minute) {
                textView.setText(hourOfDay+""+minute);
            }
        });

    }
}
