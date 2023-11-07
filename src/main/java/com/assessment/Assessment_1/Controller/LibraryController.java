package com.assessment.Assessment_1.Controller;

import com.assessment.Assessment_1.model.Library;
import com.assessment.Assessment_1.Service.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/library")
public class LibraryController {
    @Autowired
    LibraryService libraryService;
    @GetMapping("/allDetails")
    public List<Library> getAllDetails(){
       return libraryService.getAllDetails();

    }

    @PostMapping("/add")
    public String addDetails(@RequestBody Library library){
       return libraryService.addDetails(library);
    }

    @DeleteMapping("/delete")
    public String deleteDetails(@RequestParam Integer id){
        libraryService.deleteDetails(id);
        return "Deleted";
    }

    @PutMapping("/update")
    public String updateDetails(@RequestBody Library library){

        return libraryService.updateDetails(library);
    }
}
