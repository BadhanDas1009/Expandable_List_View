package com.example.expendable_list;

import android.os.Bundle;
import android.widget.ExpandableListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ExpandableListView expandableListView;
    List<String> groupList;
    HashMap<String, List<String>> childList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        expandableListView = findViewById(R.id.expandableListView);
        groupList = new ArrayList<>();
        childList = new HashMap<>();

        groupList.add("Fruits");
        groupList.add("Vegetables");

        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        List<String> vegetables = new ArrayList<>();
        vegetables.add("Carrot");
        vegetables.add("Potato");
        vegetables.add("Tomato");

        childList.put(groupList.get(0), fruits);
        childList.put(groupList.get(1), vegetables);

        ExpandableListAdapter adapter = new ExpandableListAdapter(this, groupList, childList);
        expandableListView.setAdapter(adapter);
    }
}
