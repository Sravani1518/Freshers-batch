import org.junit.jupiter.api.Test;
class MinMaxTest {int[]a=new int[] {56,34,7,3,34,34,53};
@Test
public void testMaxValue()
{
int real=MiniMax.findMax(a);
int expected=56;
assert(real==expected);
System.out.println("Test case passed");
}
@Test
public void testMinValue()
{
int real=MiniMax.findMin(a);
int expected=3;
assert(real==expected);
System.out.println("Test case passed");
}
}