package services.impl;

import classes.Person;
import services.PersonInterface;

public class PersonImpl implements PersonInterface {
    private Person[] people;

    public Person[] getPeople() {
        return people;
    }

    public void setPeople(Person[] people) {
        this.people = people;
    }

    @Override
    public String createPerson(Person... person) {
        Person [] people1;
        for (Person person1:person){
            if(getPeople()==null){
                this.people=person;
            } else {
                people1 = new Person[person.length+getPeople().length];
                int index = 0;
                int index2 = 0;
                for (int i = 0; i < people1.length; i++) {
                    if (i<getPeople().length){
                        people1[i]=getPeople()[index];
                        index++;
                    }else {
                        people1[i]=getAllPeople()[index2];
                        index2++;
                    }
                }setPeople(people1);

            }
        }
        return "Operation was successful!";
    }

    @Override
    public Person[] getAllPeople() {
        return getPeople();
    }
}