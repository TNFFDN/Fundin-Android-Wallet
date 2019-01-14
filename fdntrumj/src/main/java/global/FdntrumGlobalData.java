package global;

import java.util.ArrayList;
import java.util.List;

import fdntrum.FdntrumPeerData;

/**
 * Created by tnf on 1/14/19. on 7/2/17.
 */

public class FdntrumGlobalData {

    public static final String KAALI_TESTNET_SERVER = "node1.fundincrypto.com";

    public static final String[] TRUSTED_NODES = new String[]{"node1.fundincrypto.com"};

    public static final List<FdntrumPeerData> listTrustedHosts(){
        List<FdntrumPeerData> list = new ArrayList<>();
        list.add(new FdntrumPeerData(KAALI_TESTNET_SERVER,52543,55552));
        for (String trustedNode : TRUSTED_NODES) {
            list.add(new FdntrumPeerData(trustedNode,52543,55552));
        }
        return list;
    }

}
