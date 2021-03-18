public class Cat implements Animal {
    private String name;

    public Cat(String name){
        this.name = name;
    }

    @Override
    public String speak() {
        String catSound = "Meow";
        return catSound;
    }

    @Override
    public void eat(String string) {
        System.out.println(name + " eats " + string);
        
    }

    @Override
    public void beSneaky() {
        System.out.println("The kitchen door is open and the room is cold..");
        
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
