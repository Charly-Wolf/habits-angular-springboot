CREATE TABLE IF NOT EXISTS Habit (
    id INTEGER AUTO_INCREMENT,
    habit_text varchar(255) NOT NULL,
    is_done BOOLEAN,
    is_archived BOOLEAN,
    primary key (id)
);
