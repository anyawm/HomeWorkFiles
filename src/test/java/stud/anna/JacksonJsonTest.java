package stud.anna;


import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import stud.anna.model.PatientSlot;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import java.io.File;
import java.io.IOException;

public class JacksonJsonTest {

    ObjectMapper objectMapper = new ObjectMapper();

    @Test
    void jsonParseTest() throws IOException {

        File file = new File("src/test/resources/patient.json");
        PatientSlot patient = objectMapper.readValue(file, PatientSlot.class);

        assertThat(patient.dateSlot).isEqualTo("2023-01-13T00:00:00");
        assertThat(patient.timeBegin).isEqualTo("2023-01-13T08:45:00");
        assertThat(patient.timeEnd).isEqualTo("2023-01-13T17:15:00");
        assertThat(patient.patient.passport).isEqualTo(null);
        assertThat(patient.patient.snils).isEqualTo("900-999-717 44");
        assertThat(patient.patient.birthday).isEqualTo("1985-10-26T00:00:00");
        assertThat(patient.patient.surname).isEqualTo("Тестовый");
        assertThat(patient.patient.name).isEqualTo("Пациент");
        assertThat(patient.patient.patronymic).isEqualTo("Тестович");
    }
}
