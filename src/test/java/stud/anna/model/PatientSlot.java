package stud.anna.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PatientSlot {


    @JsonProperty("DateSlot")
    public String dateSlot;
    public String timeBegin;
    public String timeEnd;
    public Patient patient;

    public static class Patient {
        public String passport;
        public String snils;
        public String birthday;
        public String surname;
        public String name;
        public String patronymic;
    }
}
