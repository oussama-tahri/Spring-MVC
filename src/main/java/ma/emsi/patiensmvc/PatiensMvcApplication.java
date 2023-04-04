package ma.emsi.patiensmvc;

import ma.emsi.patiensmvc.entities.Patient;
import ma.emsi.patiensmvc.repositories.PatientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class PatiensMvcApplication {

    public static void main(String[] args) {
        SpringApplication.run(PatiensMvcApplication.class, args);
    }

    @Bean
    CommandLineRunner start(PatientRepository patientRepository) {
        return args -> {
         patientRepository.save(
                 new Patient(null, "Nawfal", new Date(), false, 7));
         patientRepository.save(
                    new Patient(null, "Abrak", new Date(), false, 7));
         patientRepository.save(
                    new Patient(null, "Marouane", new Date(), false, 7));
         patientRepository.save(
                    new Patient(null, "Hamza", new Date(), false, 7));

         patientRepository.findAll().forEach(p -> {
             System.out.println(p.getName());
         });
        };
    }
}
