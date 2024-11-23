package service;

import dto.AccountDTO;

import java.util.List;

public interface AccountService {
    void add(AccountDTO record);
    void remove(int id);
    List<AccountDTO> getAll();
    void update(int id, AccountDTO record);
    AccountDTO get(int id);
}
