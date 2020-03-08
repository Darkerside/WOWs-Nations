package com.ra121514.wowsnations;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements NationRecyclerAdapter.OnItemClickListener{

    private List<Nation> rv_list;
    private RecyclerView recyclerView;

    // create an action bar button
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.about, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        // Take appropriate action for each action item click
        switch (item.getItemId()) {
            case R.id.about:
                Intent abt = new Intent(this, About.class);
                startActivity(abt);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.nation_rv);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));

        rv_list = new ArrayList<>();
        rv_list.add(new Nation("flag1", "America", getString(R.string.us_info), getString(R.string.us_desc), "us_")); // image, name, information, description, prefix
        rv_list.add(new Nation("flag2", "Japan", getString(R.string.jpn_info), getString(R.string.jpn_desc), "jpn_")); // image, name, information, description
        rv_list.add(new Nation("flag3", "U.S.S.R", getString(R.string.ussr_info), getString(R.string.ussr_desc), "ussr_")); // image, name, information, description
        rv_list.add(new Nation("flag4", "Germany", getString(R.string.grm_info), getString(R.string.grm_desc), "grm_")); // image, name, information, description
        rv_list.add(new Nation("flag5", "U.K.", getString(R.string.uk_info), getString(R.string.uk_desc),"uk_")); // image, name, information, description
        rv_list.add(new Nation("flag6", "Commonwealth", getString(R.string.cmw_info), getString(R.string.cmw_desc),"cmw_")); // image, name, information, description
        rv_list.add(new Nation("flag7", "France", getString(R.string.frc_info), getString(R.string.frc_desc),"frc_")); // image, name, information, description
        rv_list.add(new Nation("flag8", "Italy", getString(R.string.ity_info), getString(R.string.ity_desc),"ity_")); // image, name, information, description
        rv_list.add(new Nation("flag9", "Pan-Asia", getString(R.string.pa_info), getString(R.string.pa_desc),"pa_")); // image, name, information, description
        rv_list.add(new Nation("flag10", "Pan-Europe", getString(R.string.pe_info), getString(R.string.pe_desc),"pe_")); // image, name, information, description
        rv_list.add(new Nation("flag11", "Pan-America", getString(R.string.pam_info), getString(R.string.pam_desc),"pam_")); // image, name, information, description

        NationRecyclerAdapter mAdapter = new NationRecyclerAdapter(rv_list, this);
        recyclerView.setAdapter(mAdapter);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
    }

    @Override
    public void onClick(Nation item) {
        Intent intent = new Intent(this, NationDetailActivity.class);
        intent.putExtra("image", item.getImage());
        intent.putExtra("name", item.getName());
        intent.putExtra("information", item.getInformation());
        intent.putExtra("description", item.getDescription());
        intent.putExtra("prefix", item.getPrefix());

        startActivity(intent);
    }

}
