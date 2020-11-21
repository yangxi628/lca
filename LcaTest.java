import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
@RunWith(JUnit4.class)
public class LcaTest {

	@Test
	public void test() {
		LCA tree = new LCA();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);
        assertEquals("LCA(4, 5): ",2,tree.findLCA(4,5));
        assertEquals("LCA(4, 6): ",1,tree.findLCA(4,6));
        assertEquals("LCA(3, 4): ",1,tree.findLCA(3,4));

	}
}
