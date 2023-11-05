package org.lesson35.entity;

import lombok.*;
import org.lesson35.Role;

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
    private boolean male;

    @OneToMany(mappedBy = "user", fetch = FetchType.EAGER)
    private List<TaskEntity> tasks;

}
