package stud.anna.model;

import com.google.gson.annotations.SerializedName;

public class PatientSlot {


    @SerializedName("DateSlot")
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
