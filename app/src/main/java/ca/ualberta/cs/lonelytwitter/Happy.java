package ca.ualberta.cs.lonelytwitter;

import android.util.Log;

import java.util.Date;

/**
 * Created by ttran1 on 9/20/18.
 */

public class Happy extends Mood {

    public Happy() {
        super();
        Log.d("date", this.format());
    }

    public Happy(Date date) {
        super(date);
        Log.d("date", this.format());
    }

    public String format() {
        return "Happy";
    }
}
