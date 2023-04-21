public class Citizen {
    private String name;
    public Citizen(String name, Government government) {
        this.name = name;
        government.registerCitizen(this);
    }

    void update(String News) {
        System.out.println(name + " узнали о новом указе - " + News);
    }
}
