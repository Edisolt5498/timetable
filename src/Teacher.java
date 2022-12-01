public class Teacher implements show {

    private static int count = 0;
    private String name = "Default name";
    private int age = 0;
    private Subject sub;

    public Teacher(String name, int age) {
        this.age = age;
        this.name = name;
        count++;
    }
    public Teacher() {
        count++;
    }

    public static int getCount() {
        return count;
    }

    public void setName (String name) {
        this.name = name;
    }
    public void setAge (int age) {
        this.age = age;
    }
    public void setSub(Subject sub) {
        this.sub = sub;
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public Subject getSub() {
        return sub;
    }

    @Override
    public void sayInfo(){
        System.out.println("Firstname and Lastname: " +name);
        System.out.println("Age: " +age);
        System.out.println("Subject: " +sub.getName() + " with date " +sub.getDay());
    }
}
