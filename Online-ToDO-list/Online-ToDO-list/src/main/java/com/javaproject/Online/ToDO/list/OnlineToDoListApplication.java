package com.javaproject.Online.ToDO.list;

import com.javaproject.Online.ToDO.list.Entity.todolist;
import com.javaproject.Online.ToDO.list.Repository.todorepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OnlineToDoListApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(OnlineToDoListApplication.class, args);
	}
	@Autowired
	private todorepo todoRepo;
	@Override
	public void run(String... args)throws Exception
	{

	}

}
