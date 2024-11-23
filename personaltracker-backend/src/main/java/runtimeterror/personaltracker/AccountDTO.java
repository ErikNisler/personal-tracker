package runtimeterror.personaltracker;

public class AccountDTO {
    private String name;
    private double value;
    private String note;

    public AccountDTO(String name, double value, String note){
        setName(name);
        setValue(value);
        setNote(note);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
