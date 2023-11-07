package com.assessment.Assessment_1.Service;

import com.assessment.Assessment_1.Dao.LibraryDao;
import com.assessment.Assessment_1.model.Library;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibraryService {
    @Autowired
    LibraryDao libraryDao;


    public List<Library> getAllDetails() {

        return libraryDao.findAll();
    }


    public String addDetails(Library library) {
        libraryDao.save(library);
        return "Details Added Successfully";
    }

    public void deleteDetails(Integer id) {
        libraryDao.deleteById(id);
    }

    public String updateDetails(Library library) {
        libraryDao.save(library);
        return "Details Updated Successfully!";
    }
}
