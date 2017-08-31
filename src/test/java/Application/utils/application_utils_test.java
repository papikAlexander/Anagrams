package Application.utils;

import org.junit.Assert;
import org.junit.Test;

import static Application.utils.ApplicationUtils.*;

/**
 * Created by alex on 31.08.17.
 */
public class application_utils_test {


	@Test
	public void trim_String_test(){
		Assert.assertEquals("test", trimAndLowerCaseString(" test       "));
	}

	@Test
	public void string_to_lower_case_test(){
		Assert.assertEquals("test", trimAndLowerCaseString("TeSt"));
	}

	@Test
	public void string_length_test(){
		Assert.assertTrue(stringLength("test", "text"));
	}

	@Test
	public void string_length_test_fail(){
		Assert.assertFalse(stringLength("test", "lower"));
	}

	@Test
	public void sort_string_test(){
		Assert.assertEquals("aabcd", sortString("caadb"));
	}

	@Test
	public void check_anagrams_test(){
		Assert.assertTrue(checkAnagrams("   Апельсин  ", " СпаНиель  "));
	}
}
