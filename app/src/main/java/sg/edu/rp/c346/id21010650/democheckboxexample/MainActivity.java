package sg.edu.rp.c346.id21010650.democheckboxexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox checkboxDiscount;
    Button buttonCheck;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("MyActivity", "Inside onClick()");
        checkboxDiscount = findViewById(R.id.checkboxDiscount);
        buttonCheck = findViewById(R.id.buttonCheck);
        textView = findViewById(R.id.textView);


    buttonCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(checkboxDiscount.isChecked()) {
                    textView.setText("The discount is given.");
                    Toast.makeText(getApplicationContext(),"Button clicked.",Toast.LENGTH_LONG).show();
                }
                else {
                    textView.setText("The discount is not given.");
                    Toast.makeText(getApplicationContext(),"Button not clicked.",Toast.LENGTH_LONG).show();
                }
                }
            });



            }
}