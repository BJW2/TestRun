package brysonwilliams.com.backtobasics;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {
    //FirebaseDatabase database = FirebaseDatabase.getInstance();

    MediaPlayer mp;
    MediaPlayer mp1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mp = MediaPlayer.create(MainActivity.this, R.raw.rap);
        mp1 = MediaPlayer.create(MainActivity.this,R.raw.gunshot);
    }

    public void toastMsg(String msg) { // creates a pop up message
        Toast toast = Toast.makeText(this, msg, Toast.LENGTH_LONG);
        toast.show(); // displays message
    }

    public void onClick(View view) {

        mp.start();

        // EditText editPassword = findViewById(R.id.editTextPassword);
        //TextView textPassword = findViewById(R.id.textViewPassword);
        //String content = editPassword.getText().toString(); //gets you the content of edit text

        //if (content.equals("Password")) {
        //startActivity(new Intent(MainActivity.this, MainActivity2.class)); // Navigate to another activity
        //} else {
        //  toastMsg("Wrong PW Bruv, You are not good at this mate, just stop!!!");
    }



    public void onClick2(View view) {
        //DatabaseReference myRef = database.getReference("message");

        //myRef.setValue("Goodbye, World!")
        mp1.start();
    }

    public void onClick3(View view) {
        //DatabaseReference myRef = database.getReference("message");

        //myRef.setValue("Goodbye, World!")
        mp.stop();
        mp1.stop();
    }
}