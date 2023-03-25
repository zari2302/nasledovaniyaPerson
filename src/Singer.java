public class Singer extends Person {
    String bandName;

    public Singer() {

    }

    public Singer(String name, String designation, String bandName) {
        super(name, designation);
        this.bandName = bandName;
    }

    public String getBandName() {
        return bandName;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }

    public void singing() {
        System.out.println("хип хоп");
    }

    public void playGitar() {
        System.out.println("хорошо играет");
    }

    @Override
    public void learn() {
        System.out.println("петь");
        ;
    }

    @Override
    public void walk() {
        System.out.println("в стюдию");
        ;
    }

    @Override
    public void eat() {
        System.out.println("овощи");
        ;
    }

    @Override
    public String toString() {
        return "Singer: " + "\n" +
                "bandName: " + bandName + "\n" + super.toString();
    }
}
