public class Citizen {
    private String name;
    private int age;
    public Citizen(String name, Government government, int age) {
        this.name = name;
        this.age = age;
        government.registerCitizen(this);
    }

    void update(String News) {
        System.out.println(name + " узнали о новом указе - " + News);
    }

    public int getAge(){
        return age;
    }
}
