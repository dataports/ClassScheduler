package com.example.a774261.classscheduler;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.lang.*;
import android.content.Intent;
import java.util.*;
import java.io.*;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.view.View;
import android.widget.EditText;

public class AddClassroom extends AppCompatActivity implements Serializable{

    Button addClassButton;
    EditText classNameEditTxt;
    EditText classBuildingEditTxt;
    String className;
    String classBuilding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_classroom);
        Intent intent = getIntent();
        ArrayList<Classroom> saitClassRoomsBooked = (ArrayList<Classroom>)intent.getSerializableExtra("classArrayList");

        addListenerOnButton();




    }


    public void addListenerOnButton() {
        addClassButton = (Button) findViewById(R.id.add_class_button);
        addClassButton.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View view) {
                classNameEditTxt = (EditText) findViewById(R.id.class_name_edit_txt);
                classBuildingEditTxt = (EditText) findViewById(R.id.building_edit_text);
                className = classNameEditTxt.getText().toString();
                classBuilding = classBuildingEditTxt.getText().toString();
                Classroom classroom = new Classroom(classBuilding, className);
                Intent intent = new Intent();
                intent.putExtra("classObject", classroom);
                setResult(1, intent);
                finish();
            }

        });

    }

}
