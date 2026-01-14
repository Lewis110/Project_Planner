package org.example;
import io.javalin.http.Context;

import java.util.ArrayList;
import java.util.List;

public class TaskController {
    private static List<Task> tasks = JsonLoader.loadTasksFromJson("tasks.json");


    public static void getAllTasks(Context ctx) {

        ctx.json(tasks);
    }


    public static void getTaskById(Context ctx) {
       String strID = ctx.pathParam("id");
        int ID = Integer.parseInt(strID);

        Task foundTask = tasks.stream().filter(f -> f.getId() == ID)
                .findFirst()
                .orElse(null);
        if (foundTask != null) {
            ctx.json(foundTask);
        }
        else{
            ctx.status(404).result("Task not found");
        }

    }
}
