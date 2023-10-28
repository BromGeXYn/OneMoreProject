package org.lesson34.entity;

import lombok.*;
import org.lesson34.Role;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@Entity
@Table(name = "persons")
public class PersonEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(length = 1024)
    private String name;
    private boolean mail;
    @Temporal(TemporalType.DATE)
    private Date birthdate;
    @Enumerated(EnumType.STRING)
    private Role role;

    @OneToMany(mappedBy = "person")
    private List<PhoneEntity> phones;

}
