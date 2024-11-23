package runtimeterror.personaltracker;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImplementation implements AccountService{
    @Override
    public void add(AccountDTO record) {
        //Add account
    }

    @Override
    public void remove(int id) {
        //Remove account by id
    }

    @Override
    public List<AccountDTO> getAll() {
        //Get all accounts
        return List.of();
    }

    @Override
    public void update(int id, AccountDTO record) {
        //Update account at id
    }

    @Override
    public AccountDTO get(int id) {
        //Get account by id
        return null;
    }
}
