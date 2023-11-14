package org.lesson35;

import org.lesson35.entity.TaskEntity;
import org.lesson35.entity.UserEntity;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        UserService service = new UserService();
        TaskService taskService = new TaskService();

        UserEntity user1 = UserEntity.builder()
                .name("user1")
                .birthdate("03-03-1995")
                .male(true)
                .role(Role.Admin)
                .build();
        UserEntity user2 = UserEntity.builder()
                .name("user2")
                .birthdate("01-01-1990")
                .male(false)
                .role(Role.User)
                .build();
        UserEntity user3 = UserEntity.builder()
                .name("user2")
                .birthdate("01-01-1990")
                .male(false)
                .role(Role.Support)
                .build();
        TaskEntity task1 = TaskEntity.builder()
                .taskName("task1")
                .taskDescription("to do smth 1")
                .taskStatus(TaskStatus.NEW)
                .user(user1)
                .build();
        TaskEntity task2 = TaskEntity.builder()
                .taskName("task2")
                .taskDescription("to do smth 2")
                .taskStatus(TaskStatus.NEW)
                .user(user1)
                .build();
        TaskEntity task3 = TaskEntity.builder()
                .taskName("task3")
                .taskDescription("to do smth 3")
                .taskStatus(TaskStatus.NEW)
                .user(user2)
                .build();
        TaskEntity task4 = TaskEntity.builder()
                .taskName("task4")
                .taskDescription("to do smth 4")
                .taskStatus(TaskStatus.NEW)
                .user(user2)
                .build();

        service.saveUser(user1);
        service.saveUser(user2);
        taskService.saveTask(task1);
        taskService.saveTask(task2);
        taskService.saveTask(task3);
        taskService.saveTask(task4);
        UserEntity user = service.findUser(1);
        System.out.println(user);
        //service.delUser(2);
        service.updateUser(user3, 2);
        TaskEntity taskById = taskService.findById(1);
        System.out.println(taskById);
        taskService.taskStatusUpd(4, TaskStatus.FINISHED);
//        List<TaskEntity> byUser = taskService.findByUser(1);
//        System.out.println(byUser);
        List<UserEntity> byActiveTask = service.findByActiveTask();
        System.out.println(byActiveTask);
    }

}
