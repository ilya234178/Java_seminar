package AnimalLesson;

public class Lion extends Animal{
    public Lion(String say , int teeth){
        setSay(say);
        setTeeth(teeth);

    }
    void roar(){
        System.out.println(getSay() + " во все " + getTeeth() + " зуба");
    }
}
