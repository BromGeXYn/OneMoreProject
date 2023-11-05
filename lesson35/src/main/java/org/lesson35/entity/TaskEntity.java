package org.lesson35.entity;

import lombok.*;
import org.lesson35.TaskStatus;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@Entity
@Table(name = "tasks")
public class TaskEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String taskName;
    @Column(length = 1024)
    private String taskDescription;
    @Enumerated(EnumType.STRING)
    private TaskStatus taskStatus;

    @ManyToOne
    @JoinColumn(name = "user_id")
    @ToString.Exclude
    private UserEntity user;

}
