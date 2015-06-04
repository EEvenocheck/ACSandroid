package com.funnrun.asc1.funnrun;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;
import android.view.View;
import android.view.View.OnClickListener;
import android.content.Intent;


public class NewRun extends ActionBarActivity {

    TextView NewRunId;
    EditText Day;
    EditText Duration;
    EditText Distance;
    EditText Pace;
    EditText Location;
    EditText Notes;
    Button CreateRun;


    OnClickListener buttonListenerCreateRun = new OnClickListener() {
        public void onClick(View V) {
            Intent intent = new Intent(V.getContext(), History.class);
            intent.putExtra("Hday",Day.getText().toString());
            intent.putExtra("Hduration", Duration.getText().toString());
            intent.putExtra("Hdistance",Distance.getText().toString());
            intent.putExtra("Hpace",Pace.getText().toString());
            intent.putExtra("Hlocation",Location.getText().toString());
            intent.putExtra("Hnotes",Notes.getText().toString());


           // Intent intent2 = new Intent(V.getContext(), Home.class);
           // intent2.putExtra("GHduration",Duration.getText().toString());
           // intent2.putExtra("GHdistance",Distance.getText().toString());
           // intent2.putExtra("GHpace",Pace.getText().toString());

            startActivity(intent);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_run);
        Day = (EditText)findViewById(R.id.Day);
        NewRunId = (TextView)findViewById(R.id.NewRunId);
        Duration = (EditText)findViewById(R.id.Duration);
        Distance = (EditText)findViewById(R.id.Distance);
        Pace = (EditText)findViewById(R.id.Pace);
        Location = (EditText)findViewById(R.id.Location);
        Notes = (EditText)findViewById(R.id.Notes);
        CreateRun = (Button)findViewById(R.id.CreateRun);
        CreateRun.setOnClickListener(buttonListenerCreateRun);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_new_run, menu);
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
