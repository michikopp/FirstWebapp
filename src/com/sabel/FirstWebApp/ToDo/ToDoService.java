package com.sabel.FirstWebApp.ToDo;

import com.sabel.FirstWebApp.ToDo.ToDo;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@ApplicationScoped
public class ToDoService implements Serializable{

    @Inject
    private ToDoStore toDoStore;


    public List<ToDo> retrieveTodos() {
       return toDoStore.getToDos();
    }

    public void add(ToDo toDo) {
        toDoStore.store(toDo);
    }

    public void delete(ToDo toDo) {
       toDoStore.delete(toDo);


    }


    }

