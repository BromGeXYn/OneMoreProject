package org.lesson36;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;
import org.lesson36.entity.TaskEntity;
import org.lesson36.entity.UserEntity;

import java.util.ArrayList;
import java.util.List;

public class TaskService {

    public void saveTask(TaskEntity task) {
        Session session = HibernateConfig.create();
        Transaction transaction = session.beginTransaction();
        session.save(task);
        transaction.commit();
        session.close();
    }
    public TaskEntity findById(Integer id) {
        Session session = HibernateConfig.create();
        Transaction transaction = session.beginTransaction();
        TaskEntity taskEntity = session.find(TaskEntity.class, id);
        transaction.commit();
        session.close();
        return taskEntity;
    }
    public List<TaskEntity> findByUser (Integer id) {
        List<TaskEntity> list = new ArrayList<>();
        Session session = HibernateConfig.create();
        Transaction transaction = session.beginTransaction();
        Query query = session.createQuery("from TaskEntity where user = " +id);
        list = query.list();
        transaction.commit();
        session.close();
        return list;
    }

    public void taskStatusUpd(Integer id, TaskStatus status) {
        Session session = HibernateConfig.create();
        Transaction transaction = session.beginTransaction();
        TaskEntity taskEntity = session.find(TaskEntity.class, id);
        taskEntity.setTaskStatus(status);
        session.update(taskEntity);
        transaction.commit();
        session.close();
    }
    public List<UserEntity> criteriaFindByTaskStatus (TaskStatus taskStatus) {
        List list;
        Session session = HibernateConfig.create();
        Transaction transaction = session.beginTransaction();
        Criteria criteria = session.createCriteria(UserEntity.class, "ue");
        Criteria crTask = criteria.createCriteria("ue.tasks", "te");
        crTask.add(Restrictions.eq("te.taskStatus", taskStatus));
        list = criteria.list();
        transaction.commit();
        session.close();
        return list;
    }


}
