public class Parametrizedconstructor {


    public Parametrizedconstructor(Student ss){
        System.out.println("work");

    }
    public static void main(String[]args){
        Student ss = new Student();
        Parametrizedconstructor pc = new Parametrizedconstructor(ss);
    }
}
