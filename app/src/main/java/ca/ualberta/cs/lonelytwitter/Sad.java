package ca.ualberta.cs.lonelytwitter;

import android.util.Log;

import java.util.Date;

/**
 * Created by ttran1 on 9/20/18.
 */

public class Sad extends Mood {

    private String mood;

    public Sad() {
        super();
        Log.d("date", "I am sad");
    }

    public Sad(Date date) {
        super(date);
        Log.d("date", "I am sad");
    }

    public String format() {
        return this.mood;
    }
}
