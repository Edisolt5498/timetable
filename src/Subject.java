public class Subject implements show{

    private static int count = 0;
    private String name = "Default name";
    private int day = 1;
    private Teacher forThisSub;

    public Subject(String name, int day) {
        this.name = name;
        this.day = day;
        count++;
    }
    public Subject() {
        count++;
    }

    public static int getCount() {
        return count;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setDay(int day) {
        this.day = day;
    }

    public String getName() {
        return name;
    }
    public int getDay() {
        return day;
    }

    @Override
    public void sayInfo(){
        System.out.print("Subject: " +name +". Day: " +day);
    }
}
