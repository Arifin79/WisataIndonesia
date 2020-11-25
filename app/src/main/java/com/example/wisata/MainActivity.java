package com.example.wisata;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
     RecyclerView rvWisata;
     ArrayList<Wisata> list = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (getSupportActionBar() !=null)
            getSupportActionBar().setTitle("Wisata Sejarah Indonesia");

        rvWisata = findViewById(R.id.rv_wisata);
        rvWisata.setHasFixedSize(true);

        list.addAll(WisataData.getListData());
        showRecyclerList();

    }
    private void showRecyclerList(){
        rvWisata.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));
        ListWisataAdapter listWisataAdapter = new ListWisataAdapter(list);
        rvWisata.setAdapter(listWisataAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.profile,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }
    private void setMode(int selectedMode){
        switch (selectedMode) {
            case R.id.My_profile:
                Intent moveIntent = new Intent(MainActivity.this, profile.class);
                startActivity(moveIntent);
                break;

        }
    }
}
