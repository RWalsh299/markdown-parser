import static org.junit.Assert.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import org.junit.*;

public class MarkdownParseTest extends MarkdownParse {   

@Test
public void addition() {
    assertEquals(2, 1 + 1);
    }

@Test
public void file1() throws IOException{
    ArrayList<String> testArr = new ArrayList<>();
    testArr.add("https://something.com");
    testArr.add("some-thing.html");

    Path fileName = Path.of("mytest-file.md");
    String content = Files.readString(fileName);
    ArrayList<String> links = getLinks(content);
    
    assertEquals(testArr,links);
    }

    @Test
    public void file2() throws IOException{
        ArrayList<String> testArr = new ArrayList<>();
        testArr.add("https://somethingfunny.com");
    
        Path fileName = Path.of("mytest-file2.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = getLinks(content);
        
        assertEquals(testArr,links);
        }

        @Test
        public void file3() throws IOException{
            ArrayList<String> testArr = new ArrayList<>();
            testArr.add("https://randomlink.com");
        
            Path fileName = Path.of("mytest-file3.md");
            String content = Files.readString(fileName);
            ArrayList<String> links = getLinks(content);
            
            assertEquals(testArr,links);
            }

            @Test
            public void file4() throws IOException{
                ArrayList<String> testArr = new ArrayList<>();
                testArr.add("esttest.html");
                
                Path fileName = Path.of("mytest-file4.md");
                String content = Files.readString(fileName);
                ArrayList<String> links = getLinks(content);
                
                assertEquals(testArr,links);
                }
    
}

