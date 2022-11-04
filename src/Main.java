public class Main {
    public static void main(String[] args) {
        String [] commands = {"Сидеть", "Лежать"};
        Shelter shelter = new Shelter("Romashka", "Chuy 1");
        Dog dog = new Dog("Rex","Ovcharka", commands, shelter, ColorEnum.BLACK);
        System.out.println(dog.getInfo());
        dog.makeVoice();
        dog.makeVoice("Гив гив");
        dog.makeVoice("Гув гув");
        System.out.println("------------------------------");
        Shelter shelter1 = new Shelter("Goodboy", "Toktonalieva 54");
        Dog dog1 = new Dog("Balto", "Хаски", shelter1, ColorEnum.BROWN);
        System.out.println(dog1.getInfo());
        dog1.makeVoice();
        dog1.makeVoice("Гуввв гуввв");
        System.out.println("---------------------------");
        Dog dog2 = new Dog();
        System.out.println(dog2.getInfo());
    }
}