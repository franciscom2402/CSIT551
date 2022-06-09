package com.example.gpa_franciscom3_calculator2;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.gpa_franciscom3_calculator2.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    Button b;
    EditText e1,e2,e3,e4,e5;
    TextView t;
    int count=0;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b=(Button)findViewById(R.id.b);
        e1=(EditText)findViewById(R.id.e1);
        e2=(EditText)findViewById(R.id.e2);
        e3=(EditText)findViewById(R.id.e3);
        e4=(EditText)findViewById(R.id.e4);
        e5=(EditText)findViewById(R.id.e5);
        t=(TextView)findViewById(R.id.t);
        t.setBackgroundColor(Color.WHITE);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float g1, g2, g3, g4, g5;
                if (count % 2 == 0) {
                    if (e1.getText().toString().equals("") || e2.getText().toString().equals("") || e3.getText().toString().equals("") || e4.getText().toString().equals("") || e5.getText().toString().equals("")) {
                        t.setText("Please complete all fields");
                    }
                    else {
                        g1 = Float.parseFloat(e1.getText().toString());
                        g2 = Float.parseFloat(e2.getText().toString());
                        g3 = Float.parseFloat(e3.getText().toString());
                        g4 = Float.parseFloat(e4.getText().toString());
                        g5 = Float.parseFloat(e5.getText().toString());
                        float avg = g1 + g2 + g3 + g4 + g5;
                        avg = avg / 5;
                        if (avg < 60) {
                            t.setText(Float.toString(avg));
                            t.setBackgroundColor(Color.RED);
                        } else if (avg > 60 && avg < 80) {
                            t.setText(Float.toString(avg));
                            t.setBackgroundColor(Color.YELLOW);
                        } else if (avg >= 80 && avg <= 100) {
                            t.setText(Float.toString(avg));
                            t.setBackgroundColor(Color.GREEN);
                        }
                        count++;
                        b.setText("Clear");
                    }

                }
                else
                {
                    e1.setText("");
                    e2.setText("");
                    e3.setText("");
                    e4.setText("");
                    e5.setText("");
                    t.setText("");
                    b.setText("Calculate GPA");
                    t.setBackgroundColor(Color.WHITE);
                    count++;
                }
            }
        });
    }
}
