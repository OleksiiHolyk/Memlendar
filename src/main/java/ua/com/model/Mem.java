package ua.com.model;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;
import java.time.ZoneOffset;

/**
 * Created by oleksii.holyk on 15.02.2017.
 */

@Document(collection = "memes")
public class Mem {

    private String id;
    private String shortDescription;
    private String fullDescription;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private long createdDate;
    private long date;


    public Mem() {
        this.createdDate = LocalDateTime.now().toInstant(ZoneOffset.UTC).toEpochMilli();
        this.date = LocalDateTime.now().toInstant(ZoneOffset.UTC).toEpochMilli();

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getFullDescription() {
        return fullDescription;
    }

    public void setFullDescription(String fullDescription) {
        this.fullDescription = fullDescription;
    }

    public long getDate() {
        return date;
    }

    public void setDate(long date) {
        this.date = date;
    }
}
