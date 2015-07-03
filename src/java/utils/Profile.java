package utils;

import hibernate.user.User;

public class Profile {
    private User u;
    private double feedback;

    public Profile() {
    }
    
    public User getU() {
        return u;
    }

    public void setU(User u) {
        this.u = u;
    }

    public double getFeedback() {
        return feedback;
    }

    public void setFeedback(double feedback) {
        this.feedback = feedback;
    }   
}