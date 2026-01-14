package org.example;

import io.javalin.Javalin;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        var app = Javalin.create(config -> {
            config.bundledPlugins.enableCors(cors -> cors.addRule(it -> it.anyHost()));
        }).start(8080);

        // Clean, readable routing
        app.get("/tasks", ctx -> TaskController.getAllTasks(ctx));
        app.get("/task/{id}", ctx -> TaskController.getTaskById(ctx));

        Runtime.getRuntime().addShutdownHook(new Thread(app::stop));

        System.out.println("Server is running at http://localhost:8080/tasks");
    }
}