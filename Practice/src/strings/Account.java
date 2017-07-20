package strings;

import static strings.AccountType.FUTSU;
import static strings.AccountType.TOUZA;
import static strings.AccountType.TEIKI;


public class Account {
	private String accountNo;
	private int balance;
	private AccountType accountType;

	public Account(String aNo, AccountType aType){
		this.accountNo = aNo;
		this.accountType = aType;
	}
}
