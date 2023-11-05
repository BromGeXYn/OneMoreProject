package org.lesson35;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.lesson35.entity.UserEntity;

public class UserService {

    public void saveUser(UserEntity user) {
        Session session = HibernateConfig.create();
        Transaction transaction = session.beginTransaction();
        session.save(user);
        transaction.commit();
        session.close();
    }

    public UserEntity findUser(Integer id) {
        Session session = HibernateConfig.create();
        Transaction transaction = session.beginTransaction();
        UserEntity user = session.find(UserEntity.class, id);
        //session.save(user);
        transaction.commit();
        session.close();
        return user;
    }
    public void delUser(Integer id) {
        Session session = HibernateConfig.create();
        Transaction transaction = session.beginTransaction();
        UserEntity user = session.find(UserEntity.class, id);
        session.delete(user);
        transaction.commit();
        session.close();
    }
    public void updateUser(UserEntity userEntity, Integer id) {
        Session session = HibernateConfig.create();
        Transaction transaction = session.beginTransaction();//логика в том, что
        UserEntity user = session.find(UserEntity.class, id);//передаётся обновленный юзер, но обновиться
        if (userEntity.getName() != null) {                  //могут только два поля - имя(теоретически) и роль
            user.setName(userEntity.getName());
        }
        if (userEntity.getRole() !=null) {
            user.setRole(userEntity.getRole());
        }
        session.update(user);
        transaction.commit();
        session.close();
    }

//    public void findByActiveTask() {
//        List<UserEntity> list = new ArrayList<>();
//        Session session = HibernateConfig.create();
//        Transaction transaction = session.beginTransaction();
//        Query query = session.createQuery("from UserEntity as users join users.tasks where TaskEntity.taskStatus = ?1 or TaskEntity.taskStatus = ?2");
//        query.setParameter(1, TaskStatus.NEW);
//        query.setParameter(2, TaskStatus.INPROGRESS);
//        list = query.list();
//        //from TaskEntity as tasks join tasks.user where tasks.taskStatus = ?1 or tasks.taskStatus = ?2
//        transaction.commit();
//        session.close();
//    }




}
