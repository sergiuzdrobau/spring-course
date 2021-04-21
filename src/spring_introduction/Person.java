package spring_introduction;

public class Person {
    private Pet pet;
    private String firstName;

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Person() {

    }

    public void callYourPet(){
        System.out.println("Hi, my Pet");
        pet.say();
    }
}
