package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Date;

public abstract class Tweet {
    protected String message;
    protected Date date;
    protected ArrayList<Mood> moods;

    public void setMessage(String message) throws TooLongTweetException{
        this.message=message;

        if(this.message.length()>140){
            throw new TooLongTweetException();
        }
    }

    public void setDate(Date date){
        this.date=date;
    }

    public void addMood(Mood mood){
        this.moods.add(mood);
    }

    public String getMessage(){
        return this.message;
    }

    public Date getDate(){
        return this.date;
    }

    public ArrayList<Mood> getMoods(){
        return moods;
    }

    public abstract Boolean isImportant();

    @Override
    public String toString(){
        return (this.date.toString()+" | "+this.message);
    }
}
