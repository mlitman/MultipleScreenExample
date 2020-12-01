package com.example.multiplescreenexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity
{
    private EditText myNumberET;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.myNumberET = this.findViewById(R.id.myNumberET);
    }

    public void onPressMeButtonClicked(View v)
    {
        int myNumber = Integer.parseInt(this.myNumberET.getText().toString());
        Intent i = new Intent(this, Page2Activity.class);
        //i.putExtra("myNumber", myNumber);
        Core.myNumber = myNumber;
        this.startActivity(i);
    }
}