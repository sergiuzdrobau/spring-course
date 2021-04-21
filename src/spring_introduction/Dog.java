package spring_introduction;

public class Dog implements Pet{
    private String name;

    public String getName() {
        return name;
    }

    public void init(){
        System.out.println("Init method in Dog class");
    }

    public void destroy(){
        System.out.println("Destroy method in Dog class");
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void say(){
        System.out.printf("Ham Ham");
    }
}
