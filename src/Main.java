public class Main {
    public static void main(String[] args) {
        Programmer programmer=new Programmer();
        programmer.setName("Omka");
        programmer.setDesignation("Otkryt svoi It kurs");
        programmer.setCompanyName("It kg");
        programmer.learn();
        programmer.walk();
        programmer.eat();
        programmer.coding();
        System.out.println(programmer);

        Dancer dancer=new Dancer();
        dancer.setName("Medi");
        dancer.setDesignation("sozdat' gruppu");
        dancer.setGroupName("Bereke");
        dancer.learn();
        dancer.walk();
        dancer.eat();
        dancer.dancing();
        System.out.println(dancer);

        Singer singer =new Singer();
        singer.setName("Raiana");
        singer.setDesignation("svoi solo konsert");
        singer.setBandName("BlakPink");
        singer.learn();
        singer.walk();
        singer.eat();
        singer.singing();
        singer.playGitar();
        System.out.println(singer);
    }
}