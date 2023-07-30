package Assignment;

public class Clock {
    String time;
    void setTime(String t) { //void is used along with Setter() methods and does not return any values
        time = t;
    }
    String getTime(){  // the Getter() method goes along with return type.
        return time;
    }

    public static void main(String[] args) {
        Clock myClock = new Clock();
        myClock.setTime("12 O'Clock");
        System.out.println("The time is: " + myClock.getTime());
    }
}
