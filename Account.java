import java.math.BigInteger;

public class Account {
	
	private String username;
	private String password;
	private BigInteger pubKey;
	private BigInteger privKey;
	
	public Account(String user, String pass, BigInteger pk, BigInteger sk) {
		username = user;
		password = pass;
		pubKey = pk;
		privKey = sk;
	}
	
	public String getUser() {
		return username;
	}
	
	public String getPass() {
		return password;
	}
	
	public BigInteger getPubKey() {
		return pubKey;
	}
	
	public BigInteger getPrivKey() {
		return privKey;
	}
}
