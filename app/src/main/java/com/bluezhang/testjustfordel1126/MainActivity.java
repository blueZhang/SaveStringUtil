package com.bluezhang.testjustfordel1126;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import com.bluezhang.testjustfordel1126.savestring.SaveStringUtil;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    private String a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        a = "dfsdfsdfsfsdfsfsfsff";



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void saveString(View view) {
        try {
            SaveStringUtil.save(getApplicationContext(),"a.txt",a);
            SaveStringUtil.saveToSDCard("a.txt", a);
            SaveStringUtil.putString(getApplicationContext(),"a",a);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
