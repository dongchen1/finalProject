package com.example.finalproject;

import java.io.File;  

import android.app.Activity;  
import android.media.MediaPlayer;  
import android.media.MediaPlayer.OnCompletionListener;  
import android.os.Bundle;  
import android.widget.MediaController;  
import android.widget.Toast;  
import android.widget.VideoView;  
   
public class Maldives extends Activity {  
    private VideoView video;  
     
   public void onCreate(Bundle savedInstanceState) {  
        super.onCreate(savedInstanceState);  
        setContentView(R.layout.maldives);  
         
        video=(VideoView) findViewById(R.id.video);  
        File file=new File("/asssts/velassarumaldives.mp4");  
        MediaController mc=new MediaController(Maldives.this);         
        if(file.exists()){  
        video.setVideoPath(file.getAbsolutePath());  
        video.setMediaController(mc);       
        video.requestFocus();        
        try {  
                video.start();      
            }catch(Exception e) {  
                e.printStackTrace();  
            }  
          
        video.setOnCompletionListener(new OnCompletionListener(){               
                @Override  
                public void onCompletion(MediaPlayer mp) {  
                    Toast.makeText(Maldives.this, "END.", Toast.LENGTH_SHORT).show();  
                }  
            });  
        }else{  
        Toast.makeText(this, "COULDN'T FIND", Toast.LENGTH_SHORT).show();  
        }  
   }  
}  