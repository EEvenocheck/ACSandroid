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



public class History extends ActionBarActivity {

    TextView Hday;
    TextView Hduration;
    TextView Hdistance;
    TextView Hpace;
    TextView Hlocation;
    TextView Hnotes;
    Button goHome;
    ListView list;


    OnClickListener buttonListenerGoHome = new OnClickListener() {
        public void onClick(View V) {
            Intent intent = new Intent(V.getContext(), Home.class);
            intent.putExtra("HHduration",Hduration.getText().toString());
            intent.putExtra("HHdistance",Hdistance.getText().toString());
            intent.putExtra("HHpace",Hpace.getText().toString());
            startActivity(intent);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        Bundle bundle = getIntent().getExtras();
        String day = bundle.getString("Hday");
        String duration = bundle.getString("Hduration");
        String distance = bundle.getString("Hdistance");
        String pace = bundle.getString("Hpace");
        String location = bundle.getString("Hlocation");
        String notes = bundle.getString("Hnotes");

        Hday = (TextView)findViewById(R.id.Hday);
        Hday.setText(day);
        Hduration = (TextView)findViewById(R.id.Hduration);
        Hduration.setText(duration);
        Hdistance = (TextView)findViewById(R.id.Hdistance);
        Hdistance.setText(distance);
        Hpace = (TextView)findViewById(R.id.Hpace);
        Hpace.setText(pace);
        Hlocation = (TextView)findViewById(R.id.Hlocation);
        Hlocation.setText(location);
        Hnotes = (TextView)findViewById(R.id.Hnotes);
        Hnotes.setText(notes);
        goHome = (Button)findViewById(R.id.goHome);
        goHome.setOnClickListener(buttonListenerGoHome);

        //list = (ListView)findByViewId(R.id.listview);
        //list.addFooterView(Hday);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_history, menu);
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
