public class Main {
    public static void main(String[] args) {
        Student st = new Student("Damian", "Diaconu","1994-08-29", "30, 27, 25, 24");
        Student st2 = new Student("Mario", "Rossi","1994-02-23", "18, 26, 20, 29");
        System.out.println(st.firstname + " " + st.lastname + ": " + st.age() + " anni, media voti: " + st.avg_grade());
        System.out.println(st2.firstname + " " + st2.lastname + ": " + st2.age() + " anni, media voti: " + st2.avg_grade());
    }
}
