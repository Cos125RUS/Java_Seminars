package org.example.Data.Controller;

import org.example.Data.Model.Student;
import org.example.Data.Model.Teacher;
import org.example.Data.Model.User;
import org.example.Data.Model.UserService;
import org.example.Data.View.View;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    public void start() {
        UserService userService = new UserService();
        List<User> users = new ArrayList<>();
        users.add(new Student());
        users.add(new Teacher());
        userService.read(users);
        View view = new View();
        System.out.println(view.studentView(users));
    }
}
