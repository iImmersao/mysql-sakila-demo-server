package com.iimmersao.mysql_sakila_demo_server.models;

import jakarta.persistence.*;
import org.hibernate.annotations.Type;

import java.time.LocalDateTime;

@Entity
@Table(name="actor", schema="sakila")
public class Actor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "actor_id", columnDefinition = "smallint unsigned")
    private Long actorId;

    @Column(name = "first_name", columnDefinition = "varchar(255)")
    private String firstName;

    @Column(name = "last_name", columnDefinition = "varchar(255)")
    private String lastName;

    @Column(name = "last_update", columnDefinition = "TIMESTAMP")
    private LocalDateTime lastUpdate;

    public Long getActorId() {
        return actorId;
    }

    public void setActorId(Long actorId) {
        this.actorId = actorId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDateTime getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(LocalDateTime lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
}
