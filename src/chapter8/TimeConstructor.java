package chapter8;

public class TimeConstructor {

    private int hour;
    private int minute;
    private int second;

    public TimeConstructor(){
//       this(0,0,0);
    }

    public TimeConstructor(int hour){
        this(hour,0,0);
    }

    public TimeConstructor(int hour, int minute ){
        this(hour,minute,0);
    }

    public TimeConstructor(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second= second;
    }

    public TimeConstructor(TimeConstructor time){
        this(time.getHour(), time.getMinute(), time.getSecond());
//        this(time.hour, time.minute, time.second);
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }


    public void setTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
}
