//package calculadora;
//
//
//
//import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertTrue;
//
//import java.io.File;
//import java.io.IOException;
//import java.util.concurrent.TimeUnit;
//
//import org.junit.Rule;
//import org.junit.Test;
//import org.junit.rules.TemporaryFolder;
//
//public class RoleTest {
//	
//	@Rule
//	public TemporaryFolder tmpFolder = new TemporaryFolder();
//	
//	@Test
//	public void shouldCreateNewFileInTemporaryFolder() throws IOException, Exception {
//		File created = tmpFolder.newFile("test.txt");
//		TimeUnit.SECONDS.sleep(20);
//		assertTrue("O Arquivo foi criado com sucesso: ",created.isFile());
//		
//	}
//}
