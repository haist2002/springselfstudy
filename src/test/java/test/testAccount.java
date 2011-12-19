package test;

import static org.junit.Assert.*;

import chapter1.Account;
import org.junit.Test;

/**
 * Created by IntelliJ IDEA.
 * User: Administrator
 * Date: 11. 12. 19
 * Time: 오후 9:28
 * To change this template use File | Settings | File Templates.
 */
public class testAccount {

    @Test
    public void testAccount(){
        Account account = new Account();

        assertNull(account);

    }
}
