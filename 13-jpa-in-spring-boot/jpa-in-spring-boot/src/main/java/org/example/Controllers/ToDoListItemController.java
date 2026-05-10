package org.example.Controllers;

import org.example.Models.ToDoListItem;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

import javax.sql.DataSource;
import java.util.List;

/**
 * The controller for to-do list items.
 */
@RestController
@RequestMapping("/todo-list-items")
public class ToDoListItemController {
    private JdbcTemplate jdbcTemplate;

    public ToDoListItemController(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @GetMapping
    public List<ToDoListItem> getToDoListItems() {
        return jdbcTemplate.query(
                "SELECT id, text, todo_list_id, completed FROM todo_list_items",
                (rs, rowNum) -> new ToDoListItem(
                        rs.getInt("id"),
                        rs.getString("text"),
                        rs.getInt("todo_list_id"),
                        rs.getBoolean("completed")
                )
        );
    }

    @GetMapping("/{id}")
    public ToDoListItem getToDoListItem(@PathVariable int id) {
        return jdbcTemplate.queryForObject(
                "SELECT id, text, todo_list_id, completed FROM todo_list_items WHERE id = ?",
                (rs, rowNum) -> new ToDoListItem(
                        rs.getInt("id"),
                        rs.getString("text"),
                        rs.getInt("todo_list_id"),
                        rs.getBoolean("completed")
                ),
                id
        );
    }

    @PostMapping
    public void createToDoListItem(@RequestBody ToDoListItem toDoListItem) {
        jdbcTemplate.update(
                "INSERT INTO todo_list_items (text, todo_list_id, completed) VALUES (?, ?, ?)",
                toDoListItem.getText(),
                toDoListItem.getTodoListId(),
                toDoListItem.isCompleted()
        );
    }

    @PostMapping("/{id}")
    public void updateToDoListItem(@PathVariable int id, @RequestBody ToDoListItem toDoListItem) {
        jdbcTemplate.update(
                "UPDATE todo_list_items SET text = ?, todo_list_id = ?, completed = ? WHERE id = ?",
                toDoListItem.getText(),
                toDoListItem.getTodoListId(),
                toDoListItem.isCompleted(),
                id
        );
    }

    @PostMapping("/{id}/delete")
    public void deleteToDoListItem(@PathVariable int id) {
        jdbcTemplate.update("DELETE FROM todo_list_items WHERE id = ?", id);
    }
}
