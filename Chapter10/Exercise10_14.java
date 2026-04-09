package Chapter10;

public class Exercise10_14 {
    public static void main(String[] args) {
        
        MyDate newCurrentDate = new MyDate();
        MyDate specificCurrentDate = new MyDate(34355555133101L);
        MyDate testDate = new MyDate(561555550000L);

        System.out.println("Today is the " + newCurrentDate.getDay() + " of " + newCurrentDate.getMonth() + ", " + newCurrentDate.getYear());
        System.out.println("With the entered date, today would be the " + specificCurrentDate.getDay() + " of " + specificCurrentDate.getMonth() + ", " + specificCurrentDate.getYear());
    }
}
