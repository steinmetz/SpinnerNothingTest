package testes.spinner.com.spinnernothingtest;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
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




    }



}
