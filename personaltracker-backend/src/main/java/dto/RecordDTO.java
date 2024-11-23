package dto;

import enums.Currency;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document(collection = "records") // MongoDB collection name
public class RecordDTO {
    @Id
    private String id; // Unique identifier for MongoDB
    private String name;
    private double value;
    private Currency currency;
    private LocalDateTime dateTime;
    private String note;

    public RecordDTO(String name, double value, Currency currency, LocalDateTime dateTime, String note) {
        setName(name);
        setValue(value);
        setCurrency(currency);
        setDateTime(dateTime);
        setNote(note);
    }

    //region Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty()) {
            throw new IllegalArgumentException("Record name cannot be an empty String");
        }
        this.name = name;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        if (value == 0) {
            throw new IllegalArgumentException("The record cannot have a zero value");
        }
        this.value = value;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public LocalDateTime getDateTime() {
        return LocalDateTime.from(dateTime);
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
    //endregion Getters and Setters
}
