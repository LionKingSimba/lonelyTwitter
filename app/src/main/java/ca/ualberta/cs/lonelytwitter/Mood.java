package ca.ualberta.cs.lonelytwitter;

import android.util.Log;

import java.util.Date;

import static android.R.attr.tag;

/**
 * Created by ttran1 on 9/20/18.
 */

public abstract class Mood {

    private Date date;

    public Mood() {
        this.date = new Date();
        Log.d("date", this.date.toString());
    }

    public Mood(Date date) {
        this.date = date;
        Log.d("date", this.date.toString());
    }

    public Date getDate() {
        return this.date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public abstract String format();
}
