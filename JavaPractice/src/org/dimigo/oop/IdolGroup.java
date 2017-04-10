/**
 * 
 */
package org.dimigo.oop;

/**
 *<pre>
 *&{package_name} 
 *  |_ &{type_name}
 * 1. ∞≥ø‰ :
 * 2. ¿€º∫¿œ: &{date}
 * </pre>
 *
 * @author  : ∫˘¡∂
 * @version : 1.0
 */
public class IdolGroup {

	public void printArr(String[] ar, String[][] arr){
		for (int i=0; i<arr.length; i++)
		{
			System.out.println("<<"+ar[i]+">>");
			for(int j=0; j<arr[i].length; j++){
				System.out.println(arr[i][j]);
				
			}
			System.out.println();
		}
		System.out.println();

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] groupName = {"∫Úπ", "2NE1", "∞…Ω∫µ•¿Ã"};
		IdolGroup obj = new IdolGroup();
		String[][]memberName = {
				{"GD","≈¬æÁ","T.O.P","¥Îº∫","Ω¬∏Æ"},
				{"CL","ªÍ¥Ÿ∂Ûπ⁄","π⁄∫Ω","πŒ¡ˆ"},
				{"¿Ø∂Û","«˝∏Æ","º“¡¯","πŒæ∆"}	
		};
		 obj.printArr(groupName, memberName);
		
		 }
	}


