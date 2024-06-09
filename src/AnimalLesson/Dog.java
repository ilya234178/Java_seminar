package AnimalLesson;

public class Dog extends Animal{
    public Dog(String say , int teeth){
        setSay(say);
        setTeeth(teeth);
    }
    void gav(){
        System.out.println(getSay() + " во все " + getTeeth() + " зуба");
    }
}
