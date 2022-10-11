package groupId.ru.hogwarts.artifact.school.service;

import groupId.ru.hogwarts.artifact.school.model.Faculty;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class FacultyService {
    private Map<Long, Faculty> faculties = new HashMap<>();
    private Long facultyId = 1L;

    public Faculty createFaculty(Faculty faculty) {
        faculties.put(facultyId, faculty);
        facultyId++;
        return faculty;
    }

    public Faculty findFaculty(Long id) {
        return faculties.get(id);
    }

    public Faculty editFaculty(Long id, Faculty faculty) {
        faculties.put(facultyId, faculty);
        return faculty;
    }

    public Faculty deleteFaculty(Long id) {
        return faculties.remove(id);
    }

    public Collection<Faculty> getAllFaculties() {
        return faculties.values();
    }

    public Collection<Faculty> findColor(String color) {
        return faculties.values();
    }
}
