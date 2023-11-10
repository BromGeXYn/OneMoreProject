package org.lesson36.entity;

import lombok.*;
import org.lesson36.Role;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@Entity
@Table(name = "users")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    @Enumerated(EnumType.STRING)
    private Role role;
    private String birthdate;
    private boolean isMan;

    @OneToMany(mappedBy = "user", fetch = FetchType.EAGER)
    private List<TaskEntity> tasks;


}
