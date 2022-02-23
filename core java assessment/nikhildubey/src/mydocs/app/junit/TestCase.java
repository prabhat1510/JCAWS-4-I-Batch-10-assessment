package mydocs.app.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import mydocs.app.data.User;
import mydocs.app.exceptions.IncorrectCredentialsException;
import mydocs.app.services.UserServices;
import mydocs.app.services.UserServicesImpl;
import mydocs.app.ui.MyDocsOps;
import mydocs.app.ui.MyDocsOpsImpl;

class TestCase {

	@Test
	void test() {
		fail("Not yet implemented");
	}

	@Test
	void testLoginUser() {

		MyDocsOps ops = new MyDocsOpsImpl();

		assertEquals(ops.login(), true);

	}

}
