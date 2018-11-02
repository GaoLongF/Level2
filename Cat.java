public class Cat extends Animal {
    public Cat() {

    }

    public Cat(String name, String voice) {
        super(name, voice);
    }

    @Override
    public void said() {
        System.out.println("喵喵喵");
    }

    @Override
    public void Myfavourite() {
        System.out.println("我喜欢吃鱼");
    }

    @Override
    public void Skill() {
        System.out.println("我会抓老鼠");
    }
}
