package animals;

public class Wolf extends Canine{
    public String eat() {
        return "Hunts its food and eats it";
    }

    public String eat(String typeOfFood) {
        return "hunts " + typeOfFood + " and eats it";
    }


}
