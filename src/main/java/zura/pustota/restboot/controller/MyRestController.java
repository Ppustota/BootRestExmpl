package zura.pustota.restboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import zura.pustota.restboot.entity.Account;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@RestController
public class MyRestController {

    List<Account> accountList;
    @PostConstruct
    public void initializeData(){
     accountList = new ArrayList<>();
        accountList.add(new Account(1,"George"));
        accountList.add(new Account(2,"John"));
        accountList.add(new Account(3,"Michael"));
    }
    @GetMapping("/accounts")
    public List<Account> getAccounts(){
        return accountList;
    }
    @GetMapping("/accounts/{id}")
    public Account getAccount(@PathVariable int id){
        return accountList.get(id+1);
    }

}
