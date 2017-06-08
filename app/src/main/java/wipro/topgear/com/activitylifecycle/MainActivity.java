package wipro.topgear.com.activitylifecycle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(getApplicationContext(), "onCreate() First Activity",
                Toast.LENGTH_SHORT).show();


        Button nav = (Button) findViewById(R.id.navigate);
        /*Button home = (Button) findViewById(R.id.home);


        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(Intent.ACTION_MAIN).addCategory(Intent.CATEGORY_HOME));

            }
        });*/

        nav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                    Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                    startActivity(intent);

            }
        });

            }
    public void onStart()
    {
        super.onStart();
        Toast.makeText(getApplicationContext(), "onStart() First Activity",
                Toast.LENGTH_SHORT).show();

    }
    public void onRestart()
    {
        super.onRestart();
        Toast.makeText(getApplicationContext(), "onRestart() First Activity",
                Toast.LENGTH_SHORT).show();
    }
    public void onResume()
    {
        super.onResume();
        Toast.makeText(getApplicationContext(), "onResume() First Activity",
                Toast.LENGTH_SHORT).show();

    }
    public void onPause()
    {
        super.onPause();
        Toast.makeText(getApplicationContext(), "onPause() First Activity",
                Toast.LENGTH_SHORT).show();
    }
    public void onStop()
    {
        super.onStop();
        Toast.makeText(getApplicationContext(), "onStop() First Activity",
                Toast.LENGTH_SHORT).show();
    }
    public void onDestroy()
    {
        super.onDestroy();
        Toast.makeText(getApplicationContext(), "onDestroy() First Activity",
                Toast.LENGTH_SHORT).show();
    }
}