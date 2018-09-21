package ca.ualberta.cs.lonelytwitter;

import android.util.Log;

import java.util.Date;

/**
 * Created by ttran1 on 9/20/18.
 */

public class Happy extends Mood {

    private String mood;

    public Happy() {
        super();
        Log.d("date", "I am happy");
    }

    public Happy(Date date) {
        super(date);
        Log.d("date", "I am happy");
    }

    public String format() {
        return this.mood;
    }
}
