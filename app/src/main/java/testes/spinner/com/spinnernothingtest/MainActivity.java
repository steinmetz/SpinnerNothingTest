package testes.spinner.com.spinnernothingtest;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.DragEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;


public class MainActivity extends ActionBarActivity {

    private Spinner mySpinner;

    private ArrayList<String> names;
    private ArrayAdapter<String> namesAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mySpinner = (Spinner) findViewById(R.id.mySpinner);

        names = new ArrayList<>();
        names.add("Charles");
        names.add("Guilherme");

        namesAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,names);

        mySpinner.setAdapter(namesAdapter);

        setListeners();

    }

    private void setListeners() {



        mySpinner.setOnDragListener(new View.OnDragListener() {
            @Override
            public boolean onDrag(View v, DragEvent event) {

                return false;
            }
        });

        mySpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Log.i("SSS", "onItemSelected");
                namesAdapter.clear();
                namesAdapter.notifyDataSetChanged();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                Log.i("SSS", "onNothingSelected");
            }
        });
    }


}
