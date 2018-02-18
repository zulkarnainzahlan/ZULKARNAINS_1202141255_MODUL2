package com.deqode.android.zulkarnains_1202141255_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class DineIn extends AppCompatActivity
    implements AdapterView.OnItemSelectedListener{

    private String mSpinnerLabel = "";
    private static final String TAG = DineIn.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dine_in);

        //Untuk membuat spinner
        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        if (spinner != null) {
            spinner.setOnItemSelectedListener(this);
        }

        // Create ArrayAdapter using the string array and default spinner layout.
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.labels_array, android.R.layout.simple_spinner_item);

        // Specify the layout to use when the list of choices appears.
        adapter.setDropDownViewResource
                (android.R.layout.simple_spinner_dropdown_item);

        // Apply the adapter to the spinner.
        if (spinner != null) {
            spinner.setAdapter(adapter);
        }

    }

    public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
        mSpinnerLabel = adapterView.getItemAtPosition(position).toString();
        Toast.makeText(DineIn.this ,mSpinnerLabel, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {
        Log.d(TAG,"onNothingSelected: ");
    }

    public void pilihPesananLagi(View view) {
        startActivity(new Intent(DineIn.this , DaftarMenu.class));
        //ini digunakan untuk melakukan intent ke DaftarMenu.class //TESR
    }
}
