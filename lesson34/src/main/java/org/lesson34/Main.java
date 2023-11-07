package org.lesson34;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.lesson34.entity.PersonEntity;
import org.lesson34.entity.PhoneEntity;

import java.util.Date;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Session session = HibernateConfig.create();
        Transaction transaction = session.beginTransaction();

        PersonEntity person = PersonEntity.builder()
                .id(null)
                .name("user1")
                .mail(false)
                .birthdate(new Date())
                .role(Role.Developer)
                .build();

//        PersonEntity personEntity = new PersonEntity(UUID.randomUUID(), "user1");

        PhoneEntity phone = PhoneEntity.builder()
                        .id(null)
                        .number("123456")
                        .person(person)
                        .build();
        PhoneEntity phone2 = PhoneEntity.builder()
                .id(null)
                .number("456789")
                .person(person)
                .build();
        person.setPhones(List.of(phone, phone2));
        session.save(person);
        session.save(phone);
        session.save(phone2);

        transaction.commit();

        System.out.println("-------------------------------------------------------------------");
        PersonEntity personEntity = session.find(PersonEntity.class, 1);
        System.out.println(personEntity);

        session.close();

    }

}
