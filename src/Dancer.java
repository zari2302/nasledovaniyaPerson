public class Dancer extends Person {
    String groupName;

    public Dancer() {
    }

    public Dancer(String name, String designation, String groupName) {
        super(name, designation);
        this.groupName = groupName;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public void dancing() {
        System.out.println("танго");
    }

    @Override
    public void learn() {
        System.out.println("танцевать");
    }

    @Override
    public void walk() {
        System.out.println("В плошадь");
    }

    @Override
    public void eat() {
        System.out.println("Фрукты");
    }

    @Override
    public String toString() {
        return "Dancer: " + "\n" +
                "groupName: " + groupName + "\n" + super.toString();
    }
}
