import java.time.LocalDateTime;

public class Record {
    private String name;
    private double value;
    private Currency currency;
    private LocalDateTime dateTime;
    private String note;

    public Record (String name, double value, Currency currency, LocalDateTime dateTime, String note){
        setName(name);
        setValue(value);
        setCurrency(currency);
        setDateTime(dateTime);
        setNote(note);
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
        if (value == 0){
        throw new IllegalArgumentException("The record can not have a zero value");
        }
        this.value = value;
    }

    public Currency getCurrency(){
        return currency;
    }

    public void setCurrency(Currency currency){
        this.currency = currency;
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
