package com.suprithag.hexadiccalci;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DashBoard extends AppCompatActivity {


    Button b1;
    Button b2;
    Button b3;
    Button b4,b5,b6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash_board);

        b1 = findViewById(R.id.button1);
        b2 = findViewById(R.id.button2);
        b3 = findViewById(R.id.button3);
        b4 = findViewById(R.id.button4);
        b5 = findViewById(R.id.button5);
        b6 = findViewById(R.id.button6);

        b1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent= new Intent(DashBoard.this, com.suprithag.hexadiccalci.StandardCal.class);
                startActivity(intent);
            }
        });

        b2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent=new Intent(DashBoard.this, com.suprithag.hexadiccalci.ScientificCal.class);
                startActivity(intent);
            }
        });

        b3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent=new Intent(DashBoard.this, com.suprithag.hexadiccalci.UnitConverter.class);
                startActivity(intent);
            }
        });
        b4.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent=new Intent(DashBoard.this, com.suprithag.hexadiccalci.IncomeActivity.class);
                startActivity(intent);
            }
        });
        b5.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent=new Intent(DashBoard.this, com.suprithag.hexadiccalci.EMI.class);
                startActivity(intent);
            }
        });
        b6.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent=new Intent(DashBoard.this, com.suprithag.hexadiccalci.ELEC.class);
                startActivity(intent);
            }
        });
    }
}