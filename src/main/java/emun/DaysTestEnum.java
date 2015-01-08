package emun;

/**
 * Created by Spider on 19.11.2014.
 */

public class DaysTestEnum {

    Days days;

    public DaysTestEnum(Days days) {
        this.days = days;
    }

    public void tellMeWhatYouLike(){
        switch (days) {
            case MONDAY:
                System.out.println("Mondays is poor");
                break;
            case TUESDAY:
                System.out.println("Tuesdays too");
                break;
            case WEDNESDAY:
                System.out.println("Wednesday is the middle");
                break;
            case FRIDAY:
                System.out.println("Fine day");
                break;
            case SATURDAY:
                System.out.println("Sleep");
                break;
            case SUNDAY:
                System.out.println("Greate day");
                break;
            default:
                System.out.println("Alla shit");
                break;
        }
    }

    public static void main(String[] args) {

       // Days firstDay = new Days(Days.SUNDAY);




    }






}
