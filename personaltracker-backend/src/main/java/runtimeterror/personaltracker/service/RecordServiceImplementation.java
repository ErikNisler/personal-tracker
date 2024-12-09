package runtimeterror.personaltracker.service;

import org.springframework.stereotype.Service;
import runtimeterror.personaltracker.dto.RecordDTO;

import java.util.List;

@Service
public class RecordServiceImplementation implements RecordService {

    @Override
    public void add(RecordDTO record) {
        //Add record
    }

    @Override
    public void remove(int id) {
        //Remove record at id
    }

    @Override
    public List<RecordDTO> getAll() {
        //Get all records
        return List.of();
    }

    @Override
    public void update(int id, RecordDTO record) {
        //Update record at id with info
    }

    @Override
    public RecordDTO get(int id) {
        //Get record by id
        return null;
    }
}
