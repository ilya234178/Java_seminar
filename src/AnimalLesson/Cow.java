package AnimalLesson;

public class Cow extends Animal{

    public Cow(String say , int teeth) {
        setTeeth(teeth);
        setSay(say);
    }
    public String getSay(){
        String say = super.getSay();
        return say + " new!";
    }

    void mu(){
        System.out.println(getSay()+ " во все " + getTeeth() + " зуба");
    }
}
