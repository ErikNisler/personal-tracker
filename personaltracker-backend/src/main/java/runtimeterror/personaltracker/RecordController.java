package runtimeterror.personaltracker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/records")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class RecordController {
    @Autowired RecordService recordService;

    @PostMapping("/add")
    public void addRecord(@RequestBody RecordDTO record){
        recordService.add(record);
    }

    @PutMapping("/update/{recordId}")
    public void updateRecord(@PathVariable int id, @RequestBody RecordDTO record){
        recordService.update(id, record);
    }

    @DeleteMapping("/delete/{recordId}")
    public void deleteRecord(@PathVariable int id){
        recordService.remove(id);
    }

    @GetMapping("/get/{recordId}")
    public RecordDTO getRecord(@PathVariable("recordId") int id){
        return recordService.get(id);
    }

    @GetMapping("/get-all")
    public List<RecordDTO> getAllRecords(){
        return recordService.getAll();
    }
}
