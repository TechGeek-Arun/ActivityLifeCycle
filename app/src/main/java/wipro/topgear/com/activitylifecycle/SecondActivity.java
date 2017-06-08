package wipro.topgear.com.activitylifecycle;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by ar353354 on 07-06-2017.
 */
public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Toast.makeText(getApplicationContext(), "onCreate() Second Activity",
                Toast.LENGTH_SHORT).show();

        Button back = (Button) findViewById(R.id.back);
        /*Button home = (Button) findViewById(R.id.home);


        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(Intent.ACTION_MAIN).addCategory(Intent.CATEGORY_HOME));

            }
        });*/


        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(SecondActivity.this, MainActivity.class);
                startActivity(intent);

            }
        });

    }
    public void onStart()
    {
        super.onStart();
        Toast.makeText(getApplicationContext(), "onStart() Second Activity",
                Toast.LENGTH_SHORT).show();

    }
    public void onRestart()
    {
        super.onRestart();
        Toast.makeText(getApplicationContext(), "onRestart() Second Activity",
                Toast.LENGTH_SHORT).show();
    }
    public void onResume()
    {
        super.onResume();
        Toast.makeText(getApplicationContext(), "onResume() Second Activity",
                Toast.LENGTH_SHORT).show();

    }
    public void onPause()
    {
        super.onPause();
        Toast.makeText(getApplicationContext(), "onPause() Second Activity",
                Toast.LENGTH_SHORT).show();
    }
    public void onStop()
    {
        super.onStop();
        Toast.makeText(getApplicationContext(), "onStop() Second Activity",
                Toast.LENGTH_SHORT).show();
    }
    public void onDestroy()
    {
        super.onDestroy();
        Toast.makeText(getApplicationContext(), "onDestroy() Second Activity",
                Toast.LENGTH_SHORT).show();
    }
}
