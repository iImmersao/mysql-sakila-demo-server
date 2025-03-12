package com.iimmersao.mysql_sakila_demo_server.controllers;

import com.iimmersao.mysql_sakila_demo_server.models.Actor;
import com.iimmersao.mysql_sakila_demo_server.models.Film;
import com.iimmersao.mysql_sakila_demo_server.models.FilmActor;
import com.iimmersao.mysql_sakila_demo_server.respositories.ActorRepository;
import com.iimmersao.mysql_sakila_demo_server.respositories.FilmActorRepository;
import com.iimmersao.mysql_sakila_demo_server.respositories.FilmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping(path="/actor")
public class ActorController {
    @Autowired
    private ActorRepository actorRepository;

    @Autowired
    private FilmActorRepository filmActorRepository;

    @Autowired
    private FilmRepository filmRepository;

    @PostMapping()
    public @ResponseBody Actor addNewActor(@RequestBody Actor actor) {
        Actor a = new Actor();
        a.setActorId(null);
        a.setFirstName(actor.getFirstName());
        a.setLastName(actor.getLastName());
        a.setLastUpdate(LocalDateTime.now());
        return actorRepository.save(a);
    }

    @GetMapping()
    public @ResponseBody Iterable<Actor> getAllActors() {
        return actorRepository.findAll();
    }

    @GetMapping(path="/{actorId}")
    public @ResponseBody Actor getActor(@PathVariable long actorId) {
        System.out.println("Getting actor by id");
        Optional<Actor> result = actorRepository.findById(actorId);
        if (result.isPresent()) {
            return result.get();
        } else {
            return null;
        }
    }

    @GetMapping(path="/{actorId}/films")
    public @ResponseBody List<String> getCast(@PathVariable Long actorId) {
        System.out.println("Getting films by actor id");
        List<String> titles = new ArrayList<>();
        List<FilmActor> actorsFilms = filmActorRepository.findByActorId(actorId);
        for (FilmActor detail : actorsFilms) {
            Film f = filmRepository.findByFilmId(detail.getFilmId());
            titles.add(f.getTitle());
        }
        return titles;
    }
}
