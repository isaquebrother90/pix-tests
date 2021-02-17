package pixtests.services;

import java.security.SecureRandom;

public class HistoricoTransacao {
	
	 //Copied from UUID implementation :)
    private static volatile SecureRandom numberGenerator = null;
    private static final long MSB = 0x8000000000000000L;

    public static String gerarNumeroTransacao() {
        SecureRandom ng = numberGenerator;
        if (ng == null) {
            numberGenerator = ng = new SecureRandom();
        }

        return Long.toHexString(MSB | ng.nextLong()) + Long.toHexString(MSB | ng.nextLong());
    }

	  
}
