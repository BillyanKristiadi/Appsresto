package com.example.appsresto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity{

    ToggleButton Toggle1;ToggleButton Toggle2;
    ToggleButton Toggle3;ToggleButton Toggle4;
    ToggleButton Toggle5;ToggleButton Toggle6;
    ToggleButton Toggle7;ToggleButton Toggle8;
    ToggleButton Toggle9;ToggleButton Toggle10;
    ToggleButton Toggle11;ToggleButton Toggle12;
    ToggleButton Toggle13;ToggleButton Toggle14;
    ToggleButton Toggle15;ToggleButton Toggle16;
    ToggleButton Toggle17;ToggleButton Toggle18;
    ToggleButton Toggle19;ToggleButton Toggle20;
    int booked=0;
    int available=20;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toggle1= findViewById(R.id.toggleButton);Toggle2= findViewById(R.id.toggleButton2);
        Toggle3= findViewById(R.id.toggleButton3);Toggle4= findViewById(R.id.toggleButton4);
        Toggle5= findViewById(R.id.toggleButton5);Toggle6= findViewById(R.id.toggleButton6);
        Toggle7= findViewById(R.id.toggleButton7);Toggle8= findViewById(R.id.toggleButton8);
        Toggle9= findViewById(R.id.toggleButton9);Toggle10= findViewById(R.id.toggleButton10);
        Toggle11= findViewById(R.id.toggleButton11);Toggle12= findViewById(R.id.toggleButton12);
        Toggle13= findViewById(R.id.toggleButton13);Toggle14= findViewById(R.id.toggleButton14);
        Toggle15= findViewById(R.id.toggleButton15);Toggle16= findViewById(R.id.toggleButton16);
        Toggle17= findViewById(R.id.toggleButton17);Toggle18= findViewById(R.id.toggleButton18);
        Toggle19= findViewById(R.id.toggleButton19);Toggle20= findViewById(R.id.toggleButton20);

        Toggle1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Toggle1.isChecked())
                {
                    booked++;
                    available--;
                    Toast.makeText(MainActivity.this,
                            "Booked Table"+"\t"+": "+booked+"\n"+
                            "Available Table"+"\t"+": "+available,
                            Toast.LENGTH_LONG).show();
                }
                else
                {
                    booked--;
                    available++;
                    Toast.makeText(MainActivity.this,
                            "Booked Table"+"\t"+": "+booked+"\n"+
                                    "Available Table"+"\t"+": "+available,
                            Toast.LENGTH_LONG).show();
                }
            }
        });

        Toggle2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Toggle2.isChecked())
                {
                    booked++;
                    available--;
                    Toast.makeText(MainActivity.this,
                            "Booked Table"+"\t"+": "+booked+"\n"+
                                    "Available Table"+"\t"+": "+available,
                            Toast.LENGTH_LONG).show();
                }
                else
                {
                    booked--;
                    available++;
                    Toast.makeText(MainActivity.this,
                            "Booked Table"+"\t"+": "+booked+"\n"+
                                    "Available Table"+"\t"+": "+available,
                            Toast.LENGTH_LONG).show();
                }
            }
        });

        Toggle3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Toggle3.isChecked())
                {
                    booked++;
                    available--;
                    Toast.makeText(MainActivity.this,
                            "Booked Table"+"\t"+": "+booked+"\n"+
                                    "Available Table"+"\t"+": "+available,
                            Toast.LENGTH_LONG).show();
                }
                else
                {
                    booked--;
                    available++;
                    Toast.makeText(MainActivity.this,
                            "Booked Table"+"\t"+": "+booked+"\n"+
                                    "Available Table"+"\t"+": "+available,
                            Toast.LENGTH_LONG).show();
                }
            }
        });

        Toggle4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Toggle4.isChecked())
                {
                    booked++;
                    available--;
                    Toast.makeText(MainActivity.this,
                            "Booked Table"+"\t"+": "+booked+"\n"+
                                    "Available Table"+"\t"+": "+available,
                            Toast.LENGTH_LONG).show();
                }
                else
                {
                    booked--;
                    available++;
                    Toast.makeText(MainActivity.this,
                            "Booked Table"+"\t"+": "+booked+"\n"+
                                    "Available Table"+"\t"+": "+available,
                            Toast.LENGTH_LONG).show();
                }
            }
        });

        Toggle5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Toggle5.isChecked())
                {
                    booked++;
                    available--;
                    Toast.makeText(MainActivity.this,
                            "Booked Table"+"\t"+": "+booked+"\n"+
                                    "Available Table"+"\t"+": "+available,
                            Toast.LENGTH_LONG).show();
                }
                else
                {
                    booked--;
                    available++;
                    Toast.makeText(MainActivity.this,
                            "Booked Table"+"\t"+": "+booked+"\n"+
                                    "Available Table"+"\t"+": "+available,
                            Toast.LENGTH_LONG).show();
                }
            }
        });

        Toggle6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Toggle6.isChecked())
                {
                    booked++;
                    available--;
                    Toast.makeText(MainActivity.this,
                            "Booked Table"+"\t"+": "+booked+"\n"+
                                    "Available Table"+"\t"+": "+available,
                            Toast.LENGTH_LONG).show();
                }
                else
                {
                    booked--;
                    available++;
                    Toast.makeText(MainActivity.this,
                            "Booked Table"+"\t"+": "+booked+"\n"+
                                    "Available Table"+"\t"+": "+available,
                            Toast.LENGTH_LONG).show();
                }
            }
        });

        Toggle7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Toggle7.isChecked())
                {
                    booked++;
                    available--;
                    Toast.makeText(MainActivity.this,
                            "Booked Table"+"\t"+": "+booked+"\n"+
                                    "Available Table"+"\t"+": "+available,
                            Toast.LENGTH_LONG).show();
                }
                else
                {
                    booked--;
                    available++;
                    Toast.makeText(MainActivity.this,
                            "Booked Table"+"\t"+": "+booked+"\n"+
                                    "Available Table"+"\t"+": "+available,
                            Toast.LENGTH_LONG).show();
                }
            }
        });

        Toggle8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Toggle8.isChecked())
                {
                    booked++;
                    available--;
                    Toast.makeText(MainActivity.this,
                            "Booked Table"+"\t"+": "+booked+"\n"+
                                    "Available Table"+"\t"+": "+available,
                            Toast.LENGTH_LONG).show();
                }
                else
                {
                    booked--;
                    available++;
                    Toast.makeText(MainActivity.this,
                            "Booked Table"+"\t"+": "+booked+"\n"+
                                    "Available Table"+"\t"+": "+available,
                            Toast.LENGTH_LONG).show();
                }
            }
        });

        Toggle9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Toggle9.isChecked())
                {
                    booked++;
                    available--;
                    Toast.makeText(MainActivity.this,
                            "Booked Table"+"\t"+": "+booked+"\n"+
                                    "Available Table"+"\t"+": "+available,
                            Toast.LENGTH_LONG).show();
                }
                else
                {
                    booked--;
                    available++;
                    Toast.makeText(MainActivity.this,
                            "Booked Table"+"\t"+": "+booked+"\n"+
                                    "Available Table"+"\t"+": "+available,
                            Toast.LENGTH_LONG).show();
                }
            }
        });

        Toggle10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Toggle10.isChecked())
                {
                    booked++;
                    available--;
                    Toast.makeText(MainActivity.this,
                            "Booked Table"+"\t"+": "+booked+"\n"+
                                    "Available Table"+"\t"+": "+available,
                            Toast.LENGTH_LONG).show();
                }
                else
                {
                    booked--;
                    available++;
                    Toast.makeText(MainActivity.this,
                            "Booked Table"+"\t"+": "+booked+"\n"+
                                    "Available Table"+"\t"+": "+available,
                            Toast.LENGTH_LONG).show();
                }
            }
        });

        Toggle11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Toggle11.isChecked())
                {
                    booked++;
                    available--;
                    Toast.makeText(MainActivity.this,
                            "Booked Table"+"\t"+": "+booked+"\n"+
                                    "Available Table"+"\t"+": "+available,
                            Toast.LENGTH_LONG).show();
                }
                else
                {
                    booked--;
                    available++;
                    Toast.makeText(MainActivity.this,
                            "Booked Table"+"\t"+": "+booked+"\n"+
                                    "Available Table"+"\t"+": "+available,
                            Toast.LENGTH_LONG).show();
                }
            }
        });

        Toggle12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Toggle12.isChecked())
                {
                    booked++;
                    available--;
                    Toast.makeText(MainActivity.this,
                            "Booked Table"+"\t"+": "+booked+"\n"+
                                    "Available Table"+"\t"+": "+available,
                            Toast.LENGTH_LONG).show();
                }
                else
                {
                    booked--;
                    available++;
                    Toast.makeText(MainActivity.this,
                            "Booked Table"+"\t"+": "+booked+"\n"+
                                    "Available Table"+"\t"+": "+available,
                            Toast.LENGTH_LONG).show();
                }
            }
        });

        Toggle13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Toggle13.isChecked())
                {
                    booked++;
                    available--;
                    Toast.makeText(MainActivity.this,
                            "Booked Table"+"\t"+": "+booked+"\n"+
                                    "Available Table"+"\t"+": "+available,
                            Toast.LENGTH_LONG).show();
                }
                else
                {
                    booked--;
                    available++;
                    Toast.makeText(MainActivity.this,
                            "Booked Table"+"\t"+": "+booked+"\n"+
                                    "Available Table"+"\t"+": "+available,
                            Toast.LENGTH_LONG).show();
                }
            }
        });

        Toggle14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Toggle14.isChecked())
                {
                    booked++;
                    available--;
                    Toast.makeText(MainActivity.this,
                            "Booked Table"+"\t"+": "+booked+"\n"+
                                    "Available Table"+"\t"+": "+available,
                            Toast.LENGTH_LONG).show();
                }
                else
                {
                    booked--;
                    available++;
                    Toast.makeText(MainActivity.this,
                            "Booked Table"+"\t"+": "+booked+"\n"+
                                    "Available Table"+"\t"+": "+available,
                            Toast.LENGTH_LONG).show();
                }
            }
        });

        Toggle15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Toggle15.isChecked())
                {
                    booked++;
                    available--;
                    Toast.makeText(MainActivity.this,
                            "Booked Table"+"\t"+": "+booked+"\n"+
                                    "Available Table"+"\t"+": "+available,
                            Toast.LENGTH_LONG).show();
                }
                else
                {
                    booked--;
                    available++;
                    Toast.makeText(MainActivity.this,
                            "Booked Table"+"\t"+": "+booked+"\n"+
                                    "Available Table"+"\t"+": "+available,
                            Toast.LENGTH_LONG).show();
                }
            }
        });

        Toggle16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Toggle16.isChecked())
                {
                    booked++;
                    available--;
                    Toast.makeText(MainActivity.this,
                            "Booked Table"+"\t"+": "+booked+"\n"+
                                    "Available Table"+"\t"+": "+available,
                            Toast.LENGTH_LONG).show();
                }
                else
                {
                    booked--;
                    available++;
                    Toast.makeText(MainActivity.this,
                            "Booked Table"+"\t"+": "+booked+"\n"+
                                    "Available Table"+"\t"+": "+available,
                            Toast.LENGTH_LONG).show();
                }
            }
        });

        Toggle17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Toggle17.isChecked())
                {
                    booked++;
                    available--;
                    Toast.makeText(MainActivity.this,
                            "Booked Table"+"\t"+": "+booked+"\n"+
                                    "Available Table"+"\t"+": "+available,
                            Toast.LENGTH_LONG).show();
                }
                else
                {
                    booked--;
                    available++;
                    Toast.makeText(MainActivity.this,
                            "Booked Table"+"\t"+": "+booked+"\n"+
                                    "Available Table"+"\t"+": "+available,
                            Toast.LENGTH_LONG).show();
                }
            }
        });
        Toggle18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Toggle18.isChecked())
                {
                    booked++;
                    available--;
                    Toast.makeText(MainActivity.this,
                            "Booked Table"+"\t"+": "+booked+"\n"+
                                    "Available Table"+"\t"+": "+available,
                            Toast.LENGTH_LONG).show();
                }
                else
                {
                    booked--;
                    available++;
                    Toast.makeText(MainActivity.this,
                            "Booked Table"+"\t"+": "+booked+"\n"+
                                    "Available Table"+"\t"+": "+available,
                            Toast.LENGTH_LONG).show();
                }
            }
        });

        Toggle19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Toggle19.isChecked())
                {
                    booked++;
                    available--;
                    Toast.makeText(MainActivity.this,
                            "Booked Table"+"\t"+": "+booked+"\n"+
                                    "Available Table"+"\t"+": "+available,
                            Toast.LENGTH_LONG).show();
                }
                else
                {
                    booked--;
                    available++;
                    Toast.makeText(MainActivity.this,
                            "Booked Table"+"\t"+": "+booked+"\n"+
                                    "Available Table"+"\t"+": "+available,
                            Toast.LENGTH_LONG).show();
                }
            }
        });

        Toggle20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Toggle20.isChecked())
                {
                    booked++;
                    available--;
                    Toast.makeText(MainActivity.this,
                            "Booked Table"+"\t"+": "+booked+"\n"+
                                    "Available Table"+"\t"+": "+available,
                            Toast.LENGTH_LONG).show();
                }
                else
                {
                    booked--;
                    available++;
                    Toast.makeText(MainActivity.this,
                            "Booked Table"+"\t"+": "+booked+"\n"+
                                    "Available Table"+"\t"+": "+available,
                            Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}
