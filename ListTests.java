import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import java.util.List;

public class ListTests {
    @Test
    public void testfilter(){
        StringChecker check=new myChecker();
        List<String> input1=new ArrayList<>();
        String[] expected={};
        input1.add("");
        assertArrayEquals(,ListExamples.filter(input1, check).toArray());
    }
}