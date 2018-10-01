package com.example.oj_dx13.counter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView counterView;
    private Button button_increase;
    private Button button_decrease;
    private Button button_reset;

    Counter counter = new Counter();

    private View.OnClickListener clickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.button_increase:
                    counter.increase();
                    counterView.setText(String.valueOf(counter.getCounterValue()));
                    break;
                case R.id.button_decrease:
                    counter.decrease();
                    counterView.setText(String.valueOf(counter.getCounterValue()));
                    break;
                case R.id.button_reset:
                    counter.reset();
                    counterView.setText(String.valueOf(counter.getCounterValue()));
                    break;
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

    }

}
