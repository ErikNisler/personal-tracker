package service;

import dto.AccountDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.AccountRepository;

import java.util.List;
import java.util.Optional;

@Service
public class AccountServiceImplementation implements AccountService {

    @Autowired
    private AccountRepository accountRepository;

    @Override
    public void add(AccountDTO record) {
        accountRepository.save(record); // Save account
    }

    @Override
    public void remove(int id) {
        accountRepository.deleteById(id); // Delete account by ID
    }

    @Override
    public List<AccountDTO> getAll() {
        return accountRepository.findAll(); // Get all accounts
    }

    @Override
    public void update(int id, AccountDTO record) {
        Optional<AccountDTO> existingAccount = accountRepository.findById(id);
        if (existingAccount.isPresent()) {
            AccountDTO accountToUpdate = existingAccount.get();
            accountToUpdate.setName(record.getName());
            accountToUpdate.setValue(record.getValue());
            accountRepository.save(accountToUpdate); // Update account
        } else {
            throw new IllegalArgumentException("Account not found with ID: " + id);
        }
    }

    @Override
    public AccountDTO get(int id) {
        return accountRepository.findById(id).orElse(null); // Get account by ID
    }
}
