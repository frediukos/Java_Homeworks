package Objects;

public class Dog {
    String name;

    public static void main(String[] args) {
        //Создаем объект и получаем к нему доступ
        Dog dog1 = new Dog();
        dog1.bark();
        dog1.name = "Bart";

        //Создаем массив типа Dog
        Dog[] myDogs = new Dog[3];
        //Помещаем в него несколько элементов
        myDogs[0] = new Dog();
        myDogs[1] = new Dog();
        myDogs[2] = dog1;

        //Получаем достуа к объектам Dog с помощью ссылок из массива
        myDogs[0].name = "Fred";
        myDogs[1].name = "George";

        //Хмммм... Какое имя у myDogs[2];
        System.out.print("The name of the last dog is - ");
        System.out.println(myDogs[2].name);

        //Переберем все элементы массива и вызовем для каждого метод bark()
        int i = 0;
        while (i < myDogs.length) {
            myDogs[i].bark();
            i++;
        }
    }

    public void bark() {
        System.out.println(name + "said woof!");
    }

    public void eat() {}

    public void chaseCat() {}
}
