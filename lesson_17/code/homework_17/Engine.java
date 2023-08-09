package homework_17;

public class Engine {
    int power;
    String engineType;

    public Engine(int power, String engineType){
        this.power = power;
        this.engineType = engineType;
    }

    public String toString(){
        return "\tPower: "+ power + "\n \t"+ "EngineType: "+ engineType;
    }
    public void  start(){
        System.out.println("Engine is started");
    }
    public void stop(){
        System.out.println("Engine is stoped");
    }
}
