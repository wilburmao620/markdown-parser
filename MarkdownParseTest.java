import static org.junit.Assert.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import org.junit.*;

public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Before
    public void setup(){
    }
    @Test
    public void getLinksTest() throws IOException{
        Path path = Path.of("test-file.md");
        ArrayList<String> expectedResult = new ArrayList<String>();
        String content = Files.readString(path);
        ArrayList<String> testResult = MarkdownParse.getLinks(content);
        expectedResult.add("https://something.com");
        expectedResult.add("some-thingkjsfa.html");
        assertEquals(expectedResult, testResult);
    }

    @Test
    public void test2() throws IOException{
        Path path2 = Path.of("test-file2.md");
        ArrayList<String> expectedResult = new ArrayList<String>();
        String content = Files.readString(path2);
        ArrayList<String> testResult = MarkdownParse.getLinks(content);
        expectedResult.add("https://something.com");
        expectedResult.add("some-page.html");
        assertEquals(expectedResult, testResult);
    }
    @Test
    public void test3() throws IOException{
        Path path3 = Path.of("test-file3.md");
        ArrayList<String> expectedResult = new ArrayList<String>();
        String content = Files.readString(path3);
        ArrayList<String> testResult = MarkdownParse.getLinks(content);
        assertEquals(expectedResult, testResult);
    }
    @Test
    public void test4() throws IOException{
        Path path4 = Path.of("test-file4.md");
        ArrayList<String> expectedResult = new ArrayList<String>();
        String content = Files.readString(path4);
        ArrayList<String> testResult = MarkdownParse.getLinks(content);
        assertEquals(expectedResult, testResult);
    }
    @Test
    public void test5() throws IOException{
        Path path5 = Path.of("test-file5.md");
        ArrayList<String> expectedResult = new ArrayList<String>();
        String content = Files.readString(path5);
        ArrayList<String> testResult = MarkdownParse.getLinks(content);
        assertEquals(expectedResult, testResult);
    }
    @Test
    public void test6() throws IOException{
        Path path6 = Path.of("test-file6.md");
        ArrayList<String> expectedResult = new ArrayList<String>();
        String content = Files.readString(path6);
        ArrayList<String> testResult = MarkdownParse.getLinks(content);
        assertEquals(expectedResult, testResult);
    }
    @Test
    public void test7() throws IOException{
        Path path7 = Path.of("test-file7.md");
        ArrayList<String> expectedResult = new ArrayList<String>();
        String content = Files.readString(path7);
        ArrayList<String> testResult = MarkdownParse.getLinks(content);
        assertEquals(expectedResult, testResult);
    }
    @Test
    public void test8() throws IOException{
        Path path8 = Path.of("test-file8.md");
        ArrayList<String> expectedResult = new ArrayList<String>();
        String content = Files.readString(path8);
        ArrayList<String> testResult = MarkdownParse.getLinks(content);
        assertEquals(expectedResult, testResult);
    }
    @Test
    public void test_fail() throws IOException{
        Path path8 = Path.of("fail-test.md");
        ArrayList<String> expectedResult = new ArrayList<String>();
        String content = Files.readString(path8);
        ArrayList<String> testResult = MarkdownParse.getLinks(content);
        assertEquals(expectedResult, testResult);
    }

    @Test
    public void fail(){
        
    }
}
