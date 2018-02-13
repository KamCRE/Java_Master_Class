/**
 * 
 */
package oOP_Part_1;

/**
 * @author lancre
 *
 */
public class My_Class_00P_1 {
	public static void main(String[] args) {
		
		VipCustomer vip = new VipCustomer();
		System.out.println(vip.getName());
		
		VipCustomer vip2 = new VipCustomer("LAN","lan@email.com");
		System.out.println(vip2.getName());
		
		VipCustomer vip3 = new VipCustomer("CRE",3455, "cre@email.com");
		System.out.println(vip3.getName());

		
		
	}

}
