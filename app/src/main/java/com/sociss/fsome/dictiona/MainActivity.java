package com.sociss.fsome.dictiona;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;


public class MainActivity extends AppCompatActivity {
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        this.listView = (ListView) findViewById(R.id.listView);

        DatabaseAccess databaseAccess = DatabaseAccess.getInstance(this);
        System.out.println("ddsdssn day");
        databaseAccess.open();

        List<String> anhViet = databaseAccess.getWords();
        System.out.println("den day");
        databaseAccess.close();

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, anhViet);
        this.listView.setAdapter(adapter);
    }
}
