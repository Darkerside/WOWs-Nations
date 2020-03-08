package com.ra121514.wowsnations;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.Glide;

public class NationDetailActivity extends AppCompatActivity {

    TextView txtName, txtInformation, txtDescription, nameshipDD, nameshipCA, nameshipBB, nameshipCV, infoDD, infoCA, infoBB, infoCV;
    ImageView imgNation, imgshipDD, imgshipCA, imgshipBB, imgshipCV;
    String shipBB, shipCA, shipCV, shipDD, nameDD, nameCA, nameBB, nameCV, gmpDD, gmpCA, gmpBB, gmpCV;
    CardView cvBB, cvCA, cvCV, cvDD, lgBB, lgCA, lgCV, lgDD;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nation_detail);

        txtName = findViewById(R.id.text_name);
        txtInformation = findViewById(R.id.text_gameplay_ca);
        txtDescription = findViewById(R.id.text_desc);
        imgNation = findViewById(R.id.image_nation);

        imgshipDD = findViewById(R.id.ShipDD);
        imgshipCA = findViewById(R.id.ShipCA);
        imgshipBB = findViewById(R.id.ShipBB);
        imgshipCV = findViewById(R.id.ShipCV);

        nameshipDD = findViewById(R.id.shipnamedd);
        nameshipCA = findViewById(R.id.shipnameca);
        nameshipBB = findViewById(R.id.shipnamebb);
        nameshipCV = findViewById(R.id.shipnamecv);

        infoDD = findViewById(R.id.text_gameplay_dd);
        infoCA = findViewById(R.id.text_gameplay_ca);
        infoBB = findViewById(R.id.text_gameplay_bb);
        infoCV = findViewById(R.id.text_gameplay_cv);

        cvBB = findViewById(R.id.cardBB);
        cvCA = findViewById(R.id.cardCA);
        cvCV = findViewById(R.id.cardCV);
        cvDD = findViewById(R.id.cardDD);

        lgBB = findViewById(R.id.LOGOBB);
        lgCA = findViewById(R.id.LOGOCA);
        lgCV = findViewById(R.id.LOGOCV);
        lgDD = findViewById(R.id.LOGODD);

        // ambil data dari intent
        String name = getIntent().getStringExtra("name");
        String information = getIntent().getStringExtra("information");
        String description = getIntent().getStringExtra("description");
        String image = getIntent().getStringExtra("image");
        String prefix = getIntent().getStringExtra("prefix");

        shipDD = prefix + "dd";
        shipCA = prefix + "ca";
        shipCV = prefix + "cv";
        shipBB = prefix + "bb";
        nameDD = prefix + "namedd";
        nameCA = prefix + "nameca";
        nameBB = prefix + "namebb";
        nameCV = prefix + "namecv";
        gmpDD = prefix + "infodd";
        gmpCA = prefix + "infoca";
        gmpBB = prefix + "infobb";
        gmpCV = prefix + "infocv";

        // set to view
        txtName.setText(name);
        //txtInformation.setText(information);
        txtDescription.setText(description);


        if( prefix.equals("grm_")){
            cvCV.setVisibility(View.GONE);
            lgCV.setVisibility(View.GONE);
        } else if( prefix.equals("ussr_")){
            cvCV.setVisibility(View.GONE);
            lgCV.setVisibility(View.GONE);
        } else if( prefix.equals("uk_")){
            cvDD.setVisibility(View.GONE);
            lgDD.setVisibility(View.GONE);
            cvCA.setVisibility(View.VISIBLE);
            lgCA.setVisibility(View.VISIBLE);
            lgCA.setCardBackgroundColor(0xffffffff);
        } else if( prefix.equals("cmw_")){
            cvBB.setVisibility(View.GONE);
            cvCV.setVisibility(View.GONE);
            lgBB.setVisibility(View.GONE);
            lgCV.setVisibility(View.GONE);
        } else if( prefix.equals("frc_")){
            cvCV.setVisibility(View.GONE);
            lgCV.setVisibility(View.GONE);
        } else if( prefix.equals("ity_")){
            cvCA.setVisibility(View.GONE);
            cvDD.setVisibility(View.GONE);
            cvBB.setVisibility(View.GONE);
            cvCV.setVisibility(View.GONE);
            lgDD.setVisibility(View.GONE);
            lgCA.setVisibility(View.GONE);
            lgBB.setVisibility(View.GONE);
            lgCV.setVisibility(View.GONE);
        } else if( prefix.equals("pa_")){
            cvCA.setVisibility(View.GONE);
            cvDD.setVisibility(View.GONE);
            cvBB.setVisibility(View.GONE);
            cvCV.setVisibility(View.GONE);
            lgDD.setVisibility(View.GONE);
            lgCA.setVisibility(View.GONE);
            lgBB.setVisibility(View.GONE);
            lgCV.setVisibility(View.GONE);
        } else if( prefix.equals("pe_")){
            cvCA.setVisibility(View.GONE);
            cvDD.setVisibility(View.GONE);
            cvBB.setVisibility(View.GONE);
            cvCV.setVisibility(View.GONE);
            lgDD.setVisibility(View.GONE);
            lgCA.setVisibility(View.GONE);
            lgBB.setVisibility(View.GONE);
            lgCV.setVisibility(View.GONE);
        } else if( prefix.equals("pam_")){
            cvCA.setVisibility(View.GONE);
            cvDD.setVisibility(View.GONE);
            cvBB.setVisibility(View.GONE);
            cvCV.setVisibility(View.GONE);
            lgDD.setVisibility(View.GONE);
            lgCA.setVisibility(View.GONE);
            lgBB.setVisibility(View.GONE);
            lgCV.setVisibility(View.GONE);
        }

        int drawableIdentifier = this.getResources().getIdentifier(image, "drawable", this.getPackageName());
        Glide.with(getApplicationContext())
                .load(drawableIdentifier)
                .into(imgNation);

        int drawableIdentifierDD = this.getResources().getIdentifier(shipDD, "drawable", this.getPackageName());
        Glide.with(getApplicationContext())
                .load(drawableIdentifierDD)
                .into(imgshipDD);

        int drawableIdentifierCA = this.getResources().getIdentifier(shipCA, "drawable", this.getPackageName());
        Glide.with(getApplicationContext())
                .load(drawableIdentifierCA)
                .into(imgshipCA);

        int drawableIdentifierBB = this.getResources().getIdentifier(shipBB, "drawable", this.getPackageName());
        Glide.with(getApplicationContext())
                .load(drawableIdentifierBB)
                .into(imgshipBB);

        int drawableIdentifierCV = this.getResources().getIdentifier(shipCV, "drawable", this.getPackageName());
        Glide.with(getApplicationContext())
                .load(drawableIdentifierCV)
                .into(imgshipCV);

        int stringIdentifierDD = this.getResources().getIdentifier(nameDD, "string", this.getPackageName());
        nameshipDD.setText(stringIdentifierDD);
        int stringIdentifierCA = this.getResources().getIdentifier(nameCA, "string", this.getPackageName());
        nameshipCA.setText(stringIdentifierCA);
        int stringIdentifierBB = this.getResources().getIdentifier(nameBB, "string", this.getPackageName());
        nameshipBB.setText(stringIdentifierBB);
        int stringIdentifierCV = this.getResources().getIdentifier(nameCV, "string", this.getPackageName());
        nameshipCV.setText(stringIdentifierCV);
        int stringIdentifierDDa = this.getResources().getIdentifier(gmpDD, "string", this.getPackageName());
        infoDD.setText(stringIdentifierDDa);
        int stringIdentifierCAa = this.getResources().getIdentifier(gmpCA, "string", this.getPackageName());
        infoCA.setText(stringIdentifierCAa);
        int stringIdentifierBBa = this.getResources().getIdentifier(gmpBB, "string", this.getPackageName());
        infoBB.setText(stringIdentifierBBa);
        int stringIdentifierCVa = this.getResources().getIdentifier(gmpCV, "string", this.getPackageName());
        infoCV.setText(stringIdentifierCVa);

    }

    public void tabDD(View view){
        cvDD.setVisibility(View.VISIBLE);
        cvCA.setVisibility(View.GONE);
        cvBB.setVisibility(View.GONE);
        cvCV.setVisibility(View.GONE);
        lgDD.setCardBackgroundColor(0xffffffff);
        lgCA.setCardBackgroundColor(0xff12243a);
        lgBB.setCardBackgroundColor(0xff12243a);
        lgCV.setCardBackgroundColor(0xff12243a);

    }

    public void tabCA(View view){
        cvCA.setVisibility(View.VISIBLE);
        cvDD.setVisibility(View.GONE);
        cvBB.setVisibility(View.GONE);
        cvCV.setVisibility(View.GONE);
        lgCA.setCardBackgroundColor(0xffffffff);
        lgDD.setCardBackgroundColor(0xff12243a);
        lgBB.setCardBackgroundColor(0xff12243a);
        lgCV.setCardBackgroundColor(0xff12243a);

    }

    public void tabBB(View view){
        cvBB.setVisibility(View.VISIBLE);
        cvDD.setVisibility(View.GONE);
        cvCA.setVisibility(View.GONE);
        cvCV.setVisibility(View.GONE);
        lgBB.setCardBackgroundColor(0xffffffff);
        lgDD.setCardBackgroundColor(0xff12243a);
        lgCA.setCardBackgroundColor(0xff12243a);
        lgCV.setCardBackgroundColor(0xff12243a);

    }

    public void tabCV(View view){
        cvCV.setVisibility(View.VISIBLE);
        cvDD.setVisibility(View.GONE);
        cvBB.setVisibility(View.GONE);
        cvCA.setVisibility(View.GONE);
        lgCV.setCardBackgroundColor(0xffffffff);
        lgDD.setCardBackgroundColor(0xff12243a);
        lgBB.setCardBackgroundColor(0xff12243a);
        lgCA.setCardBackgroundColor(0xff12243a);

    }
}