package org.example;

import io.javalin.Javalin;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            var app = Javalin.create()
                .start(8080); // This opens the door at localhost:8080

        // 2. The "Dummy" Endpoint
        // When you visit /test, this block of code runs
            app.get("/test", ctx -> {
                ctx.result("Hello World!");
        });

        app.get("/tasks", ctx -> {
            // Use your JsonLoader from Phase 1
            List<Task> myTasks = JsonLoader.loadTasksFromJson("tasks.json");

            // Javalin sees you're returning a List and automatically
            // uses Jackson to turn it back into JSON for the browser!
            ctx.json(myTasks);
        });

        System.out.println("Server is running at http://localhost:8080/test");
    }
}