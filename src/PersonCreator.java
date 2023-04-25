public class PersonCreator {
    public static void main(String[] args) {
        Person Person01 = new Person("James Peterson", 34,180,73.5);
        Person Person02 = new Person("Bob Thornley", 25, 171,68.2);
        Person Person03 = new Person("Paige Warden",25,175,65.5);

        System.out.println("The first person is: "+ Person01.getName() +" Their age is: " + Person01.getAge() + " Their height is: "
                + Person01.getHeight() +"cm. Their weight is: " + Person01.getWeight());

        System.out.println("The second person is: "+ Person02.getName() +" Their age is: " + Person02.getAge() + " Their height is: "
                + Person02.getHeight() +"cm. Their weight is: " + Person02.getWeight());

        System.out.println("The third person is: "+ Person03.getName() +" Their age is: " + Person03.getAge() + " Their height is: "
                + Person03.getHeight() +"cm. Their weight is: " + Person03.getWeight());

       Person01.growOlder();
       Person02.growOlder();
       Person03.growOlder();
        System.out.println("After one year the first person is: "+ Person01.getName() +" Their age is: " + Person01.getAge() + " Their height is: "
                + Person01.getHeight() +"cm. Their weight is: " + Person01.getWeight());

        System.out.println("After one year the second person is: "+ Person02.getName() +" Their age is: " + Person02.getAge() + " Their height is: "
                + Person02.getHeight() +"cm. Their weight is: " + Person02.getWeight());

        System.out.println("After one year the third person is: "+ Person03.getName() +" Their age is: " + Person03.getAge() + " Their height is: "
                + Person03.getHeight() +"cm. Their weight is: " + Person03.getWeight());

    }


}