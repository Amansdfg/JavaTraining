public class Java {
    public static void main(String[] args){
       long time = System.currentTimeMillis();
       long totalSecond = time/1000;
       System.out.println("Totalsecond is "+totalSecond);
       long currentSecond= totalSecond%60;
       System.out.println("Currentseond is "+ currentSecond);
       long totalMinutes = totalSecond/60;
       System.out.println("TotalMinutes is " +totalMinutes);
       long currentMinute = totalSecond % 60;
       System.out.println("CurrentMinute is " + currentMinute);
       long totalHours = totalMinutes/24;
       System.out.println("totalhours is " + totalHours);
       long currentHour = totalMinutes % 24;
       System.out.println("currenthours is "+ currentHour);
       System.out.println("Current time is " + currentHour + ":" +currentMinute + ":" +currentSecond);
    }
}
