package com.example.nils_martin.hubba;

import android.widget.ImageView;

public class Habit {

    private String title;
    private String timestamp;
    private int streak;
    private int goalDays;
    private Frequency frequency;
    private boolean isDone;
    private boolean isActive;
    private boolean enableNofitications;
    private ImageView image;

    public Habit(String title){
        this.title = title;
        this.streak = 0;
        this.isDone = false;
        this.isActive = true;
        this.enableNofitications = false;
    }

    public int getGoalDays(Habit habit){
        return habit.goalDays;
    }

    public void setGoalDays(Habit habit, int days){
        habit.goalDays = days;
    }

    public void setDone(Habit habit){
        habit.isDone = !habit.isDone;
        upStreak(this);
    }

    public void upStreak(Habit habit){
        if(habit.isDone){
            habit.streak++;
        }
    }

    public void setActive(Habit habit){
        habit.isActive = !habit.isActive;
    }

    public void setNotifications(Habit habit){
        habit.enableNofitications = !habit.enableNofitications;
    }

    public int getStreak(Habit habit){
        return habit.streak;
    }
}
