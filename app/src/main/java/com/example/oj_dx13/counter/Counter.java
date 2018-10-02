package com.example.oj_dx13.counter;


public class Counter {
    private int counterValue;
    private final int maxCounterValue;
    private final int minCounterValue;
    private int radioGroup;

    public Counter() {
        counterValue = 0;
        maxCounterValue = 100;
        minCounterValue = -5;

    }

    public void increase() {
        if (counterValue < maxCounterValue) {
            this.counterValue++;
        }
        // counterView.setText(String.valueOf(counterValue));
    }
    public void decrease() {
        if (counterValue > minCounterValue) {
            this.counterValue--;
        }
        // counterView.setText(String.valueOf(counterValue));
    }
    public void reset() {
        this.counterValue = 0;
        // counterValue.setText(String.valueOf(counterValue));
    }

    public int getCounterValue() {
        return this.counterValue;
    }

}

