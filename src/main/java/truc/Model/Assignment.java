package truc.Model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Assignment {

    private String name;
    private Tag tag;
    private String status;
    final private String[] statusss = new String[]{"Not started", "In progress", "Done", "Finished", "Cancelled"};
    private LocalDate dueDate;
    private String notes;

    final DateTimeFormatter myFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    // System.out.println(myDate.format(myFormat));

    public Assignment(String name, Tag tag, String date, String notes) {
        this.name = name;
        this.tag = tag;
        this.status = "Not started";
        this.dueDate = createLocalDate(date);
        this.notes = notes;
    }

    private LocalDate createLocalDate(String date) {
        String[] dateArray = date.split("/");
        int day = Integer.parseInt(dateArray[0]);
        int month = Integer.parseInt(dateArray[1]);
        int year = Integer.parseInt(dateArray[2]);
        return LocalDate.of(year, month, day);
    }
}
