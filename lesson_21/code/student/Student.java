package student;

public class Student {
    private final String name;
    private static int questionsCounter;


    static {
        questionsCounter=0;
    }

    public Student(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student " +  name;
    }

//    public  String getName(){
//        return name;
//    }

    public void ask(){
        questionsCounter++;
        System.out.println(name + " ask the question #"+questionsCounter);
    }


}
