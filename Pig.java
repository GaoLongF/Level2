public class Pig extends Animal {

    public Pig() {

    }

    public Pig(String name, String voice) {
        super(name, voice);
    }

    @Override
    public void said() {
        System.out.println("哼哼哼");
    }

    @Override
    public void Myfavourite() {
        System.out.println("我啥都喜欢吃");
    }

    @Override
    public void Skill() {
        System.out.println("我会被人们吃掉......");
    }
}
