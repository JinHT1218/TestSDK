package com.jeffrey.mylibrary;

import android.content.Context;
import android.widget.Toast;

public class ToastTest {
    public  static void  showToast(Context context, String str){
        Toast.makeText(context,str, Toast.LENGTH_SHORT).show();
    }
}
