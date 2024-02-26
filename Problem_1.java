import java.util.ArrayList;
import java.util.List;

public class Problem_1 {
    public static void main(String[] args) {


        Masina ford = new Masina("Ford", 1500, 200, "Blue", 4, 200);
        Masina bmw = new Masina("BMW", 1500, 200, "Blue", 4, 200);

        Persoana popescu = new Persoana();
        Persoana baba = new Persoana();
        popescu.addCar(bmw);
        popescu.addCar(ford);


        List<Masina> masiniAlePopescului = popescu.getCars();
        for (Masina masina : masiniAlePopescului) {
            System.out.println("Popescu are " + masina.getCarName());
        }

    }
}
