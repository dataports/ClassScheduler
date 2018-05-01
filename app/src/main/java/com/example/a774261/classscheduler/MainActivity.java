package com.example.a774261.classscheduler;

import java.lang.*;
import java.util.*;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ListView classListView;
        classListView = (ListView) findViewById(R.id.classroom_list_view);
        ArrayList<Classroom> saitClassRoomsBooked = new ArrayList<Classroom>(); //list of all the classrooms time is booked for
        //example classrooms in list
        Classroom md116 = new Classroom("116", "Stan Grad Center", "MD116");
        saitClassRoomsBooked.add(md116); //append object into the array of classrooms

        Classroom md104 = new Classroom("104", "Stan Grad Center", "MD104");
        saitClassRoomsBooked.add(md104);

        String[] listItems = new String[saitClassRoomsBooked.size()];

        for(int i = 0; i < saitClassRoomsBooked.size(); i++){
            Classroom classroom = saitClassRoomsBooked.get(i);
            listItems[i] = classroom.getRoomName();
        }

        ArrayAdapter adapter = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1, listItems);
        classListView.setAdapter(adapter);



        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
