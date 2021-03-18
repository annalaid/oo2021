public class Dog implements Animal {
    private String name;

    public Dog(String name){
        this.name = name;
    }

    @Override
    public String speak() {
        String dogSound = "Woof";
        return dogSound;
    }

    @Override
    public void eat(String string) {
        System.out.println(name + " eats " + string);
        
    }

    @Override
    public void beSneaky() {
        System.out.println("The dog is nowhere to be seen..");
        
    }

    @Override
    public void lookAround() {
        System.out.println(name +  " is looking around");
        
    }

    @Override
    public void attack(String string) {
        System.out.println(name + " is attacking " + string);
        
    }

    @Override
    public void defend() {
        System.out.println(name + "is defending himself");
        
    }

    @Override
    public void attack() {
        // TODO Auto-generated method stub
        
    }
    
}
