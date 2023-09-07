package intern;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import org.junit.jupiter.api.Test;

class SampleTest {

	@Test
	void test() {
		String stdIn = "a\n3";
		InputStream in = new ByteArrayInputStream(stdIn.getBytes());
		System.setIn(in);
		
		Sample.main(new String[]{});
	}

}
