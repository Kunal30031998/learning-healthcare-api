package com.deepthi.healthcareapi.repository;

import com.deepthi.healthcareapi.model.Patient;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class PatientRepository {

    private List<Patient> patients = new ArrayList<>();

    public PatientRepository() {
        patients.add(new Patient(1, "Deepthi", 28, "Hypertension"));
        patients.add(new Patient(2, "Ananya", 35, "Diabetes"));
        patients.add(new Patient(3, "Ravi", 45, "Asthma"));
    }

    public List<Patient> getAllPatients() {
        return patients;
    }

    // Homework method — returns one patient by ID
    public Optional<Patient> getPatientById(int id) {
        return patients.stream()
                       .filter(p -> p.getId() == id)
                       .findFirst();
    }
}
