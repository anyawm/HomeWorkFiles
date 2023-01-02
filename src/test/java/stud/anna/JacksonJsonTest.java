package stud.anna;


import org.junit.jupiter.api.Test;
import com.fasterxml.jackson.databind.ObjectMapper;


import java.io.File;
import java.io.IOException;


import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class JacksonJsonTest {

    @Test
    void jsonParseTest() throws Exception {
        ObjectMapper objectMapper = new ObjectMapper();
        File file = new File("src/test/resources/patient.json");
        Patient patient = objectMapper.readValue(file, PatientSlot.class);

        assertThat(patient.getAge()).isEqualTo(44);
        assertThat(patient.getLastName()).isEqualTo("Simpson");
        assertThat(patient.getFirstName()).isEqualTo("Homer");
    }
}
