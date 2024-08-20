package pcfactoria.benja;

import java.util.Date;

/**
 *
 * @author bjcan
 */
public class PcFactoriaBenja {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Pccomp  pccomp1 = new Pccomp("ASUS", "INTEL", 800, 16, new Date(), 's');
        Pccomp  pccomp2 = new Pccomp("Lenovo", "msi", 250, 4, new Date(), 's');        
        
        //pccomp1.print();   
        pccomp2.print();
    }
    
}
