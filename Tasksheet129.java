
interface Animal {
    boolean feed(boolean timeToEat);
    void groom();
    void pet();
}
class Gorilla implements Animal{

    @Override
    public boolean feed(boolean timeToEat) {
        if (timeToEat) {
            System.out.println("Feeding: put gorilla food into cage");
            return true;
        } else {
            System.out.println("Feeding: gorilla not yet fed");
            return false;
        }
    }

    @Override
    public void groom() {
        System.out.println("Grooming: lather, rinse, repeat");
    }

    @Override
    public void pet() {
        System.out.println("Pet: pet at your own risk");
    }
}
public class Tasksheet129 {
    public static void main(String[] args) {
        Gorilla gorilla = new Gorilla();

        boolean fed = gorilla.feed(false);
        gorilla.groom();
        gorilla.pet();
    }
}
