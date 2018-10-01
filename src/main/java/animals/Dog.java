package animals;

public class Dog extends Canine implements iGreet
{
    public String eat() {
        return "Eats some shit";
    }

    public String eat(String typeOfFood) {
        return " likes to eat " + typeOfFood;
    }

    public String greet() {
        return "Wags tail and barks ";
    }
}
