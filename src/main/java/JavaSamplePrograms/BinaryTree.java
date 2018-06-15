///*
//package JavaSamplePrograms;
//
//
//*/
///*
//Write a function which finds the minimum value in a binary tree.
//
//During the exercise the facilitator will be adding Tests/Assertions to check for behavior. Please make sure to include appropriate constructors to build the tree.
//*//*
//
//import java.util.*;
//import org.junit.*;
//
//    public class Node{
//
//        int data;
//        Node left,right;
//
//        public Node(int data) {
//            this.data = data;
//            left = right = null;
//        }
//
//        public static int findMinValue (Node node){
//            if (node == null)
//                return Integer.MAX_VALUE;
//
//            int res = node.data;
//            int leftResult = findMinValue(node.left);
//            int rightResult = findMinValue(node.right);
//
//            if (leftResult < res)
//                res = leftResult;
//            if (rightResult < res)
//                res = rightResult;
//            return res;
//        }
//    }
//
//
//
//
//
//
//        public static void main(String[] args) {
//
//        JUnitCore.main("Solution");
//            @Test
//            public void singleNodeTest() {
//
//                Node node = new Node(5);
//                Assert.assertEquals("A single node tree should return its value",
//                    5,
//                    Node.findMinValue(node)
//                );
//            }
//
//            @Test
//            public void multiNodeTest() {
//                Node a = new Node(5);
//                Node b = new Node(6);
//                Node c = new Node(-27);
//                Node d = new Node(-7);
//                Node e = new Node(-6);
//                a.left = b;
//                a.right = c;
//                b.left = e;
//                b.right = d;
//                Assert.assertEquals("A Node's minimum method should return the minimum value in the tree",
//                    -27,
//                    Node.findMinValue(a)
//                );
//            }
//        }
//
//
//
//
//*/
