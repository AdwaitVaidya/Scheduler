package com.example.scheduler.recyclerViewClasses;

import android.content.Context;
import android.os.Build;
import android.widget.TextView;

import androidx.annotation.RequiresApi;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.Month;

@RequiresApi(api = Build.VERSION_CODES.O)
public class TimeActivity {


    Timestamp timestamp = new Timestamp(System.currentTimeMillis());
    LocalDateTime localDateTime = LocalDateTime.now();

    int month = localDateTime.getMonth().getValue();



}
