import java.util.function.Predicate;

public class ClassAndObjectFirstLesson {
    public static void main(String[] args){
        Person vitya =new Person();
        vitya.height=120;
        vitya.say("George");
        System.out.println(vitya.height);
        Person vlad =new Person();
        System.out.println(vlad.height);
    }
}
