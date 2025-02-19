package com.Trees_in_JAVA.HuffmanCoding;

import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        int n = 6;
        char[] charArray = {'a', 'b', 'c', 'd', 'e', 'f'};
        int[] frequency = {12, 9, 7, 13, 2, 45};
        PriorityQueue<HuffmanNode> queue = new PriorityQueue<>(n, new MyComparator());
        for (int i = 0; i < n; i++) {
            HuffmanNode hn = new HuffmanNode();
            hn.ch = charArray[i];
            hn.data = frequency[i];
            hn.leftChild = null;
            hn.rightChild = null;
            queue.add(hn);
        }

        //Building the Huffman Tree
        HuffmanNode root = null;


        while(queue.size() > 1){
            HuffmanNode x = queue.poll();
            HuffmanNode y = queue.poll();

            HuffmanNode f = new HuffmanNode();
            assert y != null;
            f.data = x.data + y.data;
            f.ch = '-';

            f.leftChild = x;
            f.rightChild = y;


            root = f;

            queue.add(f);
        }

        assert root != null;
        HuffmanCoding.printCode(root, "");
    }
}
