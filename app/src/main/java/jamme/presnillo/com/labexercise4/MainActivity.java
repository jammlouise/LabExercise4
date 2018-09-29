package jamme.presnillo.com.labexercise4;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button toastButton = (Button) findViewById(R.id.toastButton);
        Button snackbarButton = (Button) findViewById(R.id.snackbarButton);
        Button snackbaractButton = (Button) findViewById(R.id.snackbaractButton);


        toastButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = "I am a Toast";
                int duration = Toast.LENGTH_SHORT;
                Toast.makeText(getApplicationContext(),message,duration).show();
            }

    });

        snackbarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                View view = findViewById(R.id.main_layout_id);
                String message = "Snackbar: Hi";
                int duration = Snackbar.LENGTH_SHORT;

                Snackbar.make(view, message, duration).show();

            }
        });

        snackbaractButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                View view = findViewById(R.id.main_layout_id);
                String message = "Snackbar: Hi again";
                int duration = Snackbar.LENGTH_SHORT;

                showSnackbarAct(view, message, duration);

            }

        });

    }



    public void showSnackbarAct(View view, String message, int duration)
    {
        final Snackbar snackbar = Snackbar.make(view, message, duration);
        snackbar.setAction("DISMISS", new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            snackbar.dismiss();

        }

    });

        snackbar.show();

    }

    @Override
    protected void onStart () {
        super.onStart();
        Log.d("LabActivity4", "onResume() has executed");
    }


}
