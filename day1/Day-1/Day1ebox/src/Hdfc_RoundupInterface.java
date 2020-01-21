public class Hdfc_RoundupInterface  implements Notification_RoundupInetrface {
		 @Override
		 public void notificationBySms() {
		  System.out.println("Notification By SMS");
		  
		 }
		 @Override
		 public void notificationByEmail() {
		  System.out.println("Notification By Mail");
		  
		 }
		 @Override
		 public void notificationByCourier() {
		  System.out.println("Notification By Courier");
		  
		 }
		}

