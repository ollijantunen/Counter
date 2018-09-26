package com.example.oj_dx13.counter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int counterValue = 0;
    private TextView counterView;
    private Button button_increase;
    private Button button_decrease;
    private Button button_reset;

    // Counter counter = new Counter();

    private View.OnClickListener clickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.button_increase:
                    increase();
                    break;
                case R.id.button_decrease:
                    decrease();
                    break;
                case R.id.button_reset:
                    reset();
                    break;
            }
        }
    };
       @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        counterView = (TextView) findViewById(R.id.counterView);
        button_increase = (Button) findViewById(R.id.button_increase);
        button_increase.setOnClickListener(clickListener);
        button_decrease = (Button) findViewById(R.id.button_decrease);
        button_decrease.setOnClickListener(clickListener);
        button_reset = (Button) findViewById(R.id.button_reset);
        button_reset.setOnClickListener(clickListener);

        counterView.setText(String.valueOf(counterValue));

        }

    private void increase() {
        this.counterValue++;
        counterView.setText(String.valueOf(counterValue));
    }
    private void decrease() {
        this.counterValue--;
        counterView.setText(String.valueOf(counterValue));
    }
    private void reset() {
        this.counterValue = 0;
        counterView.setText(String.valueOf(counterValue));
    }
}
