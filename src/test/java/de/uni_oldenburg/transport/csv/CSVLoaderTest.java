package de.uni_oldenburg.transport.csv;

import de.uni_oldenburg.transport.Location;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.util.ArrayList;

/**
 * Tests {@link CSVLoader}.
 */
public class CSVLoaderTest {

	private CSVLoader instance;

	// Constructor
	@Test(expected = FileNotFoundException.class)
	public void CSVLoader_passInvalidFile_throwsIOException() throws FileNotFoundException {
		String file = "invalid.csv";
		this.instance = new CSVLoader(file) {};
	}

	@Test
	public void CSVLoader_passValidFile_throwsNoIOException() throws Exception {
		String file = "src/test/resources/test.csv";
		this.instance = new CSVLoader(file) {};
	}

}
