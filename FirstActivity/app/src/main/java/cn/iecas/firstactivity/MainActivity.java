package cn.iecas.firstactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater f = getMenuInflater();
        f.inflate(R.menu.men,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.Options:
                Toast.makeText(this,"You clicked Options Menu",Toast.LENGTH_SHORT).show();
                break;
            case R.id.Settings:
                Toast.makeText(this,"You clicked Settings Menu",Toast.LENGTH_SHORT).show();
                break;
            case R.id.Help:
                Toast.makeText(this,"You clicked Hrlp Menu",Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_main);
        Button  btn_hello = (Button) findViewById(R.id.BTN_HELLO);
        btn_hello.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Hello Buddy",
                        Toast.LENGTH_SHORT).show();
                finish();
            }
        });

    }

}
