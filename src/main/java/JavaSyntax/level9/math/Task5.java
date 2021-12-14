package JavaSyntax.level9.math;

import java.util.concurrent.TimeUnit;

public class Task5 {
    public static void main(String[] args) throws InterruptedException {
        setTimer(2,4,10,5000,14);
    }
    public static void setTimer(int days, int hours, int minutes, int seconds, int millis) throws InterruptedException {
        System.out.println("Таймер запущен!");
        System.out.println(TimeUnit.DAYS.toHours(days));
        System.out.println(TimeUnit.DAYS.toSeconds(days));
        System.out.println(TimeUnit.SECONDS.toMinutes(seconds));
//        TimeUnit.DAYS.sleep(days);
//        TimeUnit.HOURS.sleep(hours);
//        TimeUnit.MINUTES.sleep(minutes);
//        TimeUnit.SECONDS.sleep(seconds);
//        TimeUnit.MILLISECONDS.sleep(millis);

        System.out.println("♬ ♪ ♬♬♬♬ ♪♪♪♪");
    }
}
