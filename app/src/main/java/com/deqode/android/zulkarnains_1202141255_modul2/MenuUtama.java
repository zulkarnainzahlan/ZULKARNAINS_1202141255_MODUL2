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
    RadioButton myRadiobtn;
    RadioButton rb1;
    RadioButton rb2;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_utama);

        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        rb1 = (RadioButton) findViewById(R.id.rbdinein);
        rb2 = (RadioButton) findViewById(R.id.rbtakeaway);
        button = (Button) findViewById(R.id.btpesan);
        myLister();
    }

    public void myLister(){

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(RadioGroup radioGroup, int i) {
                        switch (i){
                            case R.id.rbdinein:
                                myLister();
                                Toast.makeText(MenuUtama.this ,"Dine In", Toast.LENGTH_SHORT).show();
                                startActivity(new Intent(MenuUtama.this , DineIn.class));
                                break;
                            case R.id.rbtakeaway:
                                myLister();
                                Toast.makeText(MenuUtama.this ,"Take Away", Toast.LENGTH_SHORT).show();
                                startActivity(new Intent(MenuUtama.this , TakeAway.class));
                                break;
                        }
                    }
                });

//                int rgs_id = radioGroup.getCheckedRadioButtonId();
//
//                if(rgs_id==2){
//
//                    myRadiobtn = (RadioButton)findViewById(rgs_id);
//                    Toast.makeText(MenuUtama.this ,myRadiobtn.getText().toString(), Toast.LENGTH_LONG).show();
//                    //startActivity(new Intent(MenuUtama.this ,rb1.getText().toString(),Toast DineIn.class));
//                    startActivity(new Intent(MenuUtama.this , DineIn.class)); //test
//
//                }else{
//                    myRadiobtn = (RadioButton)findViewById(rgs_id);
//                    Toast.makeText(MenuUtama.this ,myRadiobtn.getText().toString(), Toast.LENGTH_LONG).show();
//
//                    startActivity(new Intent(MenuUtama.this , TakeAway.class));
//                }

            }
        });
    }
}
