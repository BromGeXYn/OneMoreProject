package org.lesson36;

import org.apache.commons.lang3.BooleanUtils;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;
import org.lesson36.dto.UserDto;
import org.lesson36.entity.UserEntity;

import java.util.ArrayList;
import java.util.List;

import static org.apache.commons.lang3.StringUtils.isNotBlank;

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
    public List<UserEntity> criteriaFind (UserDto userDto) {
        List list;
        Session session = HibernateConfig.create();
        Transaction transaction = session.beginTransaction();
        Criteria criteria = session.createCriteria(UserEntity.class);

        criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
        if (userDto == null) {
            return list = criteria.list();
        } else {
            if (isNotBlank(userDto.getName())) {
                criteria.add(Restrictions.eq("name", userDto.getName()));
            }
            if (userDto.getRole() != null) {
                criteria.add(Restrictions.eq("role", userDto.getRole()));
            }
            if (BooleanUtils.isTrue(userDto.getIsMan())) {
                criteria.add(Restrictions.eq("isMan", true));
            }
            if (BooleanUtils.isTrue(userDto.getIsMan())) {
                criteria.add(Restrictions.eq("isMan", false));
            }
            if (userDto.getBirthdateFrom() != null) {
                criteria.add(Restrictions.gt("birthdate", userDto.getBirthdateFrom()));
            }
            if (userDto.getBirthdateTo() != null) {
                criteria.add(Restrictions.lt("birthdate", userDto.getBirthdateTo()));
            }
//            if (userDto.getList() != null) {
//                criteria.add(Restrictions.sqlRestriction(""))
//            }
        }
        list = criteria.list();
        transaction.commit();
        session.close();
        return list;
    }

}
