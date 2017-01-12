package gym;

import java.awt.Toolkit;

public class GymSystem {

	 
	  
          private login l;
          public GymSystem()
     {
    	 
          l=new login("LOGIN");
         l.setVisible(true);
         Toolkit t=Toolkit.getDefaultToolkit();
        int x=(int)t.getScreenSize().getWidth();
        int y=(int)t.getScreenSize().getHeight();
         l.pack();
        l.setLocationRelativeTo(null);
        l.setResizable(false);
     }
	

}
