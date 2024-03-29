package kz.example.practiceJavaEE.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Tasks {
    private Long id;
    private String name;
    private String description;
    private String deadlineDate;
    private Boolean isDone;
}
