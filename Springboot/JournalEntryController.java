package com.regved.journalApp.controller;

import com.regved.journalApp.controller.entity.JournalEntry;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


//Says that it is a component, and it also provides the additional functionality
@RestController
@RequestMapping("/journal") //Add Mapping on the full class below
public class JournalEntryController {

    private Map<Long, JournalEntry> journalEntries = new HashMap<>();


   @GetMapping("/abc")
   //(Note: Methods inside a controller class should be public so that they
   // can be accessed and invoked by the spring framework or external http requests)
   public List<JournalEntry> getAll(){
        return new ArrayList<>(journalEntries.values());
    }

public void createEntry(){

}


}
