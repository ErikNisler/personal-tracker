package runtimeterror.personaltracker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/accounts")
public class AccountController {
    @Autowired
    AccountService accountService;

    @PostMapping("/add")
    public void addAccount(@RequestBody AccountDTO account){
        accountService.add(account);
    }

    @PutMapping("/update/{accountId}")
    public void updateAccount(@PathVariable int accountId, @RequestBody AccountDTO account){
        accountService.update(accountId, account);
    }

    @DeleteMapping("/delete/{accountId}")
    public void deleteAccount(@PathVariable int accountId){
        accountService.remove(accountId);
    }

    @GetMapping("/get/{accountId}")
    public AccountDTO getAccount(@PathVariable int accountId){
        return accountService.get(accountId);
    }

    @GetMapping("/get-all")
    public List<AccountDTO> getAllAccounts(){
        return accountService.getAll();
    }
}
