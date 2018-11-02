public class Dog extends Animal {

    public Dog() {

    }

    public Dog(String name, String voice) {
        super(name, voice);
    }

    @Override
    public void said() {
        System.out.println("旺旺旺");
    }

    @Override
    public void Myfavourite() {
        System.out.println("我喜欢吃骨头");
    }

    @Override
    public void Skill() {
        System.out.println("我会看家");
    }

    @Override
    public String toString() {
        return "我是狗，我叫"+name;
    }
}
