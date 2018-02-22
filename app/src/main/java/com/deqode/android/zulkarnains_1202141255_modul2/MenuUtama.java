package com.deqode.android.zulkarnains_1202141255_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MenuUtama extends AppCompatActivity {

    RadioGroup radioGroup;
    RadioButton rb1;
    RadioButton rb2;
    Button button;
    boolean dineIn;
    boolean way;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_utama);

        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        rb1 = (RadioButton) findViewById(R.id.rbdinein);
        rb2 = (RadioButton) findViewById(R.id.rbtakeaway);
        button = (Button) findViewById(R.id.btpesan);
        dineIn = false;
        way = false;
    }


    public void onRadioButtonClicked (View view){
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        //Toast.makeText(MenuUtama.this, "Dine In"+checked, Toast.LENGTH_SHORT).show();
        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.rbdinein:
                if(checked) {
                    dineIn = true;//membuat check di dine in
                }

                break;
            case R.id.rbtakeaway:
                if(checked){
                    way=true;} //membuat check di take away

                break;
        }

    }

    public void fungsiButton (View view){

        if(dineIn){//apabila dine in yg ke check laksanakan code ini

            Toast.makeText(MenuUtama.this, "Dine In", Toast.LENGTH_SHORT).show();
            startActivity(new Intent(MenuUtama.this, DineIn.class));
        }else if(way){//apabila take away yg ke check laksanakan code ini

            Toast.makeText(MenuUtama.this, "Take Way", Toast.LENGTH_SHORT).show();
            startActivity(new Intent(MenuUtama.this, TakeAway.class));
        }



    }


}
