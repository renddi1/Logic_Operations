public class Door {
    // базовый класс "дверь"
    // у каждой двери есть цена
    protected int price;

    //этот метод тоже наследуется
    protected void doSomething() {
        System.out.println("Door is doing someting");

    }

    //этот метод исключетельно в классе Door
    private void onlyForDoor() {

    }
}



