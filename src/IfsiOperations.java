public class IfsiOperations {

    public void ifsiOperations(String name, int age) {
        if (name == null || age <= 0) {
            System.out.println("NOP");
        } else if (name == "SomeName" && age == 30) {
            System.out.println(name+ ", age: " + age);
        }else {
            System.out.println("name +: " + name);
        }
       int ageResult =(age <= 20) ? 20 : 0 ;
        System.out.println(ageResult);

        if (age == 20) {
            ageResult = 20;
        }else {
            ageResult = 0;

        }
    }
           //12.07.2018г.





}
