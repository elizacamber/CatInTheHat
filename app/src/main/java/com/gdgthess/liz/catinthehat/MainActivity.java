package com.gdgthess.liz.catinthehat;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialize();
    }

    public void initialize(){
        // Initialize all buttons
        Button btn1 = (Button) findViewById(R.id.btn1);
        Button btn2 = (Button) findViewById(R.id.btn2);
        Button btn3 = (Button) findViewById(R.id.btn3);
        Button btn4 = (Button) findViewById(R.id.btn4);
        Button btn5 = (Button) findViewById(R.id.btn5);
        Button btn6 = (Button) findViewById(R.id.btn6);
        Button btn7 = (Button) findViewById(R.id.btn7);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        return true;
    }

    public void onBtnClicked(View view){
        switch (view.getId()){
            case R.id.btn1:
                Toast.makeText(getApplicationContext(), "'The Cat' is clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn2:
                Toast.makeText(getApplicationContext(), "'Thing 1' is clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn3:
                Toast.makeText(getApplicationContext(), "'Thing 2' is clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn4:
                Toast.makeText(getApplicationContext(), "'Thingamajigger' is clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn5:
                Toast.makeText(getApplicationContext(), "'Sally' is clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn6:
                Toast.makeText(getApplicationContext(), "'Nick' is clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn7:
                Toast.makeText(getApplicationContext(), "'Dr. Seuss' is clicked", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
