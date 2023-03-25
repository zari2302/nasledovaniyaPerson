public class Programmer extends Person {
    private String companyName;

    public Programmer() {
    }

    public Programmer(String name, String designation, String companyName) {
        super(name, designation);
        this.companyName = companyName;
    }


    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void coding() {
        System.out.println("хорошо");
    }

    @Override
    public void learn() {
        System.out.println("хочет создать программу ");
    }

    @Override
    public void walk() {
        System.out.println();
    }

    @Override
    public void eat() {
        System.out.println();

    }

    @Override
    public String toString() {
        return "Programmer: " + "\n" +
                "companyName: " + companyName + "\n" +
                super.toString();
    }
}