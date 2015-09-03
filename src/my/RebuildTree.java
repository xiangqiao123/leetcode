package my;

import java.util.Arrays;

import common.ListNode;
import common.TreeNode;

public class RebuildTree {
	
	public TreeNode rebuildTree(int[] bArray, int[] mArray){
		if(bArray.length!=mArray.length || bArray.length == 0){
			return null;
		}else{
			/*System.out.println();
			for(int i=0;i<bArray.length;i++){
				System.out.print(bArray[i]);
			}
			System.out.println();
			for(int j=0;j<mArray.length;j++){
				System.out.print(mArray[j]);
			}
			System.out.println();*/
			
			TreeNode n = new TreeNode(bArray[0]);
			int index = getIndex(bArray[0], mArray);
			int []b1=Arrays.copyOfRange(bArray, 1, index+1);
			int []b2=Arrays.copyOfRange(bArray, index+1, bArray.length);
			int []m1= Arrays.copyOfRange(mArray, 0, index);
			int []m2=Arrays.copyOfRange(mArray, index+1, mArray.length);
			n.leftNode = rebuildTree(Arrays.copyOfRange(bArray, 1, index+1), Arrays.copyOfRange(mArray, 0, index));
			n.rightNode = rebuildTree(Arrays.copyOfRange(bArray, index+1, bArray.length), Arrays.copyOfRange(mArray, index+1, mArray.length));
			return n;
			}		
	}
	
	
	public int getIndex(int pVal,int[] mArray){
		for(int i = 0;i<mArray.length;i++){
			if(mArray[i] == pVal){
				return i;
			}
		}
		return -1;
	}
	
	public void PreScan(TreeNode node){
		if(node!=null){
			System.out.println(node.val);
			PreScan(node.leftNode);
			PreScan(node.rightNode);
		}
	}
	
	public void middleScan(TreeNode node){
		if(node!=null){			
			middleScan(node.leftNode);
			System.out.println(node.val);
			middleScan(node.rightNode);
			
			
		}
	}
	
	public static void main(String[] args){
		
		int[] a = {1,2,4,7,3,5,6,8};
		int[] b = {4,7,2,1,5,3,8,6};
		TreeNode root = new RebuildTree().rebuildTree(a, b);
		new RebuildTree().middleScan(root);
		
	}

}
