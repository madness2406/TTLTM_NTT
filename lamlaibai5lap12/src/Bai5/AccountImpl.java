/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai5;

import java.io.Serializable;
import java.rmi.*;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author Admin
 */
public class AccountImpl implements Account, Serializable {

    private BankManager bankManager;
    private Client Client;
    private float balance;
    private String accountNumber;

    public AccountImpl(BankManager bankManager, Client Client, String accountNumber, float bal) {
        this.bankManager = bankManager;
        this.Client = Client;
        this.balance = bal;
        this.accountNumber = accountNumber;
    }

    @Override
    public void deposit(float amount) {
        balance += amount;
    }

    @Override
    public void withdraw(float amount) {
        balance -= amount;
    }

    @Override
    public BankManager getBankManager() throws RemoteException {
        return bankManager;
    }

    @Override
    public Client getClient() throws RemoteException {
        return Client;
    }

    @Override
    public float getBalance() throws RemoteException {
        return balance;
    }

    @Override
    public void setBalance(float bal) throws RemoteException {
        balance = bal;
    }

    @Override
    public long getCash(long amount) throws NoCashAvailableException, RemoteException {
        if (amount > balance) {
            throw new NoCashAvailableException();
        }
        balance = balance - amount;
        return amount;
    }
}
