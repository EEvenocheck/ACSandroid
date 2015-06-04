package com.funnrun.asc1.funnrun;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Button;
import android.view.View;
import android.view.View.OnClickListener;
import android.content.Intent;
import android.widget.ListView;



public class Home extends ActionBarActivity {

    TextView title;
    Button NewRun;
    Button History;
    Button Goals;
    TextView Achieve;
    TextView Gdistance;
    TextView Gduration;
    TextView Gpace;
    TextView EDuration;
    TextView Random;

    OnClickListener buttonListener = new OnClickListener() {
        public void onClick(View V) {
            Intent intent = new Intent(V.getContext(), NewRun.class);
            startActivity(intent);
        }
    };
    OnClickListener buttonListenerHistory = new OnClickListener() {
        public void onClick(View V) {
            Intent intent = new Intent(V.getContext(), History.class);
            startActivity(intent);
        }
    };
    OnClickListener buttonListenerGoals = new OnClickListener() {
        public void onClick(View V) {
            Intent intent = new Intent(V.getContext(), Goals.class);
            startActivity(intent);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        title=(TextView)findViewById(R.id.Title);
        NewRun = (Button)findViewById(R.id.NewRun);
        NewRun.setOnClickListener(buttonListener);
        History = (Button)findViewById(R.id.History);
        History.setOnClickListener(buttonListenerHistory);
        Goals = (Button)findViewById(R.id.Goals);
        Goals.setOnClickListener(buttonListenerGoals);
        Achieve=(TextView)findViewById(R.id.Achieve);



        Bundle bundle = getIntent().getExtras();
        String value2 = bundle.getString("Gduration");
        String value3 = bundle.getString("Gdistance");
        String value4 = bundle.getString("Gpace");

        //EDuration=(TextView)findViewById(R.id.EDuration);
       // EDuration.setText(value2);
       // int DurInt =0;
       // DurInt = Integer.parseInt(value2);

        Bundle bundle2 = getIntent().getExtras();
        String value5 = bundle2.getString("HHduration");
        String value6 = bundle2.getString("HHdistance");
        String value7 = bundle2.getString("HHpace");


        Gduration = (TextView)findViewById(R.id.GHHduration);
        Gduration.setText(value2);

       // if(Iduration>0) {
           // Gduration = (TextView)findViewById(R.id.GHHduration);
            Gduration.setText("Duration of " + value2 + " Minutes");
       // }
       // if(GGdistance>0) {
            Gdistance = (TextView)findViewById(R.id.GHHdistance);
            Gdistance.setText("Distance of " + value3 + " Miles");
      //  }
      //  if(GGpace>0) {
            Gpace = (TextView)findViewById(R.id.GHHpace);
            Gpace.setText("Pace of " + value4);
       // }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_home, menu);
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
