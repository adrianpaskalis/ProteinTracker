package com.example.proteintracker;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.proteintracker.Adapter.DaftarTemanAdapter;
import com.example.proteintracker.Model.DaftarTeman;

import java.util.ArrayList;

public class DaftarTemanActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private DaftarTemanAdapter daftarTemanAdapter;
    private ArrayList<DaftarTeman>DaftarTemanArraylist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_teman);
        addData();

        recyclerView = findViewById(R.id.RvTeman);
        daftarTemanAdapter = new DaftarTemanAdapter(DaftarTemanArraylist);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(DaftarTemanActivity.this);
        recyclerView .setLayoutManager(layoutManager);
        recyclerView .setAdapter(daftarTemanAdapter);
    }
    private  void addData(){
        DaftarTemanArraylist =  new ArrayList<>();
        DaftarTemanArraylist.add(new DaftarTeman("Angkie Octovaldo Elias Wangkai","72170146","Tidur","Punya Pacar","tidur is the best","Laki-Laki",R.drawable.angkie));
        DaftarTemanArraylist.add(new DaftarTeman("Yos Rafel","72170092","dolanan game","Jualan Komputer","selow aja","Laki-Laki",R.drawable.yos));
        DaftarTemanArraylist.add(new DaftarTeman("Dorran","72170110","Make Up","Glowing","fak lyfe","Laki-Laki",R.drawable.dorra));
        DaftarTemanArraylist.add(new DaftarTeman("Desta Siwi Prabawan","72170126","makan","kurus dan ganteng","s k u yy ","Laki-laki",R.drawable.desta));
    }
}