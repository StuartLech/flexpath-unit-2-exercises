package org.example.Models;

/**
 * A to-do list item.
 */
public class ToDoListItem {
    private int id;
    private String text;
    private int todoListId;
    private boolean completed;

    public ToDoListItem() {
    }

    public ToDoListItem(int id, String text, int todoListId, boolean completed) {
        this.id = id;
        this.text = text;
        this.todoListId = todoListId;
        this.completed = completed;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getTodoListId() {
        return todoListId;
    }

    public void setTodoListId(int todoListId) {
        this.todoListId = todoListId;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}
