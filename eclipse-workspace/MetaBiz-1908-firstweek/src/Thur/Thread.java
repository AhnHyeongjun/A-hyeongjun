/*
 * Thread ȣ��
 * 
 */
package Thur;

Thread thread = new Thread(()-> {
	for(int i=0; i<10; i++) {
		System.out.println(i);
	}
});
