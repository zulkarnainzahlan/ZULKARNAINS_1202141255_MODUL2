package com.deqode.android.zulkarnains_1202141255_modul2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class DaftarMenu extends AppCompatActivity {

    RecyclerView r1;
    String s1[], s2[];
    int imageResource[] = {R.drawable.nasigoreng, R.drawable.mieayam};

    MyOwnAdapter ad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_menu);

        r1=(RecyclerView) findViewById(R.id.recyclerv_view);

        s1=getResources().getStringArray(R.array.menu_makan);
        s2=getResources().getStringArray(R.array.harga);

        ad = new MyOwnAdapter(this, s1, s2, imageResource);

        r1.setAdapter(ad);
        r1.setLayoutManager(new LinearLayoutManager(this));
    }
}
