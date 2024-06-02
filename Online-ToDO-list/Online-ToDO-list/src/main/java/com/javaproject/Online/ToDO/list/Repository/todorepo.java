package com.javaproject.Online.ToDO.list.Repository;

import com.javaproject.Online.ToDO.list.Entity.todolist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface todorepo extends JpaRepository<todolist,Long> {
}
