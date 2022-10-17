package truc.Model;

import java.util.ArrayList;

public class Workspace {

    private ArrayList tags;
    private String name;
    private String notes;
    private String tagType;

    public Workspace(String name, ArrayList tags, String tagType, String notes) {
        this.name = name;
        this.tags = tags;
        this.tagType = tagType;
        this.notes = notes;
    }

}
