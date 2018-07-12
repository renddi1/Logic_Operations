public class IronDoor{

    //железная дверь
    public class IronDoor extends  Door {
        //уровень защиты определен только для железных дверей
        private int protectionLvl;

        IronDoor(int price, int protectionLvl) {
            this.price = price;
            this.protectionLvl = protectionLvl;

        }
    }


