package com.example.finalproject;

import android.graphics.Bitmap;
import android.util.Log;
 
import com.example.finalproject.IrregularButton.TouchChecker;
 
public class BitmapTouchChecker implements TouchChecker
{
        private Bitmap bitmap;
         
        public BitmapTouchChecker(Bitmap bitmap)
        {
                this.bitmap = bitmap;
        }
         
        @Override
        public boolean isInTouchArea(int x, int y, int width, int height)
        {
                if (bitmap != null)
                {
                        int pixel = bitmap.getPixel(x, y);
                         
                        if (((pixel >> 24) & 0xff) > 0)
                        {
                                Log.d("BitmapTouchChecker", "isInTouchArea return true");
                                 
                                return true;
                        }
                }       
                 
                Log.d("BitmapTouchChecker", "isInTouchArea return false");
                 
                return false;
        }
 
}
