package liquibase.integration.ant;

import junit.framework.TestSuite;
import org.apache.ant.antunit.junit4.AntUnitSuiteRunner;
import org.junit.runner.RunWith;

import java.net.URISyntaxException;

@RunWith(AntUnitSuiteRunner.class)
public class ChangeLogSyncTaskTest extends AbstractAntTaskTest {
    public static TestSuite suite() throws URISyntaxException {
        return buildSuite("ChangeLogSyncTaskTest.xml", ChangeLogSyncTaskTest.class);
    }
}