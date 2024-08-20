package dynamic;

import java.lang.reflect.Proxy;
import java.util.HashMap;

public class MatchMakingDrive {
    HashMap<String, Person> datingDB = new HashMap<>();
    public static void main(String[] args) {
        MatchMakingDrive test = new MatchMakingDrive();
        test.drive();
    }

    public MatchMakingDrive() {
        initializeDatabase();
    }

    public void drive(){
        Person joe = getPersonFromDatabase("Joe Javabean");
        Person ownerProxy = getOwnerProxy(joe);
        System.out.println("Name is " + ownerProxy.getName());
        ownerProxy.setInterests("bowling, Go");
        System.out.println("Interests set from owner proxy");

        try{
            ownerProxy.setGeekRating(10);
        } catch (Exception e){
            System.out.println("Can't set rating from owner proxy");
        }
        System.out.println("Rating is " + ownerProxy.getGeekRating());

        Person nonOwnerProxy = getNonOwnerProxy(joe);
        System.out.println("Name is " + nonOwnerProxy.getName());
        try{
            nonOwnerProxy.setInterests("bowling, go");
        } catch (Exception e){
            System.out.println("Can't set interests from non owner proxy");
        }
        nonOwnerProxy.setGeekRating(3);
        System.out.println("Rating set from non owner proxy");
        System.out.println("Rating is " + nonOwnerProxy.getGeekRating());
    }

    Person getPersonFromDatabase(String name){
        return (Person) datingDB.get(name);
    }

    Person getOwnerProxy(Person person){
        return (Person) Proxy.newProxyInstance(person.getClass().getClassLoader(),
                person.getClass().getInterfaces(),
                new OwnerInvocationHandler(person));
    }

    Person getNonOwnerProxy(Person person){
        return (Person) Proxy.newProxyInstance(
                person.getClass().getClassLoader(),
                person.getClass().getInterfaces(),
                new NonOwnerInvocationHandler(person)
        );
    }
    void initializeDatabase(){
        Person joe = new PersonImpl();
        joe.setName("joe Javabean");
        joe.setInterests("car, computers, music");
        joe.setGeekRating(7);
        datingDB.put(joe.getName(), joe);

        Person kelly = new PersonImpl();
        kelly.setName("Kelly Klosure");
        kelly.setInterests("ebay, movies, music");
        kelly.setGeekRating(6);
        datingDB.put(kelly.getName(), kelly);
    }
}
