import java.util.List;

public interface RecordService {
    void add(RecordDTO record);
    void remove(int id);
    List<RecordDTO> getAll();
    void update(int id, RecordDTO record);
    RecordDTO get(int id);
}
