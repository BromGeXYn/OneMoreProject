package org.lesson36;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.lesson36.dto.UserDto;
import org.lesson36.entity.UserEntity;

import java.util.ArrayList;
import java.util.List;

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

    public List<UserEntity> findByActiveTask() {
        List<UserEntity> list = new ArrayList<>();
        Session session = HibernateConfig.create();
        Transaction transaction = session.beginTransaction();
        Query query = session.createQuery("select distinct user from TaskEntity where taskStatus = 'NEW' or taskStatus = 'INPROGRESS'");
        list = query.list();
        transaction.commit();
        session.close();
        return list;
    }
    public List<UserEntity> criteriaFind (UserDto userDto) { ///name = "user1"
        Session session = HibernateConfig.create();
        Transaction transaction = session.beginTransaction();
        Criteria criteria = session.createCriteria(UserEntity.class);
        //criteria.add(Restrictions.eq("name", userDto.getName()));
        List list = criteria.list();
        transaction.commit();
        session.close();
        return list;
    }

//        if (userDto == null) {
//            return list = criteria.list();
//        } else {
//            if (isNotBlank(userDto.getName())) {
//                criteria.add(Restrictions.eq("name", userDto.getName()));
//            }
//        }


}
