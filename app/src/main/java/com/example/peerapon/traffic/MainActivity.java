package com.example.peerapon.traffic;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Create ListView
        createlistView();
    }   //Main Metod

    private void createlistView() {
        MyData objMyData = new MyData();
        int[] inIcon = objMyData.icon();
        String[] strTitle = objMyData.title();

        MyAdapter objMyAdapter = new MyAdapter(MainActivity.this, inIcon,strTitle);
        ListView myLisView = (ListView) findViewById(R.id.listView);
        myLisView.setAdapter(objMyAdapter);

    } // createlistView

    public void clickAboutMe(View view) {
        Intent objIntent = new Intent(Intent.ACTION_VIEW);
        objIntent.setData(Uri.parse("www.csclub.ssru.ac.th/s56122201125/csc3215/"));
        startActivity(objIntent);
    } //click
}