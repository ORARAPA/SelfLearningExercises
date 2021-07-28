public class Tiger extends Felidae{

    public Tiger(int age, double weight, String running, String eating){
        super(age, weight, running, eating);
    }

    public static void main(String[] args){
        Tiger tiger = new Tiger(2,16.5,"fast","meat");
        tiger.animalSound();
    }
}
