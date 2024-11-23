import java.time.LocalDateTime;

public class Record {
    private String name;
    private double value;
    private LocalDateTime dateTime;
    private String note;

    public Record (String name, double value, LocalDateTime dateTime, String note){
        setName(name);
        this.value = value;
        this.dateTime = dateTime;
        this.note = note;
    }

    //region Getters and Setters
    public String getName(){
        return name;
    }

    public void setName(String name){
        if (name.isEmpty()){
            throw new IllegalArgumentException("Record name can not be an empty String");
        }
        this.name = name;
    }

    public double getValue(){
        return value;
    }

    public void setValue(double value){
        this.value = value;
    }

    public LocalDateTime getDateTime(){
        return LocalDateTime.from(dateTime);
    }

    public void setDateTime(LocalDateTime dateTime){
        this.dateTime = dateTime;
    }

    public String getNote(){
        return note;
    }

    public void setNote(String note){
        this.note = note;
    }
    //endregion Getters and Setters
}
