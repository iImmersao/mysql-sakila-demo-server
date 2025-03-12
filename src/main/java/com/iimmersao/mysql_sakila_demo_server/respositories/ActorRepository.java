package com.iimmersao.mysql_sakila_demo_server.respositories;

import com.iimmersao.mysql_sakila_demo_server.models.Actor;
import org.springframework.data.repository.CrudRepository;

public interface ActorRepository extends CrudRepository<Actor, Long> {
    public Actor findByActorId(Long actorId);
}
