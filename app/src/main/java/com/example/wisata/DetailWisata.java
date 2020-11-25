package com.example.wisata;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailWisata extends AppCompatActivity {
     private TextView txtTitle, textDetail;
     private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_wisata);
        Wisata wisata;
        wisata = getIntent().getParcelableExtra("wisata");
        Log.d("IDN","Nama : "+wisata.getNama());

        txtTitle = findViewById(R.id.txtWisata);
        txtTitle.setText(wisata.getNama());

        textDetail = findViewById(R.id.txtDetailWisata);
        textDetail.setText(wisata.getDetail());

        imageView = findViewById(R.id.imageWisata);
        imageView.setImageResource(wisata.getPhoto());
    }
}
