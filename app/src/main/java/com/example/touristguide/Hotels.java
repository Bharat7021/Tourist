package com.example.touristguide;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Hotels extends AppCompatActivity {
    private RadioButton r1, r2, r3, r4, r5, r6, r8, r9, r10, r11, r12, r13;
    private Button book;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotels);
        r1 = findViewById(R.id.radio1);
        r2 = findViewById(R.id.radio2);
        r3 = findViewById(R.id.radio3);
        r4 = findViewById(R.id.radio4);
        r5 = findViewById(R.id.radio5);
        r6 = findViewById(R.id.radio6);
        r8 = findViewById(R.id.radio8);
        r9 = findViewById(R.id.radio9);
        r10 = findViewById(R.id.radio10);
        r11 = findViewById(R.id.radio11);
        r12 = findViewById(R.id.radio12);
        r13 = findViewById(R.id.radio13);
        book = findViewById(R.id.book);
        book.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean b1,b2,b3,b4,b5,b6,b8,b9,b10,b11,b12,b13;
                b1 =r1.isChecked();
                b2 =r2.isChecked();
                b3 =r3.isChecked();
                b4 =r4.isChecked();
                b5 =r5.isChecked();
                b6 =r6.isChecked();
                b8 =r8.isChecked();
                b9 =r9.isChecked();
                b10 =r10.isChecked();
                b11 =r11.isChecked();
                b12 =r12.isChecked();
                b13 =r13.isChecked();
                StringBuffer s = new StringBuffer();
                if(b1){
                    s.append("HOTEL FORTUNE MUMBAI booked Sucessfully!");
                }
                else if (b2){
                    s.append("HOTEL SAPNA MARINE booked Sucessfully!");
                }
                else if (b3){
                    s.append("WEST END HOTEL booked Sucessfully!");
                }
                else if (b4){
                    s.append("HOTEL TOURISTER booked Sucessfully!");
                }
                else if (b5){
                    s.append("HOTEL GIRGAON PALACE booked Sucessfully!");
                }
                else if (b6){
                    s.append("PANDURANG WADI booked Sucessfully!");
                }
                else if (b8){
                    s.append("ASHA GUEST HOUSE booked Sucessfully!");
                }
                else if (b9){
                    s.append("HOTEL REGAL PALACE booked Sucessfully!");
                }
                else if (b10){
                    s.append("PANDHARINATH CHAWL booked Sucessfully!");
                }
                else if (b11){
                    s.append("OYO 9748 HOTEL GIRGAON PALACE booked Sucessfully!");
                }
                else if (b12){
                    s.append("REVIVAL opp. Chowpatty booked Sucessfully!");
                }
                else if (b13){
                    s.append("KHADAYTA BHUVAN booked Sucessfully!");
                }
                else{
                    s.append("Please Select an Option");
                }
                Toast.makeText(Hotels.this,s.toString(),Toast.LENGTH_LONG).show();
            }
        });
    }
}