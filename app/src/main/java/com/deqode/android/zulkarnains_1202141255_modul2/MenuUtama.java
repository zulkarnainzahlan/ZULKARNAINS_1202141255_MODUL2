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

    private String dine;
    private String take;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_utama);

        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        rb1 = (RadioButton) findViewById(R.id.rbdinein);
        rb2 = (RadioButton) findViewById(R.id.rbtakeaway);
        button = (Button) findViewById(R.id.btpesan);
        Toast welcome = Toast.makeText(this,"Zulkarnain Sahlan_1202141255",Toast.LENGTH_SHORT);
        welcome.show();
    }



    public void fungsiRadiobutton(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.rbdinein:
                if (checked)
                // dine in
                {
                    dine = (String)getString(R.string.dine_in);
                    Toast warning = Toast.makeText(this,"Dine In",Toast.LENGTH_SHORT);
                    warning.show();
                    startActivity(new Intent(MenuUtama.this , DineIn.class));
                }
                break;
            case R.id.rbtakeaway:
                if (checked)
                // take away
                {
                    take = (String)getString(R.string.take_away);
                    Toast warning = Toast.makeText(this,"Take Away",Toast.LENGTH_SHORT);
                    warning.show();
                    startActivity(new Intent(MenuUtama.this , TakeAway.class));
                }
                break;
            default:
                break;
        }
    }

    public void fungsiButton(View view) {

        boolean checked = ((RadioButton) view).isChecked();
        switch(view.getId()) {
            case R.id.rbdinein:
                if (checked)
                // dine in
                {
                    startActivity(new Intent(MenuUtama.this , DineIn.class));
                }
                break;
            case R.id.rbtakeaway:
                if (checked)
                // take away
                {
                    startActivity(new Intent(MenuUtama.this , TakeAway.class));
                }
                break;
        }
//        if (dine!=null){
//            Intent dine = new Intent(this, DineIn.class);
//            startActivity(dine);
//        }else if (take!=null){
//            Intent take = new Intent(this, TakeAway.class);
//            startActivity(take);
//        }else{
//            Toast warning = Toast.makeText(this,"Nothing is chosen",Toast.LENGTH_LONG);
//            warning.show();
//        }
        return;
    }
}
