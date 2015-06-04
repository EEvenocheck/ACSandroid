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


public class Goals extends ActionBarActivity {
    TextView goals;
    EditText Gduration;
    EditText Gdistance;
    EditText Gpace;
    Button goHome;


    OnClickListener buttonListenergoHome = new OnClickListener() {
        public void onClick(View V) {
            Intent intent = new Intent(V.getContext(), Home.class);
            intent.putExtra("Gduration",Gduration.getText().toString());
            intent.putExtra("Gdistance",Gdistance.getText().toString());
            intent.putExtra("Gpace",Gpace.getText().toString());
            startActivity(intent);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goals);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_goals, menu);
        goals=(TextView)findViewById(R.id.goals);
        Gduration=(EditText)findViewById(R.id.Gduration);
        Gdistance=(EditText)findViewById(R.id.Gdistance);
        Gpace=(EditText)findViewById(R.id.Gpace);
        goHome = (Button)findViewById(R.id.goHome);
        goHome.setOnClickListener(buttonListenergoHome);
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
