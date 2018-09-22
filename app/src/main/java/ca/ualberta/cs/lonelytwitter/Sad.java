package ca.ualberta.cs.lonelytwitter;

import android.util.Log;

import java.util.Date;

/**
 * Created by ttran1 on 9/20/18.
 */

public class Sad extends Mood {

    public Sad() {
        super();
        Log.d("date", this.format());
    }

    public Sad(Date date) {
        super(date);
        Log.d("date", this.format());
    }

    public String format() {
        return "Sad";
    }
}
