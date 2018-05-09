package com.example.a774261.classscheduler;

import java.io.Serializable;
import java.lang.*;
import java.util.*;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.content.Intent;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements Serializable {
    ArrayList<Classroom> saitClassRoomsBooked = new ArrayList<Classroom>(); //list of all the classrooms time is booked for
    int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MenuFragment menu = new MenuFragment();
        menu.setHasOptionsMenu(true);

        //UI ELEMENTS
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setTitle("Classes Booked");
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        ListView classListView;
        classListView = (ListView) findViewById(R.id.classroom_list_view);
        final Intent intent = new Intent(this, AddClassroom.class);


        //Create and add classroom objects to list
        //TODO: make this a file in XML to load classrooms?
        Classroom md116 = new Classroom("Stan Grad Center", "MD116");
        saitClassRoomsBooked.add(md116); //append object into the array of classrooms

        Classroom md104 = new Classroom( "Stan Grad Center", "MD104");
        saitClassRoomsBooked.add(md104);

        //Array of strings of size equal to the classroom list
        String[] listItems = new String[saitClassRoomsBooked.size()];

        //loop to fill the array of strings and use the array adapter to populate the list view withthe items in listItems
        for(i = 0; i < saitClassRoomsBooked.size(); i++){
            Classroom classroom = saitClassRoomsBooked.get(i);
            listItems[i] = classroom.getRoomName();
        }

        ArrayAdapter adapter = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1, listItems);
        classListView.setAdapter(adapter);




            fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent.putExtra("classArrayList", saitClassRoomsBooked);
//                EditText editText = (EditText) findViewById(R.id.editText);
//                String message = editText.getText().toString();
//                intent.putExtra(EXTRA_MESSAGE, message);
                startActivityForResult(intent, 1);

            }
        });
    }

    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1) {
            if(resultCode == 1) {
                Bundle b = data.getExtras();
                if (b != null){
                    Classroom classroomOb = (Classroom) b.getSerializable("classObject");
                    saitClassRoomsBooked.add(classroomOb);
                    Toast.makeText(getApplicationContext(), classroomOb.getRoomName(),
                            Toast.LENGTH_LONG).show();
                    Log.d("Mainactivity", "classroom appended");
                    //TODO: enable updates to the list view after receiving data back
                }

            }
        }
    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.menu_main, menu);
//        return true;
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        // Handle action bar item clicks here. The action bar will
//        // automatically handle clicks on the Home/Up button, so long
//        // as you specify a parent activity in AndroidManifest.xml.
//        int id = item.getItemId();
//
//        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_settings) {
//            return true;
//        }
//
//        return super.onOptionsItemSelected(item);
//    }
}
