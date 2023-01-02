package stud.anna.model;

import com.google.gson.annotations.SerializedName;

public class PatientSlot {
    @SerializedName("DateSlot")
    public String dateSlot;
    @SerializedName("TimeBegin")
    public String timeBegin;
    @SerializedName("TimeEnd")
    public String timeEnd;
    @SerializedName("Patient")
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
