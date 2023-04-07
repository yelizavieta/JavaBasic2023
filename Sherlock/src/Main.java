public class Main {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();

        String info1 = person1.personInfo("Will", "Smith", "New York", "2936729462846");
        String info2 = person2.personInfo("Jackie", "Chan", "Shanghai ", "12312412412");
        String info3 = person3.personInfo("Sherlock", " Holmes", "London", " 37742123513");

        System.out.println(info1);
        System.out.println(info2);
        System.out.println(info3);
    }
}