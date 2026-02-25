package sv.edu.udb;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;
import jakarta.transaction.Transactional;

import sv.edu.udb.service.EscuelaService;

@SpringBootTest
@Transactional
public class EscuelaServiceTest {

    @Autowired
    private EscuelaService escuelaService;

    @Test
    @Commit
    void probarGuardadoCompleto(){
        var proferso = escuelaService.guardarProfesor("Profesor Test");

        var alumno = escuelaService.guardarAlumno("Valeria", "Montano");

        var materia = escuelaService.guardarMateria("Spring Boot", proferso.getId());

        escuelaService.inscribirAlumno(alumno.getId(), materia.getId());

    }
}
