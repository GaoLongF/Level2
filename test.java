public class test {
    public static void main(String args[]){
        //父类对象指向子类引用
            Animal animal=new Dog("小黑","旺旺");
            animal.Myfavourite();   //调用父类方法，显示子类重写内容，无法调用子类独有方法
            Dog D=(Dog) animal;     //向下转型指向子类对象，强制类型转换
            System.out.println(D);
    }
}
