package final_lesson_1;

/**
 * Created by Spider on 17.11.2014.
 */

public class Example3 {

    Example3() {
        k = -6;
    }

    int k = 4;

    public void show(int k){
        System.out.println(k);
        k++;
        inc();
    }

    public static void main(String[] args) {
        int k = 10;
        Example3 example3 = new Example3();
        example3.show(k++);
        System.out.println(example3.k);
    }

    public void inc(){
        k++;
    }
}
