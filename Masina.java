import java.util.ArrayList;
import java.util.List;


class Persoana {
    private Masina car;
    private List<Masina> cars;
    public Persoana() {
        this.cars = new ArrayList<>();
    }
    public void addCar(Masina c) {
        this.cars.add(c);
    }
    public Masina getCar() {
        return car;
    }

    public List<Masina> getCars() {
        return this.cars;
    }
}

public class Masina {
    private String carName;
    private int greutate;
    private int vitezaMax;
    private String culoare;
    private int numarUsi;
    private int caiPutere;

    public Masina() {
    }

    public Masina(String name, int greutate, int max_speed, String culoare, int numar_usi, int cai_putere) {
        this.carName = name;
        this.greutate = greutate;
        this.vitezaMax = max_speed;
        this.culoare = culoare;
        this.numarUsi = numar_usi;
        this.caiPutere = cai_putere;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public int getGreutate() {
        return greutate;
    }

    public void setGreutate(int greutate) {
        this.greutate = greutate;
    }

    public int getVitezaMax() {
        return vitezaMax;
    }

    public void setVitezaMax(int vitezaMax) {
        this.vitezaMax = vitezaMax;
    }

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public int getNumarUsi() {
        return numarUsi;
    }

    public void setNumarUsi(int numarUsi) {
        this.numarUsi = numarUsi;
    }

    public int getCaiPutere() {
        return caiPutere;
    }

    public void setCaiPutere(int caiPutere) {
        this.caiPutere = caiPutere;
    }
}

