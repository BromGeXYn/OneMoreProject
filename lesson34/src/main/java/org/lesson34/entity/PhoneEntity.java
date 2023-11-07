package org.lesson34.entity;

import lombok.*;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "phones")
public class PhoneEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String number;

    @ManyToOne
    private PersonEntity person;

    @Override
    public String toString() {
        return "PhoneEntity{" +
                "id=" + id +
                ", number='" + number + '\'' +
                '}';
    }
}
