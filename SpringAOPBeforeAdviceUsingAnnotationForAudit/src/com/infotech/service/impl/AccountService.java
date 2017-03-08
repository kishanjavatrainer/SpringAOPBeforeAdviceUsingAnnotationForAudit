package com.infotech.service.impl;

import com.infotech.model.Account;

public interface AccountService {

	public abstract void updateAccountBalance(Account account, Long amount);

}