package com.example.finalproject;

import java.util.ArrayList;

import android.graphics.Rect;
import android.util.Log;
 
import com.example.finalproject.IrregularButton.TouchChecker;
 
public class RectTouchChecker implements TouchChecker
{
        private ArrayList<Rect> rectList;
         
        public RectTouchChecker(ArrayList<Rect> rectList)
        {
                this.rectList = rectList;
        }
         
        @Override
        public boolean isInTouchArea(int x, int y, int width, int height)
        {
                if (rectList != null)
                {
                        for (Rect rect : rectList)
                        {
                                if (rect.contains(x, y))
                                {
                                        Log.d("RectTouchChecker", "isInTouchArea return true");
                                         
                                        return true;
                                }
                        }
 
                }       
                 
                Log.d("RectTouchChecker", "isInTouchArea return false");
                 
                return false;
        }
 
}