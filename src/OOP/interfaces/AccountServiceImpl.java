/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP.interfaces;

/**
 *
 * @author nikolad
 */
public class AccountServiceImpl implements AccountService {

    Account[] accounts;

    public AccountServiceImpl(Account[] accounts) {
        this.accounts = accounts;

    }

    @Override
    public Account findAccountByOwnerId(long id) {
        for (Account a : accounts) {
            if (a.getOwner().getId() == id) {
                return a;
            }
        }
        return null;
    }

    @Override
    public long countAccountsWithBalanceGreaterThan(long value) {
        long count = 1;
        for (int i = 0; i < accounts.length - 1; i++) {
            if (accounts[i].getBalance() > value) {
                count++;

            }
        }
        return count;
    }

}
