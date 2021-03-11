package Entry;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Entry {

    private String entryTitle;
    private LocalDateTime entryDateAndTime;
    private String entryBody;

    public Entry(String title) {
        entryTitle = title;
        entryDateAndTime = LocalDateTime.now();
    }

    public void setEntryTitle(String new_entry_title) {
        this.entryTitle = new_entry_title;
    }

    public String getEntryTitle() {
        return entryTitle;
    }

    public LocalDateTime getEntryDateAndTime() {
        return entryDateAndTime;
    }

    public void setEntryBody(String entryBody) {
        this.entryBody = entryBody;
    }

    public String getEntryBody() {
        return entryBody;
    }

    public String viewEntry() {
        return
                ("title: " + getEntryTitle() + "\n"
                        + "Entry Date: " + getEntryDateAndTime().toLocalDate() + "\n"
                        + "Entry Body: " + getEntryBody());

    }

    @Override
    public String toString(){
        return viewEntry();
    }
}
