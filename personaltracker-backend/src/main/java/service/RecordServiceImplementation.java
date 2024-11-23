package service;

import dto.RecordDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.RecordRepository;

import java.util.List;
import java.util.Optional;

@Service
public class RecordServiceImplementation implements RecordService {

    @Autowired
    private RecordRepository recordRepository;

    @Override
    public void add(RecordDTO record) {
        recordRepository.save(record); // Add a new record
    }

    @Override
    public void remove(int id) {
        recordRepository.deleteById(id); // Remove record by ID
    }

    @Override
    public List<RecordDTO> getAll() {
        return recordRepository.findAll(); // Fetch all records
    }

    @Override
    public void update(int id, RecordDTO record) {
        Optional<RecordDTO> existingRecord = recordRepository.findById(id);
        if (existingRecord.isPresent()) {
            RecordDTO recordToUpdate = existingRecord.get();
            recordToUpdate.setName(record.getName());
            recordToUpdate.setValue(record.getValue());
            recordToUpdate.setCurrency(record.getCurrency());
            recordToUpdate.setDateTime(record.getDateTime());
            recordToUpdate.setNote(record.getNote());
            recordRepository.save(recordToUpdate); // Save updated record
        } else {
            throw new IllegalArgumentException("Record not found with ID: " + id);
        }
    }

    @Override
    public RecordDTO get(int id) {
        return recordRepository.findById(id).orElse(null); // Get record by ID
    }
}
