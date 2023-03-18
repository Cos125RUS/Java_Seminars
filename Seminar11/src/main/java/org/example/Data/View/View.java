package org.example.Data.View;

import org.example.Data.Model.Student;
import org.example.Data.Model.User;

import java.util.List;

public class View {
    public String studentView(List<User> students){
        StringBuilder sb = new StringBuilder();
        for (User s: students) {
            sb.append(s.toString()).append("\n");
        }
        return sb.toString();
    }


}
