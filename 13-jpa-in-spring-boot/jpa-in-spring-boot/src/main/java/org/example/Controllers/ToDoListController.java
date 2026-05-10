package org.example.Controllers;

import org.example.Models.ToDoList;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

import javax.sql.DataSource;
import java.util.List;

/**
 * The controller for to-do lists.
 */
@RestController
@RequestMapping("/todo-lists")
public class ToDoListController {
    private JdbcTemplate jdbcTemplate;

    public ToDoListController(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @GetMapping
    public List<ToDoList> getToDoLists() {
        return jdbcTemplate.query(
                "SELECT id, name FROM todo_lists",
                (rs, rowNum) -> new ToDoList(rs.getInt("id"), rs.getString("name"))
        );
    }

    @GetMapping("/{id}")
    public ToDoList getToDoList(@PathVariable int id) {
        return jdbcTemplate.queryForObject(
                "SELECT id, name FROM todo_lists WHERE id = ?",
                (rs, rowNum) -> new ToDoList(rs.getInt("id"), rs.getString("name")),
                id
        );
    }

    @PostMapping
    public void createToDoList(@RequestBody ToDoList toDoList) {
        jdbcTemplate.update("INSERT INTO todo_lists (name) VALUES (?)", toDoList.getName());
    }

    @PostMapping("/{id}")
    public void updateToDoList(@PathVariable int id, @RequestBody ToDoList toDoList) {
        jdbcTemplate.update("UPDATE todo_lists SET name = ? WHERE id = ?", toDoList.getName(), id);
    }

    @PostMapping("/{id}/delete")
    public void deleteToDoList(@PathVariable int id) {
        jdbcTemplate.update("DELETE FROM todo_lists WHERE id = ?", id);
    }
}
