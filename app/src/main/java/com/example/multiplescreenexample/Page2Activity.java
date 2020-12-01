package com.example.multiplescreenexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Page2Activity extends AppCompatActivity
{
    private TextView myLabelTV;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);
        this.myLabelTV = this.findViewById(R.id.myLabelTV);
        //int myNumber = this.getIntent().getIntExtra("myNumber", -1);
        this.myLabelTV.setText("" + Core.myNumber);
    }

    public void onGoBackButtonPressed(View v)
    {
        super.onBackPressed();
    }

    @Override
    public void onBackPressed()
    {
        //super.onBackPressed();
        this.myLabelTV.setText("Back button pressed");
        Toast t = Toast.makeText(this, "back pressed", Toast.LENGTH_LONG);
        t.show();
    }
}