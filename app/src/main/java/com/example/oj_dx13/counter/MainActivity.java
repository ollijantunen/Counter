package com.example.oj_dx13.counter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView counterView;
    private Button button_increase;
    private Button button_decrease;
    private Button button_reset;
    private ImageButton image_reset;
    // private RadioGroup radioGroup;
    private RadioButton radioDec, radioHex;

    Counter counter = new Counter();

    private View.OnClickListener clickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.button_increase:
                    counter.increase();
                    // counterView.setText(String.valueOf(counter.getCounterValue()));
                    break;
                case R.id.button_decrease:
                    counter.decrease();
                    // counterView.setText(String.valueOf(counter.getCounterValue()));
                    break;
                case R.id.image_reset:
                case R.id.button_reset:
                    counter.reset();
                    // counterView.setText(String.valueOf(counter.getCounterValue()));
                    break;
            }
 /*           switch (v.getId()) {
                case R.id.radioDec:
                    counterView.setText(String.valueOf(counter.getCounterValue()));
                    break;
                case R.id.radioHex:
                    counterView.setText(String.valueOf(Integer.toHexString(counter.getCounterValue())));
                    break;
            }

            radioGroup = findViewById(R.id.radioGroup);
            int radioButtonId = radioGroup.getCheckedRadioButtonId();
            */
            if (radioDec.isChecked()) {
                counterView.setText(String.valueOf(counter.getCounterValue()));
            } else if (radioHex.isChecked()) {
                counterView.setText(Integer.toHexString(counter.getCounterValue()));
            } else {
                counterView.setText(String.valueOf(counter.getCounterValue()));
            }
        }

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        counterView = findViewById(R.id.counterView);
        button_increase = findViewById(R.id.button_increase);
        button_increase.setOnClickListener(clickListener);
        button_decrease = findViewById(R.id.button_decrease);
        button_decrease.setOnClickListener(clickListener);
        button_reset = findViewById(R.id.button_reset);
        button_reset.setOnClickListener(clickListener);
        image_reset = findViewById(R.id.image_reset);
        image_reset.setOnClickListener(clickListener);
        radioDec = findViewById(R.id.radioDec);
        radioDec.setOnClickListener(clickListener);
        radioHex = findViewById(R.id.radioHex);
        radioHex.setOnClickListener(clickListener);


    }

}
