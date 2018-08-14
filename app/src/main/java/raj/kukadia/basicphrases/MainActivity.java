package raj.kukadia.basicphrases;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void buttonTapped(View view){
         int id = view.getId();
         int resourceId = 0;
         String ourId = "";
         ourId = view.getResources().getResourceEntryName(id);
         resourceId = getResources().getIdentifier("arabic_"+ourId, "raw", "raj.kukadia.basicphrases" );
          //  if(id == ""){
              //  resourceId =
            //}
               // Log.d(ourId, "check");
         //int resourceId = getResources().getIdentifier(ourId)
        MediaPlayer mediaPlayer = MediaPlayer.create(this, resourceId);
            mediaPlayer.start();
    }
}
